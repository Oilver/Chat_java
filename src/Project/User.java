package Project;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.sql.SQLException;
import java.util.Vector;

import Server.User2;
import dao.userDao;
import model.userMessage;

public class User implements Runnable {

	private String ip = "";
	private int port = 0;
	private String flagString;
	private OutputStream os;
	private BufferedWriter bw;
	private InputStream input;
	private BufferedReader in;
	private InputStreamReader reader;
	private Socket socket = null;
	private Thread thread = null;
	private boolean sendOK = false;
	private boolean reconnect = false;
	private String username;
	private int localPort = 0;
	private boolean isadd = false;
	private boolean interruptWithServer = false;
	private userMessage userMessage = null;
	public User(userMessage userMessage) {
		ip = "localhost";
		port = 8888;
		this.userMessage = userMessage;
		username = this.userMessage.getName();
		localPort = this.userMessage.getAccnumber();
	}

	public void run() { // 手动登录，后面有一个重新连接（类似）
		try {
			Thread.sleep(2000);

			InetAddress inetAddress = InetAddress.getByName(ip);
			socket = new Socket(inetAddress, port);
			CFrame.sendPoint = false; // 不发点了

			if (socket.isConnected() && !socket.isClosed()) {
				Thread.sleep(1000);
				flagString = "***********************成功连接服务器***********************";
				CFrame.jTextArea2.append(flagString + "\r\n");
				CFrame.jTextArea2.selectAll();
				CFrame.isOnline = true; //已上线				
				userDao dao = new userDao();
				try {
					dao.updateOnlineflag(this.userMessage.getAccnumber());
				} catch (SQLException e) {
				}
				CFrame.UDPExit = false; //判断UDP是否监听
				setInterruptWithServer(false); //判断是否服务器断开连接
				os = socket.getOutputStream();
				bw = new BufferedWriter(new OutputStreamWriter(os));
				bw.write(username + "," + localPort + "\n");
				bw.flush(); // 发送用户名 和本地监听的端口

				input = socket.getInputStream();
				in = new BufferedReader(new InputStreamReader(input));
				// 接收服务器信息的线程
				Thread thread = new Thread(new Read(this));
				thread.start();
				Thread thread2 = new Thread(new ReadClient(localPort,this.userMessage));
				thread2.start();

			} else {
				flagString = "连接失败...";
			}
		} catch (UnknownHostException e) {
			flagString = "连接失败...";

		} catch (IOException e) {
			// flagString = "连接失败...";
			CFrame.sendPoint = false; // 不发点了
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e1) {
			}
			CFrame.jTextArea2.append("Error：连接超时......\r\n");
			CFrame.jTextArea2.selectAll();
			System.out.println("连接超时");
			CFrame.flag = true; // flag用来控制能否点登录按钮

		} catch (InterruptedException e) {

		}
	}

	public void write(String send) throws SQLException {
		try {
			if (socket.isConnected() && !socket.isClosed()) { // 判断是否连接成功，是否传送成功
				bw.write(send);
				bw.flush();
				setsendOK(true);
				System.out.println("发送成功");

			}
		} catch (IOException e) {
			System.out.println("发送失败");
			CFrame.jTextArea2.append("已经与客户端断开连接，发送失败...\r\n");
			CFrame.jTextArea2.selectAll();
		}
	}

	public void read() throws IOException, InterruptedException {
		try {

			for (String string = in.readLine(); string != null; string = in.readLine()) {
				if (string.equals("qwertyuiop[]")) {
					System.out.println("刷新好友");
					String ClientUsername = in.readLine();// 读取上线的好友的名字
					if (!ClientUsername.equals(username)) {
						CFrame.jTextArea2.append("您的好友 " + ClientUsername + " 已上线！\r\n");
					}
					ObjectInputStream oi = new ObjectInputStream(new BufferedInputStream(socket.getInputStream()));
					try {
						Object obj = oi.readObject();
						Vector<User2> vt = (Vector<User2>) obj;
						Object obj2 = oi.readObject();
						Vector vt1 = (Vector) obj2;
						int RepeatIndex = vt1.indexOf(username);
						vt.remove(RepeatIndex);
						vt1.remove(RepeatIndex);
						CFrame.vt = vt;
						CFrame.vt1 = vt1;
						setIsadd(true);

					} catch (ClassNotFoundException e) {
					}
				} else if (string.equals("qwertyuiop[]clientexit")) {
					System.out.println("刷新好友");
					String ClientUsername = in.readLine();
					if (!ClientUsername.equals(username)) {
						CFrame.jTextArea2.append("您的好友 " + ClientUsername + " 已下线！\r\n");
					} 
					
					ObjectInputStream oi = new ObjectInputStream(new BufferedInputStream(socket.getInputStream()));
					try {
						Object obj = oi.readObject();
						Vector<User2> vt = (Vector<User2>) obj;
						Object obj2 = oi.readObject();
						Vector vt1 = (Vector) obj2;
						int RepeatIndex = vt1.indexOf(username);
						try {
							vt.remove(RepeatIndex);
							vt1.remove(RepeatIndex);
						} catch (Exception e) {
						}					
						CFrame.vt = vt;
						CFrame.vt1 = vt1;
						setIsadd(true);

					} catch (ClassNotFoundException e) {
					}
				} else {
					CFrame.jTextArea2.append(string + "\r\n"); // 收到信息
					CFrame.jTextArea2.selectAll();// 注意！
				}
			}
		} catch (IOException e) {
			if(!CFrame.ClientExit){
				CFrame.jTextArea2.append("提示（1）：服务器已中断……不影响与好友通信\r\n"); 
				CFrame.jTextArea2.append("提示（2）：与服务器失去连接，失去好友下线提示功能\r\n"); 
				CFrame.jTextArea2.append("提示（3）：重新登录并且连上服务器才能刷新好友列表\r\n");
				CFrame.jTextArea2.selectAll();
				setInterruptWithServer(true);
				socket.close();
			}
		}		
	}

	
	public userMessage getUserMessage() {
		return userMessage;
	}

	public void setUserMessage(userMessage userMessage) {
		this.userMessage = userMessage;
	}

	public int getLocalPort() {
		return localPort;
	}

	public void setLocalPort(int localPort) {
		this.localPort = localPort;
	}

	public Socket getSocket() {
		return socket;
	}

	public void setSocket(Socket socket) {
		this.socket = socket;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getflagString() {
		return flagString;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public boolean getsendOK() {
		return sendOK;
	}

	public void setsendOK(boolean sendOK) {
		this.sendOK = sendOK;
	}

	public String getFlagString() {
		return flagString;
	}

	public void setFlagString(String flagString) {
		this.flagString = flagString;
	}

	public boolean getIsadd() {
		return isadd;
	}

	public void setIsadd(boolean isadd) {
		this.isadd = isadd;
	}

	public boolean isInterruptWithServer() {
		return interruptWithServer;
	}

	public void setInterruptWithServer(boolean interruptWithServer) {
		this.interruptWithServer = interruptWithServer;
	}
	

}

class Read implements Runnable {
	private User client;

	public Read(User client) {
		this.client = client;
	}

	@Override
	public void run() {
		try {
			client.read();
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("错误1");
		} catch (InterruptedException e) {
			System.out.println("错误2");
		}
	}
}

class ReadClient implements Runnable {   //UDP通信

	public static DatagramSocket socket = null;
	private int localport = 0;
	private userMessage userMessage = null;
	public  ReadClient(int localport,userMessage userMessage) {
		this.localport = localport;
		this.userMessage = userMessage;
	}
	@Override
	public void run() {

		try {
			socket = new DatagramSocket(localport); // 监听这个端口
		} catch (SocketException e1) {
			System.out.println("错误11");
		}

		while (true) {
			if (!socket.isClosed()) {
				byte[] buf = new byte[2048];
				DatagramPacket packet = new DatagramPacket(buf, 0, buf.length);
				try {
					socket.receive(packet);
					String info = new String(buf, 0, packet.getLength());
					int temp = info.indexOf('：');
					String temp2 = info.substring(0, temp-1); //temp2是用户名
					System.out.println(temp2);
					int temp3 = CFrame.vt1.indexOf(temp2);
					
					Thread notifyThread = new Thread(new notify(temp3));
					notifyThread.start();
					CFrame.jTextArea2.append("提示： "+ temp2 + "向您发了一条消息……\r\n");
					CFrame.vt.get(temp3).setstring(info + "\r\n");
					CFrame.jTextArea2.selectAll();
					userDao dao = new userDao();
					try {
						//聊天记录
						dao.updateChatlog(this.userMessage, info + "\r\n");
					} catch (SQLException e) {
						e.printStackTrace();
					}
				} catch (IOException e) {

				}
			}
			else {
				System.out.println("socket已关闭，并且关闭了端口");
				break;
			}
		}
	}
}

class notify implements Runnable{
	private int index;

	public notify(int index){
		this.index = index;
	}
	@Override
	public void run() {
		CFrame.jList1.setSelectedIndex(index);
		try {
			Thread.sleep(90);
		} catch (InterruptedException e) {
		}
		CFrame.jList1.clearSelection();
		try {
			Thread.sleep(90);
		} catch (InterruptedException e) {
		}
		CFrame.jList1.setSelectedIndex(index);
		try {
			Thread.sleep(90);
		} catch (InterruptedException e) {
		}
		CFrame.jList1.clearSelection();
		try {
			Thread.sleep(90);
		} catch (InterruptedException e) {
		}		
		CFrame.jList1.setSelectedIndex(index);
		try {
			Thread.sleep(90);
		} catch (InterruptedException e) {
		}
		CFrame.jList1.clearSelection();
		try {
			Thread.sleep(90);
		} catch (InterruptedException e) {
		}
		CFrame.jList1.setSelectedIndex(index);
		try {
			Thread.sleep(90);
		} catch (InterruptedException e) {
		}
		CFrame.jList1.clearSelection();
		try {
			Thread.sleep(90);
		} catch (InterruptedException e) {
		}
		CFrame.jList1.setSelectedIndex(index);
		try {
			Thread.sleep(90);
		} catch (InterruptedException e) {
		}
		CFrame.jList1.clearSelection();
		try {
			Thread.sleep(90);
		} catch (InterruptedException e) {
		}
		if(CFrame.index==0){
			CFrame.jList1.clearSelection();
		}
		else{
			CFrame.jList1.setSelectedIndex(CFrame.index);
		}
	}	
}
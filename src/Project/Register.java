package Project;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.SQLException;
import java.util.List;

import javax.swing.JOptionPane;

import dao.userDao;
import model.userMessage;

public class Register extends javax.swing.JFrame {

    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;

    public Register() {
        initComponents();
    }
                        
    private void initComponents() {

        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jPanel1 = new javax.swing.JPanel();
        jTextField8 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();

        jFormattedTextField1.setText("jFormattedTextField1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 215, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 158, Short.MAX_VALUE)
        );

        jTextField8.setText("jTextField8");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        jLabel1.setText("注册账号");

        jLabel2.setText("账号");

        jLabel3.setText("密码");

        jLabel4.setText("确认密码");

        jLabel5.setText("姓名");

        jLabel6.setText("出生地");

        jLabel7.setText("所住地");

        jTextField1.addKeyListener(new KeyListener() {  
            @Override  
            public void keyTyped(KeyEvent e) {  
            	if(jTextField1.getText().length()>=5) e.consume();
                int temp = e.getKeyChar();   
                if(temp == 10){//按回车时  
                  
                }else if(temp != 46){   //没有按小数点时  
                    if(temp != 8){  //没有按backspace时  
                        //下面检查是不是在0~9之间；  
                        if(temp > 57){  
                            e.consume();    //如果不是则消除key事件,也就是按了键盘以后没有反应;  
                        }else if(temp < 48){  
                            e.consume();  
                        }  
                    }  
                }         
            }  
            @Override  
            public void keyReleased(KeyEvent e) {  
                // TODO Auto-generated method stub  
            }  
            @Override  
            public void keyPressed(KeyEvent e) {  
                // TODO Auto-generated method stub        
            }  
});

        jTextField2.addKeyListener(new KeyListener() {  
            @Override  
            public void keyTyped(KeyEvent e) {  
            	String s = jTextField2.getText();
            	if(s.length()>=16) e.consume();
            }
            @Override  
            public void keyReleased(KeyEvent e) {   
            }  
            @Override  
            public void keyPressed(KeyEvent e) {     
            }  
});
        jTextField3.addKeyListener(new KeyListener() {  
            @Override  
            public void keyTyped(KeyEvent e) {  
            	String s = jTextField3.getText();
            	if(s.length()>=16) e.consume();
            }
            @Override  
            public void keyReleased(KeyEvent e) {   
            }  
            @Override  
            public void keyPressed(KeyEvent e) {     
            }  
});
        jButton1.setText("申请注册");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
					jButton1ActionPerformed(evt);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });
        jLabel8.setText("性别");

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("男");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("女");

        jLabel9.setText("年龄");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28" }));

        jLabel10.setText("email");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                        .addComponent(jTextField2)
                        .addComponent(jTextField3)
                        .addComponent(jTextField4)
                        .addComponent(jTextField5)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jRadioButton1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jRadioButton2))
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField6)
                        .addComponent(jTextField7))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(123, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );
        this.setResizable(false);
        this.setTitle("注册");
        this.setDefaultCloseOperation(HIDE_ON_CLOSE);
        this.setVisible(true);
        pack();
    }                        
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {                                         
    	register();
    } 
    public void register() throws SQLException{
    	userDao dao = new userDao();
    	
    	//判断账号是否合法
    	if(jTextField1.getText().equals(""))
		{
			JOptionPane.showMessageDialog(null, "Error：账号不能为空！", "WARNING", JOptionPane.WARNING_MESSAGE);
			return;
		}
    	int accnumber = Integer.parseInt(jTextField1.getText());
    	if(accnumber<1024||accnumber>65535)
    	{
    		JOptionPane.showMessageDialog(null, "Error：账号只能是1024~65535之内！", "WARNING", JOptionPane.WARNING_MESSAGE);
			return;
    	}
		List<userMessage> userList = dao.query();
		for(int i = 0;i<userList.size();i++){			
			if(accnumber==userList.get(i).getAccnumber())
			{
				JOptionPane.showMessageDialog(null, "Error：此账号已存在！", "WARNING", JOptionPane.WARNING_MESSAGE);
				return;
			}
		}
		//判断密码是否合法
		if(jTextField2.getText().equals("")||jTextField3.getText().equals(""))
		{
			JOptionPane.showMessageDialog(null, "Error：密码不能为空！", "WARNING", JOptionPane.WARNING_MESSAGE);
			return;
		}
		if(!jTextField2.getText().equals(jTextField3.getText()))
		{
			JOptionPane.showMessageDialog(null, "Error：两次密码不同，请输入正确！", "WARNING", JOptionPane.WARNING_MESSAGE);
			return;
		}
		
		//开始输入其他信息进行注册
		int sex = 1;
		String password = jTextField2.getText();
		String name = jTextField4.getText();
		if(jRadioButton1.isSelected()) sex = 1;	//男	
		else sex = 0;//女
		int age = Integer.parseInt((String)jComboBox1.getSelectedItem());
		System.out.println(age);
		String email = jTextField7.getText();
		String biraddress = jTextField5.getText();
		String address = jTextField6.getText();
		String ispass = "No";
		userMessage user = new userMessage();
		user.setAccnumber(accnumber);
		user.setAddress(address);
		user.setAge(age);
		user.setBiraddress(biraddress);
		user.setEmail(email);
		user.setName(name);
		user.setPassword(password);
		user.setSex(sex);
		user.setOnlineflag("×");
		user.setChatlog("");
		user.setIsPass(ispass);
		dao.addUser(user);
		JOptionPane.showMessageDialog(null, "申请成功，请等待审核！", "申请成功", JOptionPane.INFORMATION_MESSAGE);		
		this.setLocation(550, 230);
		this.setVisible(false);
    }                
}

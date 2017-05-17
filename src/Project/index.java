package Project;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.SQLException;
import java.util.List;

import javax.swing.JOptionPane;

import dao.userDao;
import model.userMessage;

public class index extends javax.swing.JFrame {

    public index() {
        initComponents();
    }
                        
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        jLabel1.setText("账号");

        jLabel2.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        jLabel2.setText("密码");
        
 
        jTextField1.addKeyListener(new KeyListener() {  
            @Override  
            public void keyTyped(KeyEvent e) {  
            	String s = jTextField1.getText();
            	if(s.length()>=5) e.consume();
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
            }  
            @Override  
            public void keyPressed(KeyEvent e) {     
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
        jButton1.setText("注册账号");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        
        jButton2.setText("登   录");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
					jButton2ActionPerformed(evt);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton1, jButton2});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel1, jLabel2});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jButton2.setMnemonic(java.awt.event.KeyEvent.VK_ENTER);
        this.setResizable(false);
        this.setLocation(550, 230);
        this.setTitle("软件首页");
        pack();
    }// </editor-fold>                        

    //注册
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
    	new Register();       
    } 
    //登录
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) throws InterruptedException, SQLException {                                         
    	boolean flag = false;
    	userDao dao = new userDao();
    	//判断账号是否合法
    	if(jTextField1.getText().equals(""))
		{
			JOptionPane.showMessageDialog(null, "Error：账号不能为空！", "WARNING", JOptionPane.WARNING_MESSAGE);
			return;
		}
    	//管理员登录
    	if(jTextField1.getText().equals("1"))
    	{
    		if(jTextField2.getText().equals("root"))
    		{
    			new Manager();
    			this.setVisible(false);
    			return;
    		}
    		else
    		{
    			JOptionPane.showMessageDialog(null, "Error：密码错误！", "WARNING", JOptionPane.WARNING_MESSAGE);
    			jTextField1.setText("");jTextField2.setText("");
    			return;
    		}
    	}
    	
    	List<userMessage> userList = dao.query();
    	int accnumber = Integer.parseInt(jTextField1.getText());
    	for(int i = 0;i<userList.size();i++)
    	{
    		if(accnumber==userList.get(i).getAccnumber())
    		{	
    			System.out.println(userList.get(i).getIsPass());
    			if(userList.get(i).getIsPass().equals("No"))
    			{
    				JOptionPane.showMessageDialog(null, "Error：该账号还没通过审核，请等待！", "WARNING", JOptionPane.WARNING_MESSAGE);
        			jTextField1.setText("");jTextField2.setText("");
    				return; 
    			}
    			String password = jTextField2.getText();
    			if(!password.equals(userList.get(i).getPassword()))
    			{   	
    				JOptionPane.showMessageDialog(null, "Error：密码错误！", "WARNING", JOptionPane.WARNING_MESSAGE);
        			jTextField1.setText("");jTextField2.setText("");
    				return;  				
    			}
    			//密码正确
    			if(userList.get(i).getOnlineflag().equals("√"))
    			{
    				JOptionPane.showMessageDialog(null, "Error：此账号已经在线！", "WARNING", JOptionPane.WARNING_MESSAGE);
        			jTextField1.setText("");jTextField2.setText("");
    				return; 
    			}
    			User user = new User(userList.get(i));
    	    	Thread thread = new Thread(new CFrame(user));
    	    	thread.start();
    	    	this.setVisible(false);
    	    	flag = true;
    	    	break;
    		}
    	}
    	if(!flag)
    	JOptionPane.showMessageDialog(null, "Error：不存在此账号！", "WARNING", JOptionPane.WARNING_MESSAGE);
		jTextField1.setText("");jTextField2.setText("");
    	return;     
    }                                        


    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new index().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration                   
}

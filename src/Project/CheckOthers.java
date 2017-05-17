package Project;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.SQLException;
import java.util.List;

import javax.swing.JOptionPane;

import dao.userDao;
import model.userMessage;

public class CheckOthers extends javax.swing.JFrame {

  
    public CheckOthers() {
    	
    	buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(242, 255, 255));

        jTextField1.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N

        jTextField2.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N

        jButton1.setText("查  找");
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

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("账号查找");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("姓名查找");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButton1)
                                    .addComponent(jRadioButton2))
                                .addGap(11, 11, 11)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(19, 19, 19))
        );

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
            	if(s.length()>=10) e.consume();
            }
            @Override  
            public void keyReleased(KeyEvent e) {   
            }  
            @Override  
            public void keyPressed(KeyEvent e) {     
            }  
});
        jRadioButton1.setSelected(true);
        this.setLocation(550, 230);
        this.setTitle("查  找");
    	this.setVisible(true);
    	this.setResizable(false);
    	this.setDefaultCloseOperation(HIDE_ON_CLOSE);
        pack();
    }                       
     //查找                               
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {                                         
    	userDao dao = new userDao();
    	if(jRadioButton1.isSelected())
    	{
        	List<userMessage> userList = dao.query();
        	int accnumber = Integer.parseInt(jTextField1.getText());
        	for(int i = 0;i<userList.size();i++)
        	{
        		if(accnumber==userList.get(i).getAccnumber())
        		{
        			new othersMessage(userList.get(i));
        			this.setVisible(false);
        			return;
        		}
        	}
        	JOptionPane.showMessageDialog(null, "Error：查找失败，没有此用户！", "WARNING", JOptionPane.WARNING_MESSAGE);
        	jTextField1.setText("");jTextField2.setText("");       	
        	return;
    	}
    	else if(jRadioButton2.isSelected())
    	{
    		List<userMessage> userList = dao.query();
        	String name = jTextField2.getText();
        	for(int i = 0;i<userList.size();i++)
        	{
        		if(userList.get(i).getName().equals(name))
        		{
        			new othersMessage(userList.get(i));
        			this.setVisible(false);
        			return;
        		}
        	}
        	JOptionPane.showMessageDialog(null, "Error：查找失败，没有此用户！", "WARNING", JOptionPane.WARNING_MESSAGE);
        	jTextField1.setText("");jTextField2.setText("");      	
        	return;
    	}
    }                                        

    private javax.swing.ButtonGroup buttonGroup1;            
    private javax.swing.JButton jButton1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration                   
}

package Project;

import java.sql.SQLException;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.TableModel;

import dao.userDao;
import model.userMessage;

public class Manager extends javax.swing.JFrame {
  
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JButton jButton4;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JSeparator jSeparator1;
	private javax.swing.JSeparator jSeparator2;
	public static javax.swing.JTable jTable1;

    public Manager() throws SQLException {

        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(242, 255, 255));

        jLabel1.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        jLabel1.setText("   管理员");

        jTable1.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "账  号", "密  码", "姓  名", "性  别", "年  龄", "户  籍", "地  址", "email", "上线状态"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jScrollPane1.setViewportView(jTable1);

        jButton1.setBackground(new java.awt.Color(244, 255, 255));
        jButton1.setText("特殊查询");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        jLabel1.setText("管理员");

        jButton2.setBackground(new java.awt.Color(244, 255, 255));
        jButton2.setText("查看申请列表");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
					jButton2ActionPerformed(evt);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });

        jButton3.setBackground(new java.awt.Color(244, 255, 255));
        jButton3.setText("删除用户");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
					jButton3ActionPerformed(evt);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });

        jButton4.setBackground(new java.awt.Color(244, 255, 255));
        jButton4.setText("查看聊天记录");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
					jButton4ActionPerformed(evt);
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
            .addComponent(jSeparator1)
            .addComponent(jSeparator2)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 991, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1)
                        .addGap(17, 17, 17))))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton1, jButton2, jButton3, jButton4});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addContainerGap())
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
        jTable1.getSelectionModel().setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        //显示数据
        userDao dao = new userDao();
        List<userMessage> userList = dao.query();
        TableModel model = jTable1.getModel();
        for(int i = 0;i<userList.size();i++)
        {
        	model.setValueAt(userList.get(i).getAccnumber(), i, 0);  
        	model.setValueAt(userList.get(i).getPassword(), i, 1);
        	model.setValueAt(userList.get(i).getName(), i, 2);
        	if(userList.get(i).getSex()==1) model.setValueAt("男", i, 3);
        	else model.setValueAt("女", i, 3);
        	model.setValueAt(userList.get(i).getAge()+"", i, 4);
        	model.setValueAt(userList.get(i).getBiraddress(), i, 5);
        	model.setValueAt(userList.get(i).getAddress(), i, 6);
        	model.setValueAt(userList.get(i).getEmail(), i, 7);
        	model.setValueAt(userList.get(i).getOnlineflag(), i, 8);
        }
        this.setTitle("管理员");
        this.setLocation(200, 70);
        this.setVisible(true);  
        this.setResizable(false);
        pack();
       Thread thread = new Thread(new updateView());
       thread.start();
    }                        
    //删除用户
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {      
    	if(jTable1.getValueAt(jTable1.getSelectedRow(), 0)==null)
    	{
    		JOptionPane.showMessageDialog(null, "Error：请选定你要删除的用户！", "WARNING", JOptionPane.WARNING_MESSAGE);       	      	
        	return;
    	}
        int accnumber = (int) (jTable1.getValueAt(jTable1.getSelectedRow(), 0));
        userDao dao = new userDao();
        int result = JOptionPane.showConfirmDialog(null, "确定要删除用户  "+ dao.getDeleteName(accnumber)+ " ?", "确定删除", 0);
        //删除
        if(result==0){
        	dao.deleteUser(accnumber);
        	JOptionPane.showMessageDialog(null, "删除成功！", "WARNING", JOptionPane.WARNING_MESSAGE);       	      	
        	return;
        }
        return;
    }                                        
    //查看聊天记录
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {                                         
    	if(jTable1.getValueAt(jTable1.getSelectedRow(), 0)==null)
    	{
    		JOptionPane.showMessageDialog(null, "Error：未选中用户！", "WARNING", JOptionPane.WARNING_MESSAGE);       	      	
        	return;
    	}
    	//查看聊天记录
    	int accnumber = (int) (jTable1.getValueAt(jTable1.getSelectedRow(), 0));
    	userDao dao = new userDao();
    	List<userMessage> userList = dao.query();
    	userMessage user = null;
    	for(int i = 0;i<userList.size();i++)
    	{
    		if(accnumber==userList.get(i).getAccnumber())
    		{
    			user = userList.get(i);
    			break;
    		}
    	}
    	new Chatlog(user);
    }                                        
    //特殊查询
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        new CheckByManager();
    }  
    //查看申请列表
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {                                         
        new PassIndex();
    }
}
	class updateView implements Runnable{

		private int flagnumber = 0;
		public void run() {
			while(true){
			try {
				Thread.sleep(500);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
			//不断动态更新
			userDao dao = new userDao();
	        List<userMessage> userList;
			try {
				userList = dao.query();
		        TableModel model = Manager.jTable1.getModel();
		        for(int i = 0;i<flagnumber;i++)
		        {
		        	model.setValueAt("", i, 0);model.setValueAt("", i, 1);model.setValueAt("", i, 2);
		        	model.setValueAt("", i, 3);model.setValueAt("", i, 4);model.setValueAt("", i, 5);
		        	model.setValueAt("", i, 6);model.setValueAt("", i, 7);model.setValueAt("", i, 8);
		        }
		        for(int i = 0;i<userList.size();i++)
		        {
		        	model.setValueAt(userList.get(i).getAccnumber(), i, 0);  
		        	model.setValueAt(userList.get(i).getPassword(), i, 1);
		        	model.setValueAt(userList.get(i).getName(), i, 2);
		        	if(userList.get(i).getSex()==1) model.setValueAt("男", i, 3);
		        	else model.setValueAt("女", i, 3);
		        	model.setValueAt(userList.get(i).getAge()+"", i, 4);
		        	model.setValueAt(userList.get(i).getBiraddress(), i, 5);
		        	model.setValueAt(userList.get(i).getAddress(), i, 6);
		        	model.setValueAt(userList.get(i).getEmail(), i, 7);
		        	model.setValueAt(userList.get(i).getOnlineflag(), i, 8);
		        }
		        flagnumber = userList.size();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			}
		}		
	}

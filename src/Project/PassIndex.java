package Project;

import java.awt.HeadlessException;
import java.sql.SQLException;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.TableModel;

import dao.userDao;
import model.userMessage;

public class PassIndex extends javax.swing.JFrame {

    public PassIndex() throws SQLException {

        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(242, 255, 255));

        jTable1.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "账  号", "姓  名", "性  别", "年  龄", "户  籍", "地  址", "email"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton1.setBackground(new java.awt.Color(244, 255, 255));
        jButton1.setText("通过审核");
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

        jLabel1.setFont(new java.awt.Font("宋体", 0, 18)); // NOI18N
        jLabel1.setText("用户审核");

        jButton2.setBackground(new java.awt.Color(244, 255, 255));
        jButton2.setText("不通过");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
					jButton2ActionPerformed(evt);
				} catch (HeadlessException e) {
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
            .addComponent(jSeparator1)
            .addComponent(jSeparator2)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 702, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton1, jButton2});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        List<userMessage> userList = dao.getNotPass();
        TableModel model = jTable1.getModel();
        for(int i = 0;i<userList.size();i++)
        {
        	model.setValueAt(userList.get(i).getAccnumber(), i, 0);  
        	model.setValueAt(userList.get(i).getName(), i, 1);
        	if(userList.get(i).getSex()==1) model.setValueAt("男", i, 2);
        	else model.setValueAt("女", i, 2);
        	model.setValueAt(userList.get(i).getAge()+"", i, 3);
        	model.setValueAt(userList.get(i).getBiraddress(), i, 4);
        	model.setValueAt(userList.get(i).getAddress(), i, 5);
        	model.setValueAt(userList.get(i).getEmail(), i, 6);
        }
        this.setTitle("申请列表");
        this.setLocation(550, 230);
        this.setVisible(true);  
        this.setResizable(false);
        this.setDefaultCloseOperation(HIDE_ON_CLOSE);
        pack();
        Thread thread = new Thread(new updatePassView());
        thread.start();
    } 
    
    //不通过审核，从数据库删除
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) throws HeadlessException, SQLException {                                         
    	if(jTable1.getValueAt(jTable1.getSelectedRow(), 0)==null)
    	{
    		JOptionPane.showMessageDialog(null, "Error：请选定用户！", "WARNING", JOptionPane.WARNING_MESSAGE);       	      	
        	return;
    	}
        int accnumber = (int) (jTable1.getValueAt(jTable1.getSelectedRow(), 0));
        userDao dao = new userDao();
        int result = JOptionPane.showConfirmDialog(null, "确定用户  "+ dao.getDeleteName(accnumber)+ " 不通过审核?", "审核确认", 0);
        if(result==0){
        	dao.deleteUser(accnumber);
        }
        return;
    }                                        
    //通过审核
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {                                         
    	if(jTable1.getValueAt(jTable1.getSelectedRow(), 0)==null)
    	{
    		JOptionPane.showMessageDialog(null, "Error：请选定用户！", "WARNING", JOptionPane.WARNING_MESSAGE);       	      	
        	return;
    	}
        int accnumber = (int) (jTable1.getValueAt(jTable1.getSelectedRow(), 0));
        userDao dao = new userDao();
        int result = JOptionPane.showConfirmDialog(null, "确定用户  "+ dao.getDeleteName(accnumber)+ " 通过审核?", "审核确认", 0);
        if(result==0){
        	dao.userPass(accnumber);
        	JOptionPane.showMessageDialog(null, "审核成功！", "WARNING", JOptionPane.WARNING_MESSAGE);       	      	
        	return;
        }
        return;
    }                                        
                   
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    public static javax.swing.JTable jTable1;
    // End of variables declaration                   
}
class updatePassView implements Runnable{

	private int flagnumber = 0;
	public void run() {
		while(true){
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		//不断动态更新
		userDao dao = new userDao();
        List<userMessage> userList;
		try {
	        userList = dao.getNotPass();
	        TableModel model = PassIndex.jTable1.getModel();
	        for(int i = 0;i<flagnumber;i++)
	        {
	        	model.setValueAt("", i, 0);  model.setValueAt("", i, 1); model.setValueAt("", i, 2); 
	        	model.setValueAt("", i, 3); model.setValueAt("", i, 4); model.setValueAt("", i, 5); model.setValueAt("", i, 6); 
	        	
	        }
	        for(int i = 0;i<userList.size();i++)
	        {
	        	model.setValueAt(userList.get(i).getAccnumber(), i, 0);  
	        	model.setValueAt(userList.get(i).getName(), i, 1);
	        	if(userList.get(i).getSex()==1) model.setValueAt("男", i, 2);
	        	else model.setValueAt("女", i, 2);
	        	model.setValueAt(userList.get(i).getAge()+"", i, 3);
	        	model.setValueAt(userList.get(i).getBiraddress(), i, 4);
	        	model.setValueAt(userList.get(i).getAddress(), i, 5);
	        	model.setValueAt(userList.get(i).getEmail(), i, 6);
	        }
	        flagnumber = userList.size();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		}
	}		
}


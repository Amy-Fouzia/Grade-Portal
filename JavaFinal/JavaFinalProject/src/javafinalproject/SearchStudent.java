package javafinalproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class SearchStudent extends javax.swing.JFrame {
    
    public SearchStudent() {
        initComponents();
    }
                   
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(237, 224, 212));

        jPanel7.setBackground(new java.awt.Color(230, 204, 178));

        jButton20.setBackground(new java.awt.Color(176, 137, 104));
        jButton20.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        jButton20.setForeground(new java.awt.Color(237, 224, 212));
        jButton20.setText("View Students");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        jButton21.setBackground(new java.awt.Color(176, 137, 104));
        jButton21.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        jButton21.setForeground(new java.awt.Color(237, 224, 212));
        jButton21.setText("Edit Grades");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        jButton22.setBackground(new java.awt.Color(176, 137, 104));
        jButton22.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        jButton22.setForeground(new java.awt.Color(237, 224, 212));
        jButton22.setText("Account");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        jButton23.setBackground(new java.awt.Color(176, 137, 104));
        jButton23.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        jButton23.setForeground(new java.awt.Color(237, 224, 212));
        jButton23.setText("Class Stats");
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });

        jButton24.setBackground(new java.awt.Color(176, 137, 104));
        jButton24.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        jButton24.setForeground(new java.awt.Color(237, 224, 212));
        jButton24.setText("Search Student");
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(230, 204, 178));
        jPanel2.setPreferredSize(new java.awt.Dimension(552, 59));

        jLabel6.setBackground(new java.awt.Color(127, 85, 57));
        jLabel6.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(127, 85, 57));
        jLabel6.setText("Search");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 552, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel6)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 59, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel6)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTextField2.setBackground(new java.awt.Color(221, 184, 146));
        jTextField2.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(127, 85, 57));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(127, 85, 57));
        jLabel1.setText("Student ID:");

        jTextField4.setEditable(false);
        jTextField4.setBackground(new java.awt.Color(221, 184, 146));
        jTextField4.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(127, 85, 57));
        jTextField4.setText("Name");

        jLabel3.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(127, 85, 57));
        jLabel3.setText("Results:");

        jTextField5.setEditable(false);
        jTextField5.setBackground(new java.awt.Color(221, 184, 146));
        jTextField5.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(127, 85, 57));
        jTextField5.setText("Grades");

        jTextField6.setEditable(false);
        jTextField6.setBackground(new java.awt.Color(221, 184, 146));
        jTextField6.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(127, 85, 57));
        jTextField6.setText("Average");

        jTextField7.setEditable(false);
        jTextField7.setBackground(new java.awt.Color(221, 184, 146));
        jTextField7.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        jTextField7.setForeground(new java.awt.Color(127, 85, 57));
        jTextField7.setText("Letter Grade");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField7)
                    .addComponent(jTextField6)
                    .addComponent(jTextField5)
                    .addComponent(jTextField2)
                    .addComponent(jTextField4, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }                  

    
    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // View  
        ViewStudent next = new ViewStudent();
        next.show();
        dispose();
    }                                        

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // Edit Grades
        EditGrades next = new EditGrades();
        next.show();
        dispose();
    }                                        

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // Account
        Account next = new Account();
        next.show();
        dispose();
    }                                        

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // Class Stats
        ClassStats next = new ClassStats();
        next.show();
        dispose();
    }                                        

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // Search Student
        SearchStudent next = new SearchStudent();
        next.show();
        dispose();
    }                                

    
    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // find and display results
        Connection con;
        Statement stmnt;
        ResultSet userQuery;
        Statement stmnt2;
        @SuppressWarnings("UnusedAssignment")
        ResultSet studentInfo = null;
        boolean match = false;
        
        String url = "jdbc:mysql://localhost:3306/grade_portal";
        String user = "root";
        String password = "Aliexpress1!";
        
        try {
            //get user input
            String checkID = jTextField2.getText();
            
            //get database info
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
            stmnt = con.createStatement();
            userQuery = stmnt.executeQuery("select student_id from student");

            while(userQuery.next()){
                //check if any criminal ids match user input
                if(userQuery.getString("student_id").equals(checkID)){
                    //if so, get all info
                    stmnt2 = con.createStatement();
                    studentInfo = stmnt2.executeQuery("select * from student where student_id = " + checkID);
                    //display info
                    match = true;
                    java.sql.ResultSetMetaData rsmd = studentInfo.getMetaData();
                    int columnsNumber = rsmd.getColumnCount();    
                    
                    String[] result = new String[5]; //so size can update
                    
                    while (studentInfo.next()) {
                        for (int i = 1; i <= columnsNumber; i++) {
                                String columnValue = studentInfo.getString(i);
                                //System.out.print(rsmd.getColumnName(i) + " " + columnValue + "\n");
                                result[i-1] = (columnValue);
                        }   
                    }
                    
                    jTextField4.setText(result[1]);
                    jTextField5.setText(result[2]);
                    jTextField6.setText(result[3]);
                    jTextField7.setText(result[4]);
                }
                //tests
                //System.out.print("from database: " + userQuery.getString("criminal_id") + "\n");
                //System.out.print("input: " + checkUser + "\n"); 
            }
            
            if(match == false){
                //display "no match found"
                JOptionPane.showMessageDialog(null,"No Match Found, Try Again");
                JOptionPane.getRootFrame().dispose();
            }
            
        } catch (SQLException exc) {
            exc.printStackTrace();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }     

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchStudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;           
}

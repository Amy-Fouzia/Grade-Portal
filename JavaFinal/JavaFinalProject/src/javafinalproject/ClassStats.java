package javafinalproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ClassStats extends javax.swing.JFrame {
    
    public ClassStats() {
        initComponents();
    }
                     
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(237, 224, 212));

        jPanel4.setBackground(new java.awt.Color(230, 204, 178));

        jButton5.setBackground(new java.awt.Color(176, 137, 104));
        jButton5.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(237, 224, 212));
        jButton5.setText("View Students");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    jButton2ActionPerformed(evt);
                } catch (ClassNotFoundException | SQLException ex) {
                    Logger.getLogger(ClassStats.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    jButton3ActionPerformed(evt);
                } catch (ClassNotFoundException | SQLException ex) {
                    Logger.getLogger(ClassStats.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        

        jButton6.setBackground(new java.awt.Color(176, 137, 104));
        jButton6.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(237, 224, 212));
        jButton6.setText("Edit Grades");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(176, 137, 104));
        jButton8.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        jButton8.setForeground(new java.awt.Color(237, 224, 212));
        jButton8.setText("Account");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(176, 137, 104));
        jButton9.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        jButton9.setForeground(new java.awt.Color(237, 224, 212));
        jButton9.setText("Class Stats");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setBackground(new java.awt.Color(176, 137, 104));
        jButton10.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        jButton10.setForeground(new java.awt.Color(237, 224, 212));
        jButton10.setText("Search Student");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(230, 204, 178));
        jPanel5.setPreferredSize(new java.awt.Dimension(552, 59));

        jLabel5.setBackground(new java.awt.Color(127, 85, 57));
        jLabel5.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(127, 85, 57));
        jLabel5.setText("Class Statistics");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(200, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addContainerGap(111, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        jButton1.setBackground(new java.awt.Color(127, 85, 57));
        jButton1.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(237, 224, 212));
        jButton1.setText("Class Average");

        jButton2.setBackground(new java.awt.Color(127, 85, 57));
        jButton2.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(237, 224, 212));
        jButton2.setText("Highest Score");

        jButton3.setBackground(new java.awt.Color(127, 85, 57));
        jButton3.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(237, 224, 212));
        jButton3.setText("Lowest Score");

        jTextField1.setBackground(new java.awt.Color(221, 184, 146));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.setBackground(new java.awt.Color(221, 184, 146));

        jTextField3.setBackground(new java.awt.Color(221, 184, 146));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(jTextField2)
                    .addComponent(jTextField3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 501, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
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

        pack();
    }                     

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // View  
        ViewStudent next = new ViewStudent();
        next.show();
        dispose();
    }                                        

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // Edit Grades
        EditGrades next = new EditGrades();
        next.show();
        dispose();
    }                                        

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // Account
        Account next = new Account();
        next.show();
        dispose();
    }                                        

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // Class Stats
        ClassStats next = new ClassStats();
        next.show();
        dispose();
    }                                        

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // Search Student
        SearchStudent next = new SearchStudent();
        next.show();
        dispose();
    }                                               

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }      
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        //calc/display class avg
        Connection con;
        Statement stmnt;
        ResultSet grades;
        Statement stmnt2;
        ResultSet numStudents;
        float classAvg = 0;
        
        String url = "jdbc:mysql://localhost:3306/grade_portal";
        String user = "root";
        String password = "Aliexpress1!";
        
        try {
            //get database info
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
            stmnt = con.createStatement();
            grades = stmnt.executeQuery("select average from student");
            stmnt2 = con.createStatement();
            numStudents = stmnt2.executeQuery("select count(student_id) from student");
            numStudents.next();
            int count = numStudents.getInt(1);
            
            while(grades.next()){
                classAvg += grades.getFloat(1);
            }    
            
            classAvg = classAvg / count;
            
            jTextField1.setText(classAvg+"");
            //System.out.print(classAvg + "");
            
        } catch (SQLException exc) {
            exc.printStackTrace();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        
        }
    }     
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt)  throws ClassNotFoundException, SQLException{
        //display highest class score
        Connection con;
        Statement stmnt;
        ResultSet grades;
        int currMax = 0;
        
        String url = "jdbc:mysql://localhost:3306/grade_portal";
        String user = "root";
        String password = "Aliexpress1!";
        
        //get database info
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection(url, user, password);
        stmnt = con.createStatement();
        grades = stmnt.executeQuery("select grades from student");
 
        while(grades.next()){
            ArrayList<Integer> list = str2array(grades.getString("grades"));
            //list alrdy sorted implementation
            if (list.get(list.size()-1)  > currMax){
                currMax = list.get(list.size()-1);
            }
            
            //usual implementtation
//            for(int i = 0; i < list.size(); i++){
//                if(currMax < list.get(i)){
//                    currMax = list.get(i);
//                }
//            }
        }
        
        jTextField2.setText(currMax+"");
        //System.out.print(currMax+"");
    }   
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) throws ClassNotFoundException, SQLException {
        //display class lowest score
        Connection con;
        Statement stmnt;
        ResultSet grades;
        int currMin = 100;
        
        String url = "jdbc:mysql://localhost:3306/grade_portal";
        String user = "root";
        String password = "Aliexpress1!";
        
        //get database info
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection(url, user, password);
        stmnt = con.createStatement();
        grades = stmnt.executeQuery("select grades from student");
 
        while(grades.next()){
            ArrayList<Integer> list = str2array(grades.getString("grades"));
            //list alrdy sorted implementation
            if (list.get(0) < currMin){
                currMin = list.get(0);
            }
            
            //usual implementation
//            for(int i = 0; i < list.size(); i++){
//                if(currMin > list.get(i)){
//                    currMin = list.get(i);
//                }
//            }
        }
        
        jTextField3.setText(currMin+"");
        //System.out.print(currMin+"");
    }  
    
    private ArrayList<Integer> str2array(String chain){
        ArrayList<Integer> list = new ArrayList<>();  

        String[] array = chain.split(",");  //Split the previous String for separate by commas
        for(String s:array){  //Iterate over the previous array for put each element on the ArrayList like Integers
            list.add(Integer.parseInt(s)); 
        }
        return list;
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
            java.util.logging.Logger.getLogger(ClassStats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClassStats().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;                
}

package javafinalproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class ViewStudent extends javax.swing.JFrame {
    public ViewStudent() {
        initComponents();
    }
                    
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        
        jButton1.setBackground(new java.awt.Color(176, 137, 104));
        jButton1.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(237, 224, 212));
        jButton1.setText("show data");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(237, 224, 212));

        jPanel3.setBackground(new java.awt.Color(230, 204, 178));

        jButton5.setBackground(new java.awt.Color(176, 137, 104));
        jButton5.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(237, 224, 212));
        jButton5.setText("View Students");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(230, 204, 178));

        jLabel3.setBackground(new java.awt.Color(127, 85, 57));
        jLabel3.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(127, 85, 57));
        jLabel3.setText("Students");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(256, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap(193, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        jTable1.setBackground(new java.awt.Color(176, 137, 104));
        jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(127, 85, 57)));
        jTable1.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        jTable1.setForeground(new java.awt.Color(237, 224, 212));
        jTable1.getTableHeader().setFont(new java.awt.Font("Agency FB", 1, 16));
        jTable1.getTableHeader().setBackground(new java.awt.Color(127, 85, 57));
        jTable1.getTableHeader().setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(127, 85, 57)));
        jTable1.getTableHeader().setForeground(new java.awt.Color(237, 224, 212));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student ID", "Name", "Grades", "Average", "Letter"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setToolTipText("");
        jTable1.setGridColor(new java.awt.Color(127, 85, 57));
        jTable1.setSelectionBackground(new java.awt.Color(127, 85, 57));
        jTable1.setSelectionForeground(new java.awt.Color(1, 1, 1));
        jScrollPane1.setViewportView(jTable1);


        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(227, 227, 227)
                        .addComponent(jLabel9)
                        .addContainerGap(66, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        //show database data
        Connection con;
        Statement stmnt;
        ResultSet showData;
        
        String url = "jdbc:mysql://localhost:3306/grade_portal";
        String user = "root";
        String password = "Aliexpress1!";
        
        try {
            //get database info
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
            stmnt = con.createStatement();
            showData = stmnt.executeQuery("select * from student");
            
            while(showData.next()){
                int ID = showData.getInt("student_id");
                String name = showData.getString("name");
                String grades = showData.getString("grades");
                Float avg = showData.getFloat("average");
                String letter = showData.getString("letter");
                
                Object[] data = {ID, name, grades, avg, letter};
                DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
                model.addRow(data);
            }
            
        } catch (SQLException exc) {
            exc.printStackTrace();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                        

    public static void AddRow(Object[] dataRow){
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        model.addRow(dataRow);
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
            java.util.logging.Logger.getLogger(ViewStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewStudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify 
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JTable jTable1;                  
}


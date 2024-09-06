package javafinalproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;

public class Login extends javax.swing.JFrame {
    public Login() {
        initComponents();
    }

    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panel1 = new java.awt.Panel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 153, 0));

        jPanel1.setBackground(new java.awt.Color(237, 224, 212));

        panel1.setBackground(new java.awt.Color(230, 204, 178));

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 99, Short.MAX_VALUE)
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 294, Short.MAX_VALUE)
        );

        jLabel1.setBackground(new java.awt.Color(127, 85, 57));
        jLabel1.setFont(new java.awt.Font("Agency FB", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(127, 85, 57));
        jLabel1.setText("Welcome");

        jLabel2.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(127, 85, 57));
        jLabel2.setText("Grade Portal Login");

        jLabel3.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(127, 85, 57));
        jLabel3.setText("Username:");

        jLabel4.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(127, 85, 57));
        jLabel4.setText("Password:");

        jTextField1.setBackground(new java.awt.Color(221, 184, 146));

        jPasswordField1.setBackground(new java.awt.Color(221, 184, 146));

        jButton1.setBackground(new java.awt.Color(127, 85, 57));
        jButton1.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(237, 224, 212));
        jButton1.setText("login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPasswordField1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(149, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
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

        pack();
    }                       
                      
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        //auth login and rediret to correct page
        Connection con;
        Statement stmnt;
        ResultSet userQuery;
        boolean auth = false;
        
        String url = "jdbc:mysql://localhost:3306/grade_portal";
        String user = "root";
        String password = "Aliexpress1!";
        
        try {
            //get user input
            String checkUser = jTextField1.getText();
            String checkPass = jPasswordField1.getText();
            
            //get database info
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
            stmnt = con.createStatement();
            userQuery = stmnt.executeQuery("select * from user");
            
            while(userQuery.next()){
                if(userQuery.getString("username").equals(checkUser) & userQuery.getString("password").equals(checkPass)){
                    //auth success
                    auth = true;
                    //check job
                    if(userQuery.getString("job").equals("student")){
                        //display specific students data
                        JFrame frame = new JFrame(checkUser + "'s Grades");
                        frame.setBackground(new java.awt.Color(237, 224, 212));
                        frame.setSize(515,294);
                        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        
                        Statement stmnt2 = con.createStatement();
                        ResultSet getGrades = stmnt2.executeQuery("select * from student where name = '" + checkUser + "'");
                        
                        java.sql.ResultSetMetaData rsmd = getGrades.getMetaData();
                        int columnsNumber = rsmd.getColumnCount(); 
                        ArrayList<String> result = new ArrayList<>(); //so size can update
                    
                        while (getGrades.next()) {
                            for (int i = 1; i <= columnsNumber; i++) {
                                String columnValue = getGrades.getString(i);
                                result.add(rsmd.getColumnName(i) + ": " + columnValue + "\n");
                            }   
                            result.add("\n");
                        } 
                    
                        //converting arraylist to array to jlist
                        Object[] objects = result.toArray();
                        JList resultList = new JList(objects);
                    
                        JScrollPane scrollPane = new JScrollPane();
                        scrollPane.setViewportView(resultList);
                        resultList.setLayoutOrientation(JList.VERTICAL);
                        frame.add(scrollPane);
                        frame.show();
                    }
                    else{
                        //redirect to prof page
                        Account next = new Account();
                        next.show();
                        dispose();
                    }
                }
                //tests
                //System.out.print("from database: " + userQuery.getString("username") + "\n");
                //System.out.print("input: " + checkUser + "\n");
                //System.out.print("from database: " + userQuery.getString("password") + "\n");
                //System.out.print("input: " + checkPass + "\n");            
            }
            
            if(auth == false){
                JOptionPane.showMessageDialog(null,"Account Not Found, Try Again");
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        // Create and display the form
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration                     
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    private java.awt.Panel panel1;              
}

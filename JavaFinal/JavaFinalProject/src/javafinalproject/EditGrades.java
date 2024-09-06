package javafinalproject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;


public class EditGrades extends javax.swing.JFrame {
    public EditGrades() {
        initComponents();
    }
                       
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();

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
        
        jTextField3.setText("test.txt");
        
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(230, 204, 178));
        jPanel2.setMinimumSize(new java.awt.Dimension(0, 0));
        jPanel2.setPreferredSize(new java.awt.Dimension(552, 59));

        jLabel5.setBackground(new java.awt.Color(127, 85, 57));
        jLabel5.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(127, 85, 57));
        jLabel5.setText("Edit Grades");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(127, 85, 57));
        jLabel1.setText("Student ID/Name: ");

        jLabel2.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(127, 85, 57));
        jLabel2.setText("Grades (NO SPACES): ");

        jLabel3.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(127, 85, 57));
        jLabel3.setText("Update Students Through File Upload:");

        jLabel4.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(127, 85, 57));
        jLabel4.setText("Update Students Through Student ID or Name:");

        jLabel6.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(127, 85, 57));
        jLabel6.setText("Filename: ");

        jLabel7.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(127, 85, 57));
        jLabel7.setText("To ADD a new student, you need a name and a comma separated list of grades");

        jLabel8.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(127, 85, 57));
        jLabel8.setText("To UPDATE an existing students grade, you need a student ID and a comma separated list of grades");

        jLabel9.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(127, 85, 57));
        jLabel9.setText("To OVERWRITE an existing students grade list, you need a student ID and a comma separated list of grades");

        jLabel10.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(127, 85, 57));
        jLabel10.setText("File must be a txt file containing either ADD, UPDATE and OVERWRITE statments on separate lines");

        jLabel11.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(127, 85, 57));
        jLabel11.setText("It will follow the same rules as above");

        jLabel12.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(127, 85, 57));
        jLabel12.setText("Example: ADD name 83, 56, 64, 91  UPDATE 3 85  OVERWRITE 3 91, 78, 100, 89");

        jButton1.setBackground(new java.awt.Color(127, 85, 57));
        jButton1.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(237, 224, 212));
        jButton1.setText("Add");

        jButton2.setBackground(new java.awt.Color(127, 85, 57));
        jButton2.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(237, 224, 212));
        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    jButton2ActionPerformed(evt);
                } catch (ClassNotFoundException | SQLException ex) {
                    Logger.getLogger(EditGrades.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        jTextField1.setBackground(new java.awt.Color(221, 184, 146));

        jTextField2.setBackground(new java.awt.Color(221, 184, 146));

        jButton3.setBackground(new java.awt.Color(127, 85, 57));
        jButton3.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(237, 224, 212));
        jButton3.setText("Overwrite");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    jButton3ActionPerformed(evt);
                } catch (ClassNotFoundException | SQLException ex) {
                    Logger.getLogger(EditGrades.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        jTextField3.setBackground(new java.awt.Color(221, 184, 146));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    jButton1ActionPerformed(evt);
                } catch (ClassNotFoundException | SQLException ex) {
                    Logger.getLogger(EditGrades.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    jTextField3ActionPerformed(evt);
                } catch (ClassNotFoundException | SQLException | IOException ex) {
                    Logger.getLogger(EditGrades.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jButton1)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel3)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jButton2)
                                    .addGap(18, 18, 18)
                                    .addComponent(jButton3))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel1))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                                        .addComponent(jTextField2))))))
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 676, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2)
                            .addComponent(jButton3))
                        .addGap(12, 12, 12)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12)
                        .addContainerGap(27, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) throws ClassNotFoundException, SQLException {                                         
        // add
        //check for name
        int input;
        
        try{
            input = Integer.parseInt(jTextField1.getText());
            JOptionPane.showMessageDialog(null,"Please enter a valid Student Name");
            JOptionPane.getRootFrame().dispose();
            
        } catch (NumberFormatException e){ //didnt input a number
            Add(jTextField1.getText(), jTextField2.getText());
        }
    }   

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) throws ClassNotFoundException, SQLException {                                         
        // update
        //check for student id
        Connection con;
        Statement stmnt;
        ResultSet userQuery;
        
        String url = "jdbc:mysql://localhost:3306/grade_portal";
        String user = "root";
        String password = "Aliexpress1!";
        int input;
        boolean exists = false;
        
        try{
            input = Integer.parseInt(jTextField1.getText());
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
            stmnt = con.createStatement();
            userQuery = stmnt.executeQuery("select student_id from student");
            
            while(userQuery.next()){
                if(userQuery.getInt(1) == input){
                    exists = true;
                }
            }
            
            if(exists == false){ //student id doesnt exist
                JOptionPane.showMessageDialog(null,"Please enter a valid Student ID");
                JOptionPane.getRootFrame().dispose();
            }
            
            Update(input, jTextField2.getText());
            
        } catch (NumberFormatException e){ //didnt input a number
            JOptionPane.showMessageDialog(null,"Please enter a valid Student ID");
            JOptionPane.getRootFrame().dispose();
        }
    }                                        

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) throws ClassNotFoundException, SQLException {                                         
        // overwrite
        //check for student id
        Connection con;
        Statement stmnt;
        ResultSet userQuery;
        
        String url = "jdbc:mysql://localhost:3306/grade_portal";
        String user = "root";
        String password = "Aliexpress1!";
        int input;
        boolean exists = false;
        
        try{
            input = Integer.parseInt(jTextField1.getText());
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
            stmnt = con.createStatement();
            userQuery = stmnt.executeQuery("select student_id from student");
            
            while(userQuery.next()){
                if(userQuery.getInt(1) == input){
                    exists = true;
                }
            }
            
            if(exists == false){ //student id doesnt exist
                JOptionPane.showMessageDialog(null,"Please enter a valid Student ID");
                JOptionPane.getRootFrame().dispose();
            }
            
            Overwrite(input, jTextField2.getText());
            
            
        } catch (NumberFormatException e){ //didnt input a number
            JOptionPane.showMessageDialog(null,"Please enter a valid Student ID");
            JOptionPane.getRootFrame().dispose();
        }
        
        JOptionPane.showMessageDialog(null,"Success");
        JOptionPane.getRootFrame().dispose();
    }                                  
  
    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) throws ClassNotFoundException, SQLException, IOException {
        //parse file
        File file = new File(jTextField3.getText());
        BufferedReader br = new BufferedReader(new FileReader(file));
        String str;
        while ((str = br.readLine()) != null){
            String[] arr = str.split(" ");
            
                if(arr[0].equals("ADD")){
                    //check for name, grades, pass into add()
                    int input;
                    try{
                        input = Integer.parseInt(arr[1]);
                        JOptionPane.showMessageDialog(null,"Please enter a valid Student Name");
                        JOptionPane.getRootFrame().dispose();
            
                    } catch (NumberFormatException e){ //didnt input a number
                        Add(arr[1],arr[2]);
                    }   
                }
                if(arr[0].equals("UPDATE") || arr[0].equals("OVERWRITE")){
                    //check for id, grades, pass into update()
                    Connection con;
                    Statement stmnt;
                    ResultSet userQuery;
        
                    String url = "jdbc:mysql://localhost:3306/grade_portal";
                    String user = "root";
                    String password = "Aliexpress1!";
                    int input;
                    boolean exists = false;
        
                    try{
                        input = Integer.parseInt(arr[1]);
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        con = DriverManager.getConnection(url, user, password);
                        stmnt = con.createStatement();
                        userQuery = stmnt.executeQuery("select student_id from student");
            
                        while(userQuery.next()){
                            if(userQuery.getInt(1) == input){
                                exists = true;
                            }
                        }
            
                        if(exists == false){ //student id doesnt exist
                            JOptionPane.showMessageDialog(null,"Please enter a valid Student ID");
                            JOptionPane.getRootFrame().dispose();
                        }
                       
                        if(arr[0].equals("UPDATE")){
                            Update(input, arr[2]);
                        }
                        if(arr[0].equals("OVERWRITE")){
                            Overwrite(input, arr[2]);
                        }
            
                    } catch (NumberFormatException e){ //didnt input a number
                        JOptionPane.showMessageDialog(null,"Please enter a valid Student ID");
                        JOptionPane.getRootFrame().dispose();
                    }
                }
        }
    }
    
    private void Add(String name, String grades){
        //sort grades, calc avg, get letter grade, get new student id, add to database, add to view table
        int studID = 0;
        String FinalSortedGrades;
        float avg = 0;
        String letter = "";
        
        //SORT GRADES
        //str to arraylist
        ArrayList<Integer> gradeslist = str2array(grades);
        //arraylist to integer[]
        Integer[] gradesintlist = gradeslist.toArray(Integer[]::new);
        //sort integer[]
        Integer[] sortedGrades = SortArr(gradesintlist);
        //interger[] to str
        FinalSortedGrades = array2str(sortedGrades);
       
        //CALC AVG
        for(int i: sortedGrades){
            avg += i;
        }
        avg = avg / sortedGrades.length;
        
        //ASSIGN LETTER GRADE
        if(avg > 96.67){letter = "A+";}
        if(avg < 96.67 && avg > 93.33){letter = "A";}
        if(avg < 93.33 && avg > 90.00){letter = "A-";}
        if(avg < 90.00 && avg > 86.67){letter = "B+";}
        if(avg < 86.67 && avg > 83.33){letter = "B";}
        if(avg < 83.33 && avg > 80.00){letter = "B-";}
        if(avg < 80.00 && avg > 76.67){letter = "C+";}
        if(avg < 76.67 && avg > 70.00){letter = "C";}
        if(avg < 70.00 && avg > 60.00){letter = "D";}
        if(avg < 60.00){letter = "F";}
        
        //GET NEW STUDENT ID + ADD TO DATABASE
        Connection con;
        Statement stmnt;
        Statement stmnt2;
        ResultSet numStudents;
        
        String url = "jdbc:mysql://localhost:3306/grade_portal";
        String user = "root";
        String password = "Aliexpress1!";
        
        try {
            //get database info
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
            stmnt = con.createStatement();
            stmnt2 = con.createStatement();
            //GET NEXT STUDENT ID
            numStudents = stmnt2.executeQuery("select count(student_id) from student");
            numStudents.next();
            int count = numStudents.getInt(1);
            studID = count + 1;
            //ADD TO DATABASE
            stmnt.executeUpdate("INSERT INTO student " + "VALUES (" + studID + ", '" + name + "', '" + FinalSortedGrades + "', " + avg + ", '" + letter + "')");
            
        } catch (SQLException exc) {
            exc.printStackTrace();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //ADD TO VIEW TABLE
//        ViewStudent.AddRow(new Object[]{
//            studID,
//            name,
//            FinalSortedGrades,
//            avg,
//            letter
//        });
        
    }
    
    private void Update(int studID, String grades){
        //get grades, add to grades, resort grades, calc avg, get letter grade, update database, update view table
        String FinalSortedGrades;
        float avg = 0;
        String letter = "";
        
        //GET GRADES
        Connection con;
        Statement stmnt;
        ResultSet oldGrades;
        
        String url = "jdbc:mysql://localhost:3306/grade_portal";
        String user = "root";
        String password = "Aliexpress1!";
        
        String GradesStr = "";
                
        try {
            //get database info
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
            stmnt = con.createStatement();
            oldGrades = stmnt.executeQuery("select grades from student where student_id = " + studID);
            oldGrades.next();
            GradesStr = oldGrades.getString("grades");
                 
        } catch (SQLException exc) {
            exc.printStackTrace();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //ADD NEW GRADES TO OLD GRADES
        GradesStr = GradesStr + "," + grades;
        
        //SORT GRADES
        //str to arraylist
        ArrayList<Integer> gradeslist = str2array(GradesStr);
        //arraylist to integer[]
        Integer[] gradesintlist = gradeslist.toArray(Integer[]::new);
        //sort integer[]
        Integer[] sortedGrades = SortArr(gradesintlist);
        //interger[] to str
        FinalSortedGrades = array2str(sortedGrades);
       
        //CALC AVG
        for(int i: sortedGrades){
            avg += i;
        }
        avg = avg / sortedGrades.length;
        
        //ASSIGN LETTER GRADE
        if(avg > 96.67){letter = "A+";}
        if(avg < 96.67 && avg > 93.33){letter = "A";}
        if(avg < 93.33 && avg > 90.00){letter = "A-";}
        if(avg < 90.00 && avg > 86.67){letter = "B+";}
        if(avg < 86.67 && avg > 83.33){letter = "B";}
        if(avg < 83.33 && avg > 80.00){letter = "B-";}
        if(avg < 80.00 && avg > 76.67){letter = "C+";}
        if(avg < 76.67 && avg > 70.00){letter = "C";}
        if(avg < 70.00 && avg > 60.00){letter = "D";}
        if(avg < 60.00){letter = "F";}
        
        //UPDATE DATABASE
        Statement stmnt2;
        
        try {
            //get database info
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
            stmnt2 = con.createStatement();
            //UPDATE DATABASE
            stmnt2.executeUpdate("UPDATE student SET grades = '" + FinalSortedGrades + "', average = " + avg + ", letter = '" + letter + "' WHERE (student_id = " + studID + ");");
            
        } catch (SQLException exc) {
            exc.printStackTrace();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //UPDATE VIEW TABLE
    }
    
    private void Overwrite(int studID, String grades){
        //sort grades, calc avg, get letter grade, update database, update view table
        String FinalSortedGrades;
        float avg = 0;
        String letter = "";
        
        //SORT GRADES
        //str to arraylist
        ArrayList<Integer> gradeslist = str2array(grades);
        //arraylist to integer[]
        Integer[] gradesintlist = gradeslist.toArray(Integer[]::new);
        //sort integer[]
        Integer[] sortedGrades = SortArr(gradesintlist);
        //interger[] to str
        FinalSortedGrades = array2str(sortedGrades);
       
        //CALC AVG
        for(int i: sortedGrades){
            avg += i;
        }
        avg = avg / sortedGrades.length;
        
        //ASSIGN LETTER GRADE
        if(avg > 96.67){letter = "A+";}
        if(avg < 96.67 && avg > 93.33){letter = "A";}
        if(avg < 93.33 && avg > 90.00){letter = "A-";}
        if(avg < 90.00 && avg > 86.67){letter = "B+";}
        if(avg < 86.67 && avg > 83.33){letter = "B";}
        if(avg < 83.33 && avg > 80.00){letter = "B-";}
        if(avg < 80.00 && avg > 76.67){letter = "C+";}
        if(avg < 76.67 && avg > 70.00){letter = "C";}
        if(avg < 70.00 && avg > 60.00){letter = "D";}
        if(avg < 60.00){letter = "F";}
        
        //UPDATE DATABASE
        Connection con;
        Statement stmnt;
        Statement stmnt2;
        ResultSet numStudents;
        
        String url = "jdbc:mysql://localhost:3306/grade_portal";
        String user = "root";
        String password = "Aliexpress1!";
        
        try {
            //get database info
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
            stmnt = con.createStatement();
            stmnt2 = con.createStatement();
            
            //UPDATE DATABASE
            stmnt2.executeUpdate("UPDATE student SET grades = '" + FinalSortedGrades + "', average = " + avg + ", letter = '" + letter + "' WHERE (student_id = " + studID + ");");
            
        } catch (SQLException exc) {
            exc.printStackTrace();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //UPDATE VIEW TABLE
    }

    private ArrayList<Integer> str2array(String str){
        ArrayList<Integer> list = new ArrayList<>();  

        String[] array = str.split(",");  //Split the previous String for separate by commas
        for(String s:array){  //Iterate over the previous array for put each element on the ArrayList like Integers
            list.add(Integer.parseInt(s)); 
        }
        return list;
    }
    
    private String array2str(Integer[] list){
        StringBuilder buf = new StringBuilder();
        
        for (int i = 0, n = list.length; i < n; i++) {
            if (i > 0) { buf.append(",");}
            buf.append(list[i]);
        }
        
        return buf.toString();
    }
    
    private static Integer[] SortArr(Integer list[]){ 
        MergeSort.threadSort(list);
        //for (Integer each: list)
        //System.out.print(each+", ");  
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
            java.util.logging.Logger.getLogger(EditGrades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditGrades().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;                
}

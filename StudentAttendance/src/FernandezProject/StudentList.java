package FernandezProject;

import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import java.time.LocalDate;
import javax.swing.JOptionPane;

public class StudentList extends javax.swing.JFrame {
    int xMouse;
    int yMouse;
    static LocalDate date = LocalDate.now();
    public StudentList() {
        initComponents();
        connectFromDB();
        rowTable();
        rowTable2();
        rowTable3();
        rowTable4();
        rowTable5();
    }
    Connection con = null;
    PreparedStatement ps;
    ResultSet rs;
    
    String drive = "com.mysql.cj.jdbc.Driver";
    
    public void connectFromDB(){
        try {
            Class.forName(drive);
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jeffersondb?useSSL=false","root","jeffersonbsit123");
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(StudentList.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(StudentList.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public class ListStudent{
        private String firstName,middleName,lastName,course;
        
        public ListStudent(String firstName, String middleName, String lastName,String course){
            this.firstName = firstName;
            this.middleName = middleName;
            this.lastName = lastName;
            this.course = course;
        }
    }
    public ArrayList listS(){
        
        ArrayList<ListStudent> list = new ArrayList<ListStudent>();
        ListStudent student1 = new ListStudent("Joemarie","Ayroso","Usita","BSIT 2-E");
        ListStudent student2 = new ListStudent("Eric","Seballos","Cala-or","BSIT 2-E");
        
        list.add(student1);
        list.add(student2);
        return list;
    
   }
    public void rowTable(){
        DefaultTableModel table = (DefaultTableModel) table1.getModel();
        ArrayList<ListStudent> list = listS();
        Object data[] = new Object[4];
        for(int i = 0; i<list.size() ; i++){
            
            data[0] = list.get(i).firstName;
            data[1] = list.get(i).middleName;
            data[2] = list.get(i).lastName;
            data[3] = list.get(i).course;
            
            table.addRow(data);
        }
    }
    public void rowTable2(){
        DefaultTableModel table = (DefaultTableModel) table2.getModel();
        ArrayList<ListStudent> list = listS();
        Object data[] = new Object[4];
        for(int i = 0; i<list.size() ; i++){
            
            data[0] = list.get(i).firstName;
            data[1] = list.get(i).middleName;
            data[2] = list.get(i).lastName;
            data[3] = list.get(i).course;
            
            table.addRow(data);
            
        }
    }
    public void rowTable3(){
        DefaultTableModel table = (DefaultTableModel) table3.getModel();
        ArrayList<ListStudent> list = listS();
        Object data[] = new Object[4];
        for(int i = 0; i<list.size() ; i++){
            
            data[0] = list.get(i).firstName;
            data[1] = list.get(i).middleName;
            data[2] = list.get(i).lastName;
            data[3] = list.get(i).course;
            
            table.addRow(data);
            
        }
    }
    public void rowTable4(){
        DefaultTableModel table = (DefaultTableModel) table4.getModel();
        ArrayList<ListStudent> list = listS();
        Object data[] = new Object[4];
        for(int i = 0; i<list.size() ; i++){
            
            data[0] = list.get(i).firstName;
            data[1] = list.get(i).middleName;
            data[2] = list.get(i).lastName;
            data[3] = list.get(i).course;
            
            table.addRow(data);
            
        }
    }
    public void rowTable5(){
        DefaultTableModel table = (DefaultTableModel) table5.getModel();
        ArrayList<ListStudent> list = listS();
        Object data[] = new Object[4];
        for(int i = 0; i<list.size() ; i++){
            
            data[0] = list.get(i).firstName;
            data[1] = list.get(i).middleName;
            data[2] = list.get(i).lastName;
            data[3] = list.get(i).course;
            
            table.addRow(data);
            
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        moveFrame = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        exitBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        firstNameFld = new javax.swing.JTextField();
        presentBtn = new javax.swing.JButton();
        lastNameFld = new javax.swing.JTextField();
        courseFld = new javax.swing.JTextField();
        absentFld = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        table4 = new javax.swing.JTable();
        fThursdayFld = new javax.swing.JTextField();
        lThursdayFld = new javax.swing.JTextField();
        cThursdayFld = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        table5 = new javax.swing.JTable();
        fFridayFld = new javax.swing.JTextField();
        lFridayFld = new javax.swing.JTextField();
        cFridayFld = new javax.swing.JTextField();
        pfridayBtn = new javax.swing.JButton();
        afridayBtn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table2 = new javax.swing.JTable();
        fTuesdayFld = new javax.swing.JTextField();
        lTuesdayFld = new javax.swing.JTextField();
        cTuesdayFld = new javax.swing.JTextField();
        pTuesdayBtn = new javax.swing.JButton();
        aTuesdayBtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        table3 = new javax.swing.JTable();
        fWeFld = new javax.swing.JTextField();
        lWeFld = new javax.swing.JTextField();
        cWeFld = new javax.swing.JTextField();
        pwedBtn = new javax.swing.JButton();
        pabBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("X");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 0, 20, 30));

        moveFrame.setBackground(new java.awt.Color(102, 102, 102));
        moveFrame.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        moveFrame.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                moveFrameMouseDragged(evt);
            }
        });
        moveFrame.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                moveFrameMousePressed(evt);
            }
        });
        moveFrame.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(moveFrame, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 30));

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setBackground(new java.awt.Color(102, 102, 102));
        jButton2.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Tuesday");
        jButton2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton2.setFocusable(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 180, 40));

        jButton3.setBackground(new java.awt.Color(102, 102, 102));
        jButton3.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Wednesday");
        jButton3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton3.setFocusable(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 180, 40));

        jButton4.setBackground(new java.awt.Color(102, 102, 102));
        jButton4.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Thursday");
        jButton4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 180, 40));

        jButton5.setBackground(new java.awt.Color(102, 102, 102));
        jButton5.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Friday");
        jButton5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 180, 40));

        jButton8.setBackground(new java.awt.Color(102, 102, 102));
        jButton8.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("ShowRecord");
        jButton8.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 180, 40));

        jButton1.setBackground(new java.awt.Color(102, 102, 102));
        jButton1.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Monday");
        jButton1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton1.setFocusable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 180, 40));

        exitBtn.setBackground(new java.awt.Color(102, 102, 102));
        exitBtn.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        exitBtn.setForeground(new java.awt.Color(255, 255, 255));
        exitBtn.setText("Exit");
        exitBtn.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(exitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 180, 40));

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("STUDENT");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ATTENDANCE");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 450));

        jTabbedPane1.setBackground(new java.awt.Color(102, 102, 102));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        table1.setBackground(new java.awt.Color(102, 102, 102));
        table1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        table1.setForeground(new java.awt.Color(255, 255, 255));
        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Firstname", "Middlename", "Lastname", "Course"
            }
        ));
        table1.setGridColor(new java.awt.Color(255, 255, 255));
        table1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, 530, 350));

        firstNameFld.setBackground(new java.awt.Color(153, 153, 153));
        firstNameFld.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(firstNameFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 230, 40));

        presentBtn.setBackground(new java.awt.Color(102, 102, 102));
        presentBtn.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        presentBtn.setForeground(new java.awt.Color(255, 255, 255));
        presentBtn.setText("Present");
        presentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                presentBtnActionPerformed(evt);
            }
        });
        jPanel2.add(presentBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 120, 50));

        lastNameFld.setBackground(new java.awt.Color(153, 153, 153));
        lastNameFld.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(lastNameFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 230, 40));

        courseFld.setBackground(new java.awt.Color(153, 153, 153));
        courseFld.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(courseFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 230, 40));

        absentFld.setBackground(new java.awt.Color(102, 102, 102));
        absentFld.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        absentFld.setForeground(new java.awt.Color(255, 255, 255));
        absentFld.setText("Absent");
        absentFld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                absentFldActionPerformed(evt);
            }
        });
        jPanel2.add(absentFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, 120, 50));

        jLabel5.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 2, new java.awt.Color(255, 255, 255)));
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 10, 460));

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("List of Students");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 40, -1, -1));

        jTabbedPane1.addTab("tab1", jPanel2);

        table4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Firstname", "Middlename", "Lastname", "Course"
            }
        ));
        table4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table4MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(table4);

        jButton6.setText("Present");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Absent");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(fThursdayFld)
                        .addComponent(cThursdayFld, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE))
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lThursdayFld, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(87, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 114, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fThursdayFld, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lThursdayFld, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(cThursdayFld, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6)
                    .addComponent(jButton7))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab4", jPanel5);

        table5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Firstname", "Middlename", "Lastname", "Course"
            }
        ));
        table5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table5MouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(table5);

        pfridayBtn.setText("Present");
        pfridayBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pfridayBtnActionPerformed(evt);
            }
        });

        afridayBtn.setText("Absent");
        afridayBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                afridayBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(fFridayFld)
                    .addComponent(cFridayFld)
                    .addComponent(pfridayBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE))
                .addGap(33, 33, 33)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lFridayFld)
                    .addComponent(afridayBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE))
                .addContainerGap(123, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 107, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lFridayFld, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(fFridayFld))
                .addGap(18, 18, 18)
                .addComponent(cFridayFld, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pfridayBtn)
                    .addComponent(afridayBtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab5", jPanel6);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        table2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Firstname", "Middlename", "Lastname", "Course"
            }
        ));
        table2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(table2);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, 464, 351));
        jPanel3.add(fTuesdayFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 230, 40));
        jPanel3.add(lTuesdayFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 230, 40));
        jPanel3.add(cTuesdayFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 230, 40));

        pTuesdayBtn.setText("Present");
        pTuesdayBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pTuesdayBtnActionPerformed(evt);
            }
        });
        jPanel3.add(pTuesdayBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 130, 40));

        aTuesdayBtn.setText("Absent");
        aTuesdayBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aTuesdayBtnActionPerformed(evt);
            }
        });
        jPanel3.add(aTuesdayBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 360, 130, 40));

        jLabel6.setText("jLabel6");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, -1, -1));

        jTabbedPane1.addTab("tab2", jPanel3);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        table3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Firstname", "Middlename", "Lastname", "Course"
            }
        ));
        table3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table3MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(table3);

        jPanel4.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 96, 467, 320));
        jPanel4.add(fWeFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 210, 32));
        jPanel4.add(lWeFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 210, 32));
        jPanel4.add(cWeFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 210, 33));

        pwedBtn.setText("Present");
        pwedBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwedBtnActionPerformed(evt);
            }
        });
        jPanel4.add(pwedBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 120, 40));

        pabBtn.setText("Absent");
        pabBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pabBtnActionPerformed(evt);
            }
        });
        jPanel4.add(pabBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, 120, 40));

        jTabbedPane1.addTab("tab3", jPanel4);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, -10, 860, 540));

        setSize(new java.awt.Dimension(1037, 451));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void table1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table1MouseClicked
        DefaultTableModel table = (DefaultTableModel) table1.getModel();
        
        String fname = table.getValueAt(table1.getSelectedRow(),0).toString();
        String mname = table.getValueAt(table1.getSelectedRow(),1).toString();
        String lname = table.getValueAt(table1.getSelectedRow(),2).toString();
        String course = table.getValueAt(table1.getSelectedRow(),3).toString();
        
        firstNameFld.setText(fname);
        lastNameFld.setText(lname);
        courseFld.setText(course);
        
        
        
    }//GEN-LAST:event_table1MouseClicked

    private void presentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_presentBtnActionPerformed
        String first = firstNameFld.getText();
        String last = lastNameFld.getText();
        String course = courseFld.getText();
        try
        {
            ps = con.prepareStatement("Insert into mondaydate (Monday) Values(?)");
            ps.setString(1,first +" "+ last +" "+ course +" Present " + date);
            
            int check = ps.executeUpdate();
            
            if(check == 1){
                JOptionPane.showMessageDialog(null,"Successfully Submit the Attendance!!");
            }
            else{
                JOptionPane.showMessageDialog(null,"Not Submited!!","Message",JOptionPane.ERROR_MESSAGE);
            }
        }
        catch(Exception e)
        {
            System.out.println("Error Occured!!" + e.getMessage());
        }
    }//GEN-LAST:event_presentBtnActionPerformed

    private void absentFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_absentFldActionPerformed
        String first = firstNameFld.getText();
        String last = lastNameFld.getText();
        String course = courseFld.getText();
         try
        {
            ps = con.prepareStatement("Insert into mondaydate (Monday) Values(?)");
            ps.setString(1,first +" "+ last +" "+ course +" Absent " + date);
            
            int check = ps.executeUpdate();
            
            if(check == 1){
                JOptionPane.showMessageDialog(null,"Successfully Submit the Attendance!!");
            }
            else{
                JOptionPane.showMessageDialog(null,"Not Submited!!","Message",JOptionPane.ERROR_MESSAGE);
            }
        }
        catch(Exception e)
        {
            System.out.println("Error Occured!!" + e.getMessage());
        }
    }//GEN-LAST:event_absentFldActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jTabbedPane1.setSelectedIndex(2);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jTabbedPane1.setSelectedIndex(3);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        jTabbedPane1.setSelectedIndex(4);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void table2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table2MouseClicked
       DefaultTableModel table = (DefaultTableModel) table2.getModel();
        
        String fname = table.getValueAt(table2.getSelectedRow(),0).toString();
        String lname = table.getValueAt(table2.getSelectedRow(),2).toString();
        String course = table.getValueAt(table2.getSelectedRow(),3).toString();
        
        fTuesdayFld.setText(fname);
        lTuesdayFld.setText(lname);
        cTuesdayFld.setText(course);
    }//GEN-LAST:event_table2MouseClicked

    private void pTuesdayBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pTuesdayBtnActionPerformed
        String first = fTuesdayFld.getText();
        String last = lTuesdayFld.getText();
        String course = cTuesdayFld.getText();
         try
        {
            ps = con.prepareStatement("Insert into tuesdaydate (Tuesday) Values(?)");
            ps.setString(1,first +" "+ last +" "+ course +" Present " + date);
            
            int check = ps.executeUpdate();
            
            if(check == 1){
                JOptionPane.showMessageDialog(null,"Successfully Submit the Attendance!!");
            }
            else{
                JOptionPane.showMessageDialog(null,"Not Submited!!","Message",JOptionPane.ERROR_MESSAGE);
            }
        }
        catch(Exception e)
        {
            System.out.println("Error Occured!!" + e.getMessage());
        }
    }//GEN-LAST:event_pTuesdayBtnActionPerformed

    private void aTuesdayBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aTuesdayBtnActionPerformed
        String first = fTuesdayFld.getText();
        String last = lTuesdayFld.getText();
        String course = cTuesdayFld.getText();
         try
        {
            ps = con.prepareStatement("Insert into tuesdaydate (Tuesday) Values(?)");
            ps.setString(1,first +" "+ last +" "+ course +" Absent " + date);
            
            int check = ps.executeUpdate();
            
            if(check == 1){
                JOptionPane.showMessageDialog(null,"Successfully Submit the Attendance!!");
            }
            else{
                JOptionPane.showMessageDialog(null,"Not Submited!!","Message",JOptionPane.ERROR_MESSAGE);
            }
        }
        catch(Exception e)
        {
            System.out.println("Error Occured!!" + e.getMessage());
        }
    }//GEN-LAST:event_aTuesdayBtnActionPerformed

    private void table3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table3MouseClicked
        DefaultTableModel table = (DefaultTableModel) table3.getModel();
        
        String fname = table.getValueAt(table3.getSelectedRow(),0).toString();
        String lname = table.getValueAt(table3.getSelectedRow(),2).toString();
        String course = table.getValueAt(table3.getSelectedRow(),3).toString();
        
        fWeFld.setText(fname);
        lWeFld.setText(lname);
        cWeFld.setText(course);
    }//GEN-LAST:event_table3MouseClicked

    private void pwedBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pwedBtnActionPerformed
        String first = fWeFld.getText();
        String last = lWeFld.getText();
        String course = cWeFld.getText();
         try
        {
            ps = con.prepareStatement("Insert into wednesdaydate (Wednesday) Values(?)");
            ps.setString(1,first +" "+ last +" "+ course +" Present " + date);
            
            int check = ps.executeUpdate();
            
            if(check == 1){
                JOptionPane.showMessageDialog(null,"Successfully Submit the Attendance!!");
            }
            else{
                JOptionPane.showMessageDialog(null,"Not Submited!!","Message",JOptionPane.ERROR_MESSAGE);
            }
        }
        catch(Exception e)
        {
            System.out.println("Error Occured!!" + e.getMessage());
        }
    }//GEN-LAST:event_pwedBtnActionPerformed

    private void pabBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pabBtnActionPerformed
        String first = fWeFld.getText();
        String last = lWeFld.getText();
        String course = cWeFld.getText();
         try
        {
            ps = con.prepareStatement("Insert into wednesdaydate (Wednesday) Values(?)");
            ps.setString(1,first +" "+ last +" "+ course +" Absent " + date);
            
            int check = ps.executeUpdate();
            
            if(check == 1){
                JOptionPane.showMessageDialog(null,"Successfully Submit the Attendance!!");
            }
            else{
                JOptionPane.showMessageDialog(null,"Not Submited!!","Message",JOptionPane.ERROR_MESSAGE);
            }
        }
        catch(Exception e)
        {
            System.out.println("Error Occured!!" + e.getMessage());
        }
    }//GEN-LAST:event_pabBtnActionPerformed

    private void table4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table4MouseClicked
        DefaultTableModel table = (DefaultTableModel) table4.getModel();
        
        String fname = table.getValueAt(table4.getSelectedRow(),0).toString();
        String lname = table.getValueAt(table4.getSelectedRow(),2).toString();
        String course = table.getValueAt(table4.getSelectedRow(),3).toString();
        
        fThursdayFld.setText(fname);
        lThursdayFld.setText(lname);
        cThursdayFld.setText(course);
    }//GEN-LAST:event_table4MouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        String first = fThursdayFld.getText();
        String last = lThursdayFld.getText();
        String course = cThursdayFld.getText();
         try
        {
            ps = con.prepareStatement("Insert into thursdaydate (Thursday) Values(?)");
            ps.setString(1,first +" "+ last +" "+ course +" Present " + date);
            
            int check = ps.executeUpdate();
            
            if(check == 1){
                JOptionPane.showMessageDialog(null,"Successfully Submit the Attendance!!");
            }
            else{
                JOptionPane.showMessageDialog(null,"Not Submited!!","Message",JOptionPane.ERROR_MESSAGE);
            }
        }
        catch(Exception e)
        {
            System.out.println("Error Occured!!" + e.getMessage());
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        String first = fThursdayFld.getText();
        String last = lThursdayFld.getText();
        String course = cThursdayFld.getText();
         try
        {
            ps = con.prepareStatement("Insert into thursdaydate (Thursday) Values(?)");
            ps.setString(1,first +" "+ last +" "+ course +" Absent " + date);
            
            int check = ps.executeUpdate();
            
            if(check == 1){
                JOptionPane.showMessageDialog(null,"Successfully Submit the Attendance!!");
            }
            else{
                JOptionPane.showMessageDialog(null,"Not Submited!!","Message",JOptionPane.ERROR_MESSAGE);
            }
        }
        catch(Exception e)
        {
            System.out.println("Error Occured!!" + e.getMessage());
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void table5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table5MouseClicked
        DefaultTableModel table = (DefaultTableModel) table5.getModel();
        
        String fname = table.getValueAt(table5.getSelectedRow(),0).toString();
        String lname = table.getValueAt(table5.getSelectedRow(),2).toString();
        String course = table.getValueAt(table5.getSelectedRow(),3).toString();
        
        fFridayFld.setText(fname);
        lFridayFld.setText(lname);
        cFridayFld.setText(course);
    }//GEN-LAST:event_table5MouseClicked

    private void pfridayBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pfridayBtnActionPerformed
        String first = fFridayFld.getText();
        String last = lFridayFld.getText();
        String course = cFridayFld.getText();
         try
        {
            ps = con.prepareStatement("Insert into fridaydate (Friday) Values(?)");
            ps.setString(1,first +" "+ last +" "+ course +" Present " + date);
            
            int check = ps.executeUpdate();
            
            if(check == 1){
                JOptionPane.showMessageDialog(null,"Successfully Submit the Attendance!!");
            }
            else{
                JOptionPane.showMessageDialog(null,"Not Submited!!","Message",JOptionPane.ERROR_MESSAGE);
            }
        }
        catch(Exception e)
        {
            System.out.println("Error Occured!!" + e.getMessage());
        }
    }//GEN-LAST:event_pfridayBtnActionPerformed

    private void afridayBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_afridayBtnActionPerformed
        String first = fFridayFld.getText();
        String last = lFridayFld.getText();
        String course = cFridayFld.getText();
         try
        {
            ps = con.prepareStatement("Insert into fridaydate (Friday) Values(?)");
            ps.setString(1,first +" "+ last +" "+ course +" Absent " + date);
            
            int check = ps.executeUpdate();
            
            if(check == 1){
                JOptionPane.showMessageDialog(null,"Successfully Submit the Attendance!!");
            }
            else{
                JOptionPane.showMessageDialog(null,"Not Submited!!","Message",JOptionPane.ERROR_MESSAGE);
            }
        }
        catch(Exception e)
        {
            System.out.println("Error Occured!!" + e.getMessage());
        }
    }//GEN-LAST:event_afridayBtnActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        this.dispose();
        showR show = new showR();
        show.setVisible(true);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void moveFrameMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_moveFrameMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_moveFrameMousePressed

    private void moveFrameMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_moveFrameMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_moveFrameMouseDragged

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aTuesdayBtn;
    private javax.swing.JButton absentFld;
    private javax.swing.JButton afridayBtn;
    private javax.swing.JTextField cFridayFld;
    private javax.swing.JTextField cThursdayFld;
    private javax.swing.JTextField cTuesdayFld;
    private javax.swing.JTextField cWeFld;
    private javax.swing.JTextField courseFld;
    private javax.swing.JButton exitBtn;
    private javax.swing.JTextField fFridayFld;
    private javax.swing.JTextField fThursdayFld;
    private javax.swing.JTextField fTuesdayFld;
    private javax.swing.JTextField fWeFld;
    private javax.swing.JTextField firstNameFld;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField lFridayFld;
    private javax.swing.JTextField lThursdayFld;
    private javax.swing.JTextField lTuesdayFld;
    private javax.swing.JTextField lWeFld;
    private javax.swing.JTextField lastNameFld;
    private javax.swing.JPanel moveFrame;
    private javax.swing.JButton pTuesdayBtn;
    private javax.swing.JButton pabBtn;
    private javax.swing.JButton pfridayBtn;
    private javax.swing.JButton presentBtn;
    private javax.swing.JButton pwedBtn;
    private javax.swing.JTable table1;
    private javax.swing.JTable table2;
    private javax.swing.JTable table3;
    private javax.swing.JTable table4;
    private javax.swing.JTable table5;
    // End of variables declaration//GEN-END:variables
}

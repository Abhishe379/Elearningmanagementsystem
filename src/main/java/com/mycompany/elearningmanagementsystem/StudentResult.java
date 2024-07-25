/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.elearningmanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
public class StudentResult extends javax.swing.JFrame {

    /**
     * Creates new form StudentResult
     */
    public StudentResult() {
        initComponents();
        
         
        java.net.URL imgURL = getClass().getResource("C:\\Users\\hp\\OneDrive\\Documents\\NetBeansProjects\\Elearningmanagementsystem\\src\\download.png");
        if (imgURL != null) {
            ImageIcon icon = new ImageIcon(imgURL);
            jLabel10.setIcon(icon);
        } else {
            System.err.println("Couldn't find file:C:C:\\Users\\hp\\OneDrive\\Documents\\NetBeansProjects\\Elearningmanagementsystem\\src\\download.png");
        }
        
    }
    
    
    int id=0;
int getId()
{
    ResultSet rs=null;
    try
    {
    Class.forName("com.mysql.cj.jdbc.Driver");
String url ="jdbc:mysql://localhost:3306/cselmsdatabase?zeroDateTimeBehavior=CONVERT_TO_NULL ";
Connection con=DriverManager.getConnection(url, "root","7217296337@abhi");

String sql="select max(id) from studentresult";
Statement st=con.createStatement();
rs=st.executeQuery(sql);

while(rs.next())
{
  id=rs.getInt(1);
id++;
}

    }
    catch(Exception e)
    {
    e.printStackTrace();
    }

return id;
}
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtsname = new javax.swing.JTextField();
        combo_course3 = new javax.swing.JComboBox<>();
        txtsubjectcode = new javax.swing.JTextField();
        txtsubject = new javax.swing.JTextField();
        txtmarks = new javax.swing.JTextField();
        txtgrade = new javax.swing.JTextField();
        btnsubmit = new javax.swing.JButton();
        btnback = new javax.swing.JButton();
        btnclear = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtpercentage = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtemailid = new javax.swing.JTextField();
        txtpfield = new javax.swing.JPasswordField();
        lblpassworderror = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 51, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setText("Result");

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\hp\\OneDrive\\Documents\\NetBeansProjects\\Elearningmanagementsystem\\src\\download.png")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(51, 102, 255));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Student Name");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Course");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Subject Code");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Subject ");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Marks");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Grade");

        txtsname.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        combo_course3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        combo_course3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MCA", "M.Tech", "M.Com" }));

        txtsubjectcode.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        txtsubject.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        txtmarks.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtmarks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmarksActionPerformed(evt);
            }
        });

        txtgrade.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        btnsubmit.setBackground(new java.awt.Color(0, 255, 0));
        btnsubmit.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnsubmit.setText("Submit");
        btnsubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsubmitActionPerformed(evt);
            }
        });

        btnback.setBackground(new java.awt.Color(0, 255, 0));
        btnback.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnback.setText("Back");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });

        btnclear.setBackground(new java.awt.Color(0, 255, 0));
        btnclear.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnclear.setText("Clear");
        btnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclearActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Percentage");

        txtpercentage.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Email_id");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("Password");

        txtemailid.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        txtpfield.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtpfield.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtpfieldKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtpfieldKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtpfieldKeyTyped(evt);
            }
        });

        lblpassworderror.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblpassworderror.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(250, 250, 250)
                        .addComponent(txtsname, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(250, 250, 250)
                        .addComponent(combo_course3, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(250, 250, 250)
                        .addComponent(txtsubjectcode, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(250, 250, 250)
                        .addComponent(txtsubject, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(250, 250, 250)
                        .addComponent(txtmarks, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(250, 250, 250)
                        .addComponent(txtpercentage, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtpfield, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtemailid, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(250, 250, 250)
                        .addComponent(txtgrade, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(47, 47, 47)
                .addComponent(lblpassworderror, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(btnsubmit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 202, Short.MAX_VALUE)
                .addComponent(btnback)
                .addGap(195, 195, 195)
                .addComponent(btnclear)
                .addGap(81, 81, 81))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel3))
                    .addComponent(txtsname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel4))
                    .addComponent(combo_course3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel5))
                    .addComponent(txtsubjectcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel6))
                    .addComponent(txtsubject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel7))
                    .addComponent(txtmarks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel9))
                    .addComponent(txtpercentage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel8))
                    .addComponent(txtgrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtemailid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtpfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblpassworderror, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnsubmit)
                    .addComponent(btnback)
                    .addComponent(btnclear)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsubmitActionPerformed
     if (validateLogin() && validation()) {
        insertData();
        
    } else {
        JOptionPane.showMessageDialog(this, "Invalid login credentials or form data.");
    }
// TODO add your handling code here:
    }//GEN-LAST:event_btnsubmitActionPerformed

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
     StudentLogin sl1 = new StudentLogin();
     sl1.show();
this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_btnbackActionPerformed

    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearActionPerformed
     
 
        txtsname.setText("");
        combo_course3.setName("");
        txtsubjectcode.setText("");
        txtsubject.setText("");
        txtmarks.setText("");
        txtpercentage.setText("");
        txtgrade.setText("");        
        txtemailid.setText("");
 txtpfield.setText("");
// TODO add your handling code here:
    }//GEN-LAST:event_btnclearActionPerformed

    private void txtmarksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmarksActionPerformed
 
        try {
            
            int marks = Integer.parseInt(txtmarks.getText());
            int totalMarks = 100; 

            // प्रतिशत की गणना करें
            double percentage = (marks * 100.0) / 100;
            txtpercentage.setText(String.format("%.2f", percentage));

            // ग्रेड की गणना करें
            String grade;
            if (percentage >= 90) {
                grade = "A";
            } else if (percentage >= 80) {
                grade = "B";
            } else if (percentage >= 70) {
                grade = "C";
            } else if (percentage >= 60) {
                grade = "D";
            } else {
                grade = "F";
            }
            txtgrade.setText(grade);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "JOptionPane.ERROR_MESSAGE");
        }
    }//GEN-LAST:event_txtmarksActionPerformed

    private void txtpfieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpfieldKeyPressed
      passwordCheck();    // TODO add your handling code here:
    }//GEN-LAST:event_txtpfieldKeyPressed

    private void txtpfieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpfieldKeyReleased
       passwordCheck(); // TODO add your handling code here:
    }//GEN-LAST:event_txtpfieldKeyReleased

    private void txtpfieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpfieldKeyTyped
      passwordCheck();  // TODO add your handling code here:
    }//GEN-LAST:event_txtpfieldKeyTyped


    boolean validateLogin() {
    String email_id = txtemailid.getText();
    String password = new String(txtpfield.getPassword());

    if (email_id.isEmpty() || password.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please enter email and password.");
        return false;
    }

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/cselmsdatabase?zeroDateTimeBehavior=CONVERT_TO_NULL";
        Connection con = DriverManager.getConnection(url, "root", "7217296337@abhi");

        System.out.println("Database connection established");

        String sql = "SELECT * FROM studentregistration WHERE email_id = ? AND password = ?";
        PreparedStatement st = con.prepareStatement(sql);
        st.setString(1, email_id);
        st.setString(2, password);

        System.out.println("SQL query prepared: " + sql);

        ResultSet rs = st.executeQuery();

        if (rs.next()) {
            System.out.println("Login successful for email: " + email_id);
            return true; // Login successful
        } else {
            JOptionPane.showMessageDialog(this, "Invalid email or password.");
            System.out.println("Invalid email or password for email: " + email_id);
            return false; // Login failed
        }
    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Database connection error.");
        return false;
    }
}
    
void insertData()
{
try
{
Class.forName("com.mysql.cj.jdbc.Driver");
String url ="jdbc:mysql://localhost:3306/cselmsdatabase?zeroDateTimeBehavior=CONVERT_TO_NULL ";
Connection con=DriverManager.getConnection(url, "root","7217296337@abhi");

String sql="insert into studentresult values(?,?,?,?,?,?,?,?)";


PreparedStatement st=con.prepareStatement(sql);

st.setInt(1,getId());

st.setString(2, studentname);
st.setString(3,course);
st.setString(4, subjectcode);
st.setString(5,subject);
st.setString(6,marks);
st.setString(7,percentage);
st.setString(8,grade);


    int i = st.executeUpdate();
    if(i>0)
    {
    JOptionPane.showMessageDialog(this,"record insetered successfully");
    }
    else
    {
      JOptionPane.showMessageDialog(this,"record not insetered successfully");
    }
}
catch(Exception e)
    
{
e.printStackTrace();
}

}
    
    String studentname,course,subjectcode,subject,marks,percentage,grade,password;
boolean validation()
{
    
studentname=txtsname.getText();
course = (String) combo_course3.getSelectedItem();   
subjectcode=txtsubjectcode.getText();
subject=txtsubject.getText();
marks=txtmarks.getText();
percentage=txtpercentage.getText();
grade=txtgrade.getText();


   if(studentname.equals(""))
{
JOptionPane.showMessageDialog(this,"enter your name");
return false;
}
   if(course.isEmpty())
{
JOptionPane.showMessageDialog(this,"enter your course");
return false;
}
if(subjectcode.equals(""))
{
JOptionPane.showMessageDialog(this , "please enter your subject code");
return false;
}
if(subject.equals(""))
{
JOptionPane.showMessageDialog(this , "please enter your subject name");
return false;
}
if(marks.equals(""))
{
JOptionPane.showMessageDialog(this,"enter your marks");
return false;
}
return true;
}

void passwordCheck()
{
  password = txtpfield.getText();
if(password.length()>=8)
{
lblpassworderror.setText("");
}
else
{
lblpassworderror.setText("enter 8 digit password number ");
}
}

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
      
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StudentResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StudentResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentResult().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnback;
    private javax.swing.JButton btnclear;
    private javax.swing.JButton btnsubmit;
    private javax.swing.JComboBox<String> combo_course3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JLabel lblpassworderror;
    private javax.swing.JTextField txtemailid;
    private javax.swing.JTextField txtgrade;
    private javax.swing.JTextField txtmarks;
    private javax.swing.JTextField txtpercentage;
    private javax.swing.JPasswordField txtpfield;
    private javax.swing.JTextField txtsname;
    private javax.swing.JTextField txtsubject;
    private javax.swing.JTextField txtsubjectcode;
    // End of variables declaration//GEN-END:variables
}

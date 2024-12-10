/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package docreservationsystem;

import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import docreservationsystem.databaseconnection;

public class signuppage extends javax.swing.JFrame {

    public signuppage() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        number = new javax.swing.JTextField();
        uname = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        cpswrd = new javax.swing.JPasswordField();
        pswrd = new javax.swing.JPasswordField();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        comboBox = new javax.swing.JComboBox<>();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Doctor Reservation System");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 90));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("confirm password");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, -1, 20));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("username");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, -1, 20));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("email address");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, -1, 20));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("contact number");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, -1, 20));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("password");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, -1, 20));

        number.setBackground(new java.awt.Color(204, 204, 204));
        number.setBorder(null);
        number.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberActionPerformed(evt);
            }
        });
        getContentPane().add(number, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 170, 20));

        uname.setBackground(new java.awt.Color(204, 204, 204));
        uname.setBorder(null);
        uname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unameActionPerformed(evt);
            }
        });
        getContentPane().add(uname, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 170, 20));

        email.setBackground(new java.awt.Color(204, 204, 204));
        email.setBorder(null);
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        getContentPane().add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 170, 20));

        cpswrd.setBackground(new java.awt.Color(204, 204, 204));
        cpswrd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpswrdActionPerformed(evt);
            }
        });
        getContentPane().add(cpswrd, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 170, 20));

        pswrd.setBackground(new java.awt.Color(204, 204, 204));
        pswrd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pswrdActionPerformed(evt);
            }
        });
        getContentPane().add(pswrd, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 170, 20));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(0, 102, 102));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("signUp");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 150, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Category");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, -1, 20));

        comboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select", "Doctor", "Patient" }));
        jPanel3.add(comboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 400, 290));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         String name = uname.getText().trim();
    String mail = email.getText().trim();
    String cont = number.getText().trim();
    String psvrd = pswrd.getText().trim();
    String cpsvrd = cpswrd.getText().trim();
    String selectedRole = comboBox.getSelectedItem().toString(); // ComboBox to select Patient or Doctor

    // Validate inputs
    if (name.isEmpty() || mail.isEmpty() || cont.isEmpty() || psvrd.isEmpty()) {
        JOptionPane.showMessageDialog(this, "All fields must be filled!", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
    if (!psvrd.equals(cpsvrd)) {
        JOptionPane.showMessageDialog(this, "Passwords do not match!", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    try (Connection con = databaseconnection.getConnection()) {
        if (con != null) {
            System.out.println("Database connected successfully!");
            
            // Insert user data into `users` table
            String userQuery = "INSERT INTO users (name, password, email, contact_info) VALUES (?, ?, ?, ?)";
            PreparedStatement psUser = con.prepareStatement(userQuery, Statement.RETURN_GENERATED_KEYS);
            psUser.setString(1, name);
            psUser.setString(2, psvrd);
            psUser.setString(3, mail);
            psUser.setString(4, cont);

            int rowsInsertedUser = psUser.executeUpdate();
            if (rowsInsertedUser > 0) {
                ResultSet generatedKeys = psUser.getGeneratedKeys();
                if (generatedKeys.next()) {
                    int userId = generatedKeys.getInt(1); // Get the generated user_id

                    if ("Patient".equalsIgnoreCase(selectedRole)) {
                        // Insert data into `patient` table
                        String patientQuery = "INSERT INTO patient (user_id, name, contact_info, address) VALUES (?, ?, ?, ?)";
                        PreparedStatement psPatient = con.prepareStatement(patientQuery);
                        psPatient.setInt(1, userId);
                        psPatient.setString(2, name);
                        psPatient.setString(3, cont);
                        psPatient.setString(4, ""); // Address can be added here if needed

                        int rowsInsertedPatient = psPatient.executeUpdate();
                        if (rowsInsertedPatient > 0) {
                            JOptionPane.showMessageDialog(this, "Patient registered successfully!");
                        } else {
                            JOptionPane.showMessageDialog(this, "Patient registration failed!", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    } else if ("Doctor".equalsIgnoreCase(selectedRole)) {
                        // Insert data into `doctor` table
                        String doctorQuery = "INSERT INTO doctor (user_id, name, email, contact_info, rating) VALUES (?, ?, ?, ?, ?)";
                        PreparedStatement psDoctor = con.prepareStatement(doctorQuery);
                        psDoctor.setInt(1, userId);
                        psDoctor.setString(2, name);
                        psDoctor.setString(3, mail);
                        psDoctor.setString(4, cont);
                        psDoctor.setBigDecimal(5, null); // Initial rating can be null or set as needed

                        int rowsInsertedDoctor = psDoctor.executeUpdate();
                        if (rowsInsertedDoctor > 0) {
                            JOptionPane.showMessageDialog(this, "Doctor registered successfully!");
                        } else {
                            JOptionPane.showMessageDialog(this, "Doctor registration failed!", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }
            } else {
                JOptionPane.showMessageDialog(this, "Registration failed!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Database connection failed!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(this, "Database error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    uname.setText("");
    email.setText("");
    number.setText("");
    pswrd.setText("");
    cpswrd.setText("");
    comboBox.setSelectedIndex(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void numberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numberActionPerformed

    private void unameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unameActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void cpswrdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpswrdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpswrdActionPerformed

    private void pswrdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pswrdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pswrdActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(signuppage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(signuppage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(signuppage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(signuppage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new signuppage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboBox;
    private javax.swing.JPasswordField cpswrd;
    private javax.swing.JTextField email;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField number;
    private javax.swing.JPasswordField pswrd;
    private javax.swing.JTextField uname;
    // End of variables declaration//GEN-END:variables
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package docreservationsystem;

import docreservationsystem.phome.ButtonRenderer;
import java.awt.Component;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author DELL
 */
public class drprofile extends javax.swing.JFrame {

    String drname;
    String uuname;
    public drprofile(String uname,String name2) {
        drname=uname;
        uuname=name2;
        initComponents();
        detail();
        exptable();
        schtable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        name = new javax.swing.JTextField();
        emailfield = new javax.swing.JTextField();
        number = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        slots = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        experience = new javax.swing.JTable();
        specialization = new javax.swing.JTextField();
        location = new javax.swing.JTextField();
        hospital = new javax.swing.JTextField();
        stime = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        etime = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Doctor Profile");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 70));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        name.setBackground(new java.awt.Color(204, 204, 204));
        name.setBorder(null);
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });

        emailfield.setBackground(new java.awt.Color(204, 204, 204));
        emailfield.setBorder(null);
        emailfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailfieldActionPerformed(evt);
            }
        });

        number.setBackground(new java.awt.Color(204, 204, 204));
        number.setBorder(null);
        number.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(0, 102, 102));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Back");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        slots.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(slots);

        experience.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(experience);

        specialization.setBackground(new java.awt.Color(204, 204, 204));
        specialization.setBorder(null);
        specialization.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                specializationActionPerformed(evt);
            }
        });

        location.setBackground(new java.awt.Color(204, 204, 204));
        location.setBorder(null);
        location.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locationActionPerformed(evt);
            }
        });

        hospital.setBackground(new java.awt.Color(204, 204, 204));
        hospital.setBorder(null);
        hospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hospitalActionPerformed(evt);
            }
        });

        stime.setBackground(new java.awt.Color(204, 204, 204));
        stime.setBorder(null);
        stime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stimeActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Username");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Email");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Contact number");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Address");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Hospital");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Specilization");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("Timing");

        etime.setBackground(new java.awt.Color(204, 204, 204));
        etime.setBorder(null);
        etime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etimeActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("Available Slots");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setText("Experience");

        jLabel14.setText("to");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(emailfield, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(number, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(location, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(hospital, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(specialization, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(stime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(jLabel14)
                        .addGap(4, 4, 4)
                        .addComponent(etime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 7, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel13)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(214, 214, 214)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(emailfield, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(number, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(location, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(hospital, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(stime, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etime, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(specialization, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addComponent(jButton4)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 620, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void emailfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailfieldActionPerformed

    private void numberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numberActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
new phome(uuname).setVisible(true);
this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void specializationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_specializationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_specializationActionPerformed

    private void locationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_locationActionPerformed

    private void hospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hospitalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hospitalActionPerformed

    private void stimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stimeActionPerformed

    private void etimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_etimeActionPerformed
public int getid(){ 
    int id = 0;
    try (Connection con = databaseconnection.getConnection()) {
        if (con != null) {
            String query = "SELECT doctor_id FROM doctor WHERE name = ? ";  
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, drname);

            ResultSet rs = ps.executeQuery();
       
            if (rs.next()) {
               id=rs.getInt("doctor_id");  
            } else {
                
                JOptionPane.showMessageDialog(this, "Doctor not found!.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            // If database connection fails
            JOptionPane.showMessageDialog(this, "Database connection failed!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } catch (SQLException ex) {
        // Handle SQL exceptions
        JOptionPane.showMessageDialog(this, "Database error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    return id;
}
private void detail(){
        try (Connection con = databaseconnection.getConnection()) {
        if (con != null) {
            //from doctors table
           String sql = "SELECT name, email, contact_info FROM doctor WHERE doctor_id = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, getid());
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                String namee = rs.getString("name");
                String email = rs.getString("email");
                String contactInfo = rs.getString("contact_info");
                name.setText(namee);
                emailfield.setText(email);
                number.setText(contactInfo);
               //from location table
               sql = "SELECT city, phase, street, hospital, from_time, to_time FROM location WHERE doctor_id = ?";
                stmt = con.prepareStatement(sql);
                stmt.setInt(1, getid());
                ResultSet rsLoc = stmt.executeQuery();

                if (rsLoc.next()) {
                    String address = rsLoc.getString("city") + ", " + rsLoc.getString("phase") + ", " + rsLoc.getString("street");
                    location.setText(address);
                    hospital.setText(rsLoc.getString("hospital"));
                    stime.setText(rsLoc.getString("from_time"));
                    etime.setText(rsLoc.getString("to_time"));
                    
                     sql = "SELECT name, years_of_completion, institute FROM specialization WHERE doctor_id = ?";
                stmt = con.prepareStatement(sql);
                stmt.setInt(1, getid());
                ResultSet rsSpec = stmt.executeQuery();

                if (rsSpec.next()) {
                    String spec = rsSpec.getString("name") + ", " + rsSpec.getInt("years_of_completion") + " years, " + rsSpec.getString("institute");
                    specialization.setText(spec);
                    
                }
                }
        }  
    } 
        }catch (SQLException ex) {
        // Handle SQL exceptions
        JOptionPane.showMessageDialog(this, "Database error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
 }
private void exptable(){
         DefaultTableModel model = new DefaultTableModel();
    model.addColumn("Position");
    model.addColumn("Organization");
    model.addColumn("City");
    model.addColumn("Start Date");
    model.addColumn("End Date");

    try (Connection con = databaseconnection.getConnection()) {
        if (con != null) {
            // Prepare the SQL query
            String query = "SELECT position_title, organization_name, city, start_date, end_date " +
                           "FROM experience " +
                           "WHERE doctor_id = ?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, getid());  // Get the doctor ID
            ResultSet rs = ps.executeQuery();
            
            model.setRowCount(0);  // Clear previous rows
            while (rs.next()) {
                // Add each row from the result set
                model.addRow(new Object[] {
                        rs.getString("position_title"),
                        rs.getString("organization_name"),
                        rs.getString("city"),
                        rs.getDate("start_date"),
                        rs.getDate("end_date")
                });
            }
            // Set the model for the experience table
            experience.setModel(model);
        }
    }  catch (SQLException ex) {
        // Handle SQL exceptions
        JOptionPane.showMessageDialog(this, "Database error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    }
private void schtable(){
         DefaultTableModel model2 = new DefaultTableModel(){
    @Override
    public boolean isCellEditable(int row, int column) {
        return column == 3; // Only make the button column editable
    }
};;
         model2.addColumn("Schedule ID");
    model2.addColumn("Date");
    model2.addColumn("Time");
model2.addColumn("Book Appointment");

    try (Connection con = databaseconnection.getConnection()) {
        if (con != null) {
            String sql = "SELECT schedule_id, date, time FROM schedule WHERE doctor_id = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, getid());  // Get the doctor ID
            ResultSet rsSched = stmt.executeQuery();
            
            model2.setRowCount(0);  // Clear previous rows
            while (rsSched.next()) {
                // Add each row from the result set
                model2.addRow(new Object[] {
                    rsSched.getInt("schedule_id"),
                    rsSched.getDate("date"),
                    rsSched.getTime("time"),
                    "Booked"
                });
            }
            // Set the model for the slots (schedule) table
            slots.setModel(model2);
            
slots.getColumn("Book Appointment").setCellRenderer(new ButtonRenderer());
slots.getColumn("Book Appointment").setCellEditor(new ButtonEditor(new JCheckBox()));
        }
    } catch (SQLException ex) {
        // Handle SQL exceptions
        JOptionPane.showMessageDialog(this, "Database error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }}
private Date convertStringToDate(String dateStr) {
    try {
        if (dateStr == null || dateStr.trim().isEmpty()) {
            return null;  // Return null or throw an exception as needed
        }
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); // Desired format: YYYY-MM-DD
        sdf.setLenient(false); // Ensure strict parsing
        java.util.Date parsedDate = sdf.parse(dateStr);  
        return new Date(parsedDate.getTime());
    } catch (ParseException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Invalid date format: " + dateStr);
        return null;  // Return null if the date format is invalid
    }
}
class ButtonRenderer extends JButton implements TableCellRenderer {
    public ButtonRenderer() {
        setOpaque(true);
    }

    public Component getTableCellRendererComponent(JTable table, Object value,
                                                   boolean isSelected, boolean hasFocus, int row, int column) {
        setText((value == null) ? "Book" : value.toString());
        return this;
    }
}

class ButtonEditor extends DefaultCellEditor {
    private JButton button;
    private String label;
    private boolean isPushed;
    private int selectedRow;

    public ButtonEditor(JCheckBox checkBox) {
        super(checkBox);
        button = new JButton();
        button.setOpaque(true);
        button.addActionListener(e -> {
            if (isPushed) {
                selectedRow = slots.getSelectedRow();
                showBookingDialog(selectedRow);
            }
        });
    }

    public Component getTableCellEditorComponent(JTable table, Object value,
                                                 boolean isSelected, int row, int column) {
        label = (value == null) ? "Book" : value.toString();
        button.setText(label);
        isPushed = true;
        return button;
    }

    public Object getCellEditorValue() {
        isPushed = false;
        return label;
    }

    public boolean stopCellEditing() {
        isPushed = false;
        return super.stopCellEditing();
    }
}
private void showBookingDialog(int row) {
    // Fetch data from the table
    String doctorNameText = name.getText();  // Assuming name field contains the doctor's name
    String patientName = uuname;  // Replace with actual patient name or input
    String addressText = location.getText();  // Assuming location field contains the address
    String hospitalText = hospital.getText();  // Hospital name
    String contactText = number.getText();  // Contact number
    String dateText = slots.getValueAt(row, 1).toString();
    String timeText = slots.getValueAt(row, 2).toString();

   // Create the booking message
    String message = String.format(
        "Doctor: %s\nPatient: %s\nAddress: %s\nHospital: %s\nContact: %s\nDate: %s\nTime: %s",
        doctorNameText, patientName, addressText, hospitalText, contactText, dateText, timeText
    );

    // Show the booking details dialog
    int result = JOptionPane.showConfirmDialog(
        this,
        message,
        "Confirm Booking",
        JOptionPane.OK_CANCEL_OPTION,
        JOptionPane.INFORMATION_MESSAGE
    );

    // If the user clicks "OK"
    if (result == JOptionPane.OK_OPTION) {
        // Display a confirmation message
        JOptionPane.showMessageDialog(
            this,
            "Your appointment request has been submitted.\nThe doctor will review and approve it later.",
            "Request Submitted",
            JOptionPane.INFORMATION_MESSAGE
        );
 int patientId = getPatientId(patientName);
    int doctorId = getDoctorId(doctorNameText);
    
    if (patientId == 0 || doctorId == 0) {
        JOptionPane.showMessageDialog(this, "Invalid Patient or Doctor name.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    try (Connection con = databaseconnection.getConnection()) {
        String sql = "INSERT INTO appointment (patient_id, doctor_id, consultation_date, consultation_time, status) VALUES (?, ?, ?, ?, ?)";
        PreparedStatement stmt = con.prepareStatement(sql);
        java.sql.Date date=java.sql.Date.valueOf(dateText);
        java.sql.Time time=java.sql.Time.valueOf(timeText);
        stmt.setInt(1, patientId);
        stmt.setInt(2, doctorId);
        stmt.setDate(3,date);
        stmt.setTime(4,time);
        stmt.setString(5, "Pending"); // Default status

        int rowsInserted = stmt.executeUpdate();
        if (rowsInserted > 0) {
            JOptionPane.showMessageDialog(this, "Your request has been submitted and will be approved by the doctor.", "Appointment Request", JOptionPane.INFORMATION_MESSAGE);
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Database error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    }}


// Method to retrieve patient_id based on patient name
private int getPatientId(String patientName) {
    int id = 0;
    try (Connection con = databaseconnection.getConnection()) {
        String sql = "SELECT patient_id FROM patient WHERE name = ?";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setString(1, patientName);
        ResultSet rs = stmt.executeQuery();
        if (rs.next()) {
            id = rs.getInt("patient_id");
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Error fetching patient ID: " + ex.getMessage());
    }
    return id;
}

// Method to retrieve doctor_id based on doctor name
private int getDoctorId(String doctorName) {
    int id = 0;
    try (Connection con = databaseconnection.getConnection()) {
        String sql = "SELECT doctor_id FROM doctor WHERE name = ?";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setString(1, doctorName);
        ResultSet rs = stmt.executeQuery();
        if (rs.next()) {
            id = rs.getInt("doctor_id");
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Error fetching doctor ID: " + ex.getMessage());
    }
    return id;
}

public static void main(String args[]) {
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField emailfield;
    private javax.swing.JTextField etime;
    private javax.swing.JTable experience;
    private javax.swing.JTextField hospital;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField location;
    private javax.swing.JTextField name;
    private javax.swing.JTextField number;
    private javax.swing.JTable slots;
    private javax.swing.JTextField specialization;
    private javax.swing.JTextField stime;
    // End of variables declaration//GEN-END:variables
}
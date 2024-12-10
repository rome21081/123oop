
package dentalproj;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class updatePD extends javax.swing.JFrame {
    
   private String firstName;
    private String lastName;
    
  public updatePD() {
        this.firstName = "";  // default value
        this.lastName = "";   // default value
        initComponents();
        txt_Fname.setText(firstName);
        txt_Lname.setText(lastName);
    }

    public updatePD(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        initComponents();
        txt_Fname.setText(firstName);
        txt_Lname.setText(lastName);
    }





    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txt_PatientID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_Fname = new javax.swing.JTextField();
        txt_Lname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_Age = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_Gender = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_add = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_cpno = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_caseD = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_Med = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_LDV = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_NDV = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        btn_update = new javax.swing.JButton();
        btn_back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Patient ID:");

        txt_PatientID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_PatientIDActionPerformed(evt);
            }
        });

        jLabel2.setText("First name:");

        txt_Fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_FnameActionPerformed(evt);
            }
        });

        txt_Lname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_LnameActionPerformed(evt);
            }
        });

        jLabel3.setText("Last name:");

        txt_Age.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_AgeActionPerformed(evt);
            }
        });

        jLabel4.setText("Age:");

        txt_Gender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_GenderActionPerformed(evt);
            }
        });

        jLabel5.setText("Gender:");

        txt_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_addActionPerformed(evt);
            }
        });

        jLabel6.setText("Address");

        txt_cpno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cpnoActionPerformed(evt);
            }
        });

        jLabel7.setText("Contact no:");

        txt_caseD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_caseDActionPerformed(evt);
            }
        });

        jLabel8.setText("Case Description:");

        txt_Med.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_MedActionPerformed(evt);
            }
        });

        jLabel9.setText("Medication:");

        txt_LDV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_LDVActionPerformed(evt);
            }
        });

        jLabel10.setText("Last Dental Visit:");

        txt_NDV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_NDVActionPerformed(evt);
            }
        });

        jLabel11.setText("Next Dental Visit:");

        btn_update.setText("Update");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });

        btn_back.setText("Back");
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt_add, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(84, 84, 84)
                                .addComponent(btn_update, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_back, javax.swing.GroupLayout.PREFERRED_SIZE, 66, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_PatientID, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_Gender, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_Age, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_Lname, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_Fname, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_cpno, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_caseD, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_Med, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_LDV, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_NDV, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(58, 58, 58))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_PatientID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_Fname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_Lname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_Age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_Gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_cpno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_caseD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_Med, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_LDV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_NDV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_add, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_update)
                    .addComponent(btn_back))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_PatientIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_PatientIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_PatientIDActionPerformed

    private void txt_FnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_FnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_FnameActionPerformed

    private void txt_LnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_LnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_LnameActionPerformed

    private void txt_AgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_AgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_AgeActionPerformed

    private void txt_GenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_GenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_GenderActionPerformed

    private void txt_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_addActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_addActionPerformed

    private void txt_cpnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cpnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cpnoActionPerformed

    private void txt_caseDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_caseDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_caseDActionPerformed

    private void txt_MedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_MedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_MedActionPerformed

    private void txt_LDVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_LDVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_LDVActionPerformed

    private void txt_NDVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_NDVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_NDVActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
         // Get the values from the text fields
    String patientID = txt_PatientID.getText();
    String firstName = txt_Fname.getText();
    String lastName = txt_Lname.getText();
    String age = txt_Age.getText();
    String gender = txt_Gender.getText();
    String address = txt_add.getText();
    String contactNo = txt_cpno.getText();
    String caseDesc = txt_caseD.getText();
    String medication = txt_Med.getText();
    String lastDentalVisit = txt_LDV.getText();
    String nextDentalVisit = txt_NDV.getText();

    // Validate the input values (optional)
    if (patientID.isEmpty() || firstName.isEmpty() || lastName.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please fill in all required fields.");
        return;
    }

    // Database update logic
    try {
        // Connect to the database
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dentaldb", "root", "password");  // Replace with your database details
        String updateSQL = "UPDATE patients SET first_name = ?, last_name = ?, age = ?, gender = ?, address = ?, contact_no = ?, case_desc = ?, medication = ?, last_dental_visit = ?, next_dental_visit = ? WHERE patient_id = ?";
        
        PreparedStatement ps = conn.prepareStatement(updateSQL);
        ps.setString(1, firstName);
        ps.setString(2, lastName);
        ps.setString(3, age);
        ps.setString(4, gender);
        ps.setString(5, address);
        ps.setString(6, contactNo);
        ps.setString(7, caseDesc);
        ps.setString(8, medication);
        ps.setString(9, lastDentalVisit);
        ps.setString(10, nextDentalVisit);
        ps.setString(11, patientID);

        // Execute the update query
        int rowsAffected = ps.executeUpdate();

        if (rowsAffected > 0) {
            JOptionPane.showMessageDialog(this, "Patient details updated successfully.");
        } else {
            JOptionPane.showMessageDialog(this, "Error: Patient ID not found.");
        }

        // Close the connection
        ps.close();
        conn.close();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Database error: " + e.getMessage());
    }
    
    }//GEN-LAST:event_btn_updateActionPerformed

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
       this.dispose();
     new dentalinterface().setVisible(true);
    String firstName = txt_Fname.getText(); // Get the first name from the text field
    String lastName = txt_Lname.getText();  // Get the last name from the text field
    new updatePD(firstName, lastName).setVisible(true);
    }//GEN-LAST:event_btn_backActionPerformed


    
    
    public static void main(String args[]) {
   
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new updatePD().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_update;
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
    private javax.swing.JTextField txt_Age;
    private javax.swing.JTextField txt_Fname;
    private javax.swing.JTextField txt_Gender;
    private javax.swing.JTextField txt_LDV;
    private javax.swing.JTextField txt_Lname;
    private javax.swing.JTextField txt_Med;
    private javax.swing.JTextField txt_NDV;
    private javax.swing.JTextField txt_PatientID;
    private javax.swing.JTextField txt_add;
    private javax.swing.JTextField txt_caseD;
    private javax.swing.JTextField txt_cpno;
    // End of variables declaration//GEN-END:variables
}

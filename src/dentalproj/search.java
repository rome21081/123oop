
package dentalproj;
import java.sql.ResultSet;

public class search extends javax.swing.JFrame { 
    
  public search(ResultSet resultSet) {
        initComponents();
        populateTextArea(resultSet);
    }

   
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        txt_area = new java.awt.TextArea();
        jComboBox1 = new javax.swing.JComboBox<>();
        btn_update = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btndel = new javax.swing.JButton();
        btn_return = new javax.swing.JButton();
        addrecord = new java.awt.Button();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setFocusCycleRoot(false);

        txt_area.setEditable(false);
        txt_area.setFont(new java.awt.Font("Georgia", 0, 24)); // NOI18N

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        btn_update.setText("Update");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });

        jLabel2.setText("Info");

        btndel.setText("Delete");
        btndel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndelActionPerformed(evt);
            }
        });

        btn_return.setText("Return");
        btn_return.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_returnActionPerformed(evt);
            }
        });

        addrecord.setLabel("Add");
        addrecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addrecordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(btn_update, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btndel, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_return, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(addrecord, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_area, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(144, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_area, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(addrecord, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_update, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btndel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_return, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_returnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_returnActionPerformed
        // TODO add your handling code here:
       try {
        this.dispose(); // Close the current JFrame
        new dentalinterface().setVisible(true); // Open the dentalinterface JFrame
    } catch (Exception e) {
        javax.swing.JOptionPane.showMessageDialog(this, "Error returning to main interface: " + e.getMessage());
     
    }
           
    }//GEN-LAST:event_btn_returnActionPerformed

     private void populateTextArea(ResultSet resultSet) {
        try {
            StringBuilder sb = new StringBuilder();
            while (resultSet.next()) {
                sb.append("Patient ID: ").append(resultSet.getInt("patientID")).append("\n");
                sb.append("First Name: ").append(resultSet.getString("first_name")).append("\n");
                sb.append("Last Name: ").append(resultSet.getString("last_name")).append("\n");
                sb.append("Age: ").append(resultSet.getString("age")).append("\n");
                sb.append("Gender: ").append(resultSet.getString("gender")).append("\n");
                sb.append("Cp_number: ").append(resultSet.getInt("cp_number")).append("\n");
                sb.append("Address: ").append(resultSet.getString("address")).append("\n");
                sb.append("Case_Description: ").append(resultSet.getString("case_Description")).append("\n");
                sb.append("Medication: ").append(resultSet.getString("medication")).append("\n");
                sb.append("Last_visitation: ").append(resultSet.getString("last_visitation")).append("\n");
                sb.append("Next_visitation: ").append(resultSet.getString("Next_visitation")).append("\n");   
                sb.append("-----------\n");
            }
            txt_area.setText(sb.toString());
        } catch (Exception e) {
            txt_area.setText("Error displaying data: " + e.getMessage());
           
        }
    }

    
    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        // TODO add your handling code here:
        
        this.dispose();
         new updatePD().setVisible(true);
          
        
    }//GEN-LAST:event_btn_updateActionPerformed

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void btndelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndelActionPerformed
 

    }//GEN-LAST:event_btndelActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void addrecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addrecordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addrecordActionPerformed

   
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button addrecord;
    private javax.swing.JButton btn_return;
    private javax.swing.JButton btn_update;
    private javax.swing.JButton btndel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.TextArea txt_area;
    // End of variables declaration//GEN-END:variables
}

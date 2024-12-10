
package dentalproj;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.DefaultListModel;

public class dentalinterface extends javax.swing.JFrame {

   
   public dentalinterface() {
        initComponents();
        fetchAndDisplayNames();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label1 = new java.awt.Label();
        jColorChooser1 = new javax.swing.JColorChooser();
        jColorChooser2 = new javax.swing.JColorChooser();
        btn_search = new java.awt.Button();
        btn_add = new java.awt.Button();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listname = new javax.swing.JList<>();
        txtEnter1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        label1.setText("label1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        btn_search.setActionCommand("Search");
        btn_search.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_search.setLabel("Search");
        btn_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchActionPerformed(evt);
            }
        });

        btn_add.setLabel("Add");
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });

        jLabel1.setText("LJD Dental Clinic");

        jScrollPane1.setViewportView(listname);

        txtEnter1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEnter1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Enter Name :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtEnter1)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btn_search, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btn_add, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtEnter1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_search, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                            .addComponent(btn_add, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        btn_search.getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
   new add().setVisible(true);
    this.dispose();
    }//GEN-LAST:event_btn_addActionPerformed

    private void btn_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchActionPerformed
     String searchName = txtEnter1.getText().trim();

        if (searchName.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter a name to search!");
            return;
        }

        String uname = "root";
        String pass = "";
        String url = "jdbc:mysql://localhost:3307/dentist";

        try (Connection connection = DriverManager.getConnection(url, uname, pass);
             PreparedStatement preparedStatement = connection.prepareStatement(
                 "SELECT * FROM patients WHERE first_name LIKE ? OR last_name LIKE ?"
             )) {

            preparedStatement.setString(1, "%" + searchName + "%");
            preparedStatement.setString(2, "%" + searchName + "%");

            ResultSet resultSet = preparedStatement.executeQuery();

            if (!resultSet.isBeforeFirst()) {
                JOptionPane.showMessageDialog(this, "No matching records found!");
            } else {
                this.dispose();
                new search(resultSet).setVisible(true);
            
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
           
        }
    }//GEN-LAST:event_btn_searchActionPerformed

    private void txtEnter1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEnter1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEnter1ActionPerformed
    private void fetchAndDisplayNames() {
    String uname = "root";
    String pass = "";
    String url = "jdbc:mysql://localhost:3307/dentist";

    try (Connection connection = DriverManager.getConnection(url, uname, pass);
         Statement statement = connection.createStatement();
         ResultSet resultSet = statement.executeQuery("SELECT first_name, last_name FROM patients")) {

        DefaultListModel<String> listModel = new DefaultListModel<>();
        while (resultSet.next()) {
            String fullName = resultSet.getString("first_name") + " " + resultSet.getString("last_name");
            listModel.addElement(fullName);
        }
        listname.setModel(listModel);

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error fetching names: " + e.getMessage());
     
    }
}
    
    private void openUpdateFrame() {
    String selectedName = listname.getSelectedValue();
    if (selectedName != null) {
        String[] nameParts = selectedName.split(" ");
        String firstName = nameParts[0];
        String lastName = nameParts[1];

        // Create the update frame and pass the patient info to it
        updatePD updateFrame = new updatePD(firstName, lastName);
        updateFrame.setVisible(true);
    } else {
        JOptionPane.showMessageDialog(this, "Please select a patient to update.");
    }
}



    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
         
                new dentalinterface().setVisible(true);
                
                 
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button btn_add;
    private java.awt.Button btn_search;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JColorChooser jColorChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Label label1;
    private javax.swing.JList<String> listname;
    private javax.swing.JTextField txtEnter1;
    // End of variables declaration//GEN-END:variables
}

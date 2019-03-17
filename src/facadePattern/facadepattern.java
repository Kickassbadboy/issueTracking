/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facadePattern;

import Main.issues;
import Main.loginForm;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author yashtalegaonkar
 */
public class facadepattern extends javax.swing.JFrame {

    /**
     * Creates new form facadepattern
     */
    public facadepattern() {
        initComponents();
        String issauth =jComboBox1.getSelectedItem().toString();
        showAllData();
    }

    
    
    
    public ArrayList<issues> issueList(){
       ArrayList<issues>issueList = new ArrayList<>();
        Connection conn = null;
        Statement stmt = null;
        try{
      //STEP 2: Register JDBC driverz
      Class.forName("com.mysql.jdbc.Driver");
      String issauth =jComboBox1.getSelectedItem().toString();
      //STEP 3: Open a connection
      System.out.println("Connecting to database...");
      conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/issueTrackingSystem","root","ac0de52dh");
      
      issues issue;
      String sql = "select * from issues where issueauth='"+issauth+"'";
      //STEP 4: Execute a query
      stmt =conn.createStatement();
      ResultSet rs = stmt.executeQuery(sql);
     
      while(rs.next()){
        issue = new issues(rs.getString(1),rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8));
        issueList.add(issue);
         System.out.println("in rs loop");
        
      }
        
        
        }catch(ClassNotFoundException | SQLException e){
            System.out.println(e);
        }
        
        
        return issueList;
        
    }
    
    
     public void showAllData(){
         ArrayList<issues> list = issueList();
         
         DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
         
         Object[] row = new Object[6];
         
         
         for(int i=0;i<list.size();i++){
             row[0]=list.get(i).getRandomID();
             row[1]=list.get(i).getIssuename();
             row[2]=list.get(i).getPriority();
             row[3]=list.get(i).getName();
             
            // row[2]=list
             model.addRow(row);
             //System.out.print(issueList().get(i).getName());
         }
     }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Unique ID", "issue Name", "Priortiy", "name"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setText("Sekect Issue Authority");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Accounts", "Administrator", "Faculty", "Director" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jButton1.setText("Logout");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 862, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(187, 187, 187)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 9, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 579, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        showAllData();
       DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
       if(jTable1.getRowCount()<0){
           showAllData();
       }
       else{
           if(model.getRowCount()!=0){
               model.setRowCount(0);
               
           }
           showAllData();
           
       }
     
//        ArrayList<issues> list = issueList();
//       DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
//       Object[] row = new Object[6];
//         
//         
//         for(int i=0;i<list.size();i++){
//             row[0]=list.get(i).getRandomID();
//             row[2]=list.get(i).getIssuename();
//             row[3]=list.get(i).getPriority();
//             row[4]=list.get(i).getName();
//             
//            // row[2]=list
//             model.addRow(row);
     
       
//       }
       
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        loginForm login=new loginForm();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
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
            java.util.logging.Logger.getLogger(facadepattern.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(facadepattern.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(facadepattern.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(facadepattern.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new facadepattern().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}

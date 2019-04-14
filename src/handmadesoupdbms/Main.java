package handmadesoupdbms;

import java.awt.print.PrinterException;
import java.text.MessageFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author Chin Jia Xiong
 */
public class Main extends javax.swing.JFrame {
    
    public Main() {
        // design setting
        initComponents();
        setLocationRelativeTo(null);
        TableOperation.initTableDesign(jTable1);
        // initialize table if no yet done.
        // oil table
        DatabaseOperation.createTable("oil", 
                new String[]{"nameChi", "nameEng", "NaOH", "KOH", "INSsolid", "INSliquid", "price"}, 
                new Object[]{"NONE", "NONE", -1.0, -1.0, -1, -1, -1},
                new String[]{"string", "string", "double", "double", "integer", "integer", "double"});
        // history table
        DatabaseOperation.createTable("history", 
                new String[]{"name", "mode", "oilAmount", "waterAmount", "selectedOilInfo"}, 
                new Object[]{"NONE", "NONE", -1.0, -1.0, ""},
                new String[]{"string", "string", "double", "double", "string"});
        // addOns table
        DatabaseOperation.createTable("addOns", 
                new String[]{"nameChi", "nameEng", "price", "amount"}, 
                new Object[]{"NONE", "NONE", -1.0, -1.0},
                new String[]{"string", "string", "double", "double"});
        // clear table
        TableOperation.clear(jTable1);
        // import records from database
        ArrayList<Object[]> dataSet = DatabaseOperation.getData("oil");
        // update table
        TableOperation.add(jTable1, dataSet);
        // initialize filter
        TableOperation.initTableFilter(jTable1, jTextField89, "油品(英)");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel98 = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jTextField89 = new javax.swing.JTextField();
        jLabel79 = new javax.swing.JLabel();
        jButton12 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Handmade Soup Management System");

        jPanel4.setBackground(new java.awt.Color(255, 153, 204));

        jLabel98.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel98.setForeground(new java.awt.Color(102, 102, 102));

        jTable1.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.", "ID", "油品(中)", "油品(英)", "NaOH值", "KOH值", "INS值(固态)", "INS值(液态)", "成本(1公克)"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setRowHeight(36);
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable1.setSurrendersFocusOnKeystroke(true);
        jScrollPane11.setViewportView(jTable1);

        jButton10.setFont(new java.awt.Font("Arial Unicode MS", 1, 18)); // NOI18N
        jButton10.setText("加油品");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setFont(new java.awt.Font("Arial Unicode MS", 1, 18)); // NOI18N
        jButton11.setText("删除油品");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jTextField89.setFont(new java.awt.Font("Arial Unicode MS", 0, 24)); // NOI18N

        jLabel79.setFont(new java.awt.Font("Arial Unicode MS", 1, 24)); // NOI18N
        jLabel79.setForeground(new java.awt.Color(0, 0, 0));
        jLabel79.setText("搜索: ");

        jButton12.setFont(new java.awt.Font("Arial Unicode MS", 1, 18)); // NOI18N
        jButton12.setText("更改油品资料");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial Unicode MS", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("油品资料库");

        jButton8.setFont(new java.awt.Font("Arial Unicode MS", 1, 18)); // NOI18N
        jButton8.setText("打印");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton13.setFont(new java.awt.Font("Arial Unicode MS", 1, 18)); // NOI18N
        jButton13.setText("添加物资料库");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane11)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(271, 271, 271)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(84, 84, 84)
                                        .addComponent(jLabel79)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField89, javax.swing.GroupLayout.DEFAULT_SIZE, 415, Short.MAX_VALUE))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addComponent(jLabel98))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49)
                                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 21, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField89, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel79)
                    .addComponent(jButton8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton10)
                    .addComponent(jButton12)
                    .addComponent(jButton11)
                    .addComponent(jButton13))
                .addGap(22, 22, 22)
                .addComponent(jLabel98))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // go to modification page
        this.dispose();
        ModifyOil.go(true, 0);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        int row = jTable1.getSelectedRow();
        // if a row is selected
        if(row != -1){
            row = jTable1.getRowSorter().convertRowIndexToModel(row);
            String nameChi = jTable1.getModel().getValueAt(row, jTable1.getColumn("油品(中)").getModelIndex()).toString();
            int id = Integer.parseInt(jTable1.getModel().getValueAt(row, jTable1.getColumn("ID").getModelIndex()).toString());
            // confimation
            int rslt = JOptionPane.showConfirmDialog(this, "确认删除油品 " + nameChi + " 及其资料？", "Delete", JOptionPane.OK_CANCEL_OPTION);
            // if yes
            if(rslt == JOptionPane.OK_OPTION){
                // remove the row from table
                TableOperation.clear(jTable1, row);
                // remove the record from database
                DatabaseOperation.removeData("oil", id);
                // notification
                JOptionPane.showMessageDialog(this, "油品 " + nameChi + " 已成功被删除。");
            }
        }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        int row = jTable1.getSelectedRow();
        // if a row is selected
        if(row != -1){
            row = jTable1.getRowSorter().convertRowIndexToModel(row);
            // go to modification page
            int id = Integer.parseInt(jTable1.getModel().getValueAt(row, jTable1.getColumn("ID").getModelIndex()).toString());
            this.dispose();
            ModifyOil.go(false, id);
        }
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // create pdf file
        try {
            // header design
            MessageFormat header = new MessageFormat("油品资料");
            // footer design
            MessageFormat footer = new MessageFormat("Page {0,number,integer}");
            jTable1.print(JTable.PrintMode.FIT_WIDTH, header, footer);
        } catch (PrinterException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        this.dispose();
        addOns.go();
    }//GEN-LAST:event_jButton13ActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }
    
    public static void go(){
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField89;
    // End of variables declaration//GEN-END:variables
}

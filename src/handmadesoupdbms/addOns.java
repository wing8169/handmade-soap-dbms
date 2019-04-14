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
public class addOns extends javax.swing.JFrame {

    public addOns() {
        // design settings
        initComponents();
        setLocationRelativeTo(null);
        // initialize table design
        TableOperation.initTableDesign(jTable1);
        // clear table
        TableOperation.clear(jTable1);
        // import records
        ArrayList<Object[]> resultSet = DatabaseOperation.getData("addOns");
        // add records into table
        TableOperation.add(jTable1, resultSet);
        // initialize filter
        TableOperation.initTableFilter(jTable1, jTextField89, "添加物(英)");
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

        jPanel4.setBackground(new java.awt.Color(255, 153, 204));

        jLabel98.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel98.setForeground(new java.awt.Color(102, 102, 102));

        jTable1.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.", "ID", "添加物(中)", "添加物(英)", "成本", "量(克/升)"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
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
        jButton10.setText("加添加物");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setFont(new java.awt.Font("Arial Unicode MS", 1, 18)); // NOI18N
        jButton11.setText("删除添加物");
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
        jButton12.setText("更改添加物资料");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial Unicode MS", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("添加物资料库");

        jButton8.setFont(new java.awt.Font("Arial Unicode MS", 1, 18)); // NOI18N
        jButton8.setText("打印");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton13.setFont(new java.awt.Font("Arial Unicode MS", 1, 18)); // NOI18N
        jButton13.setText("油品资料库");
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
                                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(84, 84, 84)
                                .addComponent(jLabel79)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField89))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(347, 347, 347)
                                .addComponent(jLabel98))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 78, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(383, 383, 383)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
        // go to addition page
        this.dispose();
        ModifyAddOns.go(true, 0);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        int row = jTable1.getSelectedRow();
        // if a row is selected
        if(row != -1){
            row = jTable1.getRowSorter().convertRowIndexToModel(row);
            String nameChi = jTable1.getModel().getValueAt(row, jTable1.getColumn("添加物(中)").getModelIndex()).toString();
            int id = Integer.parseInt(jTable1.getModel().getValueAt(row, jTable1.getColumn("ID").getModelIndex()).toString());
            // confimation
            int rslt = JOptionPane.showConfirmDialog(this, "确认删除添加物 " + nameChi + " 及其资料？", "Delete", JOptionPane.OK_CANCEL_OPTION);
            // if yes
            if(rslt == JOptionPane.OK_OPTION){
                // remove the row from table
                TableOperation.clear(jTable1, row);
                // remove the record from database
                DatabaseOperation.removeData("addOns", id);
                // notification
                JOptionPane.showMessageDialog(this, "添加物 " + nameChi + " 已成功被删除！");
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
            ModifyAddOns.go(false, id);
        }
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // create pdf file
        try {
            // header design
            MessageFormat header = new MessageFormat("添加物资料");
            // footer design
            MessageFormat footer = new MessageFormat("Page {0,number,integer}");
            jTable1.print(JTable.PrintMode.FIT_WIDTH, header, footer);
        } catch (PrinterException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        this.dispose();
        Main.go();
    }//GEN-LAST:event_jButton13ActionPerformed

    public static void go() {
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
            java.util.logging.Logger.getLogger(addOns.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addOns.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addOns.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addOns.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addOns().setVisible(true);
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

package handmadesoupdbms;

import javax.swing.JOptionPane;

/**
 *
 * @author Chin Jia Xiong
 */
public class ModifyAddOns extends javax.swing.JFrame {

    boolean add;
    int id;
    
    public ModifyAddOns(boolean add, int id) {
        initComponents();
        setLocationRelativeTo(null);
        this.add = add;
        this.id = id;
        // design for addition
        if(add){
            jLabel78.setText("添加添加物");
        }
        // design for modification
        else{
            jLabel78.setText("更改添加物资料");
            // Get the data from database
            Object[] record = DatabaseOperation.getData("addOns", id);
            // initialize fields
            jTextField91.setText((String)record[1]);
            jTextField90.setText((String)record[2]);
            jTextField89.setText(Double.toString((Double)record[3]));
            jTextField92.setText(Double.toString((Double)record[4]));
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel78 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        jTextField89 = new javax.swing.JTextField();
        jLabel114 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jTextField90 = new javax.swing.JTextField();
        jLabel115 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jLabel116 = new javax.swing.JLabel();
        jTextField91 = new javax.swing.JTextField();
        jTextField92 = new javax.swing.JTextField();
        jLabel117 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jPanel4.setBackground(new java.awt.Color(255, 153, 204));

        jLabel78.setFont(new java.awt.Font("Arial Unicode MS", 1, 24)); // NOI18N
        jLabel78.setForeground(new java.awt.Color(0, 0, 0));
        jLabel78.setText("添加添加物");

        jLabel98.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel98.setForeground(new java.awt.Color(102, 102, 102));

        jTextField89.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N

        jLabel114.setFont(new java.awt.Font("Arial Unicode MS", 0, 24)); // NOI18N
        jLabel114.setForeground(new java.awt.Color(102, 102, 102));
        jLabel114.setText("英文名:");

        jButton6.setFont(new java.awt.Font("Arial Unicode MS", 1, 18)); // NOI18N
        jButton6.setText("返回");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jTextField90.setFont(new java.awt.Font("Arial Unicode MS", 0, 24)); // NOI18N

        jLabel115.setFont(new java.awt.Font("Arial Unicode MS", 0, 24)); // NOI18N
        jLabel115.setForeground(new java.awt.Color(102, 102, 102));
        jLabel115.setText("成本:");

        jButton7.setFont(new java.awt.Font("Arial Unicode MS", 1, 18)); // NOI18N
        jButton7.setText("确认");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel116.setFont(new java.awt.Font("Arial Unicode MS", 0, 24)); // NOI18N
        jLabel116.setForeground(new java.awt.Color(102, 102, 102));
        jLabel116.setText("中文名:");

        jTextField91.setFont(new java.awt.Font("Arial Unicode MS", 0, 24)); // NOI18N

        jTextField92.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N

        jLabel117.setFont(new java.awt.Font("Arial Unicode MS", 0, 24)); // NOI18N
        jLabel117.setForeground(new java.awt.Color(102, 102, 102));
        jLabel117.setText("量(克/升):");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel78))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel116)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField91, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel117)
                                    .addComponent(jLabel115)
                                    .addComponent(jLabel114))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField92, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField89, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField90, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel98)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(70, 70, 70)))))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel78, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel116, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField91, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField90, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel114))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField89, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel115))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField92, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel117))
                        .addGap(64, 64, 64)
                        .addComponent(jLabel98)
                        .addContainerGap(55, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton6)
                            .addComponent(jButton7))
                        .addGap(46, 46, 46))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // go back to main menu
        this.dispose();
        addOns.go();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // if the data is all verified
        if(verified()){
            // addition
            if(add){
                DatabaseOperation.insertData("addOns", 
                        new String[]{"nameChi", "nameEng", "price", "amount"}, 
                        new Object[]{jTextField91.getText(), jTextField90.getText(),
                        Double.parseDouble(jTextField89.getText()),
                        Double.parseDouble(jTextField92.getText())},
                        new String[]{"string", "string", "double", "double"});
                // success dialog
                JOptionPane.showMessageDialog(this, "添加物 " + jTextField91.getText() + " 成功导入资料库!");
                // empty the fields
                jTextField91.setText("");
                jTextField90.setText("");
                jTextField89.setText("");
                jTextField92.setText("");
            }else{
                // modification
                DatabaseOperation.updateData("addOns", 
                        new String[]{"nameChi", "nameEng", "price", "amount"}, 
                        new Object[]{jTextField91.getText(), jTextField90.getText(),
                        Double.parseDouble(jTextField89.getText()),
                        Double.parseDouble(jTextField92.getText())},
                        id,
                        new String[]{"string", "string", "double", "double"});
                JOptionPane.showMessageDialog(this, "添加物 " + jTextField91.getText() + " 成功更新!");
                // go back to main menu
                this.dispose();
                addOns.go();
            }
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private boolean verified(){
        try{
            Double.parseDouble(jTextField89.getText());
        }catch(NumberFormatException e){
            return false;
        }
        try{
            Double.parseDouble(jTextField92.getText());
        }catch(NumberFormatException e){
            return false;
        }
        return true;
    }
    
    public static void go(boolean add, int id) {
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
            java.util.logging.Logger.getLogger(ModifyAddOns.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModifyAddOns.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModifyAddOns.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModifyAddOns.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModifyAddOns(add, id).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTextField89;
    private javax.swing.JTextField jTextField90;
    private javax.swing.JTextField jTextField91;
    private javax.swing.JTextField jTextField92;
    // End of variables declaration//GEN-END:variables
}

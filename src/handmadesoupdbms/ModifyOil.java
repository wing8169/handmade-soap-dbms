package handmadesoupdbms;

import javax.swing.JOptionPane;

/**
 *
 * @author Chin Jia Xiong
 */
public class ModifyOil extends javax.swing.JFrame {

    boolean add;
    int id;
    
    public ModifyOil(boolean add, int id) {
        initComponents();
        setLocationRelativeTo(null);
        this.add = add;
        this.id = id;
        // design for addition
        if(add){
            jLabel78.setText("添加油品");
        }
        // design for modification
        else{
            jLabel78.setText("更改油品资料");
            // Get the data from database
            Object[] record = DatabaseOperation.getData("oil", id);
            // initalize fields
            jTextField91.setText((String)record[1]);
            jTextField90.setText((String)record[2]);
            jTextField89.setText(Double.toString((Double)record[3]));
            jTextField92.setText(Double.toString((Double)record[4]));
            jTextField93.setText(Integer.toString((Integer)record[5]));
            jTextField94.setText(Integer.toString((Integer)record[6]));
            // initialize price only if the value is not -1
            double price = (Double)record[7];
            if(price != -1) jTextField95.setText(Double.toString(price));
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
        jTextField93 = new javax.swing.JTextField();
        jTextField94 = new javax.swing.JTextField();
        jLabel119 = new javax.swing.JLabel();
        jLabel120 = new javax.swing.JLabel();
        jTextField95 = new javax.swing.JTextField();
        jLabel121 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jPanel4.setBackground(new java.awt.Color(255, 153, 204));

        jLabel78.setFont(new java.awt.Font("Arial Unicode MS", 1, 24)); // NOI18N
        jLabel78.setForeground(new java.awt.Color(0, 0, 0));
        jLabel78.setText("添加油品");

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
        jLabel115.setText("NaOH值:");

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
        jLabel117.setText("KOH值:");

        jTextField93.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N

        jTextField94.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N

        jLabel119.setFont(new java.awt.Font("Arial Unicode MS", 0, 24)); // NOI18N
        jLabel119.setForeground(new java.awt.Color(102, 102, 102));
        jLabel119.setText("INS值(固态):");

        jLabel120.setFont(new java.awt.Font("Arial Unicode MS", 0, 24)); // NOI18N
        jLabel120.setForeground(new java.awt.Color(102, 102, 102));
        jLabel120.setText("INS值(液态):");

        jTextField95.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N

        jLabel121.setFont(new java.awt.Font("Arial Unicode MS", 0, 24)); // NOI18N
        jLabel121.setForeground(new java.awt.Color(102, 102, 102));
        jLabel121.setText("成本(1公克):");

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
                        .addGap(77, 77, 77)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel116)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField91, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel119)
                                    .addComponent(jLabel120)
                                    .addComponent(jLabel117)
                                    .addComponent(jLabel115)
                                    .addComponent(jLabel114)
                                    .addComponent(jLabel121))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField93, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel98)
                                    .addComponent(jTextField94, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField92, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField89, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField90, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField95, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(81, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(172, 172, 172))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel78, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel119)
                    .addComponent(jTextField93, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(jLabel98)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField94, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel120))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField95, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel121))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6)
                    .addComponent(jButton7))
                .addContainerGap())
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
        Main.go();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // if the data is all verified
        if(verified()){
            // addition
            if(add){
                DatabaseOperation.insertData("oil", 
                        new String[]{"nameChi", "nameEng", "NaOH", "KOH", "INSsolid", "INSliquid", "price"}, 
                        new Object[]{jTextField91.getText(), jTextField90.getText(), Double.parseDouble(jTextField89.getText()),
                        Double.parseDouble(jTextField92.getText()), Integer.parseInt(jTextField93.getText()),
                        Integer.parseInt(jTextField94.getText()), Double.parseDouble(jTextField95.getText())},
                        new String[]{"string", "string", "double", "double", "integer", "integer", "double"}
                );
                // success dialog
                JOptionPane.showMessageDialog(this, "油品 " + jTextField91.getText() + " 成功导入资料库!");
                // empty the fields
                jTextField91.setText("");
                jTextField90.setText("");
                jTextField89.setText("");
                jTextField92.setText("");
                jTextField93.setText("");
                jTextField94.setText("");
                jTextField95.setText("");
            }else{
                // modification
                DatabaseOperation.updateData("oil", 
                        new String[]{"nameChi", "nameEng", "NaOH", "KOH", "INSsolid", "INSliquid", "price"}, 
                        new Object[]{jTextField91.getText(), jTextField90.getText(), Double.parseDouble(jTextField89.getText()),
                        Double.parseDouble(jTextField92.getText()), Integer.parseInt(jTextField93.getText()),
                        Integer.parseInt(jTextField94.getText()), Double.parseDouble(jTextField95.getText())},
                        id,
                        new String[]{"string", "string", "double", "double", "integer", "integer", "double"}
                );
                JOptionPane.showMessageDialog(this, "油品 " + jTextField91.getText() + " 成功更新!");
                // go back to main menu
                this.dispose();
                Main.go();
            }
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private boolean verified(){
        try{
            Double.parseDouble(jTextField89.getText());
        }catch(Exception e){
            jTextField89.setText("-1.0");
        }
        try{
            Double.parseDouble(jTextField92.getText());
        }catch(Exception e){
            jTextField92.setText("-1.0");
        }
        try{
            Integer.parseInt(jTextField93.getText());
        }catch(Exception e){
            jTextField93.setText("-1");
        }
        try{
            Integer.parseInt(jTextField94.getText());
        }catch(Exception e){
            jTextField94.setText("-1");
        }
        try{
            Double.parseDouble(jTextField95.getText());
        }catch(Exception e){
            jTextField95.setText("-1");
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
            java.util.logging.Logger.getLogger(ModifyOil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModifyOil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModifyOil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModifyOil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModifyOil(add, id).setVisible(true);
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
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTextField89;
    private javax.swing.JTextField jTextField90;
    private javax.swing.JTextField jTextField91;
    private javax.swing.JTextField jTextField92;
    private javax.swing.JTextField jTextField93;
    private javax.swing.JTextField jTextField94;
    private javax.swing.JTextField jTextField95;
    // End of variables declaration//GEN-END:variables
}

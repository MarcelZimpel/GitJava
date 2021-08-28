
package classes;


public class telaCalc extends javax.swing.JFrame {

 
    public telaCalc() { //Construtor
        initComponents();
        panCalc.setVisible(false);
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        txtNum = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        btnCacl = new javax.swing.JButton();
        panCalc = new javax.swing.JPanel();
        lblResto2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblRaizQ2 = new javax.swing.JLabel();
        lblRaizC2 = new javax.swing.JLabel();
        lblAbs2 = new javax.swing.JLabel();
        lblResto = new javax.swing.JLabel();
        lblCubo = new javax.swing.JLabel();
        lblRaizQ = new javax.swing.JLabel();
        lblRaizC = new javax.swing.JLabel();
        lblAbs = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setText("Digite um Valor");

        txtNum.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtNum.setModel(new javax.swing.SpinnerNumberModel(1, -50, 50, 1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/images-_1_.jpg"))); // NOI18N

        btnCacl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/images-_2_.jpg"))); // NOI18N
        btnCacl.setText("Calcular");
        btnCacl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCaclActionPerformed(evt);
            }
        });

        lblResto2.setText("Resto da Divisao por 2");

        jLabel5.setText("Elevado ao Cubo");

        lblRaizQ2.setText("Raiz Quadrada");

        lblRaizC2.setText("Raiz Cubica");

        lblAbs2.setText("Valor Absoluto");

        lblResto.setBackground(new java.awt.Color(51, 51, 255));
        lblResto.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblResto.setText("0");

        lblCubo.setBackground(new java.awt.Color(51, 51, 255));
        lblCubo.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblCubo.setText("0");

        lblRaizQ.setBackground(new java.awt.Color(51, 51, 255));
        lblRaizQ.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblRaizQ.setText("0");

        lblRaizC.setBackground(new java.awt.Color(51, 51, 255));
        lblRaizC.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblRaizC.setText("0");

        lblAbs.setBackground(new java.awt.Color(51, 51, 255));
        lblAbs.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblAbs.setText("0");

        javax.swing.GroupLayout panCalcLayout = new javax.swing.GroupLayout(panCalc);
        panCalc.setLayout(panCalcLayout);
        panCalcLayout.setHorizontalGroup(
            panCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panCalcLayout.createSequentialGroup()
                .addGroup(panCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panCalcLayout.createSequentialGroup()
                        .addComponent(lblResto2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 136, Short.MAX_VALUE)
                        .addComponent(lblResto))
                    .addGroup(panCalcLayout.createSequentialGroup()
                        .addComponent(lblAbs2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblAbs))
                    .addGroup(panCalcLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblCubo))
                    .addGroup(panCalcLayout.createSequentialGroup()
                        .addComponent(lblRaizQ2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblRaizQ))
                    .addGroup(panCalcLayout.createSequentialGroup()
                        .addComponent(lblRaizC2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblRaizC)))
                .addContainerGap())
        );
        panCalcLayout.setVerticalGroup(
            panCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panCalcLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblResto2)
                    .addComponent(lblResto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lblCubo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRaizQ2)
                    .addComponent(lblRaizQ))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRaizC2)
                    .addComponent(lblRaizC))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAbs2)
                    .addComponent(lblAbs))
                .addContainerGap(98, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panCalc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(jLabel1)
                                .addGap(29, 29, 29)
                                .addComponent(txtNum, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnCacl, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(txtNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnCacl, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panCalc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(196, 196, 196))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCaclActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCaclActionPerformed
        // TODO add your handling code here:
        
        int num = Integer.parseInt(txtNum.getValue().toString());
        float  resto = num % 2;
        lblResto.setText(Float.toString(resto));
        //
        float cubo = (float) Math.pow(num, 3);
        lblCubo.setText(Float.toString(cubo));
        //
        float raizq = (float) Math.sqrt(num);
        lblRaizQ.setText(String.format("%.2f", raizq));
        //lblRaizQ.setText(Float.toString(raizq));
         //
        float raizc = (float) Math.cbrt(num);
       //  lblRaizC.setText(Float.toString(raizc));
       lblRaizC.setText(String.format("%.2f", raizc));
         //
        int abs = (int) Math.abs(num);
        lblAbs.setText(Integer.toString(abs));
        //
                    panCalc.setVisible(true);
    
        
    }//GEN-LAST:event_btnCaclActionPerformed

    
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
            java.util.logging.Logger.getLogger(telaCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.tvtNumtLogger(telaCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new telaCalc().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCacl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JLabel lblAbs;
    private javax.swing.JLabel lblAbs2;
    private javax.swing.JLabel lblCubo;
    private javax.swing.JLabel lblRaizC;
    private javax.swing.JLabel lblRaizC2;
    private javax.swing.JLabel lblRaizQ;
    private javax.swing.JLabel lblRaizQ2;
    private javax.swing.JLabel lblResto;
    private javax.swing.JLabel lblResto2;
    private javax.swing.JPanel panCalc;
    private javax.swing.JSpinner txtNum;
    // End of variables declaration//GEN-END:variables
}

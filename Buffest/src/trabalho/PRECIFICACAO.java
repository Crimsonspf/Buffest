/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package trabalho;

/**
 *
 * @author souza
 */
public class PRECIFICACAO extends javax.swing.JFrame {

    /**
     * Creates new form LOGIN
     */
    public PRECIFICACAO() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.JPanel PainelRosa = new javax.swing.JPanel();
        jLabelSENHA = new javax.swing.JLabel();
        CAMPOKG = new javax.swing.JTextField();
        jLabelTEXTOKG = new javax.swing.JLabel();
        jButtonENTRAR = new javax.swing.JButton();
        jLabelTEXTORECHEIO = new javax.swing.JLabel();
        jComboMASSA = new javax.swing.JComboBox<>();
        jLabelTEXTOMASSA = new javax.swing.JLabel();
        jComboRECHEIO = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboCALDA = new javax.swing.JComboBox<>();
        jLabelTEXTOCALDA = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabelFUNDO = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PainelRosa.setBackground(new java.awt.Color(243, 215, 231));
        PainelRosa.setMaximumSize(new java.awt.Dimension(500, 80));

        jLabelSENHA.setFont(new java.awt.Font("SimSun", 0, 20)); // NOI18N
        jLabelSENHA.setText("Que cobertura será usada?");

        jLabelTEXTOKG.setFont(new java.awt.Font("SimSun", 0, 20)); // NOI18N
        jLabelTEXTOKG.setText("Quantos quilos de bolo serão usados? (kg)");

        jButtonENTRAR.setBackground(new java.awt.Color(238, 137, 213));
        jButtonENTRAR.setText("Voltar");
        jButtonENTRAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonENTRARActionPerformed(evt);
            }
        });

        jLabelTEXTORECHEIO.setFont(new java.awt.Font("SimSun", 0, 20)); // NOI18N
        jLabelTEXTORECHEIO.setText("Que recheio será usado?");

        jComboMASSA.setForeground(new java.awt.Color(0, 0, 0));
        jComboMASSA.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabelTEXTOMASSA.setFont(new java.awt.Font("SimSun", 0, 20)); // NOI18N
        jLabelTEXTOMASSA.setText("Que massa será usada?");

        jComboRECHEIO.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboCALDA.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabelTEXTOCALDA.setFont(new java.awt.Font("SimSun", 0, 20)); // NOI18N
        jLabelTEXTOCALDA.setText("Que calda será usada?");

        jButton1.setBackground(new java.awt.Color(255, 153, 204));
        jButton1.setText("Calcular");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 164, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout PainelRosaLayout = new javax.swing.GroupLayout(PainelRosa);
        PainelRosa.setLayout(PainelRosaLayout);
        PainelRosaLayout.setHorizontalGroup(
            PainelRosaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelRosaLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(PainelRosaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelRosaLayout.createSequentialGroup()
                        .addComponent(jLabelTEXTOCALDA)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(PainelRosaLayout.createSequentialGroup()
                        .addGroup(PainelRosaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jComboBox3, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboCALDA, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PainelRosaLayout.createSequentialGroup()
                                .addGroup(PainelRosaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelTEXTOMASSA, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PainelRosaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabelTEXTOKG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(CAMPOKG)
                                        .addComponent(jComboMASSA, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabelTEXTORECHEIO, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jComboRECHEIO, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jLabelSENHA, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(34, 34, 34))
                    .addGroup(PainelRosaLayout.createSequentialGroup()
                        .addGroup(PainelRosaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PainelRosaLayout.createSequentialGroup()
                                .addGap(170, 170, 170)
                                .addComponent(jButtonENTRAR, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton1))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        PainelRosaLayout.setVerticalGroup(
            PainelRosaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelRosaLayout.createSequentialGroup()
                .addContainerGap(259, Short.MAX_VALUE)
                .addComponent(jLabelTEXTOKG, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CAMPOKG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelTEXTOMASSA, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboMASSA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelTEXTORECHEIO, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jComboRECHEIO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelTEXTOCALDA, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboCALDA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jLabelSENHA, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(jButtonENTRAR, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(195, Short.MAX_VALUE))
        );

        getContentPane().add(PainelRosa, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, 480, 980));

        jLabelFUNDO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGEM/Fundo Flores.jpg"))); // NOI18N
        getContentPane().add(jLabelFUNDO, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonENTRARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonENTRARActionPerformed
        MENU1 PrimeiroMenu = new MENU1();
        PrimeiroMenu.setVisible(true);
    }//GEN-LAST:event_jButtonENTRARActionPerformed

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
            java.util.logging.Logger.getLogger(PRECIFICACAO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PRECIFICACAO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PRECIFICACAO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PRECIFICACAO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PRECIFICACAO().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CAMPOKG;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonENTRAR;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboCALDA;
    private javax.swing.JComboBox<String> jComboMASSA;
    private javax.swing.JComboBox<String> jComboRECHEIO;
    private javax.swing.JLabel jLabelFUNDO;
    private javax.swing.JLabel jLabelSENHA;
    private javax.swing.JLabel jLabelTEXTOCALDA;
    private javax.swing.JLabel jLabelTEXTOKG;
    private javax.swing.JLabel jLabelTEXTOMASSA;
    private javax.swing.JLabel jLabelTEXTORECHEIO;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

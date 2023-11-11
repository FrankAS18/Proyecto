/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicolombo.pb2023.VentanasParaApuestasDP;

import co.edu.unicolombo.pb2023.Ventanas.VentanaSegunda;

/**
 *
 * @author ASUS
 */
public class VentanaPrincipalParaApuestas_DP extends javax.swing.JDialog {

    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipalParaApuestas_DP(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        jPanel1 = new javax.swing.JPanel();
        botonFutbol = new javax.swing.JButton();
        botonBaloncesto = new javax.swing.JButton();
        botonVoleibol = new javax.swing.JButton();
        botonTenis = new javax.swing.JButton();
        botonAtletismo = new javax.swing.JButton();
        botonCiclismo = new javax.swing.JButton();
        botonBoxeo = new javax.swing.JButton();
        botonConsultarSaldo = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        botonAtras = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonFutbol.setBackground(new java.awt.Color(255, 0, 0));
        botonFutbol.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botonFutbol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/playsoccersports_juegos_futbo_1762.png"))); // NOI18N
        botonFutbol.setText("FUTBOL");
        botonFutbol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonFutbolActionPerformed(evt);
            }
        });
        jPanel1.add(botonFutbol, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, -1, -1));

        botonBaloncesto.setBackground(new java.awt.Color(255, 0, 0));
        botonBaloncesto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botonBaloncesto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baloncesto.png"))); // NOI18N
        botonBaloncesto.setText("BALONCESTO");
        jPanel1.add(botonBaloncesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 150, -1, -1));

        botonVoleibol.setBackground(new java.awt.Color(255, 0, 0));
        botonVoleibol.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botonVoleibol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/jugador-de-voleibol.png"))); // NOI18N
        botonVoleibol.setText("VOLEIBOL");
        jPanel1.add(botonVoleibol, new org.netbeans.lib.awtextra.AbsoluteConstraints(343, 150, 160, -1));

        botonTenis.setBackground(new java.awt.Color(255, 0, 0));
        botonTenis.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botonTenis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tenis.png"))); // NOI18N
        botonTenis.setText("TENIS");
        jPanel1.add(botonTenis, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 130, -1));

        botonAtletismo.setBackground(new java.awt.Color(255, 0, 0));
        botonAtletismo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botonAtletismo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/corredor.png"))); // NOI18N
        botonAtletismo.setText("ATLETISMO");
        jPanel1.add(botonAtletismo, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 250, 170, -1));

        botonCiclismo.setBackground(new java.awt.Color(255, 0, 0));
        botonCiclismo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botonCiclismo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ciclismo.png"))); // NOI18N
        botonCiclismo.setText("CICLISMO");
        jPanel1.add(botonCiclismo, new org.netbeans.lib.awtextra.AbsoluteConstraints(573, 250, 160, -1));

        botonBoxeo.setBackground(new java.awt.Color(255, 0, 0));
        botonBoxeo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        botonBoxeo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/guantes-de-boxeo.png"))); // NOI18N
        botonBoxeo.setText("BOXEO");
        botonBoxeo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBoxeoActionPerformed(evt);
            }
        });
        jPanel1.add(botonBoxeo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, 290, -1));

        botonConsultarSaldo.setBackground(new java.awt.Color(255, 0, 0));
        botonConsultarSaldo.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        botonConsultarSaldo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/saldo-de-gastos.png"))); // NOI18N
        botonConsultarSaldo.setText("SALDO");
        botonConsultarSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonConsultarSaldoActionPerformed(evt);
            }
        });
        jPanel1.add(botonConsultarSaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 380, -1, -1));

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(255, 0, 0));
        jTextField1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("Escoje el deporte de tu preferencia para realizar tus apuestas:");
        jTextField1.setBorder(null);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 620, -1));

        botonAtras.setBackground(new java.awt.Color(255, 0, 0));
        botonAtras.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        botonAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/back_arrow_14429.png"))); // NOI18N
        botonAtras.setText("ATRAS");
        botonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAtrasActionPerformed(evt);
            }
        });
        jPanel1.add(botonAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 380, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Deporte-cambios-tecnológicos-660x394.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 660, 360));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("GESTION DE DEPORTES");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void botonBoxeoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBoxeoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonBoxeoActionPerformed

    private void botonConsultarSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonConsultarSaldoActionPerformed
        // TODO add your handling code here:
        this.dispose();
        VentanaConsultarSaldo saldo = new VentanaConsultarSaldo(null, rootPaneCheckingEnabled);
        saldo.setLocationRelativeTo(null);
        saldo.setVisible(true);
    }//GEN-LAST:event_botonConsultarSaldoActionPerformed

    private void botonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAtrasActionPerformed
        // TODO add your handling code here:
        this.dispose();
        VentanaSegunda ventana2 = new VentanaSegunda();
        ventana2.setLocationRelativeTo(null);
        ventana2.setExtendedState(VentanaSegunda.MAXIMIZED_BOTH);
        ventana2.setVisible(true);
    }//GEN-LAST:event_botonAtrasActionPerformed

    private void botonFutbolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonFutbolActionPerformed
        // TODO add your handling code here:
        this.dispose();
        VentanaParaFutbols futbol = new VentanaParaFutbols(null, rootPaneCheckingEnabled);
        futbol.setLocationRelativeTo(null);
        futbol.setVisible(true);
    }//GEN-LAST:event_botonFutbolActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPrincipalParaApuestas_DP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipalParaApuestas_DP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipalParaApuestas_DP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipalParaApuestas_DP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VentanaPrincipalParaApuestas_DP dialog = new VentanaPrincipalParaApuestas_DP(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAtletismo;
    private javax.swing.JButton botonAtras;
    private javax.swing.JButton botonBaloncesto;
    private javax.swing.JButton botonBoxeo;
    private javax.swing.JButton botonCiclismo;
    private javax.swing.JButton botonConsultarSaldo;
    private javax.swing.JButton botonFutbol;
    private javax.swing.JButton botonTenis;
    private javax.swing.JButton botonVoleibol;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
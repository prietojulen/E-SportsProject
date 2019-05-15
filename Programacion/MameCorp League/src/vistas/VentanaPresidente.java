/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author PETO
 */
public class VentanaPresidente extends javax.swing.JFrame {

    /**
     * Creates new form VentanaPresidente
     */
    public VentanaPresidente() {
        initComponents();
        setLocationRelativeTo(null);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        panelOpaco.setBackground(new Color(180,102,24,190));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelOpaco = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        lFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        panelOpaco.setLayout(null);

        jLabel1.setText("PRESIDENTE");
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        panelOpaco.add(jLabel1);
        jLabel1.setBounds(30, 40, 510, 160);

        jLabel3.setText("NOMBRE");
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        panelOpaco.add(jLabel3);
        jLabel3.setBounds(40, 200, 100, 17);
        panelOpaco.add(jTextField3);
        jTextField3.setBounds(130, 200, 200, 20);

        jLabel4.setText("APELLIDO");
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        panelOpaco.add(jLabel4);
        jLabel4.setBounds(40, 270, 130, 17);
        panelOpaco.add(jTextField4);
        jTextField4.setBounds(130, 270, 200, 20);

        getContentPane().add(panelOpaco);
        panelOpaco.setBounds(0, 0, 400, 1080);

        lFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vistas/Imgs/ImgPresidente/PresidenteFondo.png"))); // NOI18N
        getContentPane().add(lFondo);
        lFondo.setBounds(-90, -100, 2560, 1440);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(VentanaPresidente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPresidente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPresidente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPresidente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPresidente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JLabel lFondo;
    private javax.swing.JPanel panelOpaco;
    // End of variables declaration//GEN-END:variables
}

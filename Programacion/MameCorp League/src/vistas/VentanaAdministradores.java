package vistas;

import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import main.MainEsports;

/**
 *
 * @author N3Essential
 */
public class VentanaAdministradores extends javax.swing.JFrame {

    /**
     * Creates new form VentanaAdministradores
     */
    public VentanaAdministradores() {
        setUndecorated(true);
        initComponents();
        setAlwaysOnTop(rootPaneCheckingEnabled);
        setExtendedState(MAXIMIZED_BOTH);
        panelOpaco.setBackground(new Color(4,20,57,190));
        setVisible(true);
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
        tfNombre = new javax.swing.JTextField();
        tfPassword = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        bAceptar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuVolver = new javax.swing.JMenu();
        jMenuSalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelOpaco.setLayout(null);

        tfNombre.setBorder(null);
        panelOpaco.add(tfNombre);
        tfNombre.setBounds(151, 313, 178, 26);

        tfPassword.setBorder(null);
        panelOpaco.add(tfPassword);
        tfPassword.setBounds(151, 445, 178, 25);

        jLabel2.setText("NOMBRE");
        panelOpaco.add(jLabel2);
        jLabel2.setBounds(57, 319, 42, 14);

        jLabel3.setText("PASSWORD");
        panelOpaco.add(jLabel3);
        jLabel3.setBounds(57, 450, 57, 14);

        jLabel4.setText("ADMINISTRADOR");
        jLabel4.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        panelOpaco.add(jLabel4);
        jLabel4.setBounds(108, 102, 206, 75);

        bAceptar.setBackground(new java.awt.Color(83, 175, 226));
        bAceptar.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        bAceptar.setForeground(new java.awt.Color(255, 255, 255));
        bAceptar.setText("ACEPTAR");
        bAceptar.setBorder(null);
        bAceptar.setContentAreaFilled(false);
        bAceptar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bAceptar.setFocusPainted(false);
        bAceptar.setOpaque(true);
        bAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAceptarActionPerformed(evt);
            }
        });
        panelOpaco.add(bAceptar);
        bAceptar.setBounds(199, 986, 179, 55);

        getContentPane().add(panelOpaco, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 1110));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vistas/Imgs/ImgVentanaAdministradores/admin.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 2030, 1080));

        jMenuVolver.setText("Volver");
        jMenuBar1.add(jMenuVolver);

        jMenuSalir.setText("Salir");
        jMenuSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuSalirMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuSalir);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuSalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jMenuSalirMouseClicked

    private void bAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAceptarActionPerformed
        try {
            int insercion = MainEsports.insertarAdministrador(tfNombre.getText(),String.valueOf(tfPassword.getPassword()));
            
            
            if(insercion > 0){
                JOptionPane.showMessageDialog(this,"Linea insertada correctamente");
                tfNombre.setText("");
                tfPassword.setText(""); 
            }else{
                JOptionPane.showMessageDialog(this,"ERROR AL INSERTAR");
            }
            
            
        } catch (Exception ex) {
            System.out.println("Excepcion " + ex.getMessage());
        }
    }//GEN-LAST:event_bAceptarActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaAdministradores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaAdministradores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaAdministradores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaAdministradores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaAdministradores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAceptar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuSalir;
    private javax.swing.JMenu jMenuVolver;
    private javax.swing.JPanel panelOpaco;
    private javax.swing.JTextField tfNombre;
    private javax.swing.JPasswordField tfPassword;
    // End of variables declaration//GEN-END:variables
}

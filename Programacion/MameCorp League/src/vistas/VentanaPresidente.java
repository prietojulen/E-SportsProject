/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import main.MainEsports;
import modelo.Equipo;

/**
 *
 * @author PETO
 */
public class VentanaPresidente extends javax.swing.JFrame {
     private Equipo e;
       private ArrayList<Equipo> listaEquipos;
    
 public VentanaPresidente(String operacionActiva) throws Exception {
        initComponents();
        setLocationRelativeTo(null);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        panelOpaco.setBackground(new Color(180,102,24,190));
        llenarComboBox();
        
    }

      public VentanaPresidente() {
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

        panelOpaco = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfNombrePresidente = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfApellidoPresidente = new javax.swing.JTextField();
        bAceptar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        cbEquipoPresidente = new javax.swing.JComboBox<>();
        bVolver = new javax.swing.JButton();
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
        panelOpaco.add(tfNombrePresidente);
        tfNombrePresidente.setBounds(130, 200, 200, 20);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("APELLIDO");
        panelOpaco.add(jLabel4);
        jLabel4.setBounds(40, 270, 130, 17);
        panelOpaco.add(tfApellidoPresidente);
        tfApellidoPresidente.setBounds(130, 270, 200, 20);

        bAceptar.setText("Aceptar");
        bAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAceptarActionPerformed(evt);
            }
        });
        panelOpaco.add(bAceptar);
        bAceptar.setBounds(200, 390, 73, 23);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("EQUIPO");
        panelOpaco.add(jLabel2);
        jLabel2.setBounds(40, 330, 70, 20);

        cbEquipoPresidente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbEquipoPresidenteActionPerformed(evt);
            }
        });
        panelOpaco.add(cbEquipoPresidente);
        cbEquipoPresidente.setBounds(130, 330, 200, 20);

        bVolver.setText("Volver");
        bVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVolverActionPerformed(evt);
            }
        });
        panelOpaco.add(bVolver);
        bVolver.setBounds(150, 810, 110, 40);

        getContentPane().add(panelOpaco);
        panelOpaco.setBounds(0, 0, 400, 1080);

        lFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vistas/Imgs/ImgPresidente/PresidenteFondo.png"))); // NOI18N
        getContentPane().add(lFondo);
        lFondo.setBounds(-90, -100, 2560, 1440);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAceptarActionPerformed
       String posicion = cbEquipoPresidente.getSelectedItem().toString();
       // Equipo e = new Equipo();
       // e.setIdEquipo(cbEquipoPresidente.getSelectedIndex());
       
        try {
     
     int insercion =  MainEsports.insertarPresidente(tfNombrePresidente.getText(),tfApellidoPresidente.getText(),posicion);
            System.out.println("se ha insertado? " + insercion);
      if(insercion > 0){
                JOptionPane.showMessageDialog(this,"Linea insertada correctamente");
                tfNombrePresidente.setText("");
                tfApellidoPresidente.setText("");
            }else{
                JOptionPane.showMessageDialog(this,"ERROR AL INSERTAR");
            }
       }
       catch (Exception ex){
           System.out.println(ex.getClass() + ex.getMessage());
       }
      
    }//GEN-LAST:event_bAceptarActionPerformed

    private void cbEquipoPresidenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbEquipoPresidenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbEquipoPresidenteActionPerformed

    private void bVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVolverActionPerformed
        // TODO add your handling code here:
        this.dispose();
        ControladorVista.mostrarVentanaCategoria();
    }//GEN-LAST:event_bVolverActionPerformed
 public  void llenarComboBox() throws Exception{
        listaEquipos = new ArrayList();
        
       listaEquipos = MainEsports.consultarEquipoSinPresidente();
        for (int x = 0; x < listaEquipos.size(); x++) {
            
            cbEquipoPresidente.addItem(listaEquipos.get(x).getNombre());
        }
        
    }
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

       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAceptar;
    private javax.swing.JButton bVolver;
    private javax.swing.JComboBox<String> cbEquipoPresidente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lFondo;
    private javax.swing.JPanel panelOpaco;
    private javax.swing.JTextField tfApellidoPresidente;
    private javax.swing.JTextField tfNombrePresidente;
    // End of variables declaration//GEN-END:variables
}

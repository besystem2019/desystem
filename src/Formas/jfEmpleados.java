/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formas;

import Animacion.Fade;
import funciones_varias.Img_fondo_label;
import java.awt.Color;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author wwwki
 */
public class jfEmpleados extends javax.swing.JFrame {

    /**
     * Creates new form jfMenu
     */
    public jfEmpleados() {
        initComponents();
                                
        this.setLocationRelativeTo(null);
        
        //FONDO CON IMAGEN--------------------------------------------------------------------------------
        Img_fondo_label fondoLabel = new Img_fondo_label();
        fondoLabel.Llenar_Label("ventana de clientes-usuarios-empleados.jpg", lblFondo);
        fondoLabel.Llenar_Label("daika adm.png", lblNombreCliente);
        
        fondoLabel.Llenar_Label("ingresar.png", lblIngresar);
        fondoLabel.Llenar_Label("modificar.png", lblModificar);
        fondoLabel.Llenar_Label("eliminar.png", lblEliminar);
        
        fondoLabel.Llenar_Label("actualizar.png", lblActualizar);
        fondoLabel.Llenar_Label("empleados.png", lbl_imgCliente);
                                                                                                     
//        jtxtImei.setBackground(new Color(0,0,0,64));
//        jtxtCompra.setBackground(new Color(0,0,0,64));
//        jtxtCosto.setBackground(new Color(0,0,0,64));
//        
//        jtxtTasa.setBackground(new Color(0,0,0,64));
//        jtxtGanancia.setBackground(new Color(0,0,0,64));
//        
//        //jsepImei.setBackground(Color.red);
//        sep1.setForeground(Color.green); // top line color
//        sep1.setBackground(Color.green.brighter()); // bottom line color
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblSalir = new javax.swing.JLabel();
        lblNombreCliente = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jtxtEdad = new javax.swing.JTextField();
        jtxtCedula = new javax.swing.JTextField();
        jtxtDirec = new javax.swing.JTextField();
        jtxtEmail = new javax.swing.JTextField();
        jtxtTelefono = new javax.swing.JTextField();
        jtxtFechaNac = new javax.swing.JTextField();
        jtxtNombre = new javax.swing.JTextField();
        jtxtApellido = new javax.swing.JTextField();
        lblIngresar = new javax.swing.JLabel();
        lblModificar = new javax.swing.JLabel();
        lblEliminar = new javax.swing.JLabel();
        lblActualizar = new javax.swing.JLabel();
        lbl_imgCliente = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblSalir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn on_32.png"))); // NOI18N
        lblSalir.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lblSalirMouseMoved(evt);
            }
        });
        lblSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSalirMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblSalirMouseExited(evt);
            }
        });
        getContentPane().add(lblSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 5, 40, 40));

        lblNombreCliente.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lblNombreCliente.setForeground(java.awt.Color.white);
        lblNombreCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblNombreCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, 250, 40));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 170, 510, 230));

        jtxtEdad.setBackground(new java.awt.Color(204, 0, 0));
        jtxtEdad.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jtxtEdad.setForeground(new java.awt.Color(255, 255, 255));
        jtxtEdad.setText("Edad");
        jtxtEdad.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jtxtEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, 180, 20));

        jtxtCedula.setBackground(new java.awt.Color(204, 0, 0));
        jtxtCedula.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jtxtCedula.setForeground(new java.awt.Color(255, 255, 255));
        jtxtCedula.setText("Cedula");
        jtxtCedula.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jtxtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, 180, 20));

        jtxtDirec.setBackground(new java.awt.Color(204, 0, 0));
        jtxtDirec.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jtxtDirec.setForeground(new java.awt.Color(255, 255, 255));
        jtxtDirec.setText("Direccion");
        jtxtDirec.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jtxtDirec, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 380, 180, 20));

        jtxtEmail.setBackground(new java.awt.Color(204, 0, 0));
        jtxtEmail.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jtxtEmail.setForeground(new java.awt.Color(255, 255, 255));
        jtxtEmail.setText("Email");
        jtxtEmail.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jtxtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 350, 180, 20));

        jtxtTelefono.setBackground(new java.awt.Color(204, 0, 0));
        jtxtTelefono.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jtxtTelefono.setForeground(new java.awt.Color(255, 255, 255));
        jtxtTelefono.setText("Telefono");
        jtxtTelefono.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jtxtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 320, 180, 20));

        jtxtFechaNac.setBackground(new java.awt.Color(204, 0, 0));
        jtxtFechaNac.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jtxtFechaNac.setForeground(new java.awt.Color(255, 255, 255));
        jtxtFechaNac.setText("Fecha Nacimiento");
        jtxtFechaNac.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jtxtFechaNac, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 290, 180, 20));

        jtxtNombre.setBackground(new java.awt.Color(204, 0, 0));
        jtxtNombre.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jtxtNombre.setForeground(new java.awt.Color(255, 255, 255));
        jtxtNombre.setText("Nombres");
        jtxtNombre.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jtxtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, 180, 20));

        jtxtApellido.setBackground(new java.awt.Color(204, 0, 0));
        jtxtApellido.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jtxtApellido.setForeground(new java.awt.Color(255, 255, 255));
        jtxtApellido.setText("Apellidos");
        jtxtApellido.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jtxtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, 180, 20));

        lblIngresar.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lblIngresar.setForeground(java.awt.Color.white);
        lblIngresar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 420, 120, 20));

        lblModificar.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lblModificar.setForeground(java.awt.Color.white);
        lblModificar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 420, 120, 20));

        lblEliminar.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lblEliminar.setForeground(java.awt.Color.white);
        lblEliminar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 420, 120, 20));

        lblActualizar.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lblActualizar.setForeground(java.awt.Color.white);
        lblActualizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 70, 140, 20));
        getContentPane().add(lbl_imgCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 130, 100));

        jLabel1.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("DIreccion:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 380, 110, -1));

        jLabel2.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Empleados");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 140, -1));

        jLabel3.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Nombres:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 110, -1));

        jLabel4.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Apellidos:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 110, -1));

        jLabel5.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Edad:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 110, -1));

        jLabel6.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Cedula:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 110, -1));

        jLabel7.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Fecha Nac:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, 110, -1));

        jLabel8.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Telefono:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, 110, -1));

        jLabel9.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Email:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, 110, -1));
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblSalirMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalirMouseMoved
        lblSalir.setBorder(javax.swing.BorderFactory.createLineBorder(Color.RED));
    }//GEN-LAST:event_lblSalirMouseMoved

    private void lblSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalirMouseClicked
        int dialog = JOptionPane.YES_NO_OPTION;
        int result = JOptionPane.showConfirmDialog(null, "¿Desea salir?","Salir",dialog);
        if(result == 0){
            Fade.JFrameFadeOut(1f, 0f, 0.1f, 50, this,Fade.EXIT);
            
        }
    }//GEN-LAST:event_lblSalirMouseClicked

    private void lblSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalirMouseExited
        lblSalir.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(41,42,44)));
    }//GEN-LAST:event_lblSalirMouseExited

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
            java.util.logging.Logger.getLogger(jfEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jfEmpleados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jtxtApellido;
    private javax.swing.JTextField jtxtCedula;
    private javax.swing.JTextField jtxtDirec;
    private javax.swing.JTextField jtxtEdad;
    private javax.swing.JTextField jtxtEmail;
    private javax.swing.JTextField jtxtFechaNac;
    private javax.swing.JTextField jtxtNombre;
    private javax.swing.JTextField jtxtTelefono;
    private javax.swing.JLabel lblActualizar;
    private javax.swing.JLabel lblEliminar;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblIngresar;
    private javax.swing.JLabel lblModificar;
    private javax.swing.JLabel lblNombreCliente;
    private javax.swing.JLabel lblSalir;
    private javax.swing.JLabel lbl_imgCliente;
    // End of variables declaration//GEN-END:variables
}

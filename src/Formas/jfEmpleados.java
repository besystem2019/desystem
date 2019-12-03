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
        fondoLabel.Llenar_Label("clientes_empleados_usuarios.jpeg", lblFondo);
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
        getContentPane().add(lblNombreCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 60, 250, 50));

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
        getContentPane().add(jtxtEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, 210, 20));

        jtxtCedula.setBackground(new java.awt.Color(204, 0, 0));
        jtxtCedula.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jtxtCedula.setForeground(new java.awt.Color(255, 255, 255));
        jtxtCedula.setText("Cedula");
        jtxtCedula.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jtxtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 210, 20));

        jtxtDirec.setBackground(new java.awt.Color(204, 0, 0));
        jtxtDirec.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jtxtDirec.setForeground(new java.awt.Color(255, 255, 255));
        jtxtDirec.setText("Direccion");
        jtxtDirec.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jtxtDirec, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 380, 210, 20));

        jtxtEmail.setBackground(new java.awt.Color(204, 0, 0));
        jtxtEmail.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jtxtEmail.setForeground(new java.awt.Color(255, 255, 255));
        jtxtEmail.setText("Email");
        jtxtEmail.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jtxtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 350, 210, 20));

        jtxtTelefono.setBackground(new java.awt.Color(204, 0, 0));
        jtxtTelefono.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jtxtTelefono.setForeground(new java.awt.Color(255, 255, 255));
        jtxtTelefono.setText("Telefono");
        jtxtTelefono.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jtxtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 320, 210, 20));

        jtxtFechaNac.setBackground(new java.awt.Color(204, 0, 0));
        jtxtFechaNac.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jtxtFechaNac.setForeground(new java.awt.Color(255, 255, 255));
        jtxtFechaNac.setText("Fecha Nacimiento");
        jtxtFechaNac.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jtxtFechaNac, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, 210, 20));

        jtxtNombre.setBackground(new java.awt.Color(204, 0, 0));
        jtxtNombre.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jtxtNombre.setForeground(new java.awt.Color(255, 255, 255));
        jtxtNombre.setText("Nombres");
        jtxtNombre.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jtxtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, 210, 20));

        jtxtApellido.setBackground(new java.awt.Color(204, 0, 0));
        jtxtApellido.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jtxtApellido.setForeground(new java.awt.Color(255, 255, 255));
        jtxtApellido.setText("Apellidos");
        jtxtApellido.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jtxtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, 210, 20));

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
        getContentPane().add(lblActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 90, 140, 20));
        getContentPane().add(lbl_imgCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 253, 130, 80));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Empleados");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, 110, -1));
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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formas;

import Animacion.Fade;
import funciones_varias.Img_fondo_label;
import java.awt.Image;
import javax.swing.Icon;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author wwwki
 */
public class jfLogin extends javax.swing.JFrame {

    /**
     * Creates new form jfLogin
     */
    public jfLogin() {
        initComponents();
        this.setLocationRelativeTo(null);
//        rsscalelabel.RSScaleLabel.setScaleLabel(lblFondo, "\\src\\Imagenes\\CyCo128.png");
               
        
        //FONDO CON IMAGEN--------------------------------------------------------------------------------                               
        Img_fondo_label fondoLabel = new Img_fondo_label();
        fondoLabel.Llenar_Label("login.jpeg", lblFondo);        
        fondoLabel.Llenar_Label("login_letra.png", lblImg_login);     
        fondoLabel.Llenar_Label("ingresar_letra.png", lblIngresar);     
          
        
    }

    
    
    void Ingreso_login(){    
        //Aca existira un sub-funcio que realice la consulta a la base de datos para
        //validar las credenciales del usuario (preferiblemente una proceso almacenado)        
        Fade.JFrameFadeOut(1f, 0f, 0.1f, 50, this,Fade.DISPOSE);    
        jfMenu menu = new jfMenu();
        menu.setVisible(true);
                                   
    }
    
    void Valida_campos(){
        
        if(jtxtUsername.getText().equals("") || jtxtPass.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Favor completar los campos para continuar","DE_System",JOptionPane.INFORMATION_MESSAGE);            
        }else{
            Ingreso_login();
        }        
    }
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jtxtPass = new javax.swing.JTextField();
        jtxtUsername = new javax.swing.JTextField();
        lblIngresar = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblImg_login = new javax.swing.JLabel();
        lblSalir = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Username:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 160, 60));

        jtxtPass.setBackground(new java.awt.Color(204, 0, 0));
        jtxtPass.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jtxtPass.setForeground(new java.awt.Color(255, 255, 255));
        jtxtPass.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jtxtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 520, 50));

        jtxtUsername.setBackground(new java.awt.Color(204, 0, 0));
        jtxtUsername.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jtxtUsername.setForeground(new java.awt.Color(255, 255, 255));
        jtxtUsername.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jtxtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 520, 50));

        lblIngresar.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lblIngresar.setForeground(java.awt.Color.white);
        lblIngresar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIngresar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lblIngresarMouseMoved(evt);
            }
        });
        lblIngresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblIngresarMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblIngresarMouseExited(evt);
            }
        });
        getContentPane().add(lblIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 333, 240, 40));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Password:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 160, 40));

        lblImg_login.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lblImg_login.setForeground(java.awt.Color.white);
        lblImg_login.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblImg_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 20, 180, 40));

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
        getContentPane().add(lblSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 3, 40, 40));

        lblFondo.setForeground(java.awt.Color.white);
        lblFondo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 390));

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
            //System.exit(0);
        }
    }//GEN-LAST:event_lblSalirMouseClicked

    private void lblSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalirMouseExited
        lblSalir.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(41,42,44)));
    }//GEN-LAST:event_lblSalirMouseExited

    private void lblIngresarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIngresarMouseMoved
         lblIngresar.setBorder(javax.swing.BorderFactory.createLineBorder(Color.RED));
    }//GEN-LAST:event_lblIngresarMouseMoved

    private void lblIngresarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIngresarMouseExited
        lblIngresar.setBorder(null);
    }//GEN-LAST:event_lblIngresarMouseExited

    private void lblIngresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIngresarMouseClicked
        Valida_campos();
    }//GEN-LAST:event_lblIngresarMouseClicked

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
            java.util.logging.Logger.getLogger(jfLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jfLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jtxtPass;
    private javax.swing.JTextField jtxtUsername;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblImg_login;
    private javax.swing.JLabel lblIngresar;
    private javax.swing.JLabel lblSalir;
    // End of variables declaration//GEN-END:variables
}

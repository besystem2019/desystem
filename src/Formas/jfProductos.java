/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formas;

import Animacion.Fade;
import funciones_varias.Img_fondo_label;
import funciones_varias.conectar;
import funciones_varias.idex_combo;
import java.awt.Color;
import java.awt.Image;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author wwwki
 */
public class jfProductos extends javax.swing.JFrame {
    conectar cc = new conectar();
    /**
     * Creates new form jfMenu
     */
    public jfProductos() {
        initComponents();
        
        
        this.setLocationRelativeTo(null);
         //FONDO CON IMAGEN--------------------------------------------------------------------------------
        Img_fondo_label fondoLabel = new Img_fondo_label();
        fondoLabel.Llenar_Label("ventana_productos.jpg", lblFondo);
        //fondoLabel.Llenar_Label("daika adm.png", lblNombreCliente);
        
        
        jtxtImei.setBackground(new Color(0,0,0,64));
        jtxtCompra.setBackground(new Color(0,0,0,64));
        jtxtCosto.setBackground(new Color(0,0,0,64));
        
        jtxtTasa.setBackground(new Color(0,0,0,64));
        jtxtGanancia.setBackground(new Color(0,0,0,64));
        
        //jsepImei.setBackground(Color.red);
        sep1.setForeground(Color.green); // top line color
        sep1.setBackground(Color.green.brighter()); // bottom line color
        
        
        //Llenar jcombobox
        //Para llenar los combobox con datos de la bd utilizamos la clase creada llamada idex_combo la cual esta 
        //en la paqueteria de funciones_varias. En esa funcion pide 4 parametros los cuales son una variable tipo jCombobox
        // y 3 strings que piden el id de la tabla, el nombre de la tabla, y la descripcion que se mostrara en el combobox.
        //NOTA: hay que cambiar el tipo de datos que recibira el jcombobox, por default lleva el timpo <String> hay que
        //cambiarlo al tipo objeto <idex_combo> y para hacerlo hay que irse a propuedades del jCombobox -> Codigo -> parametro de tipo -> cambiar manualmente por <idex_combo>.
        //Tambien hay que dejar en blanco el jCombobox, sino marcara un error, ya que este espera recibir una varibale tipo objeto
        // y se les escribimos algo manualmente es un String, entonces es un errror de tipo de variables.
        idex_combo combo = new idex_combo();
        combo.llenarCombo(jcomboProveedor, "id_estado", "testado", "txt_desc");
        
        
        
        
        CargarTabla();
    }

    //funcon para precargar la tabla cuando se inicia la pantalla
    void CargarTabla(){
    
    //instanciamos el objeto de la tabla para luego asignarle las columnas
    DefaultTableModel tProductos = new DefaultTableModel();
    tProductos.addColumn("id_prod");
    tProductos.addColumn("iEstado");
    tProductos.addColumn("PRODUCTO");
    tProductos.addColumn("MARCA");
    tProductos.addColumn("COSTO");
    jtProductos.setModel(tProductos);
    
    
    // Esta parte sirve para asitnarl eun tamaño en especifico a cada columna, en este caso las primeras dos
    // el tamaño esta en 0 ya que no es necesario que se miren estas columnas, pero que si esxistan para poder 
    // manejar esos datos mas adelante.
     //id_prod
     jtProductos.getColumnModel().getColumn(0).setMaxWidth(0);
     jtProductos.getColumnModel().getColumn(0).setMinWidth(0);
     jtProductos.getTableHeader().getColumnModel().getColumn(0).setMaxWidth(0);
     jtProductos.getTableHeader().getColumnModel().getColumn(0).setMinWidth(0);
        
     //iEstado
     jtProductos.getColumnModel().getColumn(1).setMaxWidth(0);
     jtProductos.getColumnModel().getColumn(1).setMinWidth(0);
     jtProductos.getTableHeader().getColumnModel().getColumn(1).setMaxWidth(0);
     jtProductos.getTableHeader().getColumnModel().getColumn(1).setMinWidth(0);
            
     //Producto
     jtProductos.getColumnModel().getColumn(2).setMaxWidth(250);
     jtProductos.getColumnModel().getColumn(2).setMinWidth(250);
     jtProductos.getTableHeader().getColumnModel().getColumn(2).setMaxWidth(250);
     jtProductos.getTableHeader().getColumnModel().getColumn(2).setMinWidth(250);
     
     //Marca
     jtProductos.getColumnModel().getColumn(3).setMaxWidth(250);
     jtProductos.getColumnModel().getColumn(3).setMinWidth(250);
     jtProductos.getTableHeader().getColumnModel().getColumn(3).setMaxWidth(250);
     jtProductos.getTableHeader().getColumnModel().getColumn(3).setMinWidth(250);
            
     //costo
     jtProductos.getColumnModel().getColumn(4).setMaxWidth(150);
     jtProductos.getColumnModel().getColumn(4).setMinWidth(150);
     jtProductos.getTableHeader().getColumnModel().getColumn(4).setMaxWidth(150);
     jtProductos.getTableHeader().getColumnModel().getColumn(4).setMinWidth(150);
     
    //En esta seccion es donde realizamos la consulta y el proceso para llenar la tabla con los datos de la bd. 
     String ssql;
        try {            
            Connection cn = cc.conexion();
            //se espeficica como es la consulta a la BD
            // tomar en cuenta tambien el uso de los where para la consulta, por ejemplo si se aplica un filtro para 
            //realizar dicha consulta, todo ira especificado en la consulta con la cariable llamada ssql.
            
            ssql = "";
            ssql = ssql + "";
            ssql = ssql + "";
            ssql = ssql + "";
            ssql = ssql + "";
            String datos[] = new String[5]; // ese numero indica la cantidad de datos ue se extraera segun la consulta registrada
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(ssql);
            while (rs.next()){
                //para poder llenar los datos en las columnas de la tabla primero se coloca en cada posicion del arreglo
                //todos los datos recuperados segun los campos que se espeficico en la consulta sql. Estos datos en en forma de
                //arreglo sirve para poder ser agregado como una fila con sus columnas.
                datos[0] = rs.getNString(1);
                datos[1] = rs.getNString(2);
                datos[2] = rs.getNString(3);
                datos[3] = rs.getNString(4);
                datos[4] = rs.getNString(5);                        
                tProductos.addRow(datos); //aca es donde se agrega la fila a la tabla 
            }
                jtProductos.setModel(tProductos); //aca se setea el modelo de la tabla con todos los datos
                rs.close();
                st.close();
                cn.close();                                                            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al buscar cliente: " +e, "CyCo", JOptionPane.INFORMATION_MESSAGE);
        }                                                              
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
        lblHora = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        lblFecha1 = new javax.swing.JLabel();
        lblHora1 = new javax.swing.JLabel();
        jcomboProveedor = new javax.swing.JComboBox<>();
        jcomboCategoria = new javax.swing.JComboBox<>();
        jcomboMarca = new javax.swing.JComboBox<>();
        jcomboModelo = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtProductos = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex) {
                return false; //Disallow the editing of any cell
            }
        };
        jtxtCompra = new javax.swing.JTextField();
        jtxtCosto = new javax.swing.JTextField();
        jtxtImei = new javax.swing.JTextField();
        jbtnUpdate = new javax.swing.JButton();
        sep1 = new javax.swing.JSeparator();
        sep2 = new javax.swing.JSeparator();
        sep3 = new javax.swing.JSeparator();
        jbtnGuardar = new javax.swing.JButton();
        jtxtTasa = new javax.swing.JTextField();
        sep4 = new javax.swing.JSeparator();
        jtxtGanancia = new javax.swing.JTextField();
        sep5 = new javax.swing.JSeparator();
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
        lblNombreCliente.setText("Productos");
        getContentPane().add(lblNombreCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1020, -1));

        lblHora.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblHora.setForeground(java.awt.Color.white);
        lblHora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHora.setText("Eliminar");
        getContentPane().add(lblHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 470, 110, 30));

        lblFecha.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblFecha.setForeground(java.awt.Color.white);
        lblFecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFecha.setText("Nuevo");
        getContentPane().add(lblFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 120, 20));

        lblFecha1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblFecha1.setForeground(java.awt.Color.white);
        lblFecha1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFecha1.setText("Modificar");
        getContentPane().add(lblFecha1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 480, 120, 20));

        lblHora1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblHora1.setForeground(java.awt.Color.white);
        lblHora1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHora1.setText("Buscar");
        getContentPane().add(lblHora1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 30, 110, 30));

        jcomboProveedor.setBackground(new java.awt.Color(255, 0, 0));
        jcomboProveedor.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jcomboProveedor.setForeground(new java.awt.Color(255, 255, 255));
        jcomboProveedor.setBorder(null);
        getContentPane().add(jcomboProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 270, 20));

        jcomboCategoria.setBackground(new java.awt.Color(255, 0, 0));
        jcomboCategoria.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jcomboCategoria.setForeground(new java.awt.Color(255, 255, 255));
        jcomboCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CATEGORIA", "Item 2", "Item 3", "Item 4" }));
        jcomboCategoria.setBorder(null);
        jcomboCategoria.setOpaque(false);
        getContentPane().add(jcomboCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 162, 270, 20));

        jcomboMarca.setBackground(new java.awt.Color(255, 0, 0));
        jcomboMarca.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jcomboMarca.setForeground(new java.awt.Color(255, 255, 255));
        jcomboMarca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MARCA", "Item 2", "Item 3", "Item 4" }));
        jcomboMarca.setBorder(null);
        jcomboMarca.setOpaque(false);
        getContentPane().add(jcomboMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 184, 270, 20));

        jcomboModelo.setBackground(new java.awt.Color(255, 0, 0));
        jcomboModelo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jcomboModelo.setForeground(new java.awt.Color(255, 255, 255));
        jcomboModelo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MODELO", "Item 2", "Item 3", "Item 4" }));
        jcomboModelo.setBorder(null);
        jcomboModelo.setOpaque(false);
        getContentPane().add(jcomboModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 207, 270, 20));

        jtProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jtProductos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 131, 680, 260));

        jtxtCompra.setBackground(new java.awt.Color(0, 0, 0));
        jtxtCompra.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jtxtCompra.setForeground(new java.awt.Color(255, 255, 255));
        jtxtCompra.setText("R. COMPRA *");
        jtxtCompra.setBorder(null);
        getContentPane().add(jtxtCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 260, 265, -1));

        jtxtCosto.setBackground(new java.awt.Color(0, 0, 0));
        jtxtCosto.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jtxtCosto.setForeground(new java.awt.Color(255, 255, 255));
        jtxtCosto.setText("COSTO *");
        jtxtCosto.setBorder(null);
        getContentPane().add(jtxtCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 290, 265, -1));

        jtxtImei.setBackground(new java.awt.Color(0, 0, 0));
        jtxtImei.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jtxtImei.setForeground(new java.awt.Color(255, 255, 255));
        jtxtImei.setText("COD. IMEI *");
        jtxtImei.setBorder(null);
        jtxtImei.setOpaque(false);
        getContentPane().add(jtxtImei, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 230, 265, -1));

        jbtnUpdate.setBackground(new java.awt.Color(204, 0, 0));
        jbtnUpdate.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jbtnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        jbtnUpdate.setText("Actualizar");
        jbtnUpdate.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtnUpdate.setBorderPainted(false);
        jbtnUpdate.setOpaque(false);
        getContentPane().add(jbtnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 270, -1));
        getContentPane().add(sep1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 270, 10));
        getContentPane().add(sep2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 270, 10));
        getContentPane().add(sep3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 270, 10));

        jbtnGuardar.setBackground(new java.awt.Color(204, 0, 0));
        jbtnGuardar.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jbtnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        jbtnGuardar.setText("Guardar");
        jbtnGuardar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtnGuardar.setBorderPainted(false);
        jbtnGuardar.setOpaque(false);
        getContentPane().add(jbtnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 270, 30));

        jtxtTasa.setBackground(new java.awt.Color(0, 0, 0));
        jtxtTasa.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jtxtTasa.setForeground(new java.awt.Color(255, 255, 255));
        jtxtTasa.setText("Tasa del día");
        jtxtTasa.setBorder(null);
        jtxtTasa.setOpaque(false);
        getContentPane().add(jtxtTasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 410, 200, -1));
        getContentPane().add(sep4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 430, 200, 10));

        jtxtGanancia.setBackground(new java.awt.Color(0, 0, 0));
        jtxtGanancia.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jtxtGanancia.setForeground(new java.awt.Color(255, 255, 255));
        jtxtGanancia.setText("% de Ganancia");
        jtxtGanancia.setBorder(null);
        jtxtGanancia.setOpaque(false);
        getContentPane().add(jtxtGanancia, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 410, 200, -1));
        getContentPane().add(sep5, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 430, 200, 10));
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 530));

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
            java.util.logging.Logger.getLogger(jfProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jfProductos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnGuardar;
    private javax.swing.JButton jbtnUpdate;
    private javax.swing.JComboBox<String> jcomboCategoria;
    private javax.swing.JComboBox<String> jcomboMarca;
    private javax.swing.JComboBox<String> jcomboModelo;
    private javax.swing.JComboBox<idex_combo> jcomboProveedor;
    private javax.swing.JTable jtProductos;
    private javax.swing.JTextField jtxtCompra;
    private javax.swing.JTextField jtxtCosto;
    private javax.swing.JTextField jtxtGanancia;
    private javax.swing.JTextField jtxtImei;
    private javax.swing.JTextField jtxtTasa;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblFecha1;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblHora;
    private javax.swing.JLabel lblHora1;
    private javax.swing.JLabel lblNombreCliente;
    private javax.swing.JLabel lblSalir;
    private javax.swing.JSeparator sep1;
    private javax.swing.JSeparator sep2;
    private javax.swing.JSeparator sep3;
    private javax.swing.JSeparator sep4;
    private javax.swing.JSeparator sep5;
    // End of variables declaration//GEN-END:variables
}

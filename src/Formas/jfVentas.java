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
public class jfVentas extends javax.swing.JFrame {

    /**
     * Creates new form jfMenu
     */
    public jfVentas() {
        initComponents();
        
        this.setLocationRelativeTo(null);
     //FONDO CON IMAGEN--------------------------------------------------------------------------------
        Img_fondo_label fondoLabel = new Img_fondo_label();
        fondoLabel.Llenar_Label("ventana_de_ventas.jpg", lblFondo);        
        
        
        jtxtImei.setBackground(new Color(0,0,0,64));
//        jtxtCompra.setBackground(new Color(0,0,0,64));
//        jtxtCosto.setBackground(new Color(0,0,0,64));
//        
//      
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
        lblHora = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        lblFecha1 = new javax.swing.JLabel();
        lblHora1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jtxtImei = new javax.swing.JTextField();
        sep3 = new javax.swing.JSeparator();
        jButton2 = new javax.swing.JButton();
        lblHora2 = new javax.swing.JLabel();
        lblHora3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        jtxtImei1 = new javax.swing.JTextField();
        jtxtImei2 = new javax.swing.JTextField();
        txtImei = new javax.swing.JTextField();
        jtxtImei4 = new javax.swing.JTextField();
        jtxtImei5 = new javax.swing.JTextField();
        jtxtImei6 = new javax.swing.JTextField();
        jtxtImei7 = new javax.swing.JTextField();
        jtxtImei8 = new javax.swing.JTextField();
        jtxtImei9 = new javax.swing.JTextField();
        jtxtImei10 = new javax.swing.JTextField();
        sep4 = new javax.swing.JSeparator();
        sep5 = new javax.swing.JSeparator();
        sep6 = new javax.swing.JSeparator();
        sep7 = new javax.swing.JSeparator();
        sep8 = new javax.swing.JSeparator();
        sep9 = new javax.swing.JSeparator();
        sep10 = new javax.swing.JSeparator();
        lblFecha2 = new javax.swing.JLabel();
        lblFecha3 = new javax.swing.JLabel();
        lblFecha4 = new javax.swing.JLabel();
        lblFecha5 = new javax.swing.JLabel();
        lblFecha6 = new javax.swing.JLabel();
        lblFecha7 = new javax.swing.JLabel();
        lblFecha8 = new javax.swing.JLabel();
        lblFecha9 = new javax.swing.JLabel();
        lblFecha10 = new javax.swing.JLabel();
        txtProducto = new javax.swing.JTextField();
        jtxtNoFac = new javax.swing.JTextField();
        jtxtCantidad = new javax.swing.JTextField();
        lblFecha11 = new javax.swing.JLabel();
        jtxtPrecio = new javax.swing.JTextField();
        lblFecha12 = new javax.swing.JLabel();
        jtxtSubTotal = new javax.swing.JTextField();
        lblFecha13 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
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
        lblNombreCliente.setText("Ventas");
        getContentPane().add(lblNombreCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1020, -1));

        lblHora.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblHora.setForeground(java.awt.Color.white);
        lblHora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHora.setText("Eliminar");
        getContentPane().add(lblHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 505, 110, 30));

        lblFecha.setForeground(java.awt.Color.white);
        lblFecha.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblFecha.setText("VENDIDO POR");
        getContentPane().add(lblFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 430, 190, 10));

        lblFecha1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblFecha1.setForeground(java.awt.Color.white);
        lblFecha1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFecha1.setText("Modificar");
        getContentPane().add(lblFecha1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 510, 120, 20));

        lblHora1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblHora1.setForeground(java.awt.Color.white);
        lblHora1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHora1.setText("Cliente");
        getContentPane().add(lblHora1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 110, 30));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 210, 660, 170));

        jtxtImei.setBackground(new java.awt.Color(0, 0, 0));
        jtxtImei.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jtxtImei.setForeground(new java.awt.Color(255, 255, 255));
        jtxtImei.setText("EDAD");
        jtxtImei.setBorder(null);
        jtxtImei.setOpaque(false);
        jtxtImei.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtImeiActionPerformed(evt);
            }
        });
        getContentPane().add(jtxtImei, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 239, 290, -1));
        getContentPane().add(sep3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 290, 10));

        jButton2.setBackground(new java.awt.Color(204, 0, 0));
        jButton2.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Guardar");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.setBorderPainted(false);
        jButton2.setOpaque(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 480, 400, 40));

        lblHora2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblHora2.setForeground(java.awt.Color.white);
        lblHora2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHora2.setText("Buscar");
        getContentPane().add(lblHora2, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 30, 110, 30));

        lblHora3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblHora3.setForeground(java.awt.Color.white);
        lblHora3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHora3.setText("Producto");
        getContentPane().add(lblHora3, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 133, 110, 30));

        jComboBox1.setBackground(new java.awt.Color(255, 0, 0));
        jComboBox1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox1.setBorder(null);
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 440, 190, 20));

        jComboBox2.setBackground(new java.awt.Color(255, 0, 0));
        jComboBox2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jComboBox2.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox2.setBorder(null);
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 400, 230, 20));

        jComboBox3.setBackground(new java.awt.Color(255, 0, 0));
        jComboBox3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jComboBox3.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox3.setBorder(null);
        getContentPane().add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 400, 190, 20));

        jComboBox4.setBackground(new java.awt.Color(255, 0, 0));
        jComboBox4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jComboBox4.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox4.setBorder(null);
        getContentPane().add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 400, 210, 20));

        jtxtImei1.setBackground(new java.awt.Color(204, 0, 0));
        jtxtImei1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jtxtImei1.setForeground(new java.awt.Color(255, 255, 255));
        jtxtImei1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jtxtImei1.setOpaque(false);
        getContentPane().add(jtxtImei1, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 400, 120, -1));

        jtxtImei2.setBackground(new java.awt.Color(204, 0, 0));
        jtxtImei2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jtxtImei2.setForeground(new java.awt.Color(255, 255, 255));
        jtxtImei2.setToolTipText("");
        jtxtImei2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jtxtImei2.setOpaque(false);
        getContentPane().add(jtxtImei2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 440, 450, -1));

        txtImei.setBackground(new java.awt.Color(204, 0, 0));
        txtImei.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtImei.setForeground(new java.awt.Color(255, 255, 255));
        txtImei.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtImei.setOpaque(false);
        getContentPane().add(txtImei, new org.netbeans.lib.awtextra.AbsoluteConstraints(343, 180, 90, -1));

        jtxtImei4.setBackground(new java.awt.Color(0, 0, 0));
        jtxtImei4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jtxtImei4.setForeground(new java.awt.Color(255, 255, 255));
        jtxtImei4.setText("NOMBRES");
        jtxtImei4.setBorder(null);
        jtxtImei4.setOpaque(false);
        jtxtImei4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtImei4ActionPerformed(evt);
            }
        });
        getContentPane().add(jtxtImei4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 290, -1));

        jtxtImei5.setBackground(new java.awt.Color(0, 0, 0));
        jtxtImei5.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jtxtImei5.setForeground(new java.awt.Color(255, 255, 255));
        jtxtImei5.setText("CEDULA");
        jtxtImei5.setBorder(null);
        jtxtImei5.setOpaque(false);
        jtxtImei5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtImei5ActionPerformed(evt);
            }
        });
        getContentPane().add(jtxtImei5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 264, 290, -1));

        jtxtImei6.setBackground(new java.awt.Color(0, 0, 0));
        jtxtImei6.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jtxtImei6.setForeground(new java.awt.Color(255, 255, 255));
        jtxtImei6.setText("FECHA DE NACIMIENTO");
        jtxtImei6.setBorder(null);
        jtxtImei6.setOpaque(false);
        jtxtImei6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtImei6ActionPerformed(evt);
            }
        });
        getContentPane().add(jtxtImei6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 290, -1));

        jtxtImei7.setBackground(new java.awt.Color(0, 0, 0));
        jtxtImei7.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jtxtImei7.setForeground(new java.awt.Color(255, 255, 255));
        jtxtImei7.setText("TELEFONO");
        jtxtImei7.setBorder(null);
        jtxtImei7.setOpaque(false);
        jtxtImei7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtImei7ActionPerformed(evt);
            }
        });
        getContentPane().add(jtxtImei7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 315, 290, -1));

        jtxtImei8.setBackground(new java.awt.Color(0, 0, 0));
        jtxtImei8.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jtxtImei8.setForeground(new java.awt.Color(255, 255, 255));
        jtxtImei8.setText("EMAIL");
        jtxtImei8.setBorder(null);
        jtxtImei8.setOpaque(false);
        jtxtImei8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtImei8ActionPerformed(evt);
            }
        });
        getContentPane().add(jtxtImei8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 290, -1));

        jtxtImei9.setBackground(new java.awt.Color(0, 0, 0));
        jtxtImei9.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jtxtImei9.setForeground(new java.awt.Color(255, 255, 255));
        jtxtImei9.setText("DIRECCION");
        jtxtImei9.setBorder(null);
        jtxtImei9.setOpaque(false);
        jtxtImei9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtImei9ActionPerformed(evt);
            }
        });
        getContentPane().add(jtxtImei9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 365, 290, -1));

        jtxtImei10.setBackground(new java.awt.Color(0, 0, 0));
        jtxtImei10.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jtxtImei10.setForeground(new java.awt.Color(255, 255, 255));
        jtxtImei10.setText("APELLIDOS");
        jtxtImei10.setBorder(null);
        jtxtImei10.setOpaque(false);
        jtxtImei10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtImei10ActionPerformed(evt);
            }
        });
        getContentPane().add(jtxtImei10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 215, 290, -1));
        getContentPane().add(sep4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 205, 290, 10));
        getContentPane().add(sep5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 290, 10));
        getContentPane().add(sep6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 255, 290, 10));
        getContentPane().add(sep7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 290, 10));
        getContentPane().add(sep8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 305, 290, 10));
        getContentPane().add(sep9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 290, 10));
        getContentPane().add(sep10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 355, 290, 10));

        lblFecha2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblFecha2.setForeground(java.awt.Color.white);
        lblFecha2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFecha2.setText("Nuevo");
        getContentPane().add(lblFecha2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 120, 20));

        lblFecha3.setForeground(java.awt.Color.white);
        lblFecha3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblFecha3.setText("NO. FACTURA");
        getContentPane().add(lblFecha3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 110, 10));

        lblFecha4.setForeground(java.awt.Color.white);
        lblFecha4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblFecha4.setText("IMEI");
        getContentPane().add(lblFecha4, new org.netbeans.lib.awtextra.AbsoluteConstraints(342, 168, 100, 10));

        lblFecha5.setForeground(java.awt.Color.white);
        lblFecha5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblFecha5.setText("BANCO EMISOR");
        getContentPane().add(lblFecha5, new org.netbeans.lib.awtextra.AbsoluteConstraints(364, 390, 160, 10));

        lblFecha6.setForeground(java.awt.Color.white);
        lblFecha6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblFecha6.setText("BANCO RECEPTOR");
        getContentPane().add(lblFecha6, new org.netbeans.lib.awtextra.AbsoluteConstraints(584, 390, 160, 10));

        lblFecha7.setForeground(java.awt.Color.white);
        lblFecha7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblFecha7.setText("COD. REFERENCIA");
        getContentPane().add(lblFecha7, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 390, 120, 10));

        lblFecha8.setForeground(java.awt.Color.white);
        lblFecha8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblFecha8.setText("NOTA DE VENTA");
        getContentPane().add(lblFecha8, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 430, 370, 10));

        lblFecha9.setForeground(java.awt.Color.white);
        lblFecha9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblFecha9.setText("FORMA DE PAGO");
        getContentPane().add(lblFecha9, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 390, 150, 10));

        lblFecha10.setForeground(java.awt.Color.white);
        lblFecha10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblFecha10.setText("PRDUCTO:");
        getContentPane().add(lblFecha10, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 168, 230, 10));

        txtProducto.setBackground(new java.awt.Color(204, 0, 0));
        txtProducto.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtProducto.setForeground(new java.awt.Color(255, 255, 255));
        txtProducto.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtProducto.setOpaque(false);
        getContentPane().add(txtProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 180, 240, -1));

        jtxtNoFac.setBackground(new java.awt.Color(204, 0, 0));
        jtxtNoFac.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jtxtNoFac.setForeground(new java.awt.Color(255, 255, 255));
        jtxtNoFac.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jtxtNoFac.setOpaque(false);
        getContentPane().add(jtxtNoFac, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 110, -1));

        jtxtCantidad.setBackground(new java.awt.Color(204, 0, 0));
        jtxtCantidad.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jtxtCantidad.setForeground(new java.awt.Color(255, 255, 255));
        jtxtCantidad.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jtxtCantidad.setOpaque(false);
        getContentPane().add(jtxtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 180, 70, -1));

        lblFecha11.setForeground(java.awt.Color.white);
        lblFecha11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblFecha11.setText("Cantidad:");
        getContentPane().add(lblFecha11, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 168, 60, 10));

        jtxtPrecio.setBackground(new java.awt.Color(204, 0, 0));
        jtxtPrecio.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jtxtPrecio.setForeground(new java.awt.Color(255, 255, 255));
        jtxtPrecio.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jtxtPrecio.setOpaque(false);
        getContentPane().add(jtxtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 180, 60, -1));

        lblFecha12.setForeground(java.awt.Color.white);
        lblFecha12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblFecha12.setText("P. Unitario:");
        getContentPane().add(lblFecha12, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 168, 70, 10));

        jtxtSubTotal.setBackground(new java.awt.Color(204, 0, 0));
        jtxtSubTotal.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jtxtSubTotal.setForeground(new java.awt.Color(255, 255, 255));
        jtxtSubTotal.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jtxtSubTotal.setOpaque(false);
        getContentPane().add(jtxtSubTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 180, 90, -1));

        lblFecha13.setForeground(java.awt.Color.white);
        lblFecha13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblFecha13.setText("Sub-Total:");
        getContentPane().add(lblFecha13, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 168, 90, 10));

        jButton1.setBackground(new java.awt.Color(204, 0, 0));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText(" +ADD");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setBorderPainted(false);
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 176, 60, 30));
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblSalirMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalirMouseMoved
        lblSalir.setBorder(javax.swing.BorderFactory.createLineBorder(Color.RED));
    }//GEN-LAST:event_lblSalirMouseMoved

    private void lblSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalirMouseClicked
        Fade.JFrameFadeOut(1f, 0f, 0.1f, 50, this,Fade.DISPOSE);
        jfMenu menu = new jfMenu();
        menu.setVisible(true);
//        int dialog = JOptionPane.YES_NO_OPTION;
//        int result = JOptionPane.showConfirmDialog(null, "¿Desea salir?","Salir",dialog);
//        if(result == 0){
//            Fade.JFrameFadeOut(1f, 0f, 0.1f, 50, this,Fade.EXIT);
//            
//        }
    }//GEN-LAST:event_lblSalirMouseClicked

    private void lblSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalirMouseExited
        lblSalir.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(41,42,44)));
    }//GEN-LAST:event_lblSalirMouseExited

    private void jtxtImeiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtImeiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtImeiActionPerformed

    private void jtxtImei4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtImei4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtImei4ActionPerformed

    private void jtxtImei5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtImei5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtImei5ActionPerformed

    private void jtxtImei6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtImei6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtImei6ActionPerformed

    private void jtxtImei7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtImei7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtImei7ActionPerformed

    private void jtxtImei8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtImei8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtImei8ActionPerformed

    private void jtxtImei9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtImei9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtImei9ActionPerformed

    private void jtxtImei10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtImei10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtImei10ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(jfVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new jfVentas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jtxtCantidad;
    private javax.swing.JTextField jtxtImei;
    private javax.swing.JTextField jtxtImei1;
    private javax.swing.JTextField jtxtImei10;
    private javax.swing.JTextField jtxtImei2;
    private javax.swing.JTextField jtxtImei4;
    private javax.swing.JTextField jtxtImei5;
    private javax.swing.JTextField jtxtImei6;
    private javax.swing.JTextField jtxtImei7;
    private javax.swing.JTextField jtxtImei8;
    private javax.swing.JTextField jtxtImei9;
    private javax.swing.JTextField jtxtNoFac;
    private javax.swing.JTextField jtxtPrecio;
    private javax.swing.JTextField jtxtSubTotal;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblFecha1;
    private javax.swing.JLabel lblFecha10;
    private javax.swing.JLabel lblFecha11;
    private javax.swing.JLabel lblFecha12;
    private javax.swing.JLabel lblFecha13;
    private javax.swing.JLabel lblFecha2;
    private javax.swing.JLabel lblFecha3;
    private javax.swing.JLabel lblFecha4;
    private javax.swing.JLabel lblFecha5;
    private javax.swing.JLabel lblFecha6;
    private javax.swing.JLabel lblFecha7;
    private javax.swing.JLabel lblFecha8;
    private javax.swing.JLabel lblFecha9;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblHora;
    private javax.swing.JLabel lblHora1;
    private javax.swing.JLabel lblHora2;
    private javax.swing.JLabel lblHora3;
    private javax.swing.JLabel lblNombreCliente;
    private javax.swing.JLabel lblSalir;
    private javax.swing.JSeparator sep10;
    private javax.swing.JSeparator sep3;
    private javax.swing.JSeparator sep4;
    private javax.swing.JSeparator sep5;
    private javax.swing.JSeparator sep6;
    private javax.swing.JSeparator sep7;
    private javax.swing.JSeparator sep8;
    private javax.swing.JSeparator sep9;
    private javax.swing.JTextField txtImei;
    private javax.swing.JTextField txtProducto;
    // End of variables declaration//GEN-END:variables
}

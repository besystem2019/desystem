/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funciones_varias;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author wwwki
 */
public class Img_fondo_label {            
    public void Llenar_Label(String nombre_Imagen,JLabel nombre_Label){    
        ImageIcon imagen = new ImageIcon("src\\Imagenes\\"+nombre_Imagen);        
        Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(nombre_Label.getWidth(), nombre_Label.getHeight(), Image.SCALE_DEFAULT));
        nombre_Label.setIcon(icono);
        nombre_Label.repaint();        
    }    
}

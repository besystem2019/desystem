/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funciones_varias;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author efra
 */
public class idex_combo {
    
    
    private Integer id;
    private String sDesc;
    
    public idex_combo(Integer id, String sDesc){
    this.id = id;
    this.sDesc = sDesc;   
    }

    public idex_combo(){
    }
    
    public Integer getId(){
        return id;
    }
    
    public void setId(Integer id){
        this.id = id;
    }
    
    public String getDesc(){
        return sDesc;
    }
    
    public void setDesc(String sDesc){
        this.sDesc = sDesc;
    }
    
    public void llenarCombo(JComboBox<idex_combo> comboIndex,String iCampoId, String sTabla, String sCampo){
    String ssql;            
        try {
            ssql = "";
            ssql = ssql + " select " + iCampoId + "," + sCampo;
            ssql = ssql + " from "+sTabla;
            //ssql = ssql + "'" + sCampo + "'";
            //ssql = ssql + " from " +" '" + sTabla + "'";
            ssql = ssql + " where sn_activo = 1";
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(ssql);
            //comboIndex.addItem("-Seleccionar-");
            //combo.addItem("-Seleccionar-");
            
            while (rs.next()){
                
                
                comboIndex.addItem(new idex_combo(rs.getInt(iCampoId),
                                                  rs.getString(sCampo))
                                    );                
                //sDato = rs.getString("cod_usu");
                //combo.addItem(sDato);
            }            
            rs.close();
            st.close();         
        } catch (SQLException | HeadlessException e) {
            //JOptionPane.showMessageDialog(/*this*/, "Error al llenar combo:" + e,"CyCo",JOptionPane.ERROR_MESSAGE );
            JOptionPane.showMessageDialog(null, "Error al mostrar combo: "+e,"CyCo",JOptionPane.INFORMATION_MESSAGE );
        }
    }    
    conectar cc= new conectar();
    Connection cn= cc.conexion();  
    
    public String toString(){
        return sDesc;
    }      
}

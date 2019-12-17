package funciones_varias;
import java.sql.*;
import java.time.Clock;
import javax.swing.JOptionPane;


public class conectar {
    Connection con;
    
       public Connection conexion(){
       
           try {
               Class.forName("com.mysql.jdbc.Driver"); //driver del conector mysql
               // Esta forma sirve para reconectar automaticamente en caso no encuentre conexcion instantaneamente.-----
               con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cycodb?autoReconnect=true&useSSL=false","root","cebero1593"); 
               
               // Esta linea sirve para conectarse apuntando a una direccion ip (para ser usado de conexion remota).------
               //con = DriverManager.getConnection("jdbc:mysql://192.168.0.12:3306/cycodb?autoReconnect=true&useSSL=false","root","cebero1593");
              
               // Forma conrta de conexion, pero sin reconexion automatica.------
              //con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cycodb","root","cebero1593");
               //System.out.println("conexion establecida");
               //JOptionPane.showMessageDialog(null, "Conexion establecida");
           } catch (ClassNotFoundException | SQLException e) {
            //System.out.println("no se pudo conectar");
            JOptionPane.showMessageDialog(null, "No se puedo establecer la conexion con la base de datos: "+e);
           }
       return con;
       }
}

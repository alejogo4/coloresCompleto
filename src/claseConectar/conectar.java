package claseConectar;

import java.sql.*;
import javax.swing.*;
/**
 *
 * @author Sony
 */

public class conectar {
Connection conect = null;
   public Connection conexion()
    {
      try {
             
           //Cargamos el Driver MySQL
           Class.forName("com.mysql.jdbc.Driver");
           conect = DriverManager.getConnection("jdbc:mysql://localhost/colores","root","");
           
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error "+e);
        }
        return conect;
     
}}

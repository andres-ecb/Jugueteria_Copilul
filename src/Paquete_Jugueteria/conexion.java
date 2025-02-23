/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paquete_Jugueteria;
import com.mysql.jdbc.Connection;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Programación
 */
public class conexion {
    Connection conectar = null;
    public Connection conectar(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conectar = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/jugueteria", "root", "");
            
        } catch(ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Con. fallida" + e, "Conexión", JOptionPane.ERROR_MESSAGE);
        }
        return conectar;
    }
}

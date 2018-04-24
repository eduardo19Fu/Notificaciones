/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Eduardo
 */
public class Actualizador {
    
    private Connection connection;
    private Conexion conexion;
    
    public Actualizador(){
        
        conexion = new Conexion();
        connection = conexion.getConnection();
    }
    
    public int actualizarDatos(String clave,String dpi,String nit,String telefono,String email,String tipo_documento, String referencia){
        return 0;
    }
    
}

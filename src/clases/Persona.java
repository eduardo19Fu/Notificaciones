/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Eduardo
 */
public class Persona {
    
    private Connection connection;
    private Conexion conexion;
    
    private int idpersona;
    private String nombre;
    private String apellido;
    private String dpi;
    private String nit;
    private String telefono;
    private String email;
    private String tipo_documento;
    
    public Persona(){
        conexion = new Conexion();
        connection = conexion.getConnection();
    }

    public int getIdpersona() {
        return idpersona;
    }

    public void setIdpersona(int idpersona) {
        this.idpersona = idpersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDpi() {
        return dpi;
    }

    public void setDpi(String dpi) {
        this.dpi = dpi;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTipo_documento() {
        return tipo_documento;
    }

    public void setTipo_documento(String tipo_documento) {
        this.tipo_documento = tipo_documento;
    }

    
    public void getPersona(String clave){
        String sql = "select p.idpersona,p.nombre,p.apellido,p.identificacion,p.nit,p.telefono,p.correo_electronico,p.tipo_identificacion "
                + "from persona p, cuenta c "
                + "where p.idpersona = c.idpersona and c.clave = ?";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, sql);
            ResultSet rs = ps.executeQuery();
            
            setIdpersona(rs.getInt(1));
            setNombre(rs.getString(2));
            setApellido(rs.getString(3));
            setDpi(rs.getString(4));
            setNit(rs.getString(5));
            setTelefono(rs.getString(6));
            setEmail(rs.getString(7));
            setTipo_documento(rs.getString(8));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
//    public int actualizarPersona(){
//        String sql = "update persona set nombre = ?, apellido = ?, "
//    }
    
  
}

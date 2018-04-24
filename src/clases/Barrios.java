package clases;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author Eduardo
 */
public class Barrios {
    
    private int idBarrio;
    private String barrio;
    private Connection connection;
    private Conexion conexion;

    public Barrios() {
        conexion = new Conexion();
        connection = conexion.getConnection();
    }

    public int getIdBarrio() {
        return idBarrio;
    }

    public void setIdBarrio(int idBarrio) {
        this.idBarrio = idBarrio;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }
    
    public DefaultComboBoxModel cargarBarrios(){
        String sql = "select valor from catalogo where tipo_catalogo = 'BARRIO'";
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                modelo.addElement(rs.getString(1));
            }
            return modelo;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public void consultarBarrio(String valor){
        String sql = "select llave from catalogo where valor = ?";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, valor);
            ResultSet rs = ps.executeQuery();
            rs.next();
            setIdBarrio(rs.getInt(1));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
}

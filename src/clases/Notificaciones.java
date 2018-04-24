package clases;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Eduardo
 */
public class Notificaciones {
    
    private Connection connection;
    private Conexion conexion;
    
    public Notificaciones(){
        conexion = new Conexion();
        connection = conexion.getConnection();
    }
    
    public DefaultTableModel cuentas(int barrio, int rangoIni, int rangoFin){
        String sql = "{call deudores_corte(?,?,?)}";
        String[] titulos = {"Clave","No. Contador","Última Lect.","Nombre","Dirección","Fecha Lectura","Mes","Monto"};
        DefaultTableModel modelo = new DefaultTableModel(null,titulos);
        Object[] datos = new Object[8];
        try {
            CallableStatement cst = connection.prepareCall(sql);
            cst.setInt(1, barrio);
            cst.setInt(2, rangoIni);
            cst.setInt(3, rangoFin);
            ResultSet rs = cst.executeQuery();
            while(rs.next()){
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getInt(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                datos[5] = rs.getDate(6);
                datos[6] = rs.getString(7);
                datos[7] = rs.getDouble(8);
                modelo.addRow(datos);
            }
            return modelo;
        } catch (SQLException e) {
            return null;
        }
    }
    
    public void imprimir(int barrio, int rangoIni, int rangoFin){
        String sql = "{call deudores_corte2(?,?,?)}";
        String titulos[] = {""};
    }
}


package tienda.persistencia;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Lucho Napo
 */
public abstract class DAO {
    
    protected Connection conexion = null; 
    protected ResultSet resultado = null;
    protected Statement sentencia = null;
    
    private final String USER = "root";
    private final String PASSWORD = "root";
    private final String DATABASE = "tienda";
    private final String DRIVER = "com.mysql.jdbc.Driver";
    
    
    protected void conectarBase() throws Exception{       
        try {
            Class.forName(DRIVER);
            String urlBaseDeDatos = "jdbc:mysql://localhost:3306/" + DATABASE + "?useSSL=false";
            conexion = DriverManager.getConnection(urlBaseDeDatos, USER, PASSWORD);
        } catch (ClassNotFoundException | SQLException ex) {
            throw ex;
        }
         
    }
    
    protected void desconectarBase() throws Exception{   
        try {
            if(resultado != null){
                resultado.close();
            }
            if(sentencia != null){
                sentencia.close();
            }
            if(conexion != null){
                conexion.close();
            }
            
            
        } catch (SQLException e) {
            throw e;
        }
            
    }
    
    protected void insertarModificarEliminar(String sql) throws Exception{
        try {
            conectarBase();
            sentencia = conexion.createStatement();
            sentencia.executeUpdate(sql); 
            
        } catch (SQLException | ClassNotFoundException ex) {
            throw ex;
        }finally{
            desconectarBase();
        }
    }
    
    protected void consultarBasde(String sql) throws Exception{
          try {
            conectarBase();
            sentencia = conexion.createStatement();
            resultado = sentencia.executeQuery(sql);
            
        } catch (SQLException | ClassNotFoundException ex) {
            throw ex;
        }
    }
    
    
}

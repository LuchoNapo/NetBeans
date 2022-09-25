
package tienda.persistencia;

import java.util.Scanner;
import tienda.entidades.Fabricante;

/**
 *
 * @author Lucho Napo
 */
public final class FabricanteDAO extends DAO {
    
    private Scanner leer;
    
    public FabricanteDAO(){
        this.leer = new Scanner(System.in).useDelimiter("\n");
    }

    public void guardarFabricante(Fabricante fte) throws Exception {

        try {
            if (fte == null) {
                throw new Exception("Debe ingresar un fabricante");
            }

            String sql = "INSERT INTO Fabricante (codigo, nombre)"
                    + "VALUES (" + fte.getCodigo() + ",'" + fte.getNombre() + "');";

            insertarModificarEliminar(sql);

        } catch (Exception e) {
            throw e;
        }

    }
    
    public void modificarFabricante(Fabricante fte) throws Exception{
        try {
            if(fte == null){
                throw new Exception("Debe ingesar un fabricante");
            }
            
            String sql = "UPDATE Fabricante SET" + "nombre = '" + fte.getNombre() +
                         "'WHERE codigo ='" + fte.getCodigo()+"';";
            
            insertarModificarEliminar(sql);
            
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void eliminarFabricante(Integer codigo) throws Exception{
        
        try {
            
            String sql = "DELETE FROM Fabricante WHERE codigo= '" + codigo + "'";
            
            insertarModificarEliminar(sql);
            
        } catch (Exception e) {
            throw e;
        }
        
    }
    
    public void listarPorNombreFabricante(String nombre) throws Exception{
        
        try {
            
            String sql = "SELECT nombre FROM Fabricante WHERE nombre= '"+nombre+"'";
            consultarBasde(sql);
            
            while(resultado.next()){
                System.out.println(resultado.getInt(1)+"  |  "+ resultado.getString(2));
            }
            desconectarBase();
            
        } catch (Exception e) {
            throw e;
        }
        
    }
    
    public Fabricante buscarFabricantePorCodigo(int codigoF) throws Exception{
        Fabricante fte = new Fabricante();
        try {
            String sql = "SELECT * FROM fabricante WHERE codigo ="+codigoF;
            consultarBasde(sql);
            
            while(resultado.next()){
                System.out.println(resultado.getInt(1)+" | "+resultado.getString(2));
                fte.setCodigo(resultado.getInt(1));
                fte.setNombre(resultado.getString(2));
            }
            desconectarBase();
            return fte;
            
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }
    
    public void listarFabricantes() throws Exception{
        try {
            
            String sql = "SELECT * FROM fabricante";
            consultarBasde(sql);
            
            while(resultado.next()){
                System.out.println(resultado.getInt(1)+" | "+resultado.getString(2));
            }
            desconectarBase();
            
            
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }

}

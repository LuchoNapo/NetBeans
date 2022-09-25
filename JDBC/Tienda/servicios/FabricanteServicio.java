
package tienda.servicios;

import java.util.Scanner;
import tienda.entidades.Fabricante;
import tienda.persistencia.FabricanteDAO;

/**
 *
 * @author Lucho Napo
 */
public class FabricanteServicio {
    
    private FabricanteDAO dao;
    private Scanner leer;
    
    public FabricanteServicio(){
        this.dao = new FabricanteDAO();
        this.leer = new Scanner(System.in).useDelimiter("\n");
    }
    
    public void crearFabricante() throws Exception{
        
        try {
            
            System.out.print("Ingrese codigo del fabricante");
            Integer codigo = leer.nextInt();
            System.out.println("Ingrese nombre del fabricante");
            String nombre = leer.next();
            
            if(codigo==0){
                throw new Exception("El fabricante debe tener un codigo");
            }
            if(nombre==null || nombre.isEmpty()){
                throw new Exception("El fabricante debe tener un nombre");
            }
            
            Fabricante fte = new Fabricante();
            fte.setCodigo(codigo);
            fte.setNombre(nombre);
            dao.guardarFabricante(fte);
            
        } catch (Exception e) {
            throw e;
        }
    }
    
   public void consultarFabricante(){
       
       try {
           
           String sql = "SELECT * FROM Fabricante;";
     
           
       } catch (Exception e) {
       }
       
       
   }
}

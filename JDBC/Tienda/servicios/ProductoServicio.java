
package tienda.servicios;

import java.util.Scanner;
import tienda.entidades.Producto;
import tienda.persistencia.ProductoDAO;

/**
 *
 * @author Lucho Napo
 */
public class ProductoServicio {
    
    private Scanner leer;
    private ProductoDAO dao;
    
    public ProductoServicio(){
        this.dao = new ProductoDAO();
        this.leer= new Scanner(System.in).useDelimiter("\n");
    }
    
    public void crearProducto() throws Exception{
        try {
            System.out.print("Ingrese codigo del producto :");
            int codigo = leer.nextInt();
            System.out.print("Ingrese nombre del producto");
            String nombre = leer.next();
            System.out.print("Ingrese precio del producto");
            double precio = leer.nextDouble();
            System.out.print("Ingrese el codigo del fabricante");
            Integer codigo_fabricante = leer.nextInt();
            
            if(nombre.trim().isEmpty()){
                throw new Exception("Debe indicar nombre del producto");
            }
            if(precio == 0){
                throw new Exception("Debe indicar precio del producto");
            }
            if(codigo_fabricante == 0){
                throw new Exception("Debe indicar fabricante");
            }
            
            Producto pto = new Producto();
            pto.setCodigo(codigo);
            pto.setNombre(nombre);
            pto.setPrecio(precio);
            pto.setCodigo_fabricante(codigo_fabricante);
            
            dao.guardarProducto(pto);
            
        } catch (Exception e) {
            throw e;
        }
        
        
    }
    
    public void modificarProducto(){
        System.out.println("Ingrese numero de producto que desea ingresar");
        
    }
    
}


package tienda.persistencia;

import java.util.Scanner;
import tienda.entidades.Producto;

/**
 *
 * @author Lucho Napo
 */
public final class ProductoDAO extends DAO {

    private Scanner leer;
    private FabricanteDAO fd;

    public ProductoDAO() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.fd = new FabricanteDAO();
    }

    public void guardarProducto(Producto pto) throws Exception {

        try {
            if (pto == null) {
                throw new Exception("Debe ingresar un producto");
            }

            String sql = "INSERT INTO Producto (codigo, nombre, precio, codigo_fabricante)"
                    + "VALUES ('" + pto.getCodigo() + "' , '" + pto.getNombre() + "','" + pto.getPrecio()
                    + "','" + pto.getCodigo_fabricante() + "');";
            insertarModificarEliminar(sql);

        } catch (Exception e) {
            throw e;
        }

    }

    public void modificarNombreProducto(Producto pto) throws Exception {

        try {
            if (pto == null) {
                throw new Exception("Debe ingresar un producto");
            }

            String sql = "UPDATE Producto SET nombre = '"+pto.getNombre()+"'"+"WHERE codigo='"+pto.getCodigo()+"'";
                  
            insertarModificarEliminar(sql);

        } catch (Exception e) {
            throw e;
        }

    }

    public void modificarCodigoProducto(Producto pto) throws Exception {

        try {
            if (pto == null) {
                throw new Exception("Debe ingresar un producto");
            }

            String sql = "UPDATE Producto SET codigo= '"+pto.getCodigo()+"'"+"WHERE nombre='"+pto.getNombre()+"'";
             

            insertarModificarEliminar(sql);

        } catch (Exception e) {
            throw e;
        }

    }

    public void modificarPrecioProducto(Producto pto) throws Exception {

        try {
            if (pto == null) {
                throw new Exception("Debe ingresar un producto");
            }

             String sql = "UPDATE Producto SET precio= '"+pto.getPrecio()+"'"+"WHERE codigo='"+pto.getCodigo()+"'";

            insertarModificarEliminar(sql);

        } catch (Exception e) {
            throw e;
        }

    }

    public void modificarCodigoFProducto(Producto pto) throws Exception {

        try {
            if (pto == null) {
                throw new Exception("Debe ingresar un producto");
            }

            String sql = "UPDATE Producto SET codigo_fabricante= '"+pto.getCodigo_fabricante()+"'"+"WHERE codigo='"+pto.getCodigo()+"'";

            insertarModificarEliminar(sql);

        } catch (Exception e) {
            throw e;
        }

    }

    public void eliminarProducto(int codigo) throws Exception {

        try {

            String sql = "DELETE FROM Producto WHERE codigo = '" + codigo + "'";

            insertarModificarEliminar(sql);

        } catch (Exception e) {
            throw e;
        }

    }

    public void listarProductos() throws Exception {
        try {
            String sql = "SELECT * FROM producto";
            consultarBasde(sql);

            while (resultado.next()) {
                System.out.println(resultado.getInt(1) + " | " + resultado.getString(2) + " | " + resultado.getDouble(3) + " | " + resultado.getInt(4));
            }
            desconectarBase();

        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }

    public void listarProductoPorNombre() throws Exception {

        try {

            String sql = "SELECT nombre FROM Producto;";
            consultarBasde(sql);

            while (resultado.next()) {
                System.out.println("| " + resultado.getString(1));
            }
            desconectarBase();

        } catch (Exception e) {
            desconectarBase();
            throw e;
        }

    }

    public void listarNombreyPrecio() throws Exception {

        try {
            String sql = "SELECT nombre, precio FROM Producto;";
            consultarBasde(sql);

            while (resultado.next()) {
                System.out.println("|" + resultado.getString(1) + " | " + resultado.getDouble(2));
            }
            desconectarBase();

        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }

    public void listarPrecioEspecifico() throws Exception {

        try {

            String sql = "SELECT * FROM producto WHERE precio BETWEEN 120 AND 202";
            consultarBasde(sql);

            while (resultado.next()) {
                System.out.println(resultado.getInt(1) + " | " + resultado.getString(2) + " | " + resultado.getDouble(3) + " | " + resultado.getInt(4));
            }
            desconectarBase();

        } catch (Exception e) {
            desconectarBase();
            throw e;
        }

    }

    public void buscarProductoPorNombre() throws Exception {
        

        try {
            System.out.println("Ingrese el nombre del producto a buscar");
            String nombre = leer.next();

            String sql = "SELECT * FROM producto WHERE nombre LIKE '%" + nombre + "%'";
            consultarBasde(sql);

            while (resultado.next()) {
                System.out.println(resultado.getInt(1) + " | " + resultado.getString(2) + " | " + resultado.getDouble(3) + " | " + resultado.getInt(4));
            }
            desconectarBase();

        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }

    public void buscarProductoMasBarato() throws Exception {

        try {
            String sql = "SELECT * FROM producto ORDER BY precio LIMIT 1";
            consultarBasde(sql);

            while (resultado.next()) {
                System.out.println(resultado.getInt(1) + " | " + resultado.getString(2) + " | " + resultado.getDouble(3) + " | " + resultado.getInt(4));
            }
            desconectarBase();

        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }

    public void listarProductosPorCodigo() throws Exception {
        try {
            String sql = "SELECT codigo FROM producto ORDER BY codigo";
            consultarBasde(sql);

            while (resultado.next()) {
                System.out.println(resultado.getInt(1) + " | ");
            }
            desconectarBase();

        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }

    public void modificarProducto() throws Exception {
        try {
            Producto pto = new Producto();
            System.out.println("Ingrese codigo del producto a modificar");
            System.out.println("----------------------------------------");
            listarProductos();
            System.out.println("----------------------------------------");
            Integer codigoP = leer.nextInt();

            String sql = "SELECT * FROM producto WHERE codigo='" + codigoP + "'";
            consultarBasde(sql);

            while (resultado.next()) {
                System.out.println(resultado.getInt(1) + " | " + resultado.getString(2) + " | " + resultado.getDouble(3) + " | " + resultado.getInt(4));
                pto.setCodigo(resultado.getInt(1));
                pto.setNombre(resultado.getString(2));
                pto.setPrecio(resultado.getDouble(3));
                pto.setCodigo_fabricante(resultado.getInt(4));
            }
            System.out.println("----------------------------------");
            do {
                System.out.println("Que desea modificar del producto?");
                System.out.println("-----------------------------------");
                System.out.println("1=Codigo");
                System.out.println("2=Nombre");
                System.out.println("3=Precio");
                System.out.println("4=Fabricante");
                int opc = leer.nextInt();

                switch (opc) {
                    case 1:
                        System.out.println("El codigo del producto es: " + pto.getCodigo());
                        System.out.print("Por favor ingrese el nuevo codigo para el producto:");
                        int nuevoCodigo = leer.nextInt();
                        pto.setCodigo(nuevoCodigo);
                        System.out.println("-----------------------------------");
                        System.out.println("El Codigo ha sido cambiado con exito, el nuevo codigo para el producto " + pto.getNombre() + " es: " + pto.getCodigo());

                        modificarCodigoProducto(pto);

                        break;

                    case 2:
                        System.out.println("El nombre del producto es: " + pto.getNombre());
                        System.out.println("Ingrese nuevo nombre a ingresar");
                        String nuevoNombre = leer.next();
                        pto.setNombre(nuevoNombre);
                        System.out.println("El nombre se ha cambiado correctamente, el nombre del producto ahora es: " + pto.getNombre());
                        
                        modificarNombreProducto(pto);
                        
                        break;

                    case 3:
                        System.out.println("El Precio del producto " + pto.getCodigo() + " | " + pto.getNombre() + " es: " + pto.getPrecio());
                        System.out.println("Ingrese precio nuevo");
                        double nuevoPrecio = leer.nextDouble();
                        pto.setPrecio(nuevoPrecio);
                        System.out.println("El Precio fue modificado correctamente" + pto.getCodigo() + " | " + pto.getNombre() + " | " + pto.getPrecio());
                        
                        modificarPrecioProducto(pto);
                        
                        break;

                    case 4:
                        System.out.println("El codigo de fabricante del producto " + pto.getCodigo() + " | " + pto.getNombre() + " | es: " + pto.getCodigo_fabricante());
                        System.out.println("Correspondiente al " + fd.buscarFabricantePorCodigo(pto.getCodigo_fabricante()));
                        System.out.println("-----------------------------------");
                        System.out.println("Elija fabricante de la lista");
                        fd.listarFabricantes();
                        int nuevoF = leer.nextInt();
                        pto.setCodigo_fabricante(nuevoF);
                        System.out.println("-----------------------------------");
                        System.out.println("El cambio fue agregado correctamente");
                        
                        modificarCodigoFProducto(pto);
                        
                        break;
                }
            } while (salirDeMenu() == true);

            desconectarBase();

        } catch (Exception e) {
            desconectarBase();
            throw e;
        }

    }

    public boolean salirDeMenu() {
        try {
            boolean Flag2 = true;
            boolean Flag = true;
            int opc2;
            do {
                System.out.println("Desea modificar otra cosa?");
                System.out.println("1=Si / 2=No");
                opc2 = leer.nextInt();

                if (opc2 == 1) {
                    Flag = true;
                    Flag2 = false;
                } else if (opc2 == 2) {
                    System.out.println("Saliendo del sistema");
                    Flag2 = false;
                    Flag = false;
                } else {
                    System.out.println("Error! Ingrese un numero valido");
                    Flag2 = true;
                }
            } while (Flag2 == true);

            return Flag;

        } catch (Exception e) {
            throw e;
        }
    }

}

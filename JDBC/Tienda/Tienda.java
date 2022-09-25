package tienda;

import java.util.Scanner;
import tienda.persistencia.FabricanteDAO;
import tienda.persistencia.ProductoDAO;
import tienda.servicios.FabricanteServicio;
import tienda.servicios.ProductoServicio;

public class Tienda {

    public static void main(String[] args) throws Exception {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        ProductoServicio ps = new ProductoServicio();
        FabricanteServicio fs = new FabricanteServicio();
        ProductoDAO pd = new ProductoDAO();
        FabricanteDAO fd = new FabricanteDAO();

        int opc;
        boolean Flag = true;


        System.out.println("-------MENU-------");

        do {

            System.out.println(
                    "1) Lista el nombre de todos los productos que hay en la tabla producto.\n"
                    + "2) Lista los nombres y los precios de todos los productos de la tabla producto.\n"
                    + "3) Listar aquellos productos que su precio esté entre 120 y 202.\n"
                    + "4) Buscar y listar todos los Portátiles de la tabla producto.\n"
                    + "5) Listar el nombre y el precio del producto más barato.\n"
                    + "6) Ingresar un producto a la base de datos.\n"
                    + "7) Ingresar un fabricante a la base de datos\n"
                    + "8) Editar un producto con datos a elección.\n"
                    + "9) Salir del menu");

            opc = leer.nextInt();

            switch (opc) {
                case 1:
                    pd.listarProductoPorNombre();
                    break;
                case 2:
                    pd.listarNombreyPrecio();
                    break;
                case 3:
                    pd.listarPrecioEspecifico();
                    break;
                case 4:
                    pd.buscarProductoPorNombre();
                    break;
                case 5:
                    pd.buscarProductoMasBarato();
                    break;
                case 6:
                    ps.crearProducto();
                    break;
                case 7:
                    fs.crearFabricante();
                case 8:
                    pd.modificarProducto();
                case 9:

            }

        } while (salirMenu()==false);

    }

    public static boolean salirMenu() {
        System.out.println("------------------------------");
        try {
            Scanner leer = new Scanner(System.in).useDelimiter("\n");
            boolean Flag = true, Flag2 = true;

            do {
                System.out.println("Desea salir del menu?");
                System.out.println("1=Si/2=No");
                int opc = leer.nextInt();

                if (opc == 1) {
                    Flag = true;
                    Flag2 = false;
                } else if (opc == 2) {
                    Flag = false;
                    Flag2 = false;
                } else {
                    System.out.println("Error ingrese un numero valido");
                    Flag2 = true;
                }

            } while (Flag2 == true);
            
            return Flag;

        } catch (Exception e) {
            throw e;
        }

    }

}

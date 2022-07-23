/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendaderopa.servicio;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Lucho Napo
 */
public class ServicioProducto {

    private Scanner leer;
    private HashMap<String, Double> productos;

    public ServicioProducto() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.productos = new HashMap<>();
    }

    public void Menu() {
        boolean Flag = true;
        boolean Flag2 = true;
        do {
            System.out.println("---MENU---");
            System.out.println("1-Agregar producto al inventario");
            System.out.println("2-Modificar precio de un producto");
            System.out.println("3-Quitar un producto del inventario");
            System.out.println("4-Mostrar el stock del inventario");
            System.out.println("5-Salir del sistema");
            int opc = leer.nextInt();
            int opc2;
            switch (opc) {
                case 1:
                    StockPlus();
                    do {
                        System.out.println("Desea realizar otra operacion?");
                        System.out.println("1=Si,Volver al menu");
                        System.out.println("2=No,Salir del sistema");
                        opc2 = leer.nextInt();
                        if (opc2 == 1) {
                            Flag = true;
                            Flag2 = false;
                        } else if (opc2 == 2) {
                            Flag = false;
                            Flag2 = false;
                        } else {
                            System.out.println("ERROR! Ingrese opcion correcta");
                            Flag2 = true;
                        }
                    } while (Flag2 == true);
                    break;
                case 2:
                    ModificarPrecio();
                    do {
                        System.out.println("Desea realizar otra operacion?");
                        System.out.println("1=Si,Volver al menu");
                        System.out.println("2=No,Salir del sistema");
                        opc2 = leer.nextInt();
                        if (opc2 == 1) {
                            Flag = true;
                            Flag2 = false;
                        } else if (opc2 == 2) {
                            Flag = false;
                            Flag2 = false;
                        } else {
                            System.out.println("ERROR! Ingrese opcion correcta");
                            Flag2 = true;
                        }
                    } while (Flag2 == true);
                    break;
                case 3:
                    QuitarProducto();
                    do {
                        System.out.println("Desea realizar otra operacion?");
                        System.out.println("1=Si,Volver al menu");
                        System.out.println("2=No,Salir del sistema");
                        opc2 = leer.nextInt();
                        if (opc2 == 1) {
                            Flag = true;
                            Flag2 = false;
                        } else if (opc2 == 2) {
                            Flag = false;
                            Flag2 = false;
                        } else {
                            System.out.println("ERROR! Ingrese opcion correcta");
                            Flag2 = true;
                        }
                    } while (Flag2 == true);
                    break;
                case 4:
                    MostrarStock();
                    do {
                        System.out.println("Desea realizar otra operacion?");
                        System.out.println("1=Si,Volver al menu");
                        System.out.println("2=No,Salir del sistema");
                        opc2 = leer.nextInt();
                        if (opc2 == 1) {
                            Flag = true;
                            Flag2 = false;
                        } else if (opc2 == 2) {
                            Flag = false;
                            Flag2 = false;
                        } else {
                            System.out.println("ERROR! Ingrese opcion correcta");
                            Flag2 = true;
                        }
                    } while (Flag2 == true);
                    break;
                case 5:
                    Flag=false;
                    break;
            }
        } while (Flag == true);
        System.out.println("Saliendo del sistema!");
    }

    public void StockPlus() {
        boolean Flag = true;
        boolean Flag2 = true;
        do {
            System.out.println("Ingrese producto que desea agregar");
            String prenda = leer.next();
            System.out.println("Ingrese precio del producto");
            Double precio = leer.nextDouble();
            productos.put(prenda, precio);
            System.out.println("Desea agregar otra prenda?");
            do {
                System.out.println("1=Agregar otra prenda");
                System.out.println("2=Volver al menu");
                int opc = leer.nextInt();
                if (opc == 1) {
                    Flag = true;
                    Flag2 = false;
                } else if (opc == 2) {
                    Flag = false;
                    Flag2 = false;
                } else {
                    Flag2 = true;
                }

            } while (Flag2 == true);
        } while (Flag == true);

    }

    public void ModificarPrecio() {
        System.out.println("Ingrese prenda que desea modificar el precio");
        String modi = leer.next();
        System.out.println("Ingrese su nuevo precio");
        Double prec = leer.nextDouble();
        productos.put(modi, prec);
//        for (Map.Entry<String, Double> entry : productos.entrySet()) {
//            String key = entry.getKey();
//            Double value = entry.getValue();
//            if (modi.equals(key)) {
//                productos.replace(key, value, leer.nextDouble());
//            }
//        }
    }

    public void QuitarProducto() {
        System.out.println("Que prenda desea quitar?");
        for (Map.Entry<String, Double> entry : productos.entrySet()) {
            String key = entry.getKey();
            Double value = entry.getValue();
            System.out.println("Prenda: "+key+" $ "+value);
            
        }
        String opc = leer.next();
        if(productos.containsKey(opc)){
            productos.remove(opc);
        }else{
            System.out.println("Error al ingresar el nombre de la prenda");
        }

    }

    public void MostrarStock() {
        if (productos.isEmpty()) {
            System.out.println("NO HAY STOCK ");
        }
        for (Map.Entry<String, Double> entry : productos.entrySet()) {
            String key = entry.getKey();
            Double value = entry.getValue();
            System.out.println("Prenda: -" + key + " $ " + value);
        }
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentabancaria.servicioBanco;

import cuentabancaria.entidades.Entidades;
import java.util.Scanner;

/**
 *
 * @author Lucho Napo
 */
public class ServicioBanco {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Entidades ServicioBanco() {
        Entidades usuario = new Entidades();
        System.out.println("Ingrese Numero de Cuenta");
        usuario.setNumeroCuenta(leer.nextInt());
        System.out.println("Ingrese DNI");
        usuario.setDNI(leer.nextLong());
        usuario.setSaldo(80000);
        return usuario;
    }

    public void Menu(Entidades usuario) {
        boolean Flag=false;
        do{
        System.out.println("---------------BIENVENIDO!--------------");
        System.out.println("Ingrese operacion que desea ralizar");
        System.out.println("1=Ingresar Dinero");
        System.out.println("2=Retirar Dinero");
        System.out.println("3=Extraccion Rapida");
        System.out.println("4=Consultar Saldo");
        System.out.println("5=Consultar datos generales");
        int menu=leer.nextInt();
        switch(menu){
            case 1:
                Ingresar(usuario);
                System.out.println("Desea realizar otra operacion?");
                System.out.println("1=Si/2=No");
                int salir=leer.nextInt();
                if(salir==2){
                    System.out.println("Saliendo del sistema!");
                    System.out.println("Gracias por elegirnos!");
                    Flag=true;
                }
                break;
            case 2:
                Retirar(usuario);
                 System.out.println("Desea realizar otra operacion?");
                System.out.println("1=Si/2=No");
                 salir=leer.nextInt();
                if(salir==2){
                    System.out.println("Saliendo del sistema!");
                    System.out.println("Gracias por elegirnos!");
                    Flag=true;
                }
                break;
            case 3:
                extraccionRapida(usuario);
                  System.out.println("Desea realizar otra operacion?");
                System.out.println("1=Si/2=No");
                 salir=leer.nextInt();
                if(salir==2){
                    System.out.println("Saliendo del sistema!");
                    System.out.println("Gracias por elegirnos!");
                    Flag=true;
                }
                break;
            case 4:
            ConsultarSaldo(usuario);
              System.out.println("Desea realizar otra operacion?");
                System.out.println("1=Si/2=No");
                 salir=leer.nextInt();
                if(salir==2){
                    System.out.println("Saliendo del sistema!");
                    System.out.println("Gracias por elegirnos!");
                    Flag=true;
                }
                break;
            case 5:
                ConsultarDatos(usuario);
                  System.out.println("Desea realizar otra operacion?");
                System.out.println("1=Si/2=No");
                 salir=leer.nextInt();
                if(salir==2){
                    System.out.println("Saliendo del sistema!");
                    System.out.println("Gracias por elegirnos!");
                    Flag=true;
                }
                break;
            case 6:
                System.out.println("De sea salir?");
                System.out.println("1=Si/2=No");
                salir=leer.nextInt();
                if(salir==2){
                    System.out.println("Saliendo del sistema!");
                    System.out.println("Grcias por elegirnos!");
                    Flag=true;
                }
                break;
        }
        }while(Flag==false);

    }

    public void Ingresar(Entidades usuario) {
        int ingreso;
        System.out.println("Inrese cantidad de dinero");
        ingreso = leer.nextInt();
        usuario.setSaldo(usuario.getSaldo() + ingreso);
        System.out.println("Su saldo actualizado es: " + usuario.getSaldo());
    }

    public void Retirar(Entidades usuario) {
        int retiro;
        System.out.println("Ingrese cantidad a retirar");
        retiro = leer.nextInt();
        if (retiro > usuario.getSaldo()) {
            System.out.println("No tiene la cantidad suficiente");
            System.out.println("Su saldo es de: " + usuario.getSaldo());
        } else {
            usuario.setSaldo(usuario.getSaldo() - retiro);
            System.out.println("Retiro exitoso!");
            System.out.println("Su saldo actualizado es de: "+usuario.getSaldo());
        }
    }

    public void extraccionRapida(Entidades usuario) {
        int xtrac;
        boolean Flag;
        System.out.println("Extraccion Rapida");
        System.out.println("Ingrese monto a retirar");
        do{
        System.out.println("Recuerde que solo puede retirar hasta un 20% de su saldo actual");
        xtrac = leer.nextInt();
        if (xtrac > (usuario.getSaldo() * .20)) {
            System.out.println("El monto que desea retirar es mayor al 20% intente de nuevo");
            Flag=true;
        } else {
            System.out.println("Extraccion Exitosa");
            Flag=false;
        }   
        }while(Flag==true);
    }
    public void ConsultarSaldo(Entidades usuario){
        System.out.println("Su saldo actual es de: "+usuario.getSaldo());
    }
    public void ConsultarDatos(Entidades usuario){
        System.out.println(usuario.toString());
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciooperaciones.servicios;

import ejerciciooperaciones.entidades.Numeros;
import java.util.Scanner;

/**
 *
 * @author Lucho Napo
 */
public class Operaciones {

    Scanner leer = new Scanner(System.in);

    public Numeros operaciones() {
        Numeros operacion1 = new Numeros();
        System.out.println("Ingrese primer numero");
        operacion1.setNum1(leer.nextInt());
        System.out.println("Ingrese segundo numero");
        operacion1.setNum2(leer.nextInt());

        return operacion1;

    }

public void Sumar(Numeros operacion1){
    int suma;
    suma= operacion1.getNum1()+ operacion1.getNum2();
            System.out.println("La suma de "+operacion1.getNum1()+" y "+operacion1.getNum2()+" es: "+suma);
    
}
    public void Restar(Numeros operacion1){
        int resta;
        resta= operacion1.getNum1()-operacion1.getNum2();
        System.out.println("La resta de "+operacion1.getNum1()+" y "+operacion1.getNum2()+" es: "+resta);
    }
    public void Multiplicar(Numeros operacion1){
        int multiplicacion;
        if(operacion1.getNum1()==0 || operacion1.getNum2()==0){
            System.out.println("ERROR! el resutado es 0");
        }else{
            multiplicacion= operacion1.getNum1()*operacion1.getNum2();
            System.out.println("El resultado de la multiplicacion de "+operacion1.getNum1()+" y "+operacion1.getNum2()+" es: "+multiplicacion);
        }
    }
    public void Dividir(Numeros operacion1){
        int division;
        if(operacion1.getNum2()==0){
            System.out.println("ERROR! el resultado es una indeterminacion matematica");
        }else{
            division=operacion1.getNum1()/operacion1.getNum2();
            System.out.println("El resultado de la division de "+operacion1.getNum1()+" y "+operacion1.getNum2()+" es: "+division);
        }
    }
}

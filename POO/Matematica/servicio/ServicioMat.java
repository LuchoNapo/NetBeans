/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matematica.servicio;

import matematica.entidades.Numeros;

/**
 *
 * @author Lucho Napo
 */
public class ServicioMat {

    public Numeros CrearNumero() {
        Numeros n1 = new Numeros();
        n1.setNum1(Math.random() * 100);
        System.out.println("El primer numero es: "+n1.getNum1());
        n1.setNum2(Math.random() * 100);
        System.out.println("El segundo numero es: "+n1.getNum2());
        return n1;
    }

    public void Mayor(Numeros n1) {
        System.out.println("El mayor de los dos numeros es: " + Math.max(n1.getNum1(), n1.getNum2()));
    }
    public void Potencia(Numeros n1){
        int num1=(int)Math.round(n1.getNum1());
        int num2=(int)Math.round(n1.getNum2());
        if(num2>num1){
            System.out.println("La potencia del mayor elevado al menor es: "+ Math.pow(num2, num1) );
        }else{
            System.out.println("La potencia del mayor elevado al menor es: "+ Math.pow(num1, num2) );
        }
    }
    public void Raiz(Numeros n1){
        double menor = Math.min(n1.getNum1(),n1.getNum2());
        double abs = Math.abs(menor);
        System.out.println("La raiz del menor numero es: "+ Math.sqrt(abs));
    }
    
    
}

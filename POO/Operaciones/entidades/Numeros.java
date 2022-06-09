/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciooperaciones.entidades;

/**
 *
 * @author Lucho Napo
 */
public class Numeros {
    private int num1;
    private int num2;

    public Numeros(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    
    public Numeros(){      
}

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
    
}

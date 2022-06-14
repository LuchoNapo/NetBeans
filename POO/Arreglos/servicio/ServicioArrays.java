/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos.servicio;

import arreglos.entidades.Arreglo;
import java.util.Arrays;

/**
 *
 * @author Lucho Napo
 */
public class ServicioArrays {

    public Arreglo CrearArray1() {
        Arreglo a1 = new Arreglo();
        a1.setV1(50);
        a1.setV2(20);

        double[] vector1 = new double[a1.getV1()];
        double[] vector2 = new double[a1.getV2()];
        for (int i = 0; i < a1.getV1(); i++) {
            vector1[i] = Math.random() * 10;
            System.out.println(i + " | " + vector1[i]);
        }
        System.out.println("---------------------------");
        Arrays.sort(vector1);
        for (int i = 0; i < a1.getV1(); i++) {
            System.out.println(i + " | " + vector1[i]);
        }
        
        System.out.println("---------------------------");
        System.arraycopy(vector1, 0, vector2, 0, 10);
        for (int i = 10; i < 20; i++) {
            vector2[i]=0.5;
            
        }
        for (int i = 0; i < a1.getV2(); i++) {
            System.out.println(i+" | "+vector2[i]);
            
        }
        
        return a1;

    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

/**
 *
 * @author Lucho Napo
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       double[]V1=new double[5];
        for (int i = 0; i < 5; i++) {
            V1[i]=Math.random()*10;
            System.out.println(V1[i]);
        }
    }
    
}

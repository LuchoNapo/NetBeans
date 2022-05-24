/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javanb;

/**
 *
 * @author Lucho Napo
 */
public class Vector_Decreciente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int[] vector = new int[101];
       LLenarVector(vector);
       ImprimeVector(vector);
       
    }
    public static void LLenarVector(int[] vector){
        for (int i = 0; i < 101; i++) {
            vector[i]=i;
        }
            
        }
        public static void ImprimeVector(int[] vector){
            for (int i = 100; i >= 0; i--) {
                System.out.print(" "+vector[i]);
            }
   
        }
    
}

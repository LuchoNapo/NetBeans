
package ejerciciocadenas;

import ejerciciocadenas.entidades.Cadena;
import ejerciciocadenas.servicio.ServicioCadenas;


public class EjercicioCadenas {


    public static void main(String[] args) {
        ServicioCadenas sc = new ServicioCadenas();
        Cadena c1 = sc.CrearCadena();
        System.out.println("CANTIDAD DE VOCALES");
        sc.ContarVocales(c1);
        System.out.println("FRASE INVERTIDA");
        sc.InvertirFrase(c1);
        System.out.println("CONTADOR DE LETRAS");
        sc.ContadorLetra(c1);
        System.out.println("COMPARAR LONGITUDES");
        sc.CompararLongitud(c1);
        System.out.println("ANEXAR FRASE/PALABRA");
        sc.UnirFrase(c1);
        System.out.println("REMPLAZAR LETRA A");
        sc.RemplazarA(c1);
        System.out.println("VERIFICAR LETRA");
        sc.Contiene(c1);
    }
    
}

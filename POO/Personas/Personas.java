package personas;

import java.util.Scanner;
import personas.entidades.Persona;
import personas.servicio.ServicioPersona;

public class Personas {

    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        System.out.println("Ingrese cantidad de personas a estudiar");
        int CantPersonas=leer.nextInt();
        ServicioPersona sp = new ServicioPersona();
        int Ideal=0;
        int Debajo=0;
        int Encima=0;
        int MayEdad=0;
        int MenEdad=0;
        for (int i = 0; i < CantPersonas; i++) {
            Persona p1 = sp.CrearPersona();
    if(sp.CalcularIMC(p1)==-1){
        System.out.println("La persona esta por debajo de su peso ideal");
        Debajo++;
    }else if(sp.CalcularIMC(p1)==0){
        System.out.println("La persona esta en su peso ideal");
        Ideal++;
    }else if(sp.CalcularIMC(p1)==1){
        System.out.println("La persona esta por encima de su peso ideal");
        Encima++;
    }
            if (sp.esMayorDeEdad(p1) == true) {
                System.out.println("La persona es menor de edad");
                MayEdad++;
            } else {
                System.out.println("La persona es mayor de edad");
                MenEdad++;
            }
            System.out.println("----------------------------------");
        }
        System.out.println("---------------------------------------------------------------");
        System.out.println("El porcentaje de personas en su peso ideal es del: "+Ideal*100/CantPersonas+"%");
        System.out.println("El porcentaje de persoanas por debajo de su peso ideal es del: "+Debajo*100/CantPersonas+"%");
        System.out.println("El porcentaje de personas por encima de su peso ideal es del:"+Encima*100/CantPersonas+"%");
        System.out.println("---------------------------------------------------------------");
        System.out.println("El porsentaje de mayoria de edad es del: "+MayEdad*100/CantPersonas+"%");
        System.out.println("El personaje de menoria de edad es del: "+MenEdad*100/CantPersonas+"%");

    }

}


package ejerciciocadenas.servicio;

import ejerciciocadenas.entidades.Cadena;
import java.util.Scanner;


public class ServicioCadenas {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Cadena CrearCadena(){
        Cadena c1 = new Cadena();
        System.out.println("Ingrese una frase");
        c1.setFrase(leer.next());
        c1.setLongitud(c1.getFrase().length());
        return c1;
    }
    
    public void ContarVocales(Cadena c1){
        int vocales=0;
        String cade1;
        String cade2;
        for (int i = 0; i < c1.getLongitud(); i++) {
            cade1=(c1.getFrase().substring(i,i+1));
            cade2=cade1.toUpperCase();
            if(cade2.equals("A")||cade2.equals("E")||cade2.equals("I")||cade2.equals("O")||cade2.equals("U")){
                vocales++;
            }
        }
        System.out.println("La frase tiene "+vocales+" vocales");
    }
    public void InvertirFrase(Cadena c1){
        StringBuilder sb = new StringBuilder(c1.getFrase());
        System.out.println(sb.reverse());
    }
    
    public void ContadorLetra(Cadena c1){
        String cont;
        int cont2=0;
        System.out.println("Ingrese letra a contar");
        cont=leer.next();
        for (int i = 0; i < c1.getLongitud(); i++) {
            String cade1=c1.getFrase().substring(i,i+1);
            String cade2=cade1.toLowerCase();
            if(cont.equals(cade2)){
                cont2++;
            }
        }
        System.out.println("La letra se repite "+cont2+" veces");
    }
    public void CompararLongitud(Cadena c1){
        System.out.println("Ingrese una cadena nueva para comparar tamaño");
        String cadena1=leer.next();
        if(cadena1.length()>c1.getLongitud()){
            System.out.println("La cadena nueva es mayor por "+(cadena1.length()-c1.getLongitud())+" caracteres");
        }else if(cadena1.length()<c1.getLongitud()){
            System.out.println("La cadena nueva es menor por "+(c1.getLongitud()-cadena1.length())+" caracteres");
        }else if(cadena1.length()==c1.getLongitud()){
            System.out.println("Las cadenas son de igual tamaño");
        }
    }
    public void UnirFrase(Cadena c1){
        System.out.println("Ingrese una nueva frase para anexar");
        String frase=leer.next();
        System.out.println(c1.getFrase().concat(" "+frase));
    }
    public void RemplazarA(Cadena c1){
        System.out.println("Ingrese caracter para remplazar");
        String caracter=leer.next();
        String cade1;
        for (int i = 0; i < c1.getLongitud(); i++) {
            cade1=c1.getFrase().substring(i, i+1);
            if(cade1.equals("a")){
                cade1=caracter;
            }
            System.out.print(cade1);
        }
        System.out.println(" ");
    }
    public void Contiene(Cadena c1){
        System.out.println("Ingrese letra para verificar si se encuentra en la cadena");
        String letra=leer.next();
        String cade1;
        int cont=0;
        boolean Flag=false;
        for (int i = 0; i < c1.getLongitud(); i++) {
            cade1=c1.getFrase().substring(i,i+1);
            if(cade1.equals(letra)){
                cont++;
            }  
        }
        if(cont>0){
            Flag=true;
        }
        System.out.println(Flag);
    }
    
    
    }
    


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo1.entidades;

/**
 *
 * @author Lucho Napo
 */
public class Mascota {
    private String nombre;
    //Perro, Gato, Conejo etc.
    private String tipo;
    private int edad;
    private boolean cola;
    private String raza;
    private String color;
    private int energia;
    
    
    public Mascota(){ 
        energia=1000;
    }

    public Mascota(String nombre, String tipo, int edad, boolean cola, String raza, String color) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.edad = edad;
        this.cola = cola;
        this.raza = raza;
        this.color = color;
        this.energia = 1000;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setCola(boolean cola) {
        this.cola = cola;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setColor(String color) {
        this.color = color;
    }
    

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public int getEdad() {
        return edad;
    }

    public boolean isCola() {
        return cola;
    }

    public String getRaza() {
        return raza;
    }

    public String getColor() {
        return color;
    }
   
    public int pasear(int energiaRestar){
        this.energia=energia-energiaRestar;
        //energia-=energiaRestar (Otra forma de restarle)
        return energia;
    }

    @Override
    public String toString() {
        return "Mascota{" + "nombre=" + nombre + ", tipo=" + tipo + ", edad=" + edad + ", cola=" + cola + ", raza=" + raza + ", color=" + color + ", energia=" + energia + '}';
    }

   
    
    
}

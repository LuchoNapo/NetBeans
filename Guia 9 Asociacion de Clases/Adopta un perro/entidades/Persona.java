/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adoptarperro.entidades;

/**
 *
 * @author Lucho Napo
 */
public class Persona {

    private String nombre;
    private String apellido;
    private int edad;
    private int documento;
    private Perro adopcion;

    public Persona() {
    }

    public Persona(String nombre, String apellido, int edad, int documento, Perro adopcion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.documento = documento;
        this.adopcion = adopcion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public int getDocumento() {
        return documento;
    }

    public Perro getAdopcion() {
        return adopcion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public void setAdopcion(Perro adopcion) {
        this.adopcion = adopcion;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", documento=" + documento + ", adopcion=" + adopcion + '}';
    }

}

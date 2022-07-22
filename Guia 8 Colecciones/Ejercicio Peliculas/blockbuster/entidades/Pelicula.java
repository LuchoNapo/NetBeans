/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blockbuster.entidades;

/**
 *
 * @author Lucho Napo
 */
public class Pelicula {
    private String titulo;
    private String director;
    private Double horas;

    public Pelicula() {
    }

    public Pelicula(String titulo, String director, Double horas) {
        this.titulo = titulo;
        this.director = director;
        this.horas = horas;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDirector() {
        return director;
    }

    public Double getHoras() {
        return horas;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setHoras(Double horas) {
        this.horas = horas;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", director=" + director + ", horas=" + horas + '}';
    }
    
    
    
}

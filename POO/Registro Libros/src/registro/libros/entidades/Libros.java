/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registro.libros.entidades;

/**
 *
 * @author Lucho Napo
 */
public class Libros {
    private String ISBN;
    private String Titulo;
    private String Autor;
    private int numeroPag;

    public Libros(String ISBN, String Titulo, String Autor, int numeroPag) {
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.numeroPag = numeroPag;
    }
    public Libros(){
        
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public void setNumeroPag(int numeroPag) {
        this.numeroPag = numeroPag;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getTitulo() {
        return Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public int getNumeroPag() {
        return numeroPag;
    }

    @Override
    public String toString() {
        return "Libros{" + "ISBN=" + ISBN + ", Titulo=" + Titulo + ", Autor=" + Autor + ", numeroPag=" + numeroPag + '}';
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendaderopa.entidades;

/**
 *
 * @author Lucho Napo
 */
public class Producto {

    private String prenda;
    private Double precio;

    public Producto() {
    }

    public Producto(String prenda, Double precio) {
        this.prenda = prenda;
        this.precio = precio;
    }

    public String getPrenda() {
        return prenda;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrenda(String prenda) {
        this.prenda = prenda;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

}

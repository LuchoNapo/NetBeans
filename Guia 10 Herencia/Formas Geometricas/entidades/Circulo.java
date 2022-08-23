/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fromasgeometricas.entidades;

/**
 *
 * @author Lucho Napo
 */
public class Circulo {
    private double radio;
    private double diametro;

    public Circulo(double radio, double diametro) {
        this.radio = radio;
        this.diametro = diametro;
    }

    public Circulo() {
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    public double getRadio() {
        return radio;
    }

    public double getDiametro() {
        return diametro;
    }
    
    
    
}

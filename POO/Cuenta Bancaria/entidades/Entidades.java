/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentabancaria.entidades;

/**
 *
 * @author Lucho Napo
 */
public class Entidades {
    public int numeroCuenta;
    public long DNI;
    public int saldo;
    
    public Entidades(){
        
    }

    public Entidades(int numeroCuenta, long DNI, int saldo) {
        this.numeroCuenta = numeroCuenta;
        this.DNI = DNI;
        this.saldo = saldo;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public long getDNI() {
        return DNI;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Entidades{" + "numeroCuenta=" + numeroCuenta + ", DNI=" + DNI + ", saldo=" + saldo + '}';
    }
    
}


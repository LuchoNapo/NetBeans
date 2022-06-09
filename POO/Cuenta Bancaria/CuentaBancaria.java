
package cuentabancaria;

import cuentabancaria.entidades.Entidades;
import cuentabancaria.servicioBanco.ServicioBanco;

/**
 *
 * @author Lucho Napo
 */
public class CuentaBancaria {

    public static void main(String[] args) {
        ServicioBanco sb = new ServicioBanco();
        Entidades u1 = sb.ServicioBanco();
        sb.Menu(u1);
    }
    
}

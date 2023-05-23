
package Cuenta;

import java.util.Scanner;

/**Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular". 
 * Luego, crea un método "retirar_dinero" que permita retirar una cantidad de dinero del saldo de la cuenta. 
 * Asegúrate de que el saldo nunca sea negativo después de realizar una transacción de retiro.
 *
 * @author cokit
 */
public class Cuenta {
    public int saldo;
    public String titular;

    public Cuenta(int saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }

    public Cuenta() {
    }

    public int getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void retirar_dinero() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad que desea retirar");
        int retiro = leer.nextInt();
        if (saldo > retiro) {
            saldo -= retiro;
            System.out.println("El saldo es = " + this.saldo);
        } else {
            System.out.println("Saldo insuficiente");
        }

    } 
}

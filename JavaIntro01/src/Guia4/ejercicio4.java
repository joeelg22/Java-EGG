/*
 
Crea una aplicación que nos pida un número por teclado y con una función se lo pasamos por parámetro para que nos indique
si es o no un número primo, debe devolver true si es primo, sino false.
Un número primo es aquel que solo puede dividirse entre 1 y sí mismo.
Por ejemplo: 25 no es primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo.

 */
package Guia4;

import java.util.Scanner;

/**
 *
 * @author cokit
 */
public class ejercicio4 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        System.out.print("Numero: ");
        int num = leer.nextInt();
        
        System.out.println("¿El numero es primo?: " + primos(num));
    }
    public static String primos(int num) {
        int contador = 0;
        String respuesta;
        
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                contador++;
            }
        }
        if (contador > 1) {
            respuesta = "No";
        } else {
            respuesta = "Si";
        }
        return respuesta;
    }
    
}

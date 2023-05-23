/*
 *Crea una aplicación que a través de una función nos convierta una cantidad de euros introducida por teclado a otra moneda,
estas pueden ser a dólares, yenes o libras. La función tendrá como parámetros, 
la cantidad de euros y la moneda a convertir que será una cadena,
este no devolverá ningún valor y mostrará un mensaje indicando el cambio (void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €

 */
package Guia4;

import java.util.Scanner;

/**
 *
 * @author cokit
 */
public class ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        char socioTipo;
        do {
            System.out.println("ingrese tipo de socio");
            socioTipo = leer.next().toLowerCase().charAt(0);
            System.out.println("ingrese importe del tratamiento");
            double importe = leer.nextDouble();
            switch (socioTipo) {
                case 'a':
                    System.out.println("Importe con desc (50%) $" + importe * 0.5);
                    break;
                case 'b':
                    System.out.println("Importe con desc (35%) $" + importe * 0.35);
                    break;
                case 'c':
                    System.out.println("importe sin desc $" + importe);
                    break;
                default:
                    System.out.println("categoria no existente");
            }

        } while (socioTipo != 'a' && socioTipo != 'b' && socioTipo != 'c');
    }
    
}

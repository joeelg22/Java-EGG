/*
Una obra social tiene tres clases de socios:
Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en todos los tipos de tratamientos.
Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para los mismos tratamientos que los socios del tipo A.
Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos tratamientos.
Solicite una letra (carácter) que representa la clase de un socio, y luego un valor real que represente el costo del tratamiento (previo al descuento)
y determine el importe en efectivo a pagar por dicho socio.

 */
package guia3;

import java.util.Scanner;

/**
 *
 * @author cokit
 */
public class ejercicioExtra5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
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

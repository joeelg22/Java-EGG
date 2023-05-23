/*
 Realizar un programa que pida dos números enteros positivos por teclado y muestre por pantalla el siguiente menú:
El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla y luego volver al menú. 
El programa deberá ejecutarse hasta que se elija la opción 5. Tener en cuenta que, si el usuario selecciona la opción 5,
en vez de salir del programa directamente, se debe mostrar el siguiente mensaje de confirmación:
¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del programa,
caso contrario se vuelve a mostrar el menú.

 */
package guia3;

import java.util.Scanner;

/**
 *
 * @author cokit
 */
public class ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        int num1, num2, suma, resta, division, multiplicacion, opcion;
        String salir = "N";
        do {
            System.out.println("Ingrese 2 números enteros");
            num1 = leer.nextInt();
            num2 = leer.nextInt();
            System.out.println("MENU\n"
                    + "1.Suma\n"
                    + "2.Resta\n"
                    + "3.Multiplicación\n"
                    + "4.División\n"
                    + "5.Salir\n"
                    + "Elija una opción");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    suma = num1 + num2;
                    System.out.println("La suma es: " + suma);
                    break;
                case 2:
                    resta = num1 - num2;
                    System.out.println("La resta es: " + resta);
                    break;
                case 3:
                    multiplicacion = num1 * num2;
                    System.out.println("La multiplicacion es: " + multiplicacion);
                    break;
                case 4:
                    division = num1 / num2;
                    System.out.println("La division es: " + division);
                    break;
                case 5:

                    System.out.println("¿Está seguro que desa salir? S/N");
                    salir = leer.next();
                    if (salir.equals("S")) {
                        break;
                    }
            }
        } while (salir.equals("N"));

    }

}
   
    


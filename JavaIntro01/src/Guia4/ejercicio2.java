/*
 Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de las personas ingresadas
por teclado e indique si son mayores o menores de edad.
Después de cada persona, el programa debe preguntarle al usuario si quiere seguir mostrando personas 
y frenar cuando el usuario ingrese la palabra “No”.
 */
package Guia4;

import java.util.Scanner;

/**
 *
 * @author cokit
 */
public class ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    String nombre;
        String palabra = "no";

        int edad;
        do {
            Scanner input = new Scanner(System.in);
            System.out.println("Ingrese su nombre:");

            nombre = input.nextLine();

            System.out.println("test " + nombre.equalsIgnoreCase(palabra));

            if (!nombre.equalsIgnoreCase("no")) {
                System.out.println("Ingrese su Edad:");
                edad = input.nextInt();
                MostrarPersona(nombre, edad);
            }

        } while (!nombre.equalsIgnoreCase("no"));

    }

    public static void MostrarPersona(String nombre, int edad) {
        System.out.printf("Su nombre es " + nombre + " y tenes " + edad + " aÃ±os");
        if (edad >= 18) {
            System.out.println(" y ademas sos Mayor de edad");
        } else {
            System.out.println(" todavia sos Menor de edad");
        }
        
        
    }
    
}

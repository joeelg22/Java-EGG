/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Guia2;

import java.util.Scanner;

/** * Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por pantalla.

 *
 * @author cokit
 */
public class ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner leer = new Scanner(System.in);
        String nombre;
        System.out.println("Hola, por favor escribe tu nombre");//poniendo sout+(tab) atajo : ESCRIBIR DE PSEINT
        nombre = leer.nextLine();//llenamos la variable nombre con lo que se escriba en la linea completa en el Scanner leer
        System.out.println("Bueno, te llamas "+ nombre + " y estas aprendiendo JAVA"); // sacamos otro sout concatenando. 
    }
    
}

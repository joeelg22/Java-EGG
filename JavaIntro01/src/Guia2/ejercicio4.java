/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Guia2;

import java.util.Scanner;

/**Dada una cantidad de grados centígrados se debe mostrar su equivalente 
 * en grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 *
 * @author cokit
 */
public class ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int F, C; // creamos las variables enteras
        Scanner leer = new Scanner(System.in); //el scanner para pedir los datos
        System.out.println("Ingrese el valor de grados CENTIGRADOS;");
        C = leer.nextInt(); //aca pedimos C
        F = 32 + (9 * C/5); // hacemos la formula...
        System.out.println("El equivalente en grados Farenheit es: "+ F); // la mostramos
    }
    
}

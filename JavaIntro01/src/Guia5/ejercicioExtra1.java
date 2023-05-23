/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Guia5;

import java.util.Scanner;

/**Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño N, 
 * con los valores ingresados por el usuario.

 *
 * @author cokit
 */
public class ejercicioExtra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
            Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingrese el tamaño del vector: ");
        int n = entrada.nextInt();
        
        int[] vector = new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el valor del elemento " + (i+1) + ": ");
            vector[i] = entrada.nextInt();
        }
        
        int suma = 0;
        for (int i = 0; i < n; i++) {
            suma += vector[i];
        }
        
        System.out.println("La suma de todos los elementos del vector es: " + suma);
    }

}
    
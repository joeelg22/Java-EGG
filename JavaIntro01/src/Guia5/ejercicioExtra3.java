/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Guia5;

import java.util.Random;

/**Crear una función rellene un vector con números aleatorios, pasándole un arreglo por parámetro. 
 * Después haremos otra función o procedimiento que imprima el vector.

 *
 * @author cokit
 */
public class ejercicioExtra3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int[] vector = new int[10];
        llenarVectorAleatorio(vector);
        imprimirVector(vector);
    }

    public static void llenarVectorAleatorio(int[] vector) {
        Random random = new Random();
        for (int i = 0; i < vector.length; i++) {
            vector[i] = random.nextInt(100);
        }
    }

    public static void imprimirVector(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }
        System.out.println();
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Guia5;

/**Realizar un algoritmo que llene un vector con los 100 primeros números enteros 
 * y los muestre por pantalla en orden descendente.
 *
 * @author cokit
 */
public class ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] vector = new int[100];
          for (int i = 100; i > 0; i--) {
            vector[i] = i;
            System.out.print(vector[i] + "/");
 
          }
    }
}

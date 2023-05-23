/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Guia5;

import java.util.Scanner;

/**
 *Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios y
 * le pida al usuario un número a buscar en el vector. 
 * El programa mostrará dónde se encuentra el numero y si se encuentra repetido

 * @author cokit
 */
public class ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
        System.out.println("ingrese tamaño del vector");
        int n = leer.nextInt();
        int[] array = new int[n];
        
        for (int i = 0; i < n; i++) {
          array[i] = (int) (Math.random()*10+1);  
            System.out.print(array[i] + "/");
        }
        System.out.println("\nque numero quiere buscar dentro del arreglo?");
        int num = leer.nextInt();
        int count = 0;
        System.out.println("el numero " + num);
        for (int i = 0; i < n; i++) {
            if (num == array[i]) {
                ++count;
                System.out.println("se encuentra en la posicion " + i);
                }
        }
        System.out.println("se repite " + count + " veces");
        if (count == 0) {
             System.out.println("no pertenece al arreglo");
        
        
          }
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Guia5;

import java.util.Random;

/*Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la traspuesta de la matriz.
La matriz traspuesta de una matriz A se denota por B y se obtiene cambiando sus filas por columnas (o viceversa).


 *
 * @author cokit
 */
public class ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // 1. Generar la matriz de 4 x 4 con valores aleatorios
        
        int[][] matriz = new int[4][4];
        Random aleatorio = new Random();
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = aleatorio.nextInt(10); // valores entre 0 y 9
            }
        }
        
        // 2. Mostrar la matriz original
        
        System.out.println("Matriz original:");
        
        for (int[] matriz1 : matriz) {
            for (int j = 0; j < matriz1.length; j++) {
                System.out.print(matriz1[j] + " ");
            }
            System.out.println();
        }
        
        // 3. Calcular la matriz traspuesta
        
        int[][] transpuesta = new int[4][4];
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                transpuesta[j][i] = matriz[i][j];
            }
        }
        
        // 4. Mostrar la matriz traspuesta
        
        System.out.println("Matriz traspuesta:");
        
        for (int[] transpuesta1 : transpuesta) {
            for (int j = 0; j < transpuesta1.length; j++) {
                System.out.print(transpuesta1[j] + " ");
            }
            System.out.println();
        }
    }
    
}

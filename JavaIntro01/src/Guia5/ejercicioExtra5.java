/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Guia5;

import java.util.Random;

/**
 *
 * @author cokit
 */
public class ejercicioExtra5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
      
        int N = 5; // Tamaño de la matriz
        int M = 4;
        int[][] matriz = new int[N][M]; // Declaración de la matriz
        Random rand = new Random(); // Generador de números aleatorios
        
        // Llenado de la matriz con valores aleatorios entre 0 y 9
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                matriz[i][j] = rand.nextInt(10); // Valor aleatorio entre 0 y 9
            }
        }
        
        // Impresión de la matriz
        System.out.println("Matriz:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        
        // Cálculo de la suma de los elementos de la matriz
        int suma = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                suma += matriz[i][j];
            }
        }
        
        // Impresión de la suma de los elementos de la matriz
        System.out.println("Suma de los elementos de la matriz: " + suma);
    }
    }


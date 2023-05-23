/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Guia5;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author cokit
 */
public class sopadeletra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       

    
        Scanner sc = new Scanner(System.in);
        String[] palabras = new String[5];
        int tamanoSopa = 20;

        // Leer 5 palabras de mínimo 3 y máximo 5 caracteres
        for (int i = 0; i < palabras.length; i++) {
            do {
                System.out.print("Ingrese palabra " + (i+1) + " (de 3 a 5 caracteres): ");
                palabras[i] = sc.next();
            } while (palabras[i].length() < 3 || palabras[i].length() > 5);
        }

        // Construir sopa de letras
        char[][] sopa = new char[tamanoSopa][tamanoSopa];

        // Rellenar sopa con números aleatorios del 0 al 9
        Random rand = new Random();
        for (int i = 0; i < tamanoSopa; i++) {
            for (int j = 0; j < tamanoSopa; j++) {
                sopa[i][j] = (char)(rand.nextInt(10) + '0');
            }
        }

        // Ubicar palabras en sopa
        int filaAleatoria = rand.nextInt(tamanoSopa);
        int columnaInicialAleatoria = rand.nextInt(tamanoSopa - palabras.length);
        for (String palabra : palabras) {
            for (int j = 0; j < palabra.length(); j++) {
                sopa[filaAleatoria][columnaInicialAleatoria+j] = palabra.charAt(j);
            }
            columnaInicialAleatoria += palabra.length() + 1;
        }

        // Imprimir sopa de letras
        for (int i = 0; i < tamanoSopa; i++) {
            for (int j = 0; j < tamanoSopa; j++) {
                System.out.print(sopa[i][j] + " ");
            }
            System.out.println();
        }
    }
}
    
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Guia5;

import java.util.Scanner;

/**
 * Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y,
 * a medida que el usuario las va ingresando, construya una “sopa de letras para
 * niños” de tamaño de 20 x 20 caracteres. Las palabras se ubicarán todas en
 * orden horizontal en una fila que será seleccionada de manera aleatoria. Una
 * vez concluida la ubicación de las palabras, rellene los espacios no
 * utilizados con un número aleatorio del 0 al 9. Finalmente imprima por
 * pantalla la sopa de letras creada.
 *
 *
 * @author cokit
 */
public class ejercicioExtra6 {

    /**
     * @param args the command line arguments
     */
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {

           int palabras = 5;
        int n = 20;
        String[][] sopa = new String[n][n];
        llenarSopa(sopa, n);
        for (int i = 0; i < palabras; i++) {
            String palabra = llenarPalabra();
            sopa(palabra, sopa, n);
        }
        mostrarSopa(sopa, n);
    }

    public static String llenarPalabra() {
        String p;
        do {
            System.out.println("ingrese una palabra de entre 3 y 5 caracteres");
            p = leer.nextLine();
            if (p.length() < 3) {
                System.out.println("tiene menos de 3 caracteres");
            } else if (p.length() > 5) {
                System.out.println("tiene mas de 5 caractes");
            }
        } while (p.length() < 3 || p.length() > 5);
        return p;
    }

    public static void llenarSopa(String[][] s, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                s[i][j] = " "; //String.valueOf((int) (Math.random() * 9 + 1));
            }
        }
    }

    public static void sopa(String p, String[][] s, int n) {
        int x = 0;
        int k = (int) (Math.random() * n);
        int l = (int) (Math.abs(Math.random() * n - p.length()));

        System.out.println(k + "|" + l);
        System.out.println(p);

            for (int j = l; j < l + p.length(); j++) {
                if (s[k][l].equals(" ")) {
                    for (int m = l; m < l + p.length(); m++) {
                       s[k][m] = p.substring(x, x + 1);
                    x++; 
                    }
                } else {
                    break;
                }
            }
    }

    public static void mostrarSopa(String[][] s, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("---------------------------------------------------------------------------------");
            for (int j = 0; j < n; j++) {
                System.out.print(s[i][j] + " | ");
            }
            System.out.println("");
        }
    }
}
                    

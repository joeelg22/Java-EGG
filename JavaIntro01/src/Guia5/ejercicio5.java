/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Guia5;

/**Realice un programa que compruebe si una matriz dada es antisimétrica.
 * Se dice que una matriz A es antisimétrica cuando ésta es igual a su propia traspuesta, pero cambiada de signo. 
 * Es decir, A es antisimétrica si A = -AT.
 * La matriz traspuesta de una matriz A se denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
 *
 * @author cokit
 */
public class ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
        int[][] matriz = {{0, 2, -1}, {-2, 0, 4}, {1, -4, 0}}; // matriz de ejemplo
        if (esAntisimetrica(matriz)) {
            System.out.println("La matriz es antisimétrica");
        } else {
            System.out.println("La matriz no es antisimétrica");
        }
    }

    public static boolean esAntisimetrica(int[][] matriz) {
        int n = matriz.length; // tamaño de la matriz
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matriz[i][j] != -matriz[j][i]) { // condición de antisimetría
                    return false;
                }
            }
        }
        return true; // si no se encontró una violación de la condición de antisimetría, la matriz es antisimétrica
    }
}
  


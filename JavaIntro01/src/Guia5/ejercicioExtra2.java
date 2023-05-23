/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Guia5;

/**Escriba un programa que averigüe si dos vectores de N enteros son iguales 
 * (la comparación deberá detenerse en cuanto se detecte alguna diferencia entre los elementos).

 *
 * @author cokit
 */
public class ejercicioExtra2 {

    /**
     * @param vector1
     * @param vector2
     * @return 
     */
        // TODO code application logic here
       
    public static boolean sonIguales(int[] vector1, int[] vector2)  {
        // Verificar que los vectores tengan la misma longitud
        if (vector1.length != vector2.length) {
            return false;
        }
        // Comparar los elementos de ambos vectores
        for (int i = 0; i < vector1.length; i++) {
            if (vector1[i] != vector2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] vector1 = {1, 2, 3, 4, 5};
        int[] vector2 = {1, 2, 3, 4, 6};
        if (sonIguales(vector1, vector2)) {
            System.out.println("Los vectores son iguales.");
        } else {
            System.out.println("Los vectores son diferentes.");
        }
    }
} 
        


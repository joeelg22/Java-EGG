/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia3;

import java.util.Scanner;

/**
 *
 * @author cokit
 */
public class ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         String frase; //creamos la variable frase como cadena
        Scanner leer = new Scanner(System.in); // creamos el scanner
        System.out.println("Ingrese la frase, si comienza con A, sera correcto"); //pedimos la frase
        frase = leer.nextLine(); // guardamos lo que ingresamos en frase 
        if ("A".equals(frase.substring(0, 1))) { //condicional del equal en la primer letra usando substring
             System.out.println("frase correcta ! ");
       } else { // sino 
            System.out.println("frase incorrecta");
    }
    
}
}
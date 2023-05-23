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
public class ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         String frase; //creamos la variable frase como cadena
        Scanner leer = new Scanner(System.in); // creamos el scanner
        System.out.println("Ingrese la frase, debe tener solo 8 letras"); //pedimos la frase
        frase = leer.nextLine(); // guardamos lo que ingresamos en frase 
        if ( frase.length()== 8) { //condicional si la long de frase es igual a 8... (hay que importar la utilidad)
             System.out.println("la longitud es correcta ! ");
        } else { // sino 
            System.out.println("La longitud es incorrecta");
    }
    
}
}
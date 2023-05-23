/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Guia2;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

/**Escribir un programa que pida una frase y la muestre toda en mayúsculas
 *  y después toda en minúsculas. 
 *
 * @author cokit
 */
public class ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String frase; // creamos la variable frase
              Scanner leer = new Scanner(System.in); //creamos el scanner
              System.out.println("Ingrese la frase para convertir en mayuscula y minusculas !:"); //pedimos la frase
              frase = leer.nextLine(); //la guardamos, linea completa
             System.out.println(toUpperCase(frase)); // pedimos un sout(tab) que adentro tenga esa clase y que despues la dejamos importada 
             System.out.println(toLowerCase(frase)); // pedimos un sout(tab) que adentro tenga esa clase y que despues la dejamos importada
             
    }
    
}

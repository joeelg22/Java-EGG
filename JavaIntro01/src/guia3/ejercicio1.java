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
public class ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int num; // creamos la variable num
        Scanner leer = new Scanner(System.in); // creamos el scanner
        System.out.println("Ingrese el numero a analizar:"); //pedimos el numero por pantalla
        num = leer.nextInt(); //guardamos el valor del scanner leer en num
        if (num % 2 ==0 ) { //condicional: si num % (mod) 2 == (igual) a cero entonces...
System.out.println("El numero ingresado es par"); 
}else {  // si no 
System.out.println("El numero ingresado es impar");
}
    }
    
}

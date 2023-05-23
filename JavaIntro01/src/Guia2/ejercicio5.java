/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Guia2;

import java.util.Scanner;

/** Escribir un programa que lea un número entero por teclado y muestre por pantalla 
 * el doble, el triple y la raíz cuadrada de ese número.
 *
 * @author cokit
 */
public class ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num, resu; //creamos las variables enteras 
        double resuraiz; //creamos la variable de tipo real (double=real en pseint)
        Scanner leer = new Scanner(System.in); //hacemos el scanner para tomar los datos
        
        System.out.println("Ingrese el numeo a trabajar;");
        num = leer.nextInt();//el next tiene que albergar enteros, por eso es leer.nextInt
        resu = num * 2; // hacemos el doble
        System.out.println("El doble del numero ingresado es: "+ resu);
        resu = num * 3; // ahora el triple
          System.out.println("El triple del numero ingresado es: "+ resu);
    resuraiz = Math.sqrt(num); //la variable resuraiz SE OBTIENE usando este recurso
        System.out.println("La raiz del numero ingresado es: "+ resuraiz);
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Guia2;

import java.util.Scanner;

/**Escribir un programa que pida dos números enteros por teclado y calcule la suma de los dos. 
 * El programa deberá después mostrar el resultado de la suma
 *
 * @author cokit
 */
public class ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     int num1, num2, num3; // creamos las variables enteras
        Scanner leernum = new Scanner(System.in); //creamos el scanner
        System.out.print("Ingrese los dos numeros a sumar, por favor"); //pedimos los numeros sout+tab
        num1 = leernum.nextInt(); //cargamos num1
        num2 = leernum.nextInt(); //cargamos num2
        num3 = num1 + num2; //los sumamos
        System.out.println("El valor de la suma de los numeros ingresados es " + num3);//mostramos en pantalla
    }
    
}

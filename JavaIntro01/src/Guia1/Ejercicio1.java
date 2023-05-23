/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia1;

import java.util.Scanner;

/**
 *
 * @author cokit
 */
public class Ejercicio1 {
static Scanner leer = new Scanner(System.in); 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
     System.out.println("Ingrese dos valores");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        int suma = num1 + num2;
        
        System.out.println("La suma de los numeros es : " +  suma);
    }
    
}

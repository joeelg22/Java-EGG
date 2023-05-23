/*
Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar, restar, multiplicar y dividir.
La aplicación debe tener una función para cada operación matemática y deben devolver 
sus resultados para imprimirlos en el main. 
 */
package Guia4;

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
       Scanner input =new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        int nro1= input.nextInt();
        System.out.println("Ingrese el segundo numero");
        int nro2= input.nextInt();
        
        System.out.println("Elija una operacion para realizar");
          System.out.println("MENU\n"
                    + "1.Suma\n"
                    + "2.Resta\n"
                    + "3.Multiplicación\n"
                    + "4.División\n");
          
       int opcion = input.nextInt();
        
        switch(opcion){
            case 1 : sumar(nro1, nro2);
            break;
            case 2 : restar(nro1, nro2);
            break;
            case 3 : multiplicar(nro1, nro2);
            break;
            case 4 : dividir(nro1, nro2);
            break;        

    }
    
}
 public  static void sumar(int nro1, int nro2) {
        System.out.println("La suma es:"+(nro1+nro2));
    }

    public static void restar(int nro1, int nro2) {
       System.out.println("La resta es:"+(nro1-nro2));
    }

    private static void multiplicar(int nro1, int nro2) {
        System.out.println("El producto es:"+(nro1*nro2));
    }

    private static void dividir(int nro1, int nro2) {
        System.out.println("La division es:" +nro1/nro2);
    }
}
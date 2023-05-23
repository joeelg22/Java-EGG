/*
 * Dado un tiempo en minutos, calcular su equivalente en días y horas.
Por ejemplo, si el usuario ingresa 1600 minutos, 
el sistema debe calcular su equivalente: 1 día, 2 horas.

 */
package guia3;

import java.util.Scanner;

/**
 *
 * @author cokit
 */
public class ejercicioExtra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner leer = new Scanner (System.in);
   
        int min, dias, horas;
        
        System.out.println("Ingrese minutos a calcular");
        min = leer.nextInt();
        
        horas = min / 60;
        
        dias = horas / 24;
        horas = horas % 24;
        
        System.out.println(min + " minutos son " + dias + " dias y " + horas + " horas");
        
    }
    
}

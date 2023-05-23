
package Ejercicio02;

import Puntos.Puntos;

/**
 *
 * @author cokit
 */
public class Ejercicio02 {

   
    public static void main(String[] args) {
        Puntos p1 = new Puntos();
        
        p1.crearPuntos();
        p1.Distancia();
        System.out.println("La distancia entre punto 1 y 2 es de: " + p1.Distancia());
    }
    
}

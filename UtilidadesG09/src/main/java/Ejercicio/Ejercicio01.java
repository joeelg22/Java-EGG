

package Ejercicio;

import Entidades.Cadena;
import Servicio.CadenaServicio;

/**
 *
 * @author Joel Gonzalez 
 */
public class Ejercicio01 {

   
    public static void main(String[] args) {
        Cadena cadena = new Cadena("casa blanca");
        CadenaServicio servicio = new CadenaServicio(cadena);

        System.out.println("Cantidad de vocales: " + servicio.mostrarVocales());
        System.out.println("Frase invertida: " + servicio.invertirFrase());
        System.out.println("Cantidad de veces que se repite 'a': " + servicio.vecesRepetido("a"));
        System.out.println("La frase contiene 'x': " + servicio.contiene("x"));
        servicio.reemplazar("a", 'x');
        System.out.println("Frase reemplazando 'a' por 'x': " + cadena.getFrase());
       
    }

}

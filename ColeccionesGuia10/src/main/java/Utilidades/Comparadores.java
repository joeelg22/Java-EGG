
package Utilidades;

import Entidad.Pelicula;
import java.util.Comparator;

/**
 *
 * @author Joel Gonzalez 
 */
public class Comparadores {
 public static Comparator<Pelicula> ordenarPorDuracionAsc = new Comparator<Pelicula>() {
       
        public int compare(Pelicula o1, Pelicula o2) {
            return o1.getDuracion().compareTo(o2.getDuracion());
        }
    };

    public static Comparator<Pelicula> ordenarPorDuracionDesc = new Comparator<Pelicula>() {
      
        public int compare(Pelicula o1, Pelicula o2) {
            return o2.getDuracion().compareTo(o1.getDuracion());
        }
    };

    public static Comparator<Pelicula> ordenarPorTituloAlf = new Comparator<Pelicula>() {
       
        public int compare(Pelicula o1, Pelicula o2) {
            return o1.getTitulo().compareTo(o2.getTitulo());
        }
    };

    public static Comparator<Pelicula> ordenarPorDirectorAlf = new Comparator<Pelicula>() {
       
        public int compare(Pelicula o1, Pelicula o2) {
            return o1.getDirector().compareTo(o2.getDirector());
        }
    };
}



package Ejercicio;

import Service.PeliculaService;

/**
 *
 * @author Joel Gonzalez 
 */
public class Ejercicio04 {

   
    public static void main(String[] args) {
          PeliculaService peliService = new PeliculaService();
        peliService.crearPelicula();
        peliService.mostrarPeliculas();
    }

   

}

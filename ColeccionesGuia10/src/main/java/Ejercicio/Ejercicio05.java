

package Ejercicio;

import Service.PaisService;

/**
 *
 * @author Joel Gonzalez 
 */
public class Ejercicio05 {

   
    public static void main(String[] args) {
        PaisService paises = new PaisService();
        paises.cargarPaises();
        paises.eliminarPais();
        paises.mostrarOrdenado();
    }

}

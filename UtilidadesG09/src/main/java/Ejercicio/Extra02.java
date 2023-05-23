

package Ejercicio;

import Entidades.Ahorcado;
import Servicio.AhorcadoService;

/**
 *
 * @author Joel Gonzalez 
 */
public class Extra02 {

   
    public static void main(String[] args) {
       Ahorcado juego1 = new Ahorcado();
        AhorcadoService js = new AhorcadoService();

        js.juego(juego1);
        System.out.println(juego1.toString());

    }

}

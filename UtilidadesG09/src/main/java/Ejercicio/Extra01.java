

package Ejercicio;

import Entidades.MesSecreto;
import Servicio.MesSecretoServicio;

/**
 *
 * @author Joel Gonzalez 
 */
public class Extra01 {

   
    public static void main(String[] args) {
       MesSecreto juego1 = new MesSecreto();
        MesSecretoServicio js = new MesSecretoServicio();
        js.adivinarMes(juego1);
    }

}



package Ejercicio;

import Entidades.Persona;
import Servicio.PersonaService;

/**
 *
 * @author Joel Gonzalez 
 */
public class Ejercicio05 {

   
    public static void main(String[] args) {
       PersonaService fs = new PersonaService();
        Persona p1 = fs.crearPersona();
        System.out.println(p1.toString());
        System.out.println(fs.calculcarEdad(p1));
        System.out.println(fs.menorQue(p1, 30));
        fs.mostrarPersona(p1);
    }

}

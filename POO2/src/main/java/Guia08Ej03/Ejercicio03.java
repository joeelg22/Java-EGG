

package POO03;

import Entidad.Persona;
import Servicio.personaServicio;

/**
 *
 * @author Joel Gonzalez 
 */
public class Ejercicio03 {

   
   public static void main(String[] args) {
        personaServicio ps = new personaServicio();
        int[] imcResultados = new int[4];
        Persona[] persona = new Persona[4];
        boolean[] esMayorResultado = new boolean[4];

        for (int i = 0; i < 4; i++) {
            persona[i] = ps.crearPersona();
            imcResultados[i] = ps.calcularIMC(persona[i]);
            esMayorResultado[i] = ps.mayorDeEdad(persona[i]);
        }

        int pesoBajo = 0;
        int pesoIdeal = 0;
        int sobrepeso = 0;
        int porcentajeMayores = 0;

        for (int i = 0; i < 4; i++) {
            switch (imcResultados[i]) {
                case -1:
                    pesoBajo++;
                    break;
                case 0:
                    pesoIdeal++;
                    break;
                case 1:
                    sobrepeso++;
                    break;
            }

            if (esMayorResultado[i]) {
                porcentajeMayores++;
            }

        }

        System.out.println("El porcentaje de personas por debajo del peso ideal es: " + (pesoBajo / 4.0) * 100);
        System.out.println("El porcentaje de personas con el peso ideal es: " + (pesoIdeal / 4.0) * 100);
        System.out.println("El porcentaje de personas por encima del peso ideal es: " + (sobrepeso / 4.0) * 100);
        System.out.println("El porcentaje de personas mayores de edad es: " + (porcentajeMayores / 4.0) * 100);
        System.out.println("El porcentaje de personas por debajo del peso ideal es: " + ((4 - porcentajeMayores) / 4.0) * 100);
    }
}


package Ejercicio;

import Entidades.ParDeNumeros;
import Servicio.ParDeNumerosServicio;

/**
 *
 * @author Joel Gonzalez 
 */
public class Ejercicio02 {

   
    public static void main(String[] args) {
       
        //ParDeNumerosServicio ns = new ParDeNumerosServicio();
        
        ParDeNumeros numeropar = new ParDeNumeros();
      ParDeNumerosServicio.mostrarValores(numeropar);
      ParDeNumerosServicio.devolverMayor(numeropar);
      ParDeNumerosServicio.calcularPotencia(numeropar);
      ParDeNumerosServicio.calcularRaiz(numeropar);
      
              
    }

}

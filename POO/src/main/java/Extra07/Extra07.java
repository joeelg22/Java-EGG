
package Extra07;

import Ascensor.Ascensor;

/**
 *
 * @author cokit
 */
public class Extra07 {

  
    public static void main(String[] args) {
       
   Ascensor ascensor = new Ascensor(0,10);
         ascensor.subir();
         System.out.println("piso " + ascensor.pisoActual);
         ascensor.bajar();
         System.out.println("piso " + ascensor.pisoActual);
         ascensor.bajar();
         System.out.println("piso " + ascensor.pisoActual);
         ascensor.irA(6);
         System.out.println("Piso " + ascensor.pisoActual);
        
    }
    
}

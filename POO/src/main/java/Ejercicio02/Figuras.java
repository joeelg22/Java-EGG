
package figuras;

import figuras.Entidad.Circunferencia;


/**
 *
 * @author cokit
 */
public class Figuras {

   
    public static void main(String[] args) {
        
        Circunferencia c1 = new Circunferencia();
        System.out.println("Circunferencia...:");
        c1.crearCircunferencia();
        System.out.println("Area...:" + c1.Area());
        System.out.println("Perimetro...:" + c1.perimetro());

    }
    
}



package POO02;

import Entidad.Cafetera;
import Servicio.CafeteraServicio;

/**
 *
 * @author Joel Gonzalez 
 */
public class Ejercicio02 {

   
    public static void main(String[] args) {
       
        CafeteraServicio cfs =new CafeteraServicio();
        
        Cafetera cf = new Cafetera(30,0);
        cfs.llenarCafetera(cf);
        cfs.servirTaza(cf);
        cfs.vaciarCafetera(cf);
        cfs.agregarCafe(cf);
        
        
    }

}

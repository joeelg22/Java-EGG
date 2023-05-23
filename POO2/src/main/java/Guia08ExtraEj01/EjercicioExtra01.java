

package POOExtra01;

import Entidad.Raices;
import Servicio.RaicesServicio;

/**
 *
 * @author Joel Gonzalez 
 */
public class EjercicioExtra01 {

   
    public static void main(String[] args) {
       
        RaicesServicio rs = new RaicesServicio();
        Raices raiz = new Raices(2, 4, 2);
        rs.calcular(raiz);
    }

}

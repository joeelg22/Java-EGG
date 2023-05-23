package POOExtra03;

import Entidad.NIF;
import Servicio.NIFService;

/**
 *
 * @author Joel Gonzalez
 */
public class EjercicioExtra02 {

    public static void main(String[] args) {
        NIFService nifs = new NIFService();
        NIF nif = new NIF();
        nifs.crearNif(nif);
        nifs.mostrar(nif);

    }
}

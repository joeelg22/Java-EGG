
package Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos
usaremos un conjunto. El programa pedirá un país en un bucle, se guardará el país en el
conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir,
si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer
los servicios en la clase correspondiente)
Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
cómo se ordena un conjunto.
Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
al usuario.
 *
 * @author Joel Gonzalez 
 */
public class PaisService {
  private Scanner leer;
    private HashSet<String> paises;

    public PaisService() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.paises = new HashSet<>();
    }

    public void cargarPaises() {
        String opcion;
        do {
            System.out.println("Ingrese el nombre de un país");
            paises.add(leer.next());
            System.out.println("¿Desea añadir otro pais? (S/N)");
            opcion = leer.next();

            while (!opcion.equalsIgnoreCase("s") && !opcion.equalsIgnoreCase("n")) {
                System.out.println("Ha ingresado una opcion incorrecta. Escriba S o N");
                System.out.println("¿Desea añadir otro pais? (S/N)");
                opcion = leer.next();
            }
        } while (opcion.equalsIgnoreCase("S"));

        System.out.println("Los paises cargados en la lista son: ");
        for (String aux : paises) {
            System.out.println(aux);
        }
    }

    public void mostrarOrdenado() {
        ArrayList<String> paisesOrdenados = new ArrayList<>(paises);
        Collections.sort(paisesOrdenados);

        System.out.println("Los paises cargados en la lista son: ");
        for (String aux : paisesOrdenados) {
            System.out.println(aux);
        }
    }

    public void eliminarPais() {
        Iterator it = paises.iterator();
        boolean encontrado = false;

        System.out.println("Escriba el pais que desea eliminar");
        String pais = leer.next();

        while (it.hasNext()) {
            if (it.next().equals(pais)) {
                it.remove();
                System.out.println("El pais se ha eliminado correctamente");
                encontrado = true;
                break;
            }
        }
        if (encontrado) {
            System.out.println("Los paises que quedan en la lista son: ");
            for (String aux : paises) {
                System.out.println(aux);
            }
        }
        if (!encontrado) {
            System.out.println("El pais ingresado no se encuentra en la lista de paises");
        }
    }
}

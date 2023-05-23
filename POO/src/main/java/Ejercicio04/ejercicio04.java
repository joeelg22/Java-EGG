package ejercicio04;

import RECTANGULO.Rectangulo;

/**
 *
 * @author cokit
 */
public class ejercicio04 {

    public static void main(String[] args) {
        Rectangulo rectangulo = new Rectangulo();
        rectangulo.crearRectangulo();
        System.out.println("La superficie es: " + rectangulo.superficie());
        System.out.println("El perimetro es: " + rectangulo.perimetro());
        rectangulo.dibujarRectangulo();

    }

}

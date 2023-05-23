package Extra06;

import ExtraRectangulo.Rectangulo;

/**
 *
 * @author cokit
 */
public class Extra06 {

    
    public static void main(String[] args) {
       Rectangulo rectangulo = new Rectangulo();
        Rectangulo rectangulo1 = new Rectangulo(4, 6);
        Rectangulo rectangulo3 = new Rectangulo();

        rectangulo.rellenarC();
        System.out.println("El area del rectangulo es: " + rectangulo.calcular_area());

        System.out.println("El area del rectangulo es: " + rectangulo1.calcular_area());
        System.out.println("  ");
        rectangulo3.rellenarC();
        System.out.println("El area del rectangulo es : "+ rectangulo3.calcular_area());
    }
}

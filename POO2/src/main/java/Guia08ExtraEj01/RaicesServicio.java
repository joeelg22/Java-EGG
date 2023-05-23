package Servicio;

import Entidad.Raices;

/**
 * Vamos a realizar una clase llamada Raices, donde representaremos los valores
 * de una ecuación de 2º grado. Tendremos los 3 coeficientes como atributos,
 * llamémosles a, b y c. Hay que insertar estos 3 valores para construir el
 * objeto a través de un método constructor. Luego, en RaicesServicio las
 * operaciones que se podrán realizar son las siguientes: Método
 * getDiscriminante(): devuelve el valor del discriminante (double). El
 * discriminante tiene la siguiente fórmula: (b^2)-4*a*c Método tieneRaices():
 * devuelve un booleano indicando si tiene dos soluciones, para que esto ocurra,
 * el discriminante debe ser mayor o igual que 0. Método tieneRaiz(): devuelve
 * un booleano indicando si tiene una única solución, para que esto ocurra, el
 * discriminante debe ser igual que 0. Método obtenerRaices(): llama a
 * tieneRaíces() y si devolvió́ true, imprime las 2 posibles soluciones. Método
 * obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única
 * raíz. Es en el caso en que se tenga una única solución posible. Método
 * calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará
 * por pantalla las posibles soluciones que tiene nuestra ecuación con los
 * métodos obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros
 * métodos y en caso de no existir solución, se mostrará un mensaje. Nota:
 * Fórmula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varía el signo
 * delante de -b
 *
 *
 * @author Joel Gonzalez
 */
public class RaicesServicio {

    private Raices raices = new Raices();

    public double getDiscriminante(Raices raices) {
        return Math.pow(raices.getB(), 2) - (4 * raices.getA() * raices.getC());
    }

    public boolean tieneRaices(Raices raices) {
        // System.out.println("Tiene dos soluciones");
        return getDiscriminante(raices) > 0;
    }

    public boolean tieneRaiz(Raices raices) {
        //System.out.println("Tiene una solucion");
        return getDiscriminante(raices) == 0;
    }

    public void obtenerRaices(Raices raices) {
        boolean raiz = tieneRaices(raices);
        double x1, x2;
        if (raiz = true) {
            x1 = (-raices.getB() + Math.sqrt(getDiscriminante(raices))) / (2 * raices.getA());
            x2 = (-raices.getB() - Math.sqrt(getDiscriminante(raices))) / (2 * raices.getA());
            System.out.println("Las dos raices son: x1 =  " + x1 + " y x2 = " + x2);
        }
    }

    public void obtenerRaiz(Raices raices) {
        boolean raiz = tieneRaiz(raices);
        double x1;
        if (raiz = true) {
            x1 = -raices.getB() / (2 * raices.getA());
            System.out.println("La raiz es = " + x1);
        }
    }

    public void calcular(Raices raices) {
        if (tieneRaices(raices)) {
            obtenerRaices(raices);
        } else if (tieneRaiz(raices)) {
            obtenerRaiz(raices);
        } else {
            System.out.println("No tiene solucion");
        }
    }
}

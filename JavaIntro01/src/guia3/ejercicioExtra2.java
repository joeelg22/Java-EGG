/*
 * Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada una. 
A continuación, realizar las instrucciones necesarias para que:
B tome el valor de C, C tome el valor de A, A tome el valor de D y D tome el valor de B.
Mostrar los valores iniciales y los valores finales de cada variable.
Utilizar sólo una variable auxiliar.
 */
package guia3;

/**
 *
 * @author cokit
 */
public class ejercicioExtra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int A,B,C,D, aux;
        A = 10;
        B = 5;
        C = 12;
        D = 2;
        aux = B;
        System.out.println("Valores iniciales");
        System.out.println(A + " \n"
                + B + "\n"
                + C + "\n"
                + D + "");
        A = D;
        B = C;
        C = A;
        D = aux;
        System.out.println("Valores finales");
        System.out.println(A + " \n"
                + B + "\n"
                + C + "\n"
                + D + "");
    }
    
}

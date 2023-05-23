
package ejercicio3;

import ejercicio3.entidades.Operacion;


public class Ejercicio3 {

   
    public static void main(String[] args) {
        Operacion calculadora = new Operacion();
        
        calculadora.crearOperacion();
        System.out.println("La suma de los numeros es:  " + calculadora.sumar());
        System.out.println("La resta de los numeros es:  " + calculadora.restar());
        System.out.println("La multiplicacion de los numeros es:  " + calculadora.multiplicar());
        System.out.println("La division de los numeros es:  " + calculadora.dividir());
    }
    
}

package Servicio;

import Entidades.ParDeNumeros;

/**
 * Método mostrarValores que muestra cuáles son los dos números guardados.
 * Método devolverMayor para retornar cuál de los dos atributos tiene el mayor
 * valor Método calcularPotencia para calcular la potencia del mayor valor de la
 * clase elevado al menor número. Previamente se deben redondear ambos valores.
 * Método calculaRaiz, para calcular la raíz cuadrada del menor de los dos
 * valores. Antes de calcular la raíz cuadrada se debe obtener el valor absoluto
 * del número.
 *
 *
 * @author Joel Gonzalez
 */
public class ParDeNumerosServicio {

    ParDeNumeros numeros = new ParDeNumeros();
// * Método mostrarValores que muestra cuáles son los dos números guardados.

    public static void mostrarValores(ParDeNumeros numeros) {
        System.out.println("El num 1 es " + numeros.getNum1());
        System.out.println("El num 2 es " + numeros.getNum2());
    }
//Método devolverMayor para retornar cuál de los dos atributos tiene el mayor valor
    public static int devolverMayor(ParDeNumeros numeros) {
        int mayor;
        mayor = Math.max(numeros.getNum1(), numeros.getNum2());
        System.out.println("El numeros mayor es " + mayor);
        return mayor;
       
    }
    //Método calcularPotencia para calcular la potencia del mayor valor de la
 //clase elevado al menor número. Previamente se deben redondear ambos valores.
    public static void calcularPotencia(ParDeNumeros numeros){
        int minimo;
        int result;
        
        minimo = Math.min(numeros.getNum1(), numeros.getNum2());
        result = (int) Math.pow(Math.round(devolverMayor(numeros)), Math.round(minimo));
        System.out.println("La potencia del numero mayor es " + result);
        
    }
   //* Método calculaRaiz, para calcular la raíz cuadrada del menor de los dos valores. 
    //Antes de calcular la raíz cuadrada se debe obtener el valor absolutodel número.
    
    public static void calcularRaiz(ParDeNumeros numeros){
        int  minimo = Math.abs(Math.min(numeros.getNum1(), numeros.getNum2()));
       double raiz = (int) Math.sqrt(minimo);
        System.out.println("La raiz del minimo es " + minimo);
    }
   
}

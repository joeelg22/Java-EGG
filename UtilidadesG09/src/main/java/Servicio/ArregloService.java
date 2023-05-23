
package Servicio;

import java.util.Arrays;
import java.util.Random;


public class ArregloService {
    //Método inicializarA recibe un arreglo por parámetro y lo inicializa con números aleatorios.
    public static void inicializarA(int[] arregloA){
        Random random = new Random();
        for (int i = 0; i < arregloA.length; i++) {
            arregloA[i] = random.nextInt(50);
        }
    }
    //Método mostrar recibe un arreglo por parámetro y lo muestra por pantalla.
    public static void MostrarArreglo(int[] arreglo){
        System.out.println(Arrays.toString(arreglo));
    }
    //Método ordenar recibe un arreglo por parámetro y lo ordena de mayor a menor.
    public static void OrdenarArreglo(int[] arreglo) {
        System.out.println("Soort");
        Arrays.sort(arreglo);
        MostrarArreglo(arreglo);
        
        for (int i = arreglo.length - 1; i >= 0; i--) {
            
            System.out.print("[ " + arreglo[i]);
            
        }
    }
        
        //Método inicializarB copia los primeros 10 números del arreglo A en el arreglo B. Luego llenar las últimas 10 posiciones 
        //del arreglo B con 0.5.
        
        public static void InicializarB(int[] arregloA, int[] arregloB){
        
                System.arraycopy(arregloA, 0, arregloB, 0, 10);
                Arrays.fill(arregloB, 10,20, (int)0.5);
                for (int i = 0; i < arregloB.length; i++) {
                    System.out.print("[ " + arregloB[i]);
            }
        }
            
}
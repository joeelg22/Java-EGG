
package Servicio;

import Entidades.Ahorcado;
import java.util.Arrays;
import java.util.Scanner;

/**Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá contener como atributos, un vector con la palabra a buscar, la cantidad de letras encontradas y la cantidad jugadas máximas que puede realizar el usuario. Definir los siguientes métodos en AhorcadoService:
Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima. Con la palabra del usuario, pone la longitud de la palabra, como la longitud del vector. Después ingresa la palabra en el vector, letra por letra, quedando cada letra de la palabra en un índice del vector. Y también, guarda la cantidad de jugadas máximas y el valor que ingresó el usuario.
Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota: buscar como se usa el vector.length.
Método buscar(letra):  este método recibe una letra dada por el usuario y busca si la letra ingresada es parte de la palabra o no. También informará si la letra estaba o no.
Método encontradas(letra):  que reciba una letra ingresada por el usuario y muestre cuantas letras han sido encontradas y cuántas le faltan. Este método además deberá devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez que se busque una letra que no esté, se le restará uno a sus oportunidades.
Método intentos(): para mostrar cuántas oportunidades le queda al jugador.
Método juego(): el método juego se encargará de llamar todos los métodos previamente mencionados e informará cuando el usuario descubra toda la palabra o se quede sin intentos. Este método se llamará en el main.
Un ejemplo de salida puede ser así:
Ingrese una letra:
a
Longitud de la palabra: 6
Mensaje: La letra pertenece a la palabra
Número de letras (encontradas, faltantes): (3,4)
Número de oportunidades restantes: 4
----------------------------------------------
Ingrese una letra:
z
Longitud de la palabra: 6
Mensaje: La letra no pertenece a la palabra
Número de letras (encontradas, faltantes): (3,4)
Número de oportunidades restantes: 3
---------------------------------------------
Ingrese una letra:
b
Longitud de la palabra: 6
Mensaje: La letra no pertenece a la palabra
Número de letras (encontradas, faltantes): (4,3)
Número de oportunidades restantes: 2
----------------------------------------------
Ingrese una letra:
u
Longitud de la palabra: 6
Mensaje: La letra no pertenece a la palabra
Número de letras (encontradas, faltantes): (4,3)
Número de oportunidades restantes: 1
----------------------------------------------
Ingrese una letra:
q
Longitud de la palabra: 6
Mensaje: La letra no pertenece a la palabra
Mensaje: Lo sentimos, no hay más oportunidades

 *
 * @author Joel Gonzalez 
 */
public class AhorcadoService {
 Scanner leer = new Scanner(System.in).useDelimiter("\n");

    //Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima. Con la palabra del usuario, pone la longitud de la palabra, como la longitud del vector. Después ingresa la palabra en el vector, letra por letra, quedando cada letra de la palabra en un índice del vector. Y también, guarda la cantidad de jugadas máximas y el valor que ingresó el usuario.
    public void crearJuego(Ahorcado juego1) {

        System.out.println("Ingrese la palabra secreta: ");
        String palabra = leer.next();
        System.out.println("Ingrese la cantidad de intentos que tendrá el jugador: ");
        juego1.setCantidadJugadas(leer.nextInt());

        String[] letra = new String[palabra.length()];

        for (int i = 0; i < palabra.length(); i++) {
            letra[i] = String.valueOf(palabra.charAt(i));

        }
        juego1.setPalabra(letra);
        System.out.println("Comienza el juego. Usted tiene " + juego1.getCantidadJugadas() + " intentos");
    }
    //Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota: buscar como se usa el vector.length.
    public int longitud(Ahorcado juego) {
        String[] palabra = juego.getPalabra();
        return palabra.length;
    }
  //  Método buscar(letra):  este método recibe una letra dada por el usuario y busca si la letra ingresada es parte de la palabra o no. También informará si la letra estaba o no.
    //Método encontradas(letra):  que reciba una letra ingresada por el usuario y muestre cuantas letras han sido encontradas y cuántas le faltan. Este método además deberá devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez que se busque una letra que no esté, se le restará uno a sus oportunidades.

    public boolean buscar(String letra, Ahorcado juego) {

        boolean letraEncontrada = false;
        String[] palabra = juego.getPalabra();
        System.out.println("Longitud de la palabra: " + palabra.length);
     for (String palabra1 : palabra) {
         if (letra.equalsIgnoreCase(palabra1)) {
             letraEncontrada = true;
             juego.setCantidadLetras(juego.getCantidadLetras() + 1);
             break;
         }
     }
        if (letraEncontrada) {
            System.out.println("La letra pertenece a la palabra");
        } else {
            System.out.println("La letra NO pertenece a la palabra");
            juego.setCantidadJugadas(juego.getCantidadJugadas() - 1);
        }
        return letraEncontrada;
    }
    //Método intentos(): para mostrar cuántas oportunidades le queda al jugador.
    public int intentos(Ahorcado juego) {
        return juego.getCantidadJugadas();
    }
    //Método juego(): el método juego se encargará de llamar todos los métodos previamente mencionados e informará cuando el usuario descubra toda la palabra o se quede sin intentos. Este método se llamará en el main.

    public void juego(Ahorcado juego1) {
        crearJuego(juego1);
        do {
            System.out.println("Ingrese una letra: ");
            String letra = leer.next();
            System.out.println("Longitud de la palabra: " + longitud(juego1));
            buscar(letra, juego1);
            System.out.println("Numeros de letras (encontradas, faltantes): " + juego1.getCantidadLetras() + "/" + (longitud(juego1) - juego1.getCantidadLetras()));
            System.out.println("Numero de oportunidades restantes: " + juego1.getCantidadJugadas());

            if (juego1.getCantidadLetras() == longitud(juego1)) {
                System.out.println("¡Felicidades! Has adivinado todas las letras de la palabra.");
                break;
            }

            if (juego1.getCantidadJugadas() == 0) {
                System.out.println("Lo siento, has perdido. La palabra secreta era: " + Arrays.toString(juego1.getPalabra()));
                break;
            }

        } while (true);
    }
}

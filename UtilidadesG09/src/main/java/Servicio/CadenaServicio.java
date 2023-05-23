
package Servicio;

import Entidades.Cadena;
import java.util.Scanner;

/** Crear una clase CadenaServicio en el paquete servicios que implemente los siguientes métodos:
Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase ingresada.
Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. 
* Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y contabilizar
* cuántas veces se repite el carácter en la frase, por ejemplo:
Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
Método compararLongitud(String frase), deberá comparar la longitud de la frase que compone la clase con otra nueva frase 
* ingresada por el usuario.
Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con una nueva frase ingresada por el 
* usuario y mostrar la frase resultante.
Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se encuentren en la frase,
* por algún otro carácter seleccionado por el usuario y mostrar la frase resultante.
Método contiene(String letra), deberá comprobar si la frase contiene una letra que ingresa el usuario y devuelve
* verdadero si la contiene y falso si no.

 *
 * @author Joel Gonzalez 
 */
public class CadenaServicio {
 private Cadena cadena;

    public CadenaServicio(Cadena cadena) {
        this.cadena = cadena;
    }

    public int mostrarVocales() {
        String frase = cadena.getFrase();
        int contador = 0;
        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
                    || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                contador++;
            }
        }
        return contador;
    }

    public String invertirFrase() {
        String frase = cadena.getFrase();
        StringBuilder sb = new StringBuilder(frase);
        return sb.reverse().toString();
    }

    public int vecesRepetido(String letra) {
        String frase = cadena.getFrase();
        int contador = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == letra.charAt(0)) {
                contador++;
            }
        }
        return contador;
    }

    public boolean contiene(String letra) {
        String frase = cadena.getFrase();
        return frase.contains(letra);
    }

    public void reemplazar(String letra, char reemplazo) {
        String frase = cadena.getFrase();
        frase = frase.replace(letra, Character.toString(reemplazo));
        cadena.setFrase(frase);
    }

    public void unirFrases(String frase) {
        String fraseActual = cadena.getFrase();
        cadena.setFrase(fraseActual + " " + frase);
    }

    public boolean compararLongitud(String frase) {
        Scanner leer = new Scanner(System.in);        
        System.out.println("Ingrese frase nueva");
        String nueva =leer.nextLine();
        
        return cadena.getLongitud() == frase.length();
    }
}

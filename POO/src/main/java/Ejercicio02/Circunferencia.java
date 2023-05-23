
package figuras.Entidad;

import java.util.Scanner;

/**Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de tipo real. 
 * A continuación, se deben crear los siguientes métodos:
Método constructor que inicialice el radio pasado como parámetro.
Métodos get y set para el atributo radio de la clase Circunferencia.
Método para crearCircunferencia(): que le pide el radio y lo guarda  en el atributo del objeto.
Método area(): para calcular el área de la circunferencia (Area=〖π*radio〗^2).
Método perimetro(): para calcular el perímetro (Perimetro=2*π*radio).

 *
 * @author cokit
 */
public class Circunferencia {

    private double radio;

    public Circunferencia(double radio) {
        this.radio = radio;
        //this es la misma variable del atributo
    }

    public Circunferencia() {
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void crearCircunferencia() {
        System.out.println("");
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el Radio de la circunferencia: ");
        radio = leer.nextDouble();
    }
    
    public double Area() {
        double area = Math.PI * Math.pow(radio,2);
        return area;
    }
    
    public double perimetro() {
        double perimetro = 2*Math.PI*radio;
        return perimetro;
    
    }

}


package Servicio;

import Entidad.Persona;
import java.util.Scanner;

/**Realizar una clase llamada Persona en el paquete de entidades que tengan los siguientes atributos: nombre, edad, sexo (‘H’ para hombre, ‘M’ para mujer, ‘O’ para otro), peso y altura. Si desea añadir algún otro atributo, puede hacerlo. Agregar constructores, getters y setters.
En el paquete Servicios crear PersonaServicio con los siguientes 3 métodos:
Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve un booleano.
Metodo crearPersona(): el método crear persona, le pide los valores de los atributos al usuario y después se le asignan a sus respectivos atributos para llenar el objeto Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o O. Si no es correcto se deberá mostrar un mensaje

Método calcularIMC(): calculara si la persona está en su peso ideal (peso en kg/(altura^2 en mt2)). 
* Si esta fórmula da por resultado un valor menor que 20, significa que la persona está por debajo de su peso ideal y 
* la función devuelve un -1. Si la fórmula da por resultado un número entre 20 y 25 (incluidos), 
* significa que la persona está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la función devuelve un 1.
A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal, tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la persona es mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en distintas variables(arrays), para después calcular un porcentaje de esas 4 personas cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores. Para esto, podemos crear unos métodos adicionales.

 *
 * @author Joel Gonzalez 
 */
public class personaServicio {

    public Persona crearPersona(){
        Scanner leer = new Scanner(System.in);        
        System.out.println("Ingrese su nombre: "); 
        String nombre= leer.next();
         System.out.println("Ingrese su Edad: "); 
       int edad= leer.nextInt();
        System.out.println("Ingrese su sexo: H/M/O ");
        char sexo=leer.next().toUpperCase().charAt(0);
        while(sexo !='H' && sexo !='M' && sexo !='O'){
            System.out.println("Caracter incorrecto, Ingrese nuevamente.");
            sexo=leer.next().toUpperCase().charAt(0);
        }
        
         System.out.println("Ingrese su peso: "); 
       double peso= leer.nextDouble();
         System.out.println("Ingrese su altura: "); 
      double altura= leer.nextDouble();
       
      
      return new Persona(nombre, edad, sexo, peso, altura);
      
    }
    
    public boolean mayorDeEdad(Persona ps){
        return ps.getEdad()>=18;
        
    }
    
    public int calcularIMC(Persona ps){
        double imc = ps.getPeso()/Math.pow(ps.getAltura(), 2);
            if(imc<20){
                return -1;
            }  else if(imc >=20 && imc <=25)  {
                return 0;
            }else{
                return 1;
            }
               
        
        
    }
}

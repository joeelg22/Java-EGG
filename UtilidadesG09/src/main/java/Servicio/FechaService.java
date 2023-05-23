
package Servicio;

/**Vamos a usar la clase Date que ya existe en Java. Crearemos la clase FechaService,
 * en paquete Servicios, que tenga los siguientes métodos:
Método fechaNacimiento que pregunte al usuario día, mes y año de su nacimiento. 
* Luego los pase por parámetro a un nuevo objeto Date. El método debe retornar el objeto Date. 
* Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Método fechaActual que cree un objeto fecha con el día actual.
* Para esto usaremos el constructor vacío de la clase Date. Ejemplo: Date fechaActual = new  Date();
El método debe retornar el objeto Date.
Método diferencia que reciba las dos fechas por parámetro y retorna la diferencia de años entre una y otra (edad del usuario).
 *
 * @author Joel Gonzalez 
 */
import java.util.Date;

import java.util.Scanner;

public class FechaService {
    public Date fechaNacimiento() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, ingrese el día de su nacimiento:");
        int dia = scanner.nextInt();
        System.out.println("Por favor, ingrese el mes de su nacimiento (1-12):");
        int mes = scanner.nextInt() - 1;
        System.out.println("Por favor, ingrese el año de su nacimiento:");
        int anio = scanner.nextInt() - 1900;

        return new Date(anio, mes, dia);
    }

    public Date fechaActual() {
        return new Date();
    }

    public int difAños(Date fechaNac, Date fechaAct) {
        /*int edad = 0;
        if (fechaAct.getMonth() > fechaNac.getMonth()) {
            edad = fechaAct.getYear()-fechaNac.getYear();
        }
        if (fechaAct.getMonth() < fechaNac.getMonth()) {
            edad = (fechaAct.getYear()-fechaNac.getYear())-1;
        }
        if (fechaAct.getMonth() == fechaNac.getMonth()){
            if (fechaAct.getDay() == fechaNac.getDay()){
                edad = fechaAct.getYear()-fechaNac.getYear();
            }
            else if (fechaAct.getDay() <= fechaNac.getDay()) {
                edad = (fechaAct.getYear()-fechaNac.getYear())-1;
            }
            else {
                edad = fechaAct.getYear()-fechaNac.getYear();
            }
        }
        return edad;
    }*/
        long milisegundosPorAnio = 1000L * 60 * 60 * 24 * 365;
        long diferenciaMilisegundos = fechaAct.getTime() - fechaNac.getTime();
        int edad = (int) (diferenciaMilisegundos / milisegundosPorAnio);

        return edad;
    }
}
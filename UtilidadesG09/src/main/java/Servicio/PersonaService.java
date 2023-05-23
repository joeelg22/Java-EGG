package Servicio;

import Entidades.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 * Implemente la clase Persona en el paquete entidades. Una persona tiene un
 * nombre y una fecha de nacimiento (Tipo Date), constructor vacío, constructor
 * parametrizado, get y set. Crear una clase PersonaService, en el paquete
 * servicio, con los siguientes métodos: Método crearPersona que pida al usuario
 * Nombre y fecha de nacimiento de la persona a crear. Retornar el objeto
 * Persona creado. Método calcularEdad que calcule la edad del usuario
 * utilizando el atributo de fecha de nacimiento y la fecha actual. Método
 * menorQue recibe como parámetro una Persona y una edad. Retorna true si la
 * persona es menor que la edad consultada o false en caso contrario. Método
 * mostrarPersona que muestra la información de la persona deseada.
 *
 *
 * @author Joel Gonzalez
 */
public class PersonaService {
 public Persona crearPersona() {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Escriba su nombre");
        String nombre = leer.next();
        System.out.println("Por favor, ingrese el día de su nacimiento:");
        int dia = leer.nextInt();
        System.out.println("Por favor, ingrese el mes de su nacimiento (1-12):");
        int mes = leer.nextInt() - 1;
        System.out.println("Por favor, ingrese el año de su nacimiento:");
        int anio = leer.nextInt() - 1900;
        Date fechaNac = new Date(anio, mes, dia);
        return new Persona(nombre, fechaNac);
    }

    public int calculcarEdad(Persona persona) {

        Date fechaActual = new Date();
        return difAños(persona.getFechaNacimiento(), fechaActual);
    }

    public int difAños(Date fechaNac, Date fechaAct) {

        long milisegundosPorAnio = 1000L * 60 * 60 * 24 * 365;
        long diferenciaMilisegundos = fechaAct.getTime() - fechaNac.getTime();
        int edad = (int) (diferenciaMilisegundos / milisegundosPorAnio);

        return edad;
    }

    public boolean menorQue(Persona persona, int edad) {
        int edadPersona = calculcarEdad(persona);
        return edadPersona < edad;
    }

    public void mostrarPersona(Persona persona) {
        System.out.println("Nombre: " + persona.getName());
        System.out.println("Fecha de nacimiento: " + persona.getFechaNacimiento());
    }
}

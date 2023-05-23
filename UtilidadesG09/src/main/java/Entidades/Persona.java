package Entidades;

import java.util.Date;

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
public class Persona {

    private String name;
    private Date fechaNacimiento;

    public Persona() {
    }

    public Persona(String name, Date fechaNacimiento) {
        this.name = name;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

   
    public String toString() {
        return "Persona{"
                + "name='" + name + '\''
                + ", fechaNacimiento=" + fechaNacimiento
                + '}';
    }
}

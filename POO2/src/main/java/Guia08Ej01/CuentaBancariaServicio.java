package Servicio;

import Entidad.CuentaBancaria;
import java.util.Scanner;

/**
 * Realizar una clase llamada CuentaBancaria en el paquete Entidades con los
 * siguientes atributos: numeroCuenta(entero), dniCliente(entero largo),
 * saldoActual. Agregar constructor vacío, con parámetros, getters y setters.
 * Agregar la clase CuentaBancariaServicio en el paquete Servicios que contenga:
 * Método para crear cuenta pidiéndole los datos al usuario. Método
 * ingresar(double): recibe una cantidad de dinero a ingresar y se le sumará al
 * saldo actual. Método retirar(double): recibe una cantidad de dinero a retirar
 * y se le restara al saldo actual. Si la cuenta no tiene la cantidad de dinero
 * a retirar se retirará el máximo posible hasta dejar la cuenta en 0. Método
 * extraccionRapida: le permitirá sacar solo un 20% de su saldo. Validar que el
 * usuario no saque más del 20%. Método consultarSaldo: permitirá consultar el
 * saldo disponible en la cuenta. Método consultarDatos: permitirá mostrar todos
 * los datos de la cuenta.
 *
 * @author Joel Gonzalez
 *
 * Scanner leer = new Scanner(System.in).useDelimiter("\n");
 */
public class CuentaBancariaServicio {

    CuentaBancaria cuenta = new CuentaBancaria();
    Scanner leer = new Scanner(System.in);

    public void crearCuenta() {
        System.out.println("Ingrese su cuenta");
        cuenta.setNumeroCuenta(leer.nextInt());
        System.out.println("Ingrese su Dni");
        cuenta.setDniCliente(leer.nextLong());

    }

    public void ingresarDinero() {
        double ingreso;
        System.out.println("Cuanto dinero ingresara?");
        ingreso = leer.nextDouble();
        cuenta.setSaldoActual(cuenta.getSaldoActual() + ingreso);

    }

    public void retirarDinero() {
        double retiro;

        System.out.println("Cuanto dinero desea retirar?");
        retiro = leer.nextDouble();
        if (cuenta.getSaldoActual() > retiro) {

            cuenta.setSaldoActual(cuenta.getSaldoActual() - retiro);
        } else {
            System.out.println("Saldo insuficiente para el retiro =(");
            System.out.println("Saldo entregado: " + cuenta.getSaldoActual());
            cuenta.setSaldoActual(0);
        }

    }

    public void extraccionRapida() {
        double rapida = cuenta.getSaldoActual() * 0.2;
        double retiraR;
        System.out.println("cuando va a retirar de extraccion rapida?");
        retiraR = leer.nextDouble();
        if (rapida > retiraR) {
            System.out.println("el dinero fue retirado con exito: " + retiraR);
        } else {
            System.out.println("solo se entrega el 20% : " + rapida);
        }

    }

    public void consultarSaldo() {
        System.out.println("su saldo es: " + cuenta.getSaldoActual());

    }

    public void consultarDatos() {
        System.out.println("sus datos son numero de cuenta: " + cuenta.getNumeroCuenta());
        System.out.println("numero de dni:" + cuenta.getDniCliente());
    }

    public void resumen() {
        crearCuenta();
        ingresarDinero();
        retirarDinero();
        extraccionRapida();
        consultarSaldo();
        consultarDatos();

    }

}

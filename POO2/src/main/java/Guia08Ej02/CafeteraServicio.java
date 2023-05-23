package Servicio;

import Entidad.Cafetera;
import java.util.Scanner;

/**
 * Programa Nespresso. Desarrolle una clase Cafetera en el paquete Entidades con
 * los atributos capacidadMáxima (la cantidad máxima de café que puede contener
 * la cafetera) y cantidadActual (la cantidad actual de café que hay en la
 * cafetera). Agregar constructor vacío y con parámetros así como setters y
 * getters. Crear clase CafeteraServicio en el paquete Servicios con los
 * siguiente: 
 * Método llenarCafetera(): hace que la cantidad actual sea igual a
 * la capacidad máxima. 
 * Método servirTaza(int): se pide el tamaño de una taza
 * vacía, el método recibe el tamaño de la taza y simula la acción de servir la
 * taza con la capacidad indicada. Si la cantidad actual de café “no alcanza”
 * para llenar la taza, se sirve lo que quede. El método le informará al usuario
 * si se llenó o no la taza, y de no haberse llenado en cuanto quedó la taza.
 * Método vaciarCafetera(): pone la cantidad de café actual en cero. 
 * Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
 * recibe y se añade a la cafetera la cantidad de café indicada.
 *
 *
 * @author Joel Gonzalez
 */
public class CafeteraServicio {

 private   Scanner leer = new Scanner(System.in);    
 
    public void llenarCafetera(Cafetera cf){
        
        cf.setCantidadActual(cf.getCapacidadMaxima());
    }
    
    public void servirTaza(Cafetera cf){
        System.out.println("Ingrese el tamaño de la taza");
        int taza= leer.nextInt();
        if (cf.getCantidadActual()>taza){
            cf.setCantidadActual(cf.getCantidadActual()-taza);
            System.out.println("Se lleno la taza");
        }else{
            System.out.println("la taza se lleno hasta: " + cf.getCantidadActual());
        }   
    }
   public void vaciarCafetera(Cafetera cf) {
       cf.setCantidadActual(0);
   }
   public void agregarCafe(Cafetera cf) {
       System.out.println("Cuanto cafe decea agregar?");
       int ingreso= leer.nextInt();
       if(ingreso<cf.getCapacidadMaxima()){
           cf.setCantidadActual(cf.getCantidadActual()+ingreso);
     
       }else{
           System.out.println("Se excede la capacidad maxima de la cafetera "+ (ingreso - cf.getCapacidadMaxima()));
           llenarCafetera(cf);
       }
   }
    
}




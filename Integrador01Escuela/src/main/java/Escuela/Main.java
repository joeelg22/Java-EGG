

package Escuela;

/**
 *
 * @author Joel Gonzalez 
 */
public class Main {

   
    public static void main(String[] args) {
       
       
    EscuelaService es = new EscuelaService();
    
    Estudiante[] estu = new Estudiante[3];
    
    es.crearAlumno(estu);
        System.out.println(es.mostrarPromedio(estu));
     es.notaMayor(estu);
     es.mostrarPromedio(estu);
     es.mostrar(es.notaMayor(estu));
    
        
   
    }

}

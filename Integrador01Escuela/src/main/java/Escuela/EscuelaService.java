
package Escuela;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Joel Gonzalez 
 */
public class EscuelaService {
 Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Estudiante[] crearAlumno(Estudiante[] estu) {
        System.out.println("Ingrese los datos de los alumnos");

        String nombre;
        Double nota;

        for (int i = 0; i < estu.length; i++) {
            System.out.print("Ingrese el nombre del alumno ");
            nombre = leer.next();
            System.out.print("Ingrese  la nota del alumno ");
            nota = leer.nextDouble();
            Estudiante estudiante = new Estudiante(nombre, nota);
            estu[i] = estudiante;
        }

        return estu;
    }

    //1. Calcular y mostrar el promedio de notas de todo el curso
    public Double mostrarPromedio(Estudiante[] estu) {

        double prom, cont = 0;

        for (int i = 0; i < estu.length; i++) {
            cont += estu[i].getNota();
        }
        prom = cont / estu.length;
        return prom;
    }

    //2. Retornar otro arreglo con los nombre de los alumnos que recibieron una
    //nota mayor al promedio del curso
    public String[] notaMayor(Estudiante[] estu) {

        double promedio = mostrarPromedio(estu);
        int cont = 0, indice = 0;
        for (int i = 0; i < estu.length; i++) {
            if (estu[i].getNota() > promedio) {
                cont++;
            }
        }
        String[] nombresM = new String[cont];

        for (int i = 0; i < estu.length; i++) {
            if (estu[i].getNota() > promedio) {
                nombresM[indice] = estu[i].getNombre();
                indice++;
            }
        }
        return nombresM;
    }
    
    //3. Por último, deberemos mostrar todos los estudiantes con una nota
//mayor al promedio.
    
    public void mostrar(String[] nombresM){
        
        System.out.println(Arrays.toString(nombresM));
        
    }

    
}
//

//Nota: para crear un vector de objetos la definición es la siguiente:
//Objeto nombreVector[] = new Objeto[];
// public void crearAlumno(Estudiante[] alumno ) {
// 
//        for (int i = 0; i <alumno.length; i++) {
//            System.out.println("Ingrese el nombre del estudiante " );
//           String nombre= leer.next();
//            System.out.println("Ingrese la nota del estudiante " );
//           double nota  = leer.nextDouble();
//          alumno[i] = new Estudiante(nombre, nota);




package Ejercicio;

import Entidades.Curso;
import Servicio.CursoService;

/**
 *
 * @author Joel Gonzalez 
 */
public class Ejercicio06 {

   
    public static void main(String[] args) {
        CursoService cursoS = new CursoService();
        Curso curso1 = cursoS.crearCurso();

        cursoS.calcularGananciaSemanal(curso1);
        cursoS.mostrarAlumnos(curso1);

    }

}


package Escuela;

/**
 *
 * @author Joel Gonzalez 
 */
class Estudiante {
 private String nombre;
   private Double nota;

    public Estudiante() {
    }

    public Estudiante(String nombre, Double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }
   
}

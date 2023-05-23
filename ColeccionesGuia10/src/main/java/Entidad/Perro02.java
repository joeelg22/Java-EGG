
package Entidad;

/**
 *
 * @author Joel Gonzalez 
 */
public class Perro02 {
  private String raza;

    public Perro02(String raza) {
        this.raza = raza;
    }

    
    public String toString() {
        return "Perro{" +
                "raza='" + raza + '\'' +
                '}';
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public Perro02() {
    }
}

package Cancion;

/**
 * Desarrollar una clase Cancion con los siguientes atributos: título y autor.
 * Se deberá definir además dos constructores: uno vacío que inicializa el
 * título y el autor a cadenas vacías y otro que reciba como parámetros el
 * título y el autor de la canción. Se deberán además definir los métodos
 * getters y setters correspondientes.
 *
 *
 * @author cokit
 */
public class Cancion {


  public String titulo;
  public String autor;

  // Constructor vacío
  public Cancion() {
    this.titulo = "Convenceme";
    this.autor = "La konga";
  }

  // Constructor con parámetros
  public Cancion(String titulo, String autor) {
    this.titulo = titulo;
    this.autor = autor;
  }

  // Métodos getters y setters
  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public String getAutor() {
    return autor;
  }

  public void setAutor(String autor) {
    this.autor = autor;
  }
}
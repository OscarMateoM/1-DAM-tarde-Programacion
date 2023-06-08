/* Gato.java (proyecto GatosConClaseYBocadillos) */

package dam1;
public class Personajes {
  private final String nombre;
  private final String imagen;
  private final String fraseAleatoria;
  public Personajes(String nombre, String imagen, String fraseAleatoria) {
    this.nombre = nombre;
    this.imagen = imagen;
    this.fraseAleatoria = fraseAleatoria;
  }

  public String getNombre() {
    return nombre;
  }

  public String getImagen() {
    return imagen;
  }
    public String getfraseAleatoria() {
    return fraseAleatoria;
  }

  @Override
  public String toString() {
    return "<div class=\"acciongato\"><img src=\"" + imagen + "\" width=\"80\"><div class=\"arrow_box\">&nbsp;Me llamo " + nombre + ","+ fraseAleatoria + "&nbsp;</div></div>";
  }
  
  public String habla1() {
   return "<div class=\"acciongato\"><img src=\"" + imagen + "\" width=\"80\"><div class=\"arrow_box2\">&nbsp;Me llamo " + nombre + ","+ fraseAleatoria + "&nbsp;</div></div>";
  }
  
  public String habla2() {
return "<div class=\"acciongato\"><img src=\"" + imagen + "\" width=\"80\"><div class=\"arrow_box3\">&nbsp;Me llamo " + nombre + ","+ fraseAleatoria + "&nbsp;</div></div>";
  }
}

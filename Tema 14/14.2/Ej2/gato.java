package Ej2;
public class gato {
  
  private String color;
  private String raza;
  private String sexo;

  public gato(String s) {
    this.sexo = s;
  }
  
  public void maulla() {
    System.out.println("Miauuuu");
  }
  
  public gato apareaCon(gato pareja) throws ExcepcionApareamientoImposible {
    if (this.sexo.equals(pareja.sexo)) {
      throw new ExcepcionApareamientoImposible();
    }
    
    String s = (int)(Math.random() * 2) ==  0 ? "hembra" : "macho"; // Para que el sexo del gato nuevo sea aletorio
    return new gato(s);
  }

}

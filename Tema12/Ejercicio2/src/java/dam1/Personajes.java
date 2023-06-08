/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dam1;

/**
 *
 * @author Oscar Mateo
 */
public class Personajes {
  private final String nombre;
  private final String imagen;
  
  public Personajes(String nombre, String imagen) {
    this.nombre = nombre;
    this.imagen = imagen;
  }

  public String getNombre() {
    return nombre;
  }

  public String getImagen() {
    return imagen;
  }
    public String mostrarImagen() {
    return "<img src=\"" + imagen + "\" width=\"90\">";
  }

    public int jugar(String jugada, String jugadaOponente) {
        if (jugada.equals("piedra")) {
            if (jugadaOponente.equals("papel")) {
                return -1; // El Personaje 2 gana
            } else if (jugadaOponente.equals("tijera")) {
                return 1; // El Personaje 1 gana
            } else {
                return 0; // Empate
            }
        } else if (jugada.equals("papel")) {
                        if (jugadaOponente.equals("tijera")) {
                return -1; // El Personaje 2 gana
            } else if (jugadaOponente.equals("piedra")) {
                return 1; // El Personaje 1 gana
            } else {
                return 0; // Empate
            }
        } else if (jugada.equals("tijera")) {
                        if (jugadaOponente.equals("piedra")) {
                return -1; // El Personaje 2 gana
            } else if (jugadaOponente.equals("papel")) {
                return 1; // El Personaje 1 gana
            } else {
                return 0; // Empate
            }
        }
        
       
        
        return 0; 
    }
}

/* AUTOR: OSCAR MATEO MARTIN
 * Clase Gato
 */
class Gato extends Mascotas {
    private String color;
    private boolean peloLargo;

    public Gato(String nombre, int edad, String estado, String color, boolean peloLargo) {
        this.nombre = nombre;
        this.edad = edad;
        this.estado = estado;
        this.color = color;
        this.peloLargo = peloLargo;
    }

    @Override
    public void muestra() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Estado: " + estado);
        System.out.println("Color: " + color);
        System.out.println("Pelo largo: " + peloLargo);
    }

    @Override
    public void cumpleaños() {
        edad++;
    }

    @Override
    public void morir() {
        estado = "Muerto";
    }

    @Override
    public void habla() {
        System.out.println("¡Miau!");
    }
}

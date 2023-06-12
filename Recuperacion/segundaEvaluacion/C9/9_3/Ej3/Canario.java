/* AUTOR: OSCAR MATEO MARTIN
 * Clase Canario
 */
class Canario extends Aves {
    private String color;
    private boolean canta;

    public Canario(String nombre, int edad, String estado, String color, boolean canta) {
        this.nombre = nombre;
        this.edad = edad;
        this.estado = estado;
        this.color = color;
        this.canta = canta;
        this.pico = "Recto";
        this.vuela = true;
    }

    @Override
    public void muestra() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Estado: " + estado);
        System.out.println("Color: " + color);
        System.out.println("Canta: " + canta);
        System.out.println("Pico: " + pico);
        System.out.println("Vuela: " + vuela);
    }

    @Override
    public void volar() {
        System.out.println("El canario está volando.");
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
        System.out.println("Pio!");
    }
}


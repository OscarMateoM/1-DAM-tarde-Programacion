/* AUTOR: OSCAR MATEO MARTIN
 * Clase Loro
 */
class Loro extends Aves {
    private String origen;
    private boolean habla;

    public Loro(String nombre, int edad, String estado, String origen, boolean habla) {
        this.nombre = nombre;
        this.edad = edad;
        this.estado = estado;
        this.origen = origen;
        this.habla = habla;
        this.pico = "Curvo";
        this.vuela = true;
    }

    @Override
    public void muestra() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Estado: " + estado);
        System.out.println("Origen: " + origen);
        System.out.println("Habla: " + habla);
        System.out.println("Pico: " + pico);
        System.out.println("Vuela: " + vuela);
    }

    public void saluda() {
        System.out.println("¡Hola!");
    }

    @Override
    public void volar() {
        System.out.println("El loro está volando.");
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
        System.out.println("¡Hola!");
    }
}


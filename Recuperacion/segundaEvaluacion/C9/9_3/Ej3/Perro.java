/* AUTOR: OSCAR MATEO MARTIN
 * Clase Perro
 */
class Perro extends Mascotas {
    private String raza;
    private boolean pulgas;

    public Perro(String nombre, int edad, String estado, String raza, boolean pulgas) {
        this.nombre = nombre;
        this.edad = edad;
        this.estado = estado;
        this.raza = raza;
        this.pulgas = pulgas;
    }

    @Override
    public void muestra() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Estado: " + estado);
        System.out.println("Raza: " + raza);
        System.out.println("Tiene pulgas: " + pulgas);
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
        System.out.println( "¡Guau!");
    }
}


/* AUTOR: OSCAR MATEO MARTIN
 * Clase Mascotas
 */

abstract class Mascotas {
    protected String nombre;
    protected int edad;
    protected String estado;

    public abstract void muestra();
    public abstract void cumpleaños();
    public abstract void morir();
    public abstract void habla();
}


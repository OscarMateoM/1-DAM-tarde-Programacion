/* AUTOR: OSCAR MATEO MARTIN
 * Implementa una clase llamada Inventario que utilizaremos para almacenar referencias a todos los
 * animales existentes en una tienda de mascotas. 
 * Esta clase debe cumplir con los siguientes requisitos: 
 * • En la tienda existirán 4 tipos de animales: perros, gatos, loros y canarios. 
 * • Los animales deben almacenarse en un ArrayList privado dentro de la clase Inventario. 
 * • La clase debe permitir realizar las siguientes acciones:
 * ◦ Mostrar la lista de animales (solo tipo y nombre, 1 línea por animal).
 * ◦ Mostrar todos los datos de un animal concreto.
 * ◦ Mostrar todos los datos de todos los animales.
 * ◦ Insertar animales en el inventario. 
 * ◦ Eliminar animales del inventario. 
 * ◦ Vaciar el inventario.

 */
import java.util.ArrayList;
import java.util.List;

class Inventario {
    private ArrayList<Mascotas> animales;

    public Inventario() {
        animales = new ArrayList<>();
    }

    public void mostrarListaAnimales() {
        for (Mascotas mascota : animales) {
            System.out.println(mascota.getClass().getSimpleName() + ": " + mascota.nombre);
        }
    }

    public void mostrarDatosAnimal(String nombre) {
        for (Mascotas mascota : animales) {
            if (mascota.nombre.equals(nombre)) {
                mascota.muestra();
                return;
            }
        }
        System.out.println("No se encontró un animal con ese nombre.");
    }

    public void mostrarDatosTodosAnimales() {
        for (Mascotas mascota : animales) {
            mascota.muestra();
            System.out.println();
        }
    }

    public void insertarAnimal(Mascotas mascota) {
        animales.add(mascota);
        System.out.println("Se ha insertado el animal en el inventario.");
    }

    public void eliminarAnimal(String nombre) {
        for (int i = 0; i < animales.size(); i++) {
            if (animales.get(i).nombre.equals(nombre)) {
                animales.remove(i);
                System.out.println("Se ha eliminado el animal del inventario.");
                return;
            }
        }
        System.out.println("No se encontró un animal con ese nombre en el inventario.");
    }

    public void vaciarInventario() {
        animales.clear();
        System.out.println("Se ha vaciado el inventario.");
    }

    public List<Mascotas> getAnimales() {
        return animales;
    }
}

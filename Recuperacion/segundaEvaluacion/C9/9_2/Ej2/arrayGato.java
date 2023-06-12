/* AUTOR: OSCAR MATEO MARTIN
 * Cambia el programa anterior de tal forma que los datos de los gatos se
 * introduzcan directamente en el código de la forma gatito[2].setColor("marrón") o
 * bien mediante el constructor, de la forma gatito[3] = new Gato("Garfield", "naranja",
 * "macho"). Muestra a continuación los datos de todos los gatos utilizando un bucle.
 */
public class arrayGato {
    public static void main(String[] args) {
        Gato[] gatos = new Gato[4];
        // Introducir datos de los gatos
        gatos[0] = new Gato("Pepe", "Blanco", "Siames");
        gatos[1] = new Gato("Juan", "Negro", "Persa");
        gatos[2] = new Gato("Antonio", "Marrón", "Comun");
        gatos[3] = new Gato("Manuel", "Gris", "Montés");

        // Mostrar los datos de todos los gatos
        System.out.println("Datos de los gatos:");
        for (int i = 0; i < gatos.length; i++) {
            System.out.println("Nombre: " + gatos[i].getNombre());
            System.out.println("Color: " + gatos[i].getColor());
            System.out.println("Raza: " + gatos[i].getRaza());
            System.out.println();
        }
    }
}
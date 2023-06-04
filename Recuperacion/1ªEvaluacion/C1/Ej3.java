/* AUTOR: OSCAR MATEO MARTIN
 * Escribe un programa que muestre por pantalla 10 palabras en inglés junto a su
 * correspondiente traducción al castellano. Las palabras deben estar distribuidas
 * en dos columnas y alineadas a la izquierda.
 */
public class Ej3 {
    public static void main(String[] args) {
// Con el "%s" imprimimos las palabras en dos columnas
// Con el "%n" añadimos un salto de linea
// Con "%-10s" otorgamos un ancho de 10 caracteres 
        System.out.printf("%-10s %s%n", "Computer", "Ordenador");
        System.out.printf("%-10s %s%n", "Student", "Alumno/a");
        System.out.printf("%-10s %s%n", "Cat", "Gato");
        System.out.printf("%-10s %s%n", "Penguin", "Pingüino");
        System.out.printf("%-10s %s%n", "Machine", "Máquina");
        System.out.printf("%-10s %s%n", "Nature", "Naturaleza");
        System.out.printf("%-10s %s%n", "Light", "Luz");
        System.out.printf("%-10s %s%n", "Green", "Verde");
        System.out.printf("%-10s %s%n", "Book", "Libro");
        System.out.printf("%-10s %s%n", "Pyramid", "Pirámide");
    }
}



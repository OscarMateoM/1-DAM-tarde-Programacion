/* AUTOR: OSCAR MATEO MARTIN
 * Realiza un programa que pinte por pantalla una cuba con cierta cantidad de
 * agua. La capacidad será indicada por el usuario. La cuba se llenará con una
 * cantidad aleatoria de agua que puede ir entre 0 y la capacidad máxima que
 * pueda admitir. El ancho de la cuba no varía.
 */
import java.util.Scanner;

public class Ej20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, indique la capacidad de la cuba en litros: ");
        int capacidad = scanner.nextInt();
        scanner.close();

        int cantidadAgua = (int) (Math.random() * (capacidad + 1));

        for (int i = 0; i < capacidad; i++) {
            if (i < (capacidad - cantidadAgua)) {
              System.out.println("#    #");
            } else {
              System.out.println("#====#");
            }
          }

        System.out.println();
        System.out.println("La cuba tiene una capacidad de " + capacidad + " litros y contiene " + cantidadAgua + " litros de agua.");
    }
}


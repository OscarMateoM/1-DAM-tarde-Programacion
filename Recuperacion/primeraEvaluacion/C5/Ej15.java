/* AUTOR: OSCAR MATEO MARTIN
 * Escribe un programa que dados dos números, uno real (base) y un entero
 * positivo (exponente), saque por pantalla todas las potencias con base el
 * numero dado y exponentes entre uno y el exponente introducido. No se deben
 * utilizar funciones de exponenciación.
 */
import java.util.Scanner;

public class Ej15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la base: ");
        int base = scanner.nextInt();

        System.out.print("Introduce el exponente: ");
        int exponente = scanner.nextInt();

        int potencia = 1;

        for (int i = 1; i <= exponente; i++) {
            potencia = potencia * base;
            System.out.println(base + " elevado a " + i + " = " + potencia);
        }

        scanner.close();
    }
}


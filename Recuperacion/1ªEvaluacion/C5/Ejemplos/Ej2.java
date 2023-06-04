/* AUTOR: OSCAR MATEO MARTIN
 * Programa que muestre por pantalla los números naturales hasta un valor introducido por teclado.
 */
package Ejemplos;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduzca un número: ");
        int numero = scanner.nextInt();

        System.out.println("Números naturales hasta " + numero + ":");

        for (int i = 1; i <= numero; i++) {
            System.out.println(i);
        }

        scanner.close();
    }
}

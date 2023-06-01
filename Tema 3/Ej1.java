/* AUTOR: OSCAR MATEO MARTIN
 * Realiza un programa que pida dos números y que luego muestre el resultado
 * de su multiplicación.
 */

import java.util.Scanner;
public class Ej1 {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int numero2 = scanner.nextInt();

        int resultado = numero1 * numero2;

        scanner.close();

        System.out.println("El resultado de la multiplicación es: " + resultado);
    }
}

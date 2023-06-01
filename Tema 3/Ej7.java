/* AUTOR: OSCAR MATEO MARTIN
 * Escribe un programa que calcule el total de una factura a partir de la base
 * imponible.
 */
import java.util.Scanner;

public class Ej7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la base imponible de la factura: ");
        double baseImponible = scanner.nextDouble();

        System.out.print("Ingrese el porcentaje de impuestos (ejemplo: 21 para 21%): ");
        double porcentajeImpuestos = scanner.nextDouble();
        scanner.close();
        double impuestos = (baseImponible * porcentajeImpuestos) / 100;
        double total = baseImponible + impuestos;

        System.out.println("El total de la factura es: " + total);
    }
}


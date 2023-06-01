/* AUTOR: OSCAR MATEO MARTIN
 * Realiza un conversor de Kb a Mb.
 */
import java.util.Scanner;

public class Ej11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de kilobytes a convertir: ");
        double kilobytes = scanner.nextDouble();
        scanner.close();
        // 1 kilobyte = 1/1024 megabytes
        double megabytes = kilobytes / 1024;

        System.out.println(kilobytes + " kilobytes equivalen a " + megabytes + " megabytes.");
    }
}


/* AUTOR: OSCAR MATEO MARTIN
 * Realiza un conversor de Mb a Kb.
 */
import java.util.Scanner;

public class Ej10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de megabytes a convertir: ");
        double megabytes = scanner.nextDouble();
        scanner.close();
        // 1 megabyte = 1024 kilobytes
        double kilobytes = megabytes * 1024;

        System.out.println(megabytes + " megabytes equivalen a " + kilobytes + " kilobytes.");
    }
}


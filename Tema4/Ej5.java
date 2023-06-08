/* AUTOR: OSCAR MATEO MARTIN
 * Realiza un programa que resuelva una ecuación de primer grado (del tipo ax+b = 0).
 */
import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el valor de 'a': ");
        double a = scanner.nextDouble();

        System.out.print("Ingrese el valor de 'b': ");
        double b = scanner.nextDouble();
        scanner.close();

        System.out.printf("La ecuación es %.0fx + %.0f = 0%n", a, b);
        if (a == 0) {
            if (b == 0) {
                System.out.println("La ecuación tiene infinitas soluciones.");
            } else {
                System.out.println("La ecuación no tiene solución.");
            }
        } else {
            double x = -b / a;
            System.out.println("La solución de la ecuación es: x = " + x);
        }
    }
}

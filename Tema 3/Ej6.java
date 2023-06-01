/* AUTOR: OSCAR MATEO MARTIN
 * Escribe un programa que calcule el área de un triangulo.
 */
import java.util.Scanner;

public class Ej6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la base del triángulo: ");
        double base = scanner.nextDouble();

        System.out.print("Ingrese la altura del triángulo: ");
        double altura = scanner.nextDouble();

        scanner.close();

        double area = (base * altura) / 2;

        System.out.println("El área del triángulo es: " + area);
    }
}


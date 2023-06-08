
import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();

        int min = minimo(num1, num2);

        System.out.println("El mínimo entre " + num1 + " y " + num2 + " es: " + min);
    }

    public static int minimo(int a, int b) {
        return Math.min(a, b);
    }
}

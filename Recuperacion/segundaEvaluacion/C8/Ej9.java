/* AUTOR: OSCAR MATEO MARTIN
 * Realiza un programa que pida introducir tres valores enteros y nos diga cuál de ellos es el más
 * elevado. Implementalo creando únicamente una función a la que le pasemos dos valores (no
 * tres) y nos devuelva el máximo de los dos valores.
 */
import misFunciones.Varias;
import java.util.Scanner;
public class Ej9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el primer valor: ");
        int num1 = scanner.nextInt();

        System.out.print("Introduce el segundo valor: ");
        int num2 = scanner.nextInt();

        System.out.print("Introduce el tercer valor: ");
        int num3 = scanner.nextInt();
        scanner.close();
       
        int maximo = Varias.maximo(Varias.maximo(num1, num2), num3);

        System.out.println("El valor más elevado es: " + maximo);
    }
}


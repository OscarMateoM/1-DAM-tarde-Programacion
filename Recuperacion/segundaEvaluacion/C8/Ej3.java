/* AUTOR: OSCAR MATEO MARTIN
 * Escribe un programa que pida dos números enteros por teclado y muestre por pantalla cual es
 * el mínimo. Implementa y utiliza la función:
 * int minimo(int a, int b) // Devuelve el menor entre a y b
 */
import misFunciones.Varias;
import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();

        int min = Varias.minimo(num1,num2);
        scanner.close();
        System.out.println("El mínimo es " + min);
    }


}

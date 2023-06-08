/* AUTOR: OSCAR MATEO MARTIN
 *  Realiza un programa que escriba la tabla de multiplicar de un número introducido por teclado.
 * Para ello implementa una función que reciba como parámetro un número entero y muestre
 * por pantalla la tabla de multiplicar de dicho número.
 */
import misFunciones.Varias;
import java.util.Scanner;
public class Ej11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int numero = scanner.nextInt();
        scanner.close();
        Varias.tablaMultiplicar(numero);
    }
}


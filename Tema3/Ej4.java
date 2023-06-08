/* AUTOR: OSCAR MATEO MARTIN
 * Escribe un programa que sume, reste, multiplique y divida dos números
 * introducidos por teclado.
 */

import java.util.Scanner;

public class Ej4 {
	
	public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        double x = scanner.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double y = scanner.nextDouble();
		scanner.close();
		double sum = x+y;
		double res = x-y;
		double mul = x*y;
		double div = y/x;
			System.out.println("El valor de la variable x es " + x);
			System.out.println("El valor de la variable y es " + y);
			System.out.println("La suma de las varibales es: " + sum);
			System.out.println("La resta de las variables es: " + res);
			System.out.println("La multiplicacion de las variables es: " + mul);
			System.out.println("La division de las variables es: " + div);
	}
}


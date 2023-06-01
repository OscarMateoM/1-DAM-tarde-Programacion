/* AUTOR: OSCAR MATEO MARTIN
 * Realiza un conversor de pesetas a euros. La cantidad de pesetas que se quiere
 * convertir debe ser introducida por teclado.
 */

import java.util.Scanner;
public class Ej3 {
	
	public static void main (String[] args) {
		int num;
		double eur = 0.006; // Este es el valor en euros de 1 peseta
		
		Scanner leer=new Scanner(System.in);
			System.out.print("Introduzca un numero de pesetas para convertirlas en euros: ");
			num=leer.nextInt();
		double conversor = num * eur; // Esta es la operacion necesaria para convertir de pesetas a euros
			leer.close();
			System.out.println(num + " pesetas equivale a " + conversor + " euros ");
			
	}
}



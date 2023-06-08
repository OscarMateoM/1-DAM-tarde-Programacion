/*
 * EurosAPesetas.java
 * 
 * AUTOR: OSCAR MATEO MARTIN
 * 
 */

import java.util.Scanner;
public class EurosAPesetas {
	
	public static void main (String[] args) {
		int num;
		double pes = 166.38; // Este es el valor en pesetas de 1 euro
		
		Scanner leer=new Scanner(System.in);
			System.out.print("Introduzca un numero de euros para convertirlos en pesetas: ");
			num=leer.nextInt();
			leer.close(); //cierra el escaner
		double conversor = num * pes; // Esta es la operacion necesaria para convertir de euros a pesetas
			System.out.println(num + " euros equivale a " + conversor + " pesetas ");
			
	}
}


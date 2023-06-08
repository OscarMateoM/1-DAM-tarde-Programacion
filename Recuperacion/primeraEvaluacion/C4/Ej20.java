/* AUTOR: OSCAR MATEO MARTIN
 * Realiza un programa que diga si un número entero positivo introducido por
 * teclado es capicúa. Se permiten números de hasta 5 cifras.
 */
import java.util.Scanner;

public class Ej20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduzca un numero entero (de 5 cifras como máximo): ");
        int n = scanner.nextInt();
        if (n >= 100000) {
            System.out.println("El número introducido tiene más de 5 cifras.");
        } else {
        int cifra1 = n / 10000;
        int cifra2 = (n / 1000) % 10;
        int cifra3 = (n / 100) % 10;
        int cifra4 = (n / 10) % 10;
        int cifra5 = n % 10;
        boolean capicua = false;

        if (n < 10) {
            capicua = true;
        } else if (n < 100) {
            if (cifra4 == cifra5) {
                capicua = true;
            }
        } else if (n < 1000) {
            if (cifra3 == cifra5) {
                capicua = true;
            }
        } else if (n < 10000) {
            if (cifra2 == cifra5 && cifra3 == cifra4) {
                capicua = true;
            }
        } else if (n < 100000) {    
        } if (cifra1 == cifra5 && cifra2 == cifra4) {
            capicua = true;
        } 
       
        if (capicua) {
            System.out.println("El número introducido es capicúa.");
        } else {
            System.out.println("El número introducido no es capicúa.");
        }

        scanner.close();
    }
}
}


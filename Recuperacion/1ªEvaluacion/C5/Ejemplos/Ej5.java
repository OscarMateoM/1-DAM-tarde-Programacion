/* AUTOR: OSCAR MATEO MARTIN
 * Realiza un programa que calcule y muestre por pantalla de valor de A elevado a B 
 * (sin usar el operador potencia ni método de Math). Serán leidos por pantalla los números A y B.  
 */
package Ejemplos;
import java.util.Scanner;
public class Ej5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce A: ");
        int a = scanner.nextInt();

        System.out.print("Introduce B: ");
        int b = scanner.nextInt();

        int potencia = 1;

        for (int i = 1; i <= b; i++) {
            potencia = potencia * a;
            System.out.println(a + " elevado a " + i + " = " + potencia);
        }

        scanner.close();
    }
}


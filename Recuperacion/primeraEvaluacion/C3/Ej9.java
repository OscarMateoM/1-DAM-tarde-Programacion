/* AUTOR: OSCAR MATEO MARTIN
 *Escribe un programa que calcule el volumen de un cono según 
 *la fórmula V = 1/3πr2h
 */
import java.util.Scanner;

public class Ej9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el radio del cono: ");
        double radio = scanner.nextDouble();

        System.out.print("Ingrese la altura del cono: ");
        double altura = scanner.nextDouble();
        scanner.close();
        double volumen = (1.0 / 3.0) * Math.PI * Math.pow(radio, 2) * altura;

        System.out.println("El volumen del cono es: " + volumen);
    }
}


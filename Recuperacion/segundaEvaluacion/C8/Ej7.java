/* AUTOR: OSCAR MATEO MARTIN
 * Escribe un programa que pida el ancho y alto de un rectángulo y muestre por pantalla su área y
 * su perímetro. Implementa y utiliza las funciones:
 * double perimetroRectangulo(double ancho, double alto) // Devuelve el perímetro
 * double areaRectangulo(double ancho, double alto) // Devuelve el área
 */
import misFunciones.Geometria;
import java.util.Scanner;

public class Ej7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el ancho del rectángulo: ");
        double ancho = scanner.nextDouble();

        System.out.print("Ingrese el alto del rectángulo: ");
        double alto = scanner.nextDouble();
        scanner.close();
        double perimetro = Geometria.perimetroRectangulo(ancho, alto);
        double area = Geometria.areaRectangulo(ancho, alto);

        System.out.println("El perímetro del rectángulo es: " + perimetro);
        System.out.println("El área del rectángulo es: " + area);
    }


}


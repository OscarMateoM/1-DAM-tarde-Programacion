/* AUTOR: OSCAR MATEO MARTIN
 * Funciones relacionadas con la geometría.
 */
package misFunciones;
import java.util.Scanner;
public class Geometria {
    public static double perimetroRectangulo(double ancho, double alto) {
        return 2 * (ancho + alto);
    }

    public static double areaRectangulo(double ancho, double alto) {
        return ancho * alto;
    }
    public static double pideRadio() {
        System.out.print("Introduce el radio: ");
        Scanner scanner = new Scanner(System.in);
        double radio = scanner.nextDouble();
        return radio;
    }
    
    public static double circunferencia(double r) {
        return 2 * Math.PI * r;
    }
    
    public static double area(double r) {
        return Math.PI * r * r;
    }
    public static double volumen(double r) {
        return (4/3.0) * Math.PI * r * r * r;
    }
}

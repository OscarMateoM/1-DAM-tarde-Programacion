/* AUTOR: OSCAR MATEO MARTIN
 * Realiza un programa que calcule la nota que hace falta sacar en el segundo
 * examen de la asignatura Programación para obtener la media deseada. Hay
 * que tener en cuenta que la nota del primer examen cuenta el 40% y la del
 * segundo examen un 60%.
 */
import java.util.Scanner;

public class Ej12   {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la nota del primer examen: ");
        double notaPrimerExamen = scanner.nextDouble();

        System.out.print("¿Qué nota quieres sacar en el trimestre? ");
        double notaDeseada = scanner.nextDouble();
        scanner.close();
        // Calcula la nota necesaria en el segundo examen
        double porcentajePrimerExamen = 0.4;
        double porcentajeSegundoExamen = 0.6;

        double notaASacar = (notaDeseada - (notaPrimerExamen * porcentajePrimerExamen)) / porcentajeSegundoExamen;

        System.out.println("Para obtener un " + notaDeseada + " en el trimestre, necesitas sacar un " + notaASacar + " en el segundo examen.");
    }
}


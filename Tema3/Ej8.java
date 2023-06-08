/* AUTOR: OSCAR MATEO MARTIN
 * Escribe un programa que calcule el salario semanal de un empleado en base a
 * las horas trabajadas, a razón de 12 euros la hora.
 */
import java.util.Scanner;

public class Ej8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese las horas trabajadas: ");
        int horasTrabajadas = scanner.nextInt();
        scanner.close();
        double tarifaHora = 12.0;
        double salarioSemanal = horasTrabajadas * tarifaHora;

        System.out.println("El salario semanal del empleado es: " + salarioSemanal + " euros");
    }
}

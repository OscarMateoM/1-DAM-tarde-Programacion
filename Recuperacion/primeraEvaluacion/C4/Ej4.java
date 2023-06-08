/* AUTOR: OSCAR MATEO MARTIN
 * Vamos a ampliar uno de los ejercicios de la relación anterior para considerar
 * las horas extras. Escribe un programa que calcule el salario semanal de un
 * trabajador teniendo en cuenta que las horas ordinarias (40 primeras horas de
 * trabajo) se pagan a 12 euros la hora. A partir de la hora 41, se pagan a 16 euros
 * la hora.
 */
import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, introduzca el número de horas trabajadas durante la semana: ");
        int horasTrabajadas = scanner.nextInt();
        scanner.close();
        double tarifaNormal = 12.0;
        double tarifaExtra = 16.0;

        double salarioSemanal;

        if (horasTrabajadas <= 40) {
            salarioSemanal = horasTrabajadas * tarifaNormal;
        } else {
            int horasOrdinarias = 40;
            int horasExtras = horasTrabajadas - 40;

            double salarioOrdinario = horasOrdinarias * tarifaNormal;
            double salarioExtra = horasExtras * tarifaExtra;

            salarioSemanal = salarioOrdinario + salarioExtra;
        }

        System.out.println("El sueldo semanal que le corresponde es de " + salarioSemanal + " euros");
    }
}


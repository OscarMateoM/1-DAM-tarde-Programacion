/* AUTOR: OSCAR MATEO MARTIN
 * Escribe un programa que genere la nómina (bien desglosada) de un empleado
 * según las siguientes condiciones:
• Se pregunta el cargo del empleado (1 - Prog. junior, 2 - Prog. senior, 3 - Jefe
de proyecto), los días que ha estado de viaje visitando clientes durante el
mes y su estado civil (1 - Soltero, 2 - Casado).
• El sueldo base según el cargo es de 950, 1200 y 1600 euros según
si se trata de un prog. junior, un prog. senior o un jefe de proyecto
respectivamente.
• Por cada día de viaje visitando clientes se pagan 30 euros extra en
concepto de dietas. Al sueldo neto hay que restarle el IRPF, que será de
un 25% en caso de estar soltero y un 20% en caso de estar casado.
 */
import java.util.Scanner;

public class Ej24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cargo;
        int diasViaje;
        int estadoCivil;

        System.out.println("1 - Programador junior");
        System.out.println("2 - Programador senior");
        System.out.println("3 - Jefe de proyecto");
        System.out.print("Introduzca el cargo del empleado (1 - 3): ");
        cargo = scanner.nextInt();

        System.out.print("¿Cuántos días ha estado de viaje visitando clientes? ");
        diasViaje = scanner.nextInt();

        System.out.println("1 - Soltero");
        System.out.println("2 - Casado");
        System.out.print("Introduzca su estado civil (1 - Soltero, 2 - Casado): ");
        estadoCivil = scanner.nextInt();

        double sueldoBase = 0;
        double dietas = diasViaje * 30;
        double sueldoBruto = 0;
        double retencionIRPF = 0;
        double sueldoNeto = 0;

        switch (cargo) {
            case 1:
                sueldoBase = 950;
                break;
            case 2:
                sueldoBase = 1200;
                break;
            case 3:
                sueldoBase = 1600;
                break;
            default:
                System.out.println("La opcion introducida es incorrecta");
                break;
        }

        sueldoBruto = sueldoBase + dietas;

        if (estadoCivil == 1) {
            retencionIRPF = sueldoBruto * 0.25;
        } else if (estadoCivil == 2) {
            retencionIRPF = sueldoBruto * 0.20;
        } else {
            System.out.println("La opcion introducida es incorrecta");
        }

        sueldoNeto = sueldoBruto - retencionIRPF;

        System.out.println("---------------------------------");
        System.out.println("| Sueldo base: " + sueldoBase );
        System.out.println("| Dietas (" + diasViaje + " viajes): " + dietas);
        System.out.println("|--------------------------------|");
        System.out.println("| Sueldo bruto: " + sueldoBruto);
        System.out.println("| Retención IRPF (" + retencionIRPF + ")");
        System.out.println("|--------------------------------|");
        System.out.println("| Sueldo neto: " + sueldoNeto);
        System.out.println("---------------------------------");

        scanner.close();
    }
}


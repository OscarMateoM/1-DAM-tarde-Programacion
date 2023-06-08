/* AUTOR: OSCAR MATEO MARTIN
 * Escribe un programa que muestre un menú con 2 opciones: “1.Circunferencia” y “2.Área”.
 * En ambas se le pedirá al usuario que introduzca un radio y luego se le mostrará el cálculo
 * oportuno. Implementa las funciones:
 * int menu() // Muestra el menú y devuelve el número elegido
 * double pideRadio() // Pide que se introduzca el radio y lo devuelve
 * double circunferencia(double r) // Calcula la circunferencia y la devuelve
 * double area(double r) // Calcula el área y la devuelve
 * --Modifica el programa añadiendo otra opción llamada “Volumen”, permitiendo que el usuario
 *   también pueda solicitar el cálculo del volumen. Añade la función:
 *   double volumen(double r) // Calcula el volumen y lo devuelve
 * --Modifica el programa añadiendo otra opción llamada “Todas” en la que se pida el radio una sola
 *   vez y se muestren los tres cálculos posibles (circunferencia, área y volumen).
 * --Modifica el programa anterior de modo que el proceso se repita una y otra vez (mostrar menú ->
 *   realizar el cálculo -> volver a mostrar menú). Añade una opción más llamada “Salir” que terminará
 *   el programa si es elegida
 */
import misFunciones.Varias;
import misFunciones.Geometria;
import java.util.Scanner;

public class Ej21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int opcion = 0;
        
        while (opcion != 5) {
            opcion = Varias.menu();
            switch (opcion) {
            case 1:
                double radio1 = Geometria.pideRadio();
                double circunferencia1 = Geometria.circunferencia(radio1);
                System.out.println("La circunferencia es: " + circunferencia1);
                break;
            case 2:
                double radio2 = Geometria.pideRadio();
                double area2 = Geometria.area(radio2);
                System.out.println("El área es: " + area2);
                break;
            case 3:
                double radio3 = Geometria.pideRadio();
                double volumen3 = Geometria.volumen(radio3);
                System.out.println("El volumen es: " + volumen3);
                break;
            case 4:
                double radio4 = Geometria.pideRadio();
                double circunferencia4 = Geometria.circunferencia(radio4);
                double area4 = Geometria.area(radio4);
                double volumen4 = Geometria.volumen(radio4);
                System.out.println("La circunferencia es: " + circunferencia4);
                System.out.println("El área es: " + area4);
                System.out.println("El volumen es: " + volumen4);
                break;
            case 5:
                System.out.println("Saliendo del programa...");
                break;
            default:
                System.out.println("Opción inválida");
                break;
        }
    }
        
        scanner.close();
    }
    
}


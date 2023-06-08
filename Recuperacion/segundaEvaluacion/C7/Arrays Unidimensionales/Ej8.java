/* AUTOR: OSCAR MATEO MARTIN
 * Realiza un programa que pida la temperatura media que ha hecho en cada mes
 * de un determinado año y que muestre a continuación un diagrama de barras
 * horizontales con esos datos. Las barras del diagrama se pueden dibujar a base
 * de asteriscos o cualquier otro carácter
 */
import java.util.Scanner;

public class Ej8 {
    public static void main(String[] args) {
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio","Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        int[] temperaturas = new int[12];

        Scanner scanner = new Scanner(System.in);

        // Pide la temperatura media de cada mes
        for (int i = 0; i < 12; i++) {
            System.out.print("Ingrese la temperatura media del mes de " + meses[i] + ": ");
            temperaturas[i] = scanner.nextInt();
        }
        scanner.close();
        // Muestra el diagrama
        for (int i = 0; i < 12; i++) {
            System.out.print(meses[i] + ": ");
            for (int j = 0; j < temperaturas[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


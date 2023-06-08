/* AUTOR: OSCAR MATEO MARTIN
 * Escribe un programa que pida 20 números enteros. Estos números se deben
 * introducir en un array de 4 filas por 5 columnas. El programa mostrará las
 * sumas parciales de filas y columnas igual que si de una hoja de cálculo se
 * tratara. La suma total debe aparecer en la esquina inferior derecha.
 */
import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        int[][] numeros = new int[4][5];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese 20 números enteros:");

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("Fila %d, Columna %d: ", i +1 , j + 1 );
                numeros[i][j] = scanner.nextInt();
            }
        }
        scanner.close();
        // Calcular las sumas parciales de filas y columnas
        int[] sumasFilas = new int[4];
        int[] sumasColumnas = new int[5];
        int sumaTotal = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                sumasFilas[i] += numeros[i][j];
                sumasColumnas[j] += numeros[i][j];
                sumaTotal += numeros[i][j];
            }
        }

        // Mostrar las sumas parciales y la suma total
        System.out.println("\nSumas parciales:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("%5d", numeros[i][j]);
            }
            System.out.printf("   │%5d\n", sumasFilas[i]);
        }

        System.out.println("────────────────────────────────────");

        for (int j = 0; j < 5; j++) {
            System.out.printf("%5d", sumasColumnas[j]);
        }
        System.out.printf("   │%5d\n", sumaTotal);
    }
}


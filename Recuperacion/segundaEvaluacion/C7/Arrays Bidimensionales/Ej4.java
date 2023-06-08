/* AUTOR: OSCAR MATEO MARTIN
 * Modifica el programa anterior de tal forma que las sumas parciales y la suma
 * total aparezcan en la pantalla con un pequeño retardo, dando la impresión de
 * que el ordenador se queda “pensando” antes de mostrar los números.
 */

 import java.util.Scanner;

 public class Ej4 {
     public static void main(String[] args)  throws InterruptedException {
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
         System.out.print("Calculando...");
         Thread.sleep(1000);
         // Mostrar las sumas parciales y la suma total
         System.out.println("\nSumas parciales:");
         for (int i = 0; i < 4; i++) {
             for (int j = 0; j < 5; j++) {
                 System.out.printf("%5d", numeros[i][j]);
             }
             System.out.printf("   │%5d\n", sumasFilas[i]);
             Thread.sleep(500);
         }
 
         System.out.println("────────────────────────────────────");
 
         for (int j = 0; j < 5; j++) {
             System.out.printf("%5d", sumasColumnas[j]);
             Thread.sleep(100);
         }
         System.out.printf("   │%5d\n", sumaTotal);
         Thread.sleep(500);
     }
 }
 
 
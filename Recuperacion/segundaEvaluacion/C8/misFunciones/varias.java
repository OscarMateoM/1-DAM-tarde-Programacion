/* AUTOR: OSCAR MATEO MARTIN
 * Funciones variadas.
 */
package misFunciones;
import java.util.Scanner;

public class Varias {
    public static int minimo(int a, int b){
        if(a<b){
          return a;
        }else{
          return b;
        }
      }
    public static int maximo(int a, int b){
        if(a>b){
          return a;
        }else{
          return b;
        }
      }
    public static void tablaMultiplicar(int numero) {
        System.out.println("Tabla de multiplicar del " + numero + ":");

        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
    }
    public static int menu() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("MENU");
        System.out.println("1. Circunferencia");
        System.out.println("2. Área");
        System.out.println("3. Volumen");
        System.out.println("4. Todas");
        System.out.println("5. Salir");
        System.out.print("Elige una opción: ");
        int opcion = scanner.nextInt();
        return opcion;
    }
}

/* AUTOR: OSCAR MATEO MARTIN
 * Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás utilizando
 * un bucle while.
 */

 public class Ej5 {
    public static void main(String[] args) {
        int numero = 320;
        
        while (numero >= 160) {
            System.out.println(numero);
            numero = numero - 20;
        }
    }
}


/* AUTOR: OSCAR MATEO MARTIN
 * Programa que calcule y muestre por pantalla la suma y el producto de los 10 primeros números naturales
 */
package Ejemplos;

public class Ej3 {
    public static void main(String[] args) {
        int numero = 10;
        int suma = 0;
        int producto = 1;

        for (int i = 1; i <= numero; i++) {
            suma = suma + i;
            producto = producto * i;
        }

        System.out.println("La suma de los 10 primeros números naturales es: " + suma);
        System.out.println("El producto de los 10 primeros números naturales es: " + producto);
    }
}


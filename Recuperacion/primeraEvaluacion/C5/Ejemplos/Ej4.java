/* AUTOR: OSCAR MATEO MARTIN
 * Programa que calcule y muestre por pantalla, independientemente 
 * la suma de los números pares y la suma de impares de los números comprendidos entre 100 y 200
 */
package Ejemplos;

public class Ej4 {
    public static void main(String[] args) {
        int numero1 = 100;
        int numero2 = 200;
        int sumaPares = 0;
        int sumaImpares = 0;

        for (int i = numero1; i <= numero2; i += 2) {
            sumaPares += i;
        }

        for (int i = numero1 + 1; i <= numero2; i += 2) {
            sumaImpares += i;
        }

        System.out.println("La suma de los numeros pares es: " + sumaPares);
        System.out.println("La suma de los numeros impares es: " + sumaImpares);
    }
}


/* AUTOR: OSCAR MATEO MARTIN
 *   Escribe un programa que cree un array de tamaño 100 con los primeros 100 números
 * naturales. Luego muestra la suma total y la media. Implementa una función que calcule la
 * suma de un array y otra que calcule la media de un array.
 */
import misFunciones.FunciArrays;
public class Ej15 {
    public static void main(String[] args) {
        int[] numeros = new int[100];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 1;
            System.out.print(" "+ numeros[i] + " ");
        }

        int suma = FunciArrays.calcularSuma(numeros);
        double media = FunciArrays.calcularMedia(numeros);

        System.out.println("\nSuma total: " + suma);
        System.out.println("Media: " + media);
    }
}


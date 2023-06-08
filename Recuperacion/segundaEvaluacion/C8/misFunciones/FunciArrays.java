/* AUTOR: OSCAR MATEO MARTIN
 * Funciones relacionadas con Arrays.
 */
package misFunciones;

public class FunciArrays {
    public static int calcularSuma(int[] array) {
        int suma = 0;

        for (int i = 0; i < array.length; i++) {
            suma += array[i];
        }

        return suma;
    }

    public static double calcularMedia(int[] array) {
        int suma = calcularSuma(array);
        double media = (double) suma / array.length;

        return media;
    }
}

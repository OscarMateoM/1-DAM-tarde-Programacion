/* AUTOR: OSCAR MATEO MARTIN
 * Realiza un programa que genere 10 números enteros aleatorios entre 0 y 200
 * ambos incluidos y que los almacene en un array. A continuación, el programa
 * debe mostrar el contenido de ese array junto al índice (0 – 9). Seguidamente el
 * programa debe colocar de forma alterna y en orden los menores o iguales de
 * 100 y los mayores de 100: primero menor, luego mayor, luego menor, luego
 * mayor… Cuando se acaben los menores o los mayores, se completará con los
 * números que queden.
 */
public class Ej18 {

    public static void main(String[] args) {
        int[] numeros = new int[10];
        int[] menores = new int[10];
        int[] mayores = new int[10];
        int cuentaMenores = 0;
        int cuentaMayores = 0;

        // Genera el array original y clasifica los números
        for (int i = 0; i < 10; i++) {
            numeros[i] = (int) (Math.random() * 201);

            if (numeros[i] <= 100) {
                menores[cuentaMenores++] = numeros[i];
            } else {
                mayores[cuentaMayores++] = numeros[i];
            }
        }

        System.out.println("Array original:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Índice " + i + ": " + numeros[i]);
        }

        // Genera el array resultado
        int[] resultado = new int[10];
        int menoresColocados = 0;
        int mayoresColocados = 0;

        int j = 0;
        do {

            if (menoresColocados < cuentaMenores) {
                resultado[j++] = menores[menoresColocados++];
            }

            if (mayoresColocados < cuentaMayores) {
                resultado[j++] = mayores[mayoresColocados++];
            }

        } while (j < 10);

        System.out.println("\nArray resultado:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Índice " + i + ": " + resultado[i]);
        }
    }
}



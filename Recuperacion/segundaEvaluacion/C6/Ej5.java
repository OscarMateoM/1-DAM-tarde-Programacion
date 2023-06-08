/* AUTOR: OSCAR MATEO MARTIN
 * Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos)
 * separados por espacios. Muestra también el máximo, el mínimo y la media
 * de esos números.
 */

public class Ej5 {
    public static void main(String[] args) {

        int suma = 0;
        int minimo = 199;
        int maximo = 100;

        System.out.print("Números generados: ");

        for (int i = 0; i < 50; i++) {
            int numero = (int) (Math.random() * (100)) + 100;
            System.out.print(numero + " ");

            suma += numero;

            if (numero < minimo) {
                minimo = numero;
            }

            if (numero > maximo) {
                maximo = numero;
            }
        }

        double media = (double) suma / 50;

        System.out.println("\nMínimo: " + minimo);
        System.out.println("Máximo: " + maximo);
        System.out.println("Media: " + media);
    }
}

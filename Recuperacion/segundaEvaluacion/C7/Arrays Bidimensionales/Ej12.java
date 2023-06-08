/* AUTOR: OSCAR MATEO MARTIN
 * Realiza un programa que muestre por pantalla un array de 9 filas por 9
 * columnas relleno con números aleatorios entre 500 y 900. A continuación, el
 * programa debe mostrar los números de la diagonal que va desde la esquina
 * inferior izquierda a la esquina superior derecha, así como el máximo, el mínimo
 * y la media de los números que hay en esa diagonal
 */

 public class Ej12 {
    public static void main(String[] args) {
        int[][] array = new int[9][9];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                array[i][j] = (int) (Math.random() * 401) + 500;
            }
        }

        // Creo un array para almacenar la diagonal
        int[] diagonal = new int[9];

        // Almacena los elementos de la diagonal en el array
        int cont = 0;
        for (int i = 8; i >= 0; i--) {
            diagonal[cont] = array[i][8 - i];
            cont++;
        }

        // Calcula el mínimo, máximo y media de la diagonal
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int suma = 0;

        for (int i = 0; i < diagonal.length; i++) {
            int num = diagonal[i];
            suma += num;
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }

        double media = (double) suma / 9;

    
        System.out.println("Array:");
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.printf("%4d ", array[i][j]);
            }
            System.out.println();
        }

        System.out.println("\nDiagonal:");
        for (int i = 0; i < diagonal.length; i++) {
            System.out.print(diagonal[i] + " ");
        }

        
        System.out.println("\nMínimo: " + min);
        System.out.println("Máximo: " + max);
        System.out.println("Media: " + media);
    }
}



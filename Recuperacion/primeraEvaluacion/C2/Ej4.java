/* AUTOR: OSCAR MATEO MARTIN
 * Realiza un conversor de euros a pesetas. La cantidad en euros que se quiere
 * convertir deberá estar almacenada en una variable.
 */
public class Ej4 {
    public static void main(String[] args) {
        int euros = 20;
    
        // 1 euro = 166.386 pesetas

        double pesetas = euros * 166.386;

        System.out.println(euros + " euros equivale a " + pesetas + " pesetas.");
    }
}

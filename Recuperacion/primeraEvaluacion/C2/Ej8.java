/* AUTOR: OSCAR MATEO MARTIN
 * Escribe un programa que declare 5 variables de tipo char. A continuación, crea
 * otra variable como cadena de caracteres y asígnale como valor la concatenación de las anteriores 5 variables. Por último, muestra la cadena de caracteres
 * por pantalla
 */
public class Ej8 {
    public static void main(String[] args) {
        char letra1 = 'O';
        char letra2 = 'S';
        char letra3 = 'C';
        char letra4 = 'A';
        char letra5 = 'R';

        String cadenaCaracteres = ""+letra1 + letra2 + letra3 + letra4 + letra5;

        System.out.println("La cadena de caracteres es: " + cadenaCaracteres);
    }
}

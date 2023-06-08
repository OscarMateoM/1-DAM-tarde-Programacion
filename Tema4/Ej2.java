/* AUTOR: OSCAR MATEO MARTIN
 * Realiza un programa que pida una hora por teclado y que muestre luego buenos
 * días, buenas tardes o buenas noches según la hora. Se utilizarán los tramos de
 * 6 a 12, de 13 a 20 y de 21 a 5. respectivamente. Sólo se tienen en cuenta las
 * horas, los minutos no se deben introducir por teclado.
 */
import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la hora (sin minutos): ");
        int hora = scanner.nextInt();
        scanner.close();
        String saludo;

        if (hora >= 6 && hora <= 12) {
            saludo = "Buenos días";
        } else if (hora >= 13 && hora <= 20) {
            saludo = "Buenas tardes";
        } else {
            saludo = "Buenas noches";
        }

        System.out.println(saludo);
    }
}


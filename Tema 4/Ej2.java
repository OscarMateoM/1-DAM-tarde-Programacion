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


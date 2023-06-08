import java.util.InputMismatchException;
import java.util.Scanner;

public class numeroMaximo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int maximo = Integer.MIN_VALUE;
        System.out.println("Introduce 6 numeros enteros, para saber cual es el mayor");
        for (int i = 1; i <= 6; i++) {
     try {
        System.out.print("Introduce un número: ");
        int numero = input.nextInt();

        if (numero > maximo) {
            maximo = numero;
        }
    }
        
     catch (InputMismatchException e) {
        System.out.println("El dato introducido no es correcto, tiene que introducir un número entero.");
        input.nextLine();
        i--; // Para poder introducir de nuevo el numero
    }    
    }
    System.out.println("El número maximo introducido es: " + maximo);
    input.close();
}
}

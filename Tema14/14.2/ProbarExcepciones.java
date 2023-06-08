import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ProbarExcepciones {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int opcion;

            do {
                System.out.println("1. StackOverFlowError");
                System.out.println("2. NumberFormatException");
                System.out.println("3. ArrayIndexOutOfBoundsException");
                System.out.println("4. FileNotFoundException");
                System.out.println("5. ArithmeticException");
                System.out.print("Escoja una opcion:");
                opcion = input.nextInt();

                switch (opcion) {
                    case 1:
                        stackOverflowError();
                        break;
                    case 2:
                        numberFormatException();
                        break;
                    case 3:
                        arrayIndexOutOfBoundsException();
                        break;
                    case 4:
                        fileNotFoundException();
                        break;
                    case 5:
                        arithmeticException();
                        break;
                    default:
                        System.out.println("Opcion invalida.");
                }

            } while (opcion != 5);
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        
    } catch (NumberFormatException e) {
        // TODO Auto-generated catch block
      System.out.println("Excepcion:" + e.getClass());
      System.out.println("Error:" + e.getMessage());
      System.out.println("La opcion elegida es incorrecta");
    }
    catch (ArrayIndexOutOfBoundsException e) {
        // TODO Auto-generated catch block
      System.out.println("Excepcion:" + e.getClass());
      System.out.println("Error:" + e.getMessage());
      System.out.println("La opcion elegida es incorrecta");
    }
    catch (ArithmeticException e) {
        // TODO Auto-generated catch block
      System.out.println("Excepcion:" + e.getClass());
      System.out.println("Error:" + e.getMessage());
      System.out.println("La opcion elegida es incorrecta");
    }
    catch (StackOverflowError e) {
        // TODO Auto-generated catch block
      System.out.println("Excepcion:" + e.getClass());
      System.out.println("Error:" + e.getMessage());
      System.out.println("La opcion elegida es incorrecta");
    }
    }

    public static void stackOverflowError() {
        stackOverflowError();
    }

    public static void numberFormatException() {
        String texto = "123a";
        int num = Integer.parseInt(texto);
    }

    public static void arrayIndexOutOfBoundsException() {
        int[] array = new int[5];
        System.out.println(array[10]);
    }

    public static void fileNotFoundException() throws FileNotFoundException {
        File archivo = new File("archivo.txt");
        Scanner input = new Scanner(archivo);
        input.close(); // cierra el escaner
    }

    public static void arithmeticException() {
        int num1 = 10;
        int num2 = 0;
        int result = num1 / num2;
    }
}

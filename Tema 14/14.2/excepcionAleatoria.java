import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class excepcionAleatoria {
    public static void main(String[] args) {
        try {
            Random random = new Random();
            int opcion = random.nextInt(5);

                switch (opcion) {
                    case 0:
                        numberFormatException();
                        break;
                    case 1:
                        IndexOutOfBoundsException();
                        break;
                    case 2:
                        fileNotFoundException();
                        break;
                    case 3:
                        arithmeticException();
                        break;
                    case 4:
                        IOException();
                        break;
                    default:
                        System.out.println("Opcion invalida.");
                }

            
    }catch (FileNotFoundException e) {
      System.out.println("Excepcion:" + e.getClass());
      System.out.println("Error:" + e.getMessage());
      System.out.println("Se ha generado una FileNotFoundException");
    } catch (NumberFormatException e) {
        
      System.out.println("Excepcion:" + e.getClass());
      System.out.println("Error:" + e.getMessage());
      System.out.println("Se ha generado una NumberFormatException");
    }
    catch (IndexOutOfBoundsException e) {
        
      System.out.println("Excepcion:" + e.getClass());
      System.out.println("Error:" + e.getMessage());
      System.out.println("Se ha generado una IndexOutOfBoundsException");
    }
    catch (ArithmeticException e) {
    
      System.out.println("Excepcion:" + e.getClass());
      System.out.println("Error:" + e.getMessage());
      System.out.println("Se ha generado una ArithmeticException");
    }
    catch (IOException e) {
        
      System.out.println("Excepcion:" + e.getClass());
      System.out.println("Error:" + e.getMessage());
      System.out.println("Se ha generado una IOException");
    }
    }

    public static void numberFormatException() {
        String texto = "123a";
        int num = Integer.parseInt(texto);
    }

    public static void IndexOutOfBoundsException() {
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
    public static void IOException()throws IOException {
        throw new IOException("Se ha generado una IOException");
    }
}


import java.util.Scanner;
public class pruebavehiculos {
    public static void main(String[] args) {

        int opcion = 0;
        int km;
        
        
        bicicleta bhSpeedrom = new bicicleta(9);
        coche saab93 = new coche(1900);
        Scanner input=new Scanner(System.in);
        while (opcion != 8) {
          System.out.println("\n1. Anda con la bicicleta");
          System.out.println("2. Haz el caballito con la bicicleta");
          System.out.println("3. Anda con el coche");
          System.out.println("4. Quema rueda con el coche");
          System.out.println("5. Ver kilometraje de la bicicleta");
          System.out.println("6. Ver kilometraje del coche");
          System.out.println("7. Ver kilometraje total");
          System.out.println("8. Salir");
          System.out.println("Elige una opción (1-8): ");
          String inputStr = input.nextLine();
            
          if (isNumeric(inputStr)) {
              opcion = Integer.parseInt(inputStr);
          } else {
              System.out.println("La opcion introducida no es valida.");
              continue; 
          }

          System.out.println();
          
          
          switch (opcion) {
            case 1:
              System.out.print("¿Cuántos kilómetros quiere recorrer? ");
              km = Integer.parseInt(System.console().readLine());
              bhSpeedrom.recorre(km);
              break;
            case 2:
              bhSpeedrom.hazCaballito();
              break;
            case 3:
              System.out.print("¿Cuántos kilómetros quiere recorrer? ");
              km = Integer.parseInt(System.console().readLine());
              saab93.recorre(km);
              break;
            case 4:
              saab93.quemaRueda();
              break;
            case 5:
              System.out.print("La bicicleta lleva recorridos ");
              System.out.println(bhSpeedrom.getKilometrosRecorridos() + " Km");
              break;
            case 6:
              System.out.print("El coche lleva recorridos ");
              System.out.println(saab93.getKilometrosRecorridos() + " Km");
              break;
            case 7:
              System.out.print("Los vehículos llevan recorridos ");
              System.out.println(vehiculo.getKilometrosTotales() + " Km");
            default:
            System.out.println("La opcion elegida no es correcta");
         } // switch
        } // while
        input.close(); // cierra el escaner
      }

      private static boolean isNumeric(String str){
        return str != null && str.matches("[0-9.]+");
}
    }


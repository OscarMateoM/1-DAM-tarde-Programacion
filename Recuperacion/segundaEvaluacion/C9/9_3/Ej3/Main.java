/* AUTOR: OSCAR MATEO MARTIN
 * Main del programa Animales
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();
        Scanner scanner = new Scanner(System.in);

        int opcion;
        do {
            System.out.println("        MENÚ         ");
            System.out.println("1. Mostrar lista de animales");
            System.out.println("2. Mostrar datos de un animal");
            System.out.println("3. Mostrar datos de todos los animales");
            System.out.println("4. Insertar un animal en el inventario");
            System.out.println("5. Eliminar un animal del inventario");
            System.out.println("6. Vaciar el inventario");
            System.out.println("7. Hacer que hablen todos los  animales del inventario");
            System.out.println("0. Salir");
            System.out.print("Ingrese la opción deseada: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("=== Lista de Animales ===");
                    inventario.mostrarListaAnimales();
                    System.out.println("=========================");
                    break;
                case 2:
                    System.out.print("Ingrese el nombre del animal: ");
                    scanner.nextLine(); // Consumir el salto de línea anterior
                    String nombreAnimal = scanner.nextLine();
                    System.out.println("=== Datos del Animal ===");
                    inventario.mostrarDatosAnimal(nombreAnimal);
                    System.out.println("========================");
                    break;
                case 3:
                    System.out.println("=== Datos de Todos los Animales ===");
                    inventario.mostrarDatosTodosAnimales();
                    System.out.println("===================================");
                    break;
                case 4:
                    System.out.print("Ingrese el tipo de animal (perro, gato, loro, canario): ");
                    scanner.nextLine(); 
                    String tipoAnimal = scanner.nextLine();
                    System.out.print("Ingrese el nombre del animal: ");
                    String nombreNuevo = scanner.nextLine();
                    System.out.print("Ingrese la edad del animal: ");
                    int edadNuevo = scanner.nextInt();
                    System.out.print("Ingrese el estado del animal: ");
                    scanner.nextLine(); 
                    String estadoNuevo = scanner.nextLine();

                    if (tipoAnimal.equalsIgnoreCase("perro")) {
                        System.out.print("Ingrese la raza del perro: ");
                        String razaNuevo = scanner.nextLine();
                        System.out.print("Ingrese si el perro tiene pulgas (true/false): ");
                        boolean pulgasNuevo = scanner.nextBoolean();
                        Perro perroNuevo = new Perro(nombreNuevo, edadNuevo, estadoNuevo, razaNuevo, pulgasNuevo);
                        inventario.insertarAnimal(perroNuevo);
                    } else if (tipoAnimal.equalsIgnoreCase("gato")) {
                        System.out.print("Ingrese el color del gato: ");
                        String colorNuevo = scanner.nextLine();
                        System.out.print("Ingrese si el gato tiene pelo largo (true/false): ");
                        boolean peloLargoNuevo = scanner.nextBoolean();
                        Gato gatoNuevo = new Gato(nombreNuevo, edadNuevo, estadoNuevo, colorNuevo, peloLargoNuevo);
                        inventario.insertarAnimal(gatoNuevo);
                    } else if (tipoAnimal.equalsIgnoreCase("loro")) {
                        System.out.print("Ingrese el origen del loro: ");
                        String origenNuevo = scanner.nextLine();
                        System.out.print("Ingrese si el loro habla (true/false): ");
                        boolean hablaNuevo = scanner.nextBoolean();
                        Loro loroNuevo = new Loro(nombreNuevo, edadNuevo, estadoNuevo, origenNuevo, hablaNuevo);
                        inventario.insertarAnimal(loroNuevo);
                    } else if (tipoAnimal.equalsIgnoreCase("canario")) {
                        System.out.print("Ingrese el color del canario: ");
                        String colorNuevo = scanner.nextLine();
                        System.out.print("Ingrese si el canario canta (true/false): ");
                        boolean cantaNuevo = scanner.nextBoolean();
                        Canario canarioNuevo = new Canario(nombreNuevo, edadNuevo, estadoNuevo, colorNuevo, cantaNuevo);
                        inventario.insertarAnimal(canarioNuevo);
                    } else {
                        System.out.println("Tipo de animal inválido.");
                    }
                    break;
                case 5:
                    System.out.print("Ingrese el nombre del animal a eliminar: ");
                    scanner.nextLine();
                    String nombreEliminar = scanner.nextLine();
                    inventario.eliminarAnimal(nombreEliminar);
                    break;
                case 6:
                    inventario.vaciarInventario();
                    break;
                
                case 7:
                    System.out.println("=== Hacer que todos los animales hablen ===");
                    for (Mascotas mascota : inventario.getAnimales()) {
                        mascota.habla();
                    }
                    System.out.println("=========================================");
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, ingrese una opción válida.");
                    break;
            }

            System.out.println(); 

        } while (opcion != 0);

        scanner.close();
    }

}


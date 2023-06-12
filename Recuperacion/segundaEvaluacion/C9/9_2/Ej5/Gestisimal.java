/* AUTOR: OSCAR MATEO MARTIN
 * Crea el programa GESTISIMAL (GESTIón SIMplificada de Almacén) para llevar el
 * control de los artículos de un almacén. De cada artículo se debe saber el código,
 * la descripción, el precio de compra, el precio de venta y el stock (número de
 * unidades). El menú del programa debe tener, al menos, las siguientes opciones:
 * 1. Listado
 * 2. Alta
 * 3. Baja
 * 4. Modificación
 * 5. Entrada de mercancía
 * 6. Salida de mercancía
 * 7. Salir
 * La entrada y salida de mercancía supone respectivamente el incremento y
 * decremento de stock de un determinado artículo. Hay que controlar que no
 * se pueda sacar más mercancía de la que hay en el almacén.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Gestisimal {
    private List<Articulo> articulos;
    public static void main(String[] args) {
        Gestisimal gestisimal = new Gestisimal();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("        MENÚ       ");
            System.out.println("1. Listado");
            System.out.println("2. Alta");
            System.out.println("3. Baja");
            System.out.println("4. Modificación");
            System.out.println("5. Entrada de mercancía");
            System.out.println("6. Salida de mercancía");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    gestisimal.listarArticulos();
                    break;
                case 2:
                    gestisimal.agregarArticulo();
                    break;
                case 3:
                    gestisimal.eliminarArticulo();
                    break;
                case 4:
                    gestisimal.modificarArticulo();
                    break;
                case 5:
                    gestisimal.entradaMercancia();
                    break;
                case 6:
                    gestisimal.salidaMercancia();
                    break;
                case 7:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                    break;
            }
        } while (opcion != 7);
    }
    public Gestisimal() {
        articulos = new ArrayList<>();
    }

    public void listarArticulos() {
        System.out.println("=== Listado de Artículos ===");
        if (articulos.isEmpty()) {
            System.out.println("No hay artículos en el almacén.");
        } else {
            for (Articulo articulo : articulos) {
                System.out.println(articulo);
            }
        }
        System.out.println("============================");
    }

    public void agregarArticulo() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el código del artículo: ");
        String codigo = scanner.nextLine();
        System.out.print("Ingrese la descripción del artículo: ");
        String descripcion = scanner.nextLine();
        System.out.print("Ingrese el precio de compra del artículo: ");
        double precioCompra = scanner.nextDouble();
        System.out.print("Ingrese el precio de venta del artículo: ");
        double precioVenta = scanner.nextDouble();
        System.out.print("Ingrese el stock del artículo: ");
        int stock = scanner.nextInt();

        Articulo articulo = new Articulo(codigo, descripcion, precioCompra, precioVenta, stock);
        articulos.add(articulo);

        System.out.println("Artículo agregado correctamente.");
    }

    public void eliminarArticulo() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el código del artículo a eliminar: ");
        String codigo = scanner.nextLine();

        boolean encontrado = false;
        for (Articulo articulo : articulos) {
            if (articulo.getCodigo().equals(codigo)) {
                articulos.remove(articulo);
                encontrado = true;
                System.out.println("Artículo eliminado correctamente.");
                break;
            }
        }

        if (!encontrado) {
            System.out.println("No se encontró un artículo con el código especificado.");
        }
    }

    public void modificarArticulo() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el código del artículo a modificar: ");
        String codigo = scanner.nextLine();

        boolean encontrado = false;
        for (Articulo articulo : articulos) {
            if (articulo.getCodigo().equals(codigo)) {
                System.out.print("Ingrese la nueva descripción del artículo: ");
                String descripcion = scanner.nextLine();
                System.out.print("Ingrese el nuevo precio de compra del artículo: ");
                double precioCompra = scanner.nextDouble();
                System.out.print("Ingrese el nuevo precio de venta del artículo: ");
                double precioVenta = scanner.nextDouble();

                articulo.setDescripcion(descripcion);
                articulo.setPrecioCompra(precioCompra);
                articulo.setPrecioVenta(precioVenta);

                encontrado = true;
                System.out.println("Artículo modificado correctamente.");
                break;
            }
        }

        if (!encontrado) {
            System.out.println("No se encontró un artículo con el código especificado.");
        }
    }

    public void entradaMercancia() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el código del artículo: ");
        String codigo = scanner.nextLine();

        boolean encontrado = false;
        for (Articulo articulo : articulos) {
            if (articulo.getCodigo().equals(codigo)) {
                System.out.print("Ingrese la cantidad de mercancía a ingresar: ");
                int cantidad = scanner.nextInt();

                articulo.incrementarStock(cantidad);

                encontrado = true;
                System.out.println("Mercancía ingresada correctamente.");
                break;
            }
        }

        if (!encontrado) {
            System.out.println("No se encontró un artículo con el código especificado.");
        }
    }

    public void salidaMercancia() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el código del artículo: ");
        String codigo = scanner.nextLine();

        boolean encontrado = false;
        for (Articulo articulo : articulos) {
            if (articulo.getCodigo().equals(codigo)) {
                System.out.print("Ingrese la cantidad de mercancía a sacar: ");
                int cantidad = scanner.nextInt();

                if (articulo.getStock() >= cantidad) {
                    articulo.decrementarStock(cantidad);
                    encontrado = true;
                    System.out.println("Mercancía sacada correctamente.");
                } else {
                    System.out.println("No hay suficiente mercancía en el almacén.");
                }

                break;
            }
        }

        if (!encontrado) {
            System.out.println("No se encontró un artículo con el código especificado.");
        }
    }

}

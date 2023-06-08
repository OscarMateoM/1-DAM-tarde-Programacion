import java.util.ArrayList;
import java.util.Iterator;

public class Producto {
    private String nombre;
    private int cantidad;

    public Producto(String nombre, int cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public static void main(String[] args) {

        Producto producto1 = new Producto("Manzana", 10);
        Producto producto2 = new Producto("Naranja", 5);
        Producto producto3 = new Producto("Pera", 8);
        Producto producto4 = new Producto("Platano", 3);
        Producto producto5 = new Producto("Pomelo", 12);

        
        ArrayList<Producto> listaProductos = new ArrayList<>();

        listaProductos.add(producto1);
        listaProductos.add(producto2);
        listaProductos.add(producto3);
        listaProductos.add(producto4);
        listaProductos.add(producto5);

        // Visualizar el contenido del ArrayList utilizando Iterator
        Iterator<Producto> iterator = listaProductos.iterator();
        while (iterator.hasNext()) {
            Producto producto = iterator.next();
            System.out.println("Nombre: " + producto.getNombre() + ", Cantidad: " + producto.getCantidad());
        }

        listaProductos.remove(0);
        listaProductos.remove(1);

        Producto producto6 = new Producto("Melocoton", 7);
        listaProductos.add(2, producto6);

        // Visualizar el contenido del ArrayList utilizando Iterator
        System.out.println("Después de cambiar los datos:");
        iterator = listaProductos.iterator();
        while (iterator.hasNext()) {
            Producto producto = iterator.next();
            System.out.println("Nombre: " + producto.getNombre() + ", Cantidad: " + producto.getCantidad());
        }

        listaProductos.clear();
    }
}


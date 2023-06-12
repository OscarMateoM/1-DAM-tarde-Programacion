/* AUTOR: OSCAR MATEO MARTIN
 * Clase Tarjeta Regalo
 */
public class tarjetaRegalo {
    private int numero;
    private double saldo;

    public tarjetaRegalo(double saldo) {
        this.numero = generarNumeroAleatorio();
        this.saldo = saldo;
    }

    public void gasta(double cantidad) {
        if (cantidad <= saldo) {
            saldo -= cantidad;
        } else {
            System.out.println("No tiene suficiente saldo para gastar " + cantidad + " euros");
        }
    }

    public tarjetaRegalo fusionaCon(tarjetaRegalo otraTarjeta) {
        double nuevoSaldo = saldo + otraTarjeta.saldo;
        tarjetaRegalo nuevaTarjeta = new tarjetaRegalo(nuevoSaldo);
        saldo = 0;
        otraTarjeta.saldo = 0;
        return nuevaTarjeta;
    }

    private int generarNumeroAleatorio() {
        return (int) (Math.random() * (90000) + 10000); // Genera un número aleatorio de 5 dígitos
    }

    @Override
    public String toString() {
        return "Tarjeta nº " + numero + " - Saldo " + String.format("%.2f", saldo) + " euros";
    }
}

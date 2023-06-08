/* AUTOR: OSCAR MATEO MARTIN
 * Escribe un programa que calcule el total de una factura a partir de la base
 * imponible (precio sin IVA). La base imponible estará almacenada en una
 * variable.
 */

public class Ej6 {
    // Base Imponible = Total de la factura / (1 + IVA/100)
    // Teniendo en cuenta esta formula podemos deducir que el total de la factura será
    // Total de la factura = Base Imponible * (1 + IVA/100)
    public static void main(String[] args) {
        double baseImponible = 300.0;

        double totalFactura = baseImponible * (1 + 0.21);

        System.out.println("El total de la factura es: " + totalFactura);
    }
}

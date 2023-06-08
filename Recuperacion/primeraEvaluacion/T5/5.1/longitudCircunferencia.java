/* AUTOR: OSCAR MATEO MARTIN
 * Escribir un programa que calcule y muestre la longitud de una circunferencia de radio = 5 cm
 */
public class longitudCircunferencia {
    public static void main(String[] args) {
        double radio = 5.0;
        double longitud = 2 * Math.PI * radio;
        
        System.out.println("La longitud de la circunferencia de radio " + radio + " cm es: " + longitud + " cm");
    }
}


/* AUTOR: OSCAR MATEO MARTIN
 * Escribir un programa que calcule y muestre el volumen de una esfera de radio = 8,75 cm
 */
public class volumenEsfera {
    public static void main(String[] args) {
        double radio = 8.75;
        double volumen = (4.0 / 3.0) * Math.PI * (radio * radio * radio);
        
        System.out.println("El volumen de la esfera de radio " + radio + " cm es: " + volumen + " cm³");
    }
}


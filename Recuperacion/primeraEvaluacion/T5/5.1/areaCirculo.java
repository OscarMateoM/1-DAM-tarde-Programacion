/* AUTOR: OSCAR MATEO MARTIN
 * Escribir un programa que calcule y muestre el área de un círculo de radio = 7,125 cm
 */
public class areaCirculo {
    public static void main(String[] args) {
        double radio = 7.125;
        double area = Math.PI * radio * radio;
        
        System.out.println("El área del círculo de radio " + radio + " cm es: " + area + " cm²");
    }
}


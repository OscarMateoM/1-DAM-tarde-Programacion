/* AUTOR: OSCAR MATEO MARTIN
 * Realiza un generador de melodía.
 */
public class Ej15 {
    public static void main(String[] args) {
        String[] notas = {"do", "re", "mi", "fa", "sol", "la", "si"};

        int numeroNotas = (int) (Math.random() * 7) + 1;
        int compases = (numeroNotas / 4) * 4; 

        String melodia = "";

        for (int i = 0; i < compases; i++) {
            for (int j = 0; j < 4; j++) {
                int indiceNota = (int) (Math.random() * 7);
                melodia += notas[indiceNota] + " ";
            }

            melodia += "| ";
        }

        // Añadir última nota igual a la primera
        if (!melodia.isEmpty()) {
            melodia += " " + melodia.substring(0, 2);
        }
        

        System.out.println(melodia);
    }
}
    
/* AUTOR: OSCAR MATEO MARTIN
 * Realiza un minicuestionario con 10 preguntas tipo test sobre las asignaturas
 * que se imparten en el curso. Cada pregunta acertada sumará un punto. El
 * programa mostrará al final la calificación obtenida. Pásale el minicuestionario a
 * tus compañeros y pídeles que lo hagan para ver qué tal andan de conocimientos
 * en las diferentes asignaturas del curso.
 */
import java.util.Scanner;

public class Ej12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int puntuacion = 0;

        System.out.println("Cuestionario tipo test Programacion");
        System.out.println("-------------------------------------");

        // Pregunta 1
        System.out.println("1. ¿Cuál es la sintaxis correcta para una sentencia if en Java?");
        System.out.println("a) if (condicion) { }");
        System.out.println("b) if {condicion} :");
        System.out.println("c) if {condicion} then");

        String respuesta1 = scanner.nextLine();
        if (respuesta1.equals("a")) {
            puntuacion++;
        }

        // Pregunta 2
        System.out.println("2. ¿Cuál es la palabra clave utilizada para una sentencia else if en Java?");
        System.out.println("a) else");
        System.out.println("b) otherwise");
        System.out.println("c) elseif");

        String respuesta2 = scanner.nextLine();
        if (respuesta2.equals("c")) {
            puntuacion++;
        }
        // Pregunta 3
        System.out.println("3. ¿Cuál de las siguientes opciones NO es un bucle en Java?");
        System.out.println("a) for");
        System.out.println("b) loop");
        System.out.println("c) while");

        String respuesta3 = scanner.nextLine();
        if (respuesta3.equals("b")) {
            puntuacion++;
        }
        // Pregunta 4
        System.out.println("4. ¿Cuál es la sintaxis correcta para un bucle for en Java?");
        System.out.println("a) for (inicializacion; condicion; incremento) { }");
        System.out.println("b) for {inicializacion; incremento; condicion) { } ");
        System.out.println("c) for (incremento; condicion; inicializacion) { }");

        String respuesta4 = scanner.nextLine();
        if (respuesta4.equals("a")) {
            puntuacion++;
        }
        // Pregunta 5
        System.out.println("5. ¿Cuál es el operador utilizado para realizar una comparación de igualdad en Java?");
        System.out.println("a) ==");
        System.out.println("b) =");
        System.out.println("c) ===");
    
            String respuesta5 = scanner.nextLine();
            if (respuesta5.equals("a")) {
                puntuacion++;
            }
        // Pregunta 6
        System.out.println("6. ¿Cuál de las siguientes opciones NO es un operador de comparación en Java?");
        System.out.println("a) >=");
        System.out.println("b) <>");
        System.out.println("c) <");

        String respuesta6 = scanner.nextLine();
        if (respuesta6.equals("b")) {
            puntuacion++;
        }  
        // Pregunta 7
        System.out.println("7. ¿Cuál es la sintaxis correcta para un bucle do-while en Java?");
        System.out.println("a) do { } while (condicion);");
        System.out.println("b) do { } until (condicion);");
        System.out.println("c) do (condicion) { } while;");


        String respuesta7 = scanner.nextLine();
        if (respuesta7.equals("a")) {
            puntuacion++;
        }
        // Pregunta 8
        System.out.println("8. ¿Cuál es el operador utilizado para realizar una comparación de desigualdad en Java?");
        System.out.println("a) <>");
        System.out.println("b) =!");
        System.out.println("c) !=");

        String respuesta8 = scanner.nextLine();
        if (respuesta8.equals("c")) {
            puntuacion++;
        }
        // Pregunta 9
        System.out.println("9. ¿Cuál de las siguientes opciones NO es un operador lógico en Java?");
        System.out.println("a) &&");
        System.out.println("b) ||");
        System.out.println("c) !=");


        String respuesta9 = scanner.nextLine();
        if (respuesta9.equals("c")) {
            puntuacion++;
        }
        // Pregunta 10
        System.out.println("10. ¿Cuál es la sintaxis correcta para un bucle while en Java?");
        System.out.println("a) while (condicion) { }");
        System.out.println("b) do { } while (condicion);");
        System.out.println("c) for (inicializacion; condicion; incremento) { }");

        String respuesta10 = scanner.nextLine();
        if (respuesta10.equals("a")) {
            puntuacion++;
        }
        // Calcular y mostrar la calificación obtenida
        System.out.println("-------------------------------------");
        System.out.println("Tu calificación final es: " + puntuacion + " puntos");

        scanner.close();
    }
}


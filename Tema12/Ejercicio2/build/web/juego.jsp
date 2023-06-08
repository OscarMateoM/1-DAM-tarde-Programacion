<%-- 
    Document   : juego
    Created on : 23 may 2023, 1:53:18
    Author     : Oscar Mateo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.Random" %>
<%@page import="dam1.Personajes"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Juego - Piedra, Papel, Tijera</title>
    <link href="estilos.css" rel="stylesheet" type="text/css"/>
</head>
<body>
    <%!// Funciones
      public String mostrarImagen(String imagen) {
            return "<img src=\"" + imagen + "\" width=\"90\">";
        }
    %> 
    
    <%
        Personajes personaje1 = new Personajes(request.getParameter("nombre1"), "cr7.jpg");
        Personajes personaje2 = new Personajes(request.getParameter("nombre2"), "messi.png");

        int puntosPersonajes1 = 0;
        int puntosPersonajes2 = 0;
        String[] opciones = {"piedra", "papel", "tijera"};
        Random random = new Random();
        
        // Se jugara mientras ninguno de los 2 jugadores llegue a 5 puntos
        while (puntosPersonajes1 < 5 && puntosPersonajes2 < 5) {
            String jugadaPersonajes1 = opciones[random.nextInt(opciones.length)];
            String jugadaPersonajes2 = opciones[random.nextInt(opciones.length)];
           
            // Determinar las imágenes para cada jugada
            String imagenJugadaPersonajes1 = "";
            String imagenJugadaPersonajes2 = "";
            if (jugadaPersonajes1.equals("piedra")) {
                imagenJugadaPersonajes1 = "piedra.jpg";
            } else if (jugadaPersonajes1.equals("papel")) {
                imagenJugadaPersonajes1 = "papel.jpg";
            } else if (jugadaPersonajes1.equals("tijera")) {
                imagenJugadaPersonajes1 = "tijeras.jpg";
            }

            if (jugadaPersonajes2.equals("piedra")) {
                imagenJugadaPersonajes2 = "piedra.jpg";
            } else if (jugadaPersonajes2.equals("papel")) {
                imagenJugadaPersonajes2 = "papel.jpg";
            } else if (jugadaPersonajes2.equals("tijera")) {
                imagenJugadaPersonajes2 = "tijeras.jpg";
            }
            
            int resultado = personaje1.jugar(jugadaPersonajes1, jugadaPersonajes2);
            
            // Actualizamos el marcador
            if (resultado == 1) {
                puntosPersonajes1++;
            } else if (resultado == -1) {
                puntosPersonajes2++;
            }
            
            // Mostrar la jugada y los puntos de cada jugador
           out.println("<div class=\"personajes\">" + personaje1.mostrarImagen() + personaje1.getNombre() + "  " + mostrarImagen(imagenJugadaPersonajes1) +"  Marcador  " + puntosPersonajes1 + " : " + puntosPersonajes2 + "  " + mostrarImagen(imagenJugadaPersonajes2)+ "  " + personaje2.getNombre() + personaje2.mostrarImagen() + "</div>");
           out.println("<hr>");
        }
        
            // Mostramos el ganador de la partida
        if (puntosPersonajes1 >= 5) {
            out.println("<h2>" + personaje1.mostrarImagen()+"  ¡"+ personaje1.getNombre() + " ha ganado la partida!</h2>");
        } else {
            out.println("<h2>" + personaje2.mostrarImagen()+"  ¡"+ personaje2.getNombre() + " ha ganado la partida!</h2>");
        }
    %>
</body>
</html>
<%-- 
    Document   : datos
    Created on : 15 may 2023, 17:12:45
    Author     : oski0
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.Random"%>
<%@page import="dam1.Personajes"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ej1</title>
              <link href="estilos.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
      <%
        String[] frasesPersonaje1 = {"he ganado 5 champions", "soy una leyenda del Real Madrid", "soy el máximo goleador de Portugal", "tengo 38 años"};
        String[] frasesPersonaje2 = {"he ganado 4 champions", "he ganado 1 mundial", "soy una leyenda del FC Barcelona", "tengo 35 años"};
        String[] frasesPersonaje3 = {"he ganado 5 champions", "tengo 1 balon de oro", "soy una leyenda en Croacia", "tengo 37 años"};

        Random random = new Random();

        String fraseAleatoriaPersonaje1 = frasesPersonaje1[random.nextInt(frasesPersonaje1.length)];
        String fraseAleatoriaPersonaje2 = frasesPersonaje2[random.nextInt(frasesPersonaje2.length)];
        String fraseAleatoriaPersonaje3 = frasesPersonaje3[random.nextInt(frasesPersonaje3.length)];

        Personajes p1 = new Personajes(request.getParameter("nombre1"), "cr7.jpg", fraseAleatoriaPersonaje1);
        Personajes p2 = new Personajes(request.getParameter("nombre2"), "messi.jpg", fraseAleatoriaPersonaje2);
        Personajes p3 = new Personajes(request.getParameter("nombre3"), "modric.png", fraseAleatoriaPersonaje3);
        out.println(p1);
        out.println(p2.habla1());
        out.println(p3.habla2());
        
      %>
    </body>
</html>

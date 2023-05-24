<%-- index.jsp (Juego Piedra,papel,tijera) --%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="dam1.Personajes"%>
<!DOCTYPE html>
<html>
    <head>
      <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
      <title>Piedra,Papel,Tijera</title>
      <link href="estilos.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
      <h1>Personajes para el juego</h1>
      <hr>
    <form method="post" action="juego.jsp">
      <p>Introduce el nombre de los 2 personajes:</p>

      <input type="text" name="nombre1" placeholder="Cristiano Ronaldo">
      <input type="text" name="nombre2" placeholder="Leo Messi">
      <input type="submit" value="CONFIRMAR">
    </form>
    </body>
</html>

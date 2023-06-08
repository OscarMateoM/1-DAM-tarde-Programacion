<%-- index.jsp (proyecto GatosConClaseYBocadillos) --%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="dam1.Personajes"%>
<!DOCTYPE html>
<html>
    <head>
      <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
      <title>Ejercicio1</title>
      <link href="estilos.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
      <h1>Personajes Ejercicio 1</h1>
      <hr>
    <form method="post" action="datos.jsp">
      <p>Introduce el nombre de los 3 personajes:</p>

      <input type="text" name="nombre1" placeholder="Cristiano Ronaldo">
      <input type="text" name="nombre2" placeholder="Leo Messi">
      <input type="text" name="nombre3" placeholder="Luka Modric">
      <input type="submit" value="CONFIRMAR">
    </form>
    </body>
</html>
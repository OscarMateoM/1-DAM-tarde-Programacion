<!DOCTYPE html>
<!--
Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Html.html to edit this template
-->
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Ejercicio 25</title>
           <link href="estilos.css" rel="stylesheet" type="text/css"/>
</head>
<body>
    <h1>Tiradas de dados</h1>

    <%!// Funciones
        public int tirarDado() {
            return (int) (Math.random() * 6) + 1;
        }
    %>
    
    <%!// Funciones
      public String mostrarImagen(String imagen) {
            return "<img src=\"" + imagen + "\" width=\"90\">";
        }
    %>   
    
    <%!// Funciones
      public String obtenerImagenDado(int numeroDado) {
            String imagen = "";
          if (numeroDado == 1) {
              imagen = "1.png";
         } else if (numeroDado == 2) {
                  imagen = "2.png";
         } else if (numeroDado == 3) {
                  imagen = "3.png";
         } else if (numeroDado == 4) {
                  imagen = "4.png";
         } else if (numeroDado == 5) {
                  imagen = "5.png";
         } else if (numeroDado == 6) {
                  imagen = "6.png";
         }
            return imagen;
        }
    %>

    <%
        int dado1, dado2, dado3;
        boolean tiradaExitosa = false;

        do {
            dado1 = tirarDado();
            String imagenDado1 = obtenerImagenDado(dado1);
            dado2 = tirarDado();
            String imagenDado2 = obtenerImagenDado(dado2);
            dado3 = tirarDado();
            String imagenDado3 = obtenerImagenDado(dado3);

            out.println("<div class=\"dados\">" + mostrarImagen(imagenDado1) + " " + mostrarImagen(imagenDado2) + " " + mostrarImagen(imagenDado3) + "</div><br>");

            if (dado1 == dado2 && dado2 == dado3) {
                tiradaExitosa = true;
            }
        } while (!tiradaExitosa);
            out.println("<h2>ENHORABUENA, LOS TRES DADOS COINCIDEN!</h2>");
    %>

</body>
</html>

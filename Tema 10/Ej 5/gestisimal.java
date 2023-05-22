// Ejercicio 5 de la tarea 9.2 (Gestisimal) copiado de las soluciones del libro, modificado e implementado con ArrayList en vez de array normal.

import java.util.ArrayList;
import java.util.Scanner;

public class gestisimal {

  // N determina el tamaño del array
  static final int N = 100;
  static ArrayList<articulo> articulos = new ArrayList<articulo>(N);

  public static void main(String[] args) {
    for (int i = 0; i < N; i++) {
      articulos.add(new articulo());
    }

    int opcion;
    int stockIntroducido;
    double precioDeCompraIntroducido;
    double precioDeVentaIntroducido;
    String codigoIntroducido = "";
    String descripcionIntroducida;

    try (Scanner s = new Scanner(System.in)) {
      // MENU ///////////////////////////////////////////////////////////////////
      do {
        pintaTitulo("G E S T I S I M A L");
        System.out.println("1. Listado");
        System.out.println("2. Alta");
        System.out.println("3. Baja");
        System.out.println("4. Modificación");
        System.out.println("5. Entrada de mercancía");
        System.out.println("6. Salida de mercancía");
        System.out.println("7. Salir");
        System.out.print("Introduzca una opción: ");
        opcion = Integer.parseInt(s.nextLine());
        
        switch (opcion) {

          // LISTADO ////////////////////////////////////////////////////////////
          case 1:
            pintaTitulo("LISTADO");
            
            for(articulo a : articulos) {
              if (!a.getCodigo().equals("LIBRE")) {
                System.out.println(a);
              }
            }
 
            break;

          // ALTA ///////////////////////////////////////////////////////////////
          case 2:
            pintaTitulo("NUEVO ARTÍCULO");
            
            if (primeraPosicionLibre() == N) {
              System.out.println("Lo siento, la base de datos está llena.");
            } else {
              
              // Introducción de datos 
              System.out.println("Por favor, introduzca los datos del artículo.");  
              System.out.print("Código: ");
              
              // Comprueba que el código introducido no se repita
              do {
                codigoIntroducido = s.nextLine();
                if (existeCodigo(codigoIntroducido)) {
                  System.out.println("Ese código ya existe en la base de datos.");
                  System.out.print("Introduzca otro código: ");
                }
              } while (existeCodigo(codigoIntroducido));
              
              System.out.print("Descripcion: ");
              descripcionIntroducida = s.nextLine();
              System.out.print("Precio de compra: ");
              precioDeCompraIntroducido = Double.parseDouble(s.nextLine());
              System.out.print("Precio de venta: ");
              precioDeVentaIntroducido = Double.parseDouble(s.nextLine());
              System.out.print("Stock: ");
              stockIntroducido = Integer.parseInt(s.nextLine());

              // Crea el nuevo artículo
              articulos.set(primeraPosicionLibre(), new articulo(
                  codigoIntroducido, descripcionIntroducida, precioDeCompraIntroducido,
                  precioDeVentaIntroducido, stockIntroducido));
            }
            
            break;

          // BAJA ///////////////////////////////////////////////////////////////
          case 3:
            pintaTitulo("BAJA");
            
            System.out.print("Por favor, introduzca el código del artículo: ");
            codigoIntroducido = s.nextLine();
      
            if (!existeCodigo(codigoIntroducido)) {
              System.out.println("Lo siento, el código introducido no existe.");
            } else {
              articulos.get(posicionConCodigo(codigoIntroducido)).setCodigo("LIBRE");
              System.out.println("Artículo borrado.");
            }
            
            break;
            
          // MODIFICACIÓN ///////////////////////////////////////////////////////
          case 4:
            pintaTitulo("MODIFICACIÓN");
            
            System.out.print("Por favor, introduzca el código del artículo: ");
            codigoIntroducido = s.nextLine();

            if (!existeCodigo(codigoIntroducido)) {
              System.out.println("Lo siento, el código introducido no existe.");
            } else {
              System.out.print("Introduzca los nuevos datos del artículo");
              System.out.println(" o INTRO para dejarlos igual.");
        
              int i = posicionConCodigo(codigoIntroducido);
              articulo articulo = articulos.get(i);

              System.out.println("Código: " + articulo.getCodigo());
              System.out.print("Nuevo código: ");
              codigoIntroducido = s.nextLine();
              if (!codigoIntroducido.equals("")) {
                articulo.setCodigo(codigoIntroducido);
              }
              
              System.out.println("Descripción: " + articulo.getDescripcion());
              System.out.print("Nueva descripción: ");
              descripcionIntroducida = s.nextLine();
              if (!descripcionIntroducida.equals("")) {
                articulo.setDescripcion(descripcionIntroducida);
              }
              
              System.out.println("Precio de compra: " + articulo.getPrecioDeCompra());
              System.out.print("Nuevo precio de compra: ");
              String precioDeCompraIntroducidoString = s.nextLine();
              if (!precioDeCompraIntroducidoString.equals("")) {
                articulo.setPrecioDeCompra(Double.parseDouble(precioDeCompraIntroducidoString));
              }
              System.out.println("Precio de venta: " + articulo.getPrecioDeVenta());
              System.out.print("Nuevo precio de venta: ");
              String precioDeVentaIntroducidoString = s.nextLine();
              if (!precioDeVentaIntroducidoString.equals("")) {
                articulo.setPrecioDeVenta(Double.parseDouble(precioDeVentaIntroducidoString));
              }
              System.out.println("Stock: " + articulo.getStock());
              System.out.print("Nuevo stock: ");
              String stockIntroducidoString = s.nextLine();
              if (!stockIntroducidoString.equals("")) {
                articulo.setStock(Integer.parseInt(stockIntroducidoString));
              }
            }
            
            break;
 
            // ENTRADA DE MERCANCÍA /////////////////////////////////////////////
            case 5:
              pintaTitulo("ENTRADA DE MERCANCÍA");
              
              System.out.print("Por favor, introduzca el código del artículo: ");
              codigoIntroducido = s.nextLine();
          
              if (!existeCodigo(codigoIntroducido)) {
                System.out.println("Lo siento, el código introducido no existe.");
              } else {
                int i = posicionConCodigo(codigoIntroducido);
                System.out.println("Entrada de mercancía del siguiente artículo: ");
                System.out.println(articulos.get(i));
                System.out.print("Introduzca el número de unidades que entran: ");
                String stockIntroducidoString = s.nextLine();
                articulo articulo = articulos.get(i);
                articulo.setStock(
                  Integer.parseInt(stockIntroducidoString) + articulo.getStock());
                System.out.println("La mercancía ha entrado en el almacén.");  
              }
              
              break;

              // SALIDA DE MERCANCÍA ////////////////////////////////////////////
              case 6:
                pintaTitulo("SALIDA DE MERCANCÍA");
                
                System.out.print("Por favor, introduzca el código del artículo: ");
                codigoIntroducido = s.nextLine();

                if (!existeCodigo(codigoIntroducido)) {
                  System.out.println("Lo siento, el código introducido no existe.");
                } else {
                  int i = posicionConCodigo(codigoIntroducido);
                  System.out.println("Salida de mercancía del siguiente artículo: ");
                  System.out.println(articulos.get(i));
                  System.out.print("Introduzca el número de unidades que desea sacar del almacén: ");
                  stockIntroducido = Integer.parseInt(s.nextLine());
                  articulo articulo = articulos.get(i);
                  if (articulo.getStock() - stockIntroducido > 0) {
                    articulo.setStock(articulo.getStock() - stockIntroducido);
                    System.out.println("La mercancía ha salido del almacén.");
                  } else {
                    System.out.println("Lo siento, no se pueden sacar tantas unidades.");
                  }
                }
                
                break;
        } // switch
      } while (opcion != 7);
    } catch (NumberFormatException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }

  // FUNCIONES ////////////////////////////////////////////////////////////////

  /**
   * Busca la primera posición libre del array.
   * Si no quedan huecos, devuelve -1.
   * 
   * @return primera posición libre del array o -1 si no quedan huecos
   */
  public static int primeraPosicionLibre() {
    for (int i = 0; i < articulos.size(); i++) {
      if (articulos.get(i).equals("LIBRE")) {
        return i;
      }
    }
    return -1;
  }
  
  /**
   * Dice si existe o no un artículo con un determinado código.
   * 
   * @return true si existe el código y false si no existe
   */
  public static boolean existeCodigo(String codigo) {
    for (articulo a : articulos) {
      if (a.getCodigo().equals(codigo)) {
        return true;
      }
    }
    return false;
  }
  
  /**
   * Pinta un título con subrayado.
   */
  public static void pintaTitulo(String titulo) {
    System.out.println("\n" + titulo);
    for (int i = 0; i < titulo.length(); i++) {
      System.out.print("=");  
    }
    System.out.println();
  }

  /**
   * Devuelve la posición dentro del array en la que se encuentra un artículo
   * con un determinado código.
   * Si el código no se encuentra, devuelve -1.
   * 
   * @return posición dentro del array en la que se encuentra un artículo
   */
  public static int posicionConCodigo(String codigo) {
    for (int i = 0; i < articulos.size(); i++) {
      if (articulos.get(i).equals(codigo)) {
        return i;
      }
    }
    return -1;
  }
  
}
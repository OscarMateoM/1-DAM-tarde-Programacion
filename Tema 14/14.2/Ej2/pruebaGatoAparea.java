package Ej2;

public class pruebaGatoAparea {

        public static void main(String[] args) {
          gato pepe = new gato("macho");
          gato juan = new gato("macho");
          try {
            juan.apareaCon(pepe);
          } catch (ExcepcionApareamientoImposible e) {
            e.printStackTrace();
            System.out.println("Dos animales del mismo género no pueden aparearse.");
          }
        }
        
      }

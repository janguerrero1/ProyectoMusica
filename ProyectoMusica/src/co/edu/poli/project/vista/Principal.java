package co.edu.poli.project.vista;

import java.util.Scanner;

import co.edu.poli.project.model.Usuario;

public class Principal {
  public static void main(String args[]) {
	  
	  Scanner scanner = new Scanner(System.in);
      boolean salir = false;

    //Usuario Ejemplo
      Usuario usuario = new Usuario("Ejemplo", 25, "Ingeniería", "Rock", 6);

      while (!salir) {
          System.out.println("** Menú **");
          System.out.println("1. Ver información del usuario");
          System.out.println("2. Crear una nueva lista de reproducción");
          System.out.println("3. Ver canciones de una lista de reproducción");
          System.out.println("4. Salir");
          System.out.print("Ingrese la opción deseada: ");

          int opcion = scanner.nextInt();
          scanner.nextLine(); 

          switch (opcion) {
              case 1:
                  System.out.println(usuario);
                  break;
              case 2:
                  System.out.print("Ingrese el nombre de la lista de reproducción: ");
                  String nombrePlaylist = scanner.nextLine();
                  System.out.print("Ingrese el artista favorito asociado: ");
                  String artistaFav = scanner.nextLine();
                  usuario.crearPlaylist(nombrePlaylist, artistaFav);
                  break;
              case 3:
                  System.out.print("Ingrese el nombre de la lista de reproducción: ");
                  nombrePlaylist = scanner.nextLine();
                  usuario.verCancionesPlaylist(nombrePlaylist);
                  break;
              case 4:
                  salir = true;
                  break;
              default:
                  System.out.println("Opción no válida, por favor intente nuevamente.");
                  break;
          }
      }

      System.out.println("¡Hasta luego!");
      scanner.close();
	  
	  
  }
}

package co.edu.poli.project.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Playlist {
        private String nombre;	
        private Cancion[] canciones;
        private String artistaFav;
        private int numSongs;
        private String creador;
        private int calificacion;
        

		public Playlist(String nombre, Cancion[] canciones, String artistaFav, int numSongs, String creador,
				int calificacion) {
			super();
			this.nombre = nombre;
			this.canciones = canciones;
			this.artistaFav = artistaFav;
			this.numSongs = numSongs;
			this.creador = creador;
			this.calificacion = calificacion;
		}


		public void agregarCancion(Cancion cancion) {
		    for (Cancion c : canciones) {
		        if (c.equals(cancion)) {
		            System.out.println("La canción ya está en la lista.");
		            return;
		        }
		    }
		    Cancion[] nuevaLista = Arrays.copyOf(canciones, canciones.length + 1);
		    nuevaLista[canciones.length] = cancion;
		    canciones = nuevaLista;
		    numSongs++;
		}
	
		public void eliminarCancion(Cancion cancion) {
		    List<Cancion> nuevaLista = new ArrayList<>(Arrays.asList(canciones));
		    if (nuevaLista.remove(cancion)) {
		        canciones = nuevaLista.toArray(new Cancion[0]);
		        numSongs--;
		        System.out.println("Canción eliminada exitosamente.");
		    } else {
		        System.out.println("La canción no se encontró en la lista.");
		    }
		}
		
		
		
		public Cancion[] getCanciones() {
			return canciones;
		}

		public void setCanciones(Cancion[] canciones) {
			this.canciones = canciones;
		}

		public String getArtistaFav() {
			return artistaFav;
		}

		public void setArtistaFav(String artistaFav) {
			this.artistaFav = artistaFav;
		}

		public int getNumSongs() {
			return numSongs;
		}

		public void setNumSongs(int numSongs) {
			this.numSongs = numSongs;
		}

		public String getCreador() {
			return creador;
		}

		public void setCreador(String creador) {
			this.creador = creador;
		}

		public int getCalificacion() {
			return calificacion;
		}

		public void setCalificacion(int calificacion) {
			this.calificacion = calificacion;
		}
		

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}



		@Override
		public String toString() {
			return "Playlist [nombre=" + nombre + ", canciones=" + Arrays.toString(canciones) + ", artistaFav="
					+ artistaFav + ", numSongs=" + numSongs + ", creador=" + creador + ", calificacion=" + calificacion
					+ "]";
		}



	

		
        
        
        
}

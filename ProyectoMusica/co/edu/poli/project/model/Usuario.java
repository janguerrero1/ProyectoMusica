package co.edu.poli.project.model;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
   private String nombre;
   private int edad;
   private String carrera;
   private String generoFav;
   private int semestre;
   private List<Playlist> playlists;
   
public Usuario(String nombre, int edad, String carrera, String generoFav, int semestre) {
	super();
	this.nombre = nombre;
	this.edad = edad;
	this.carrera = carrera;
	this.generoFav = generoFav;
	this.semestre = semestre;
}

public void crearPlaylist(String nombre, String artistaFav) {
    Playlist nuevaPlaylist = new Playlist(artistaFav, null, artistaFav, edad, artistaFav, edad);
    nuevaPlaylist.setCreador(this.nombre);
    if (playlists == null) {
        playlists = new ArrayList<>();
    }
    
    playlists.add(nuevaPlaylist);
    System.out.println("Se ha creado la lista de reproducción '" + nombre + "' exitosamente.");
}

public void verCancionesPlaylist(String nombrePlaylist) {
    for (Playlist playlist : playlists) {
        if (playlist.getNombre().equals(nombrePlaylist)) {
            System.out.println("Canciones de la playlist '" + nombrePlaylist + "':");
            for (Cancion cancion : playlist.getCanciones()) {
                System.out.println("- " + cancion.getNombre() + " - " + cancion.getArtista());
            }
            return;
        }
    }
    System.out.println("La playlist '" + nombrePlaylist + "' no fue encontrada.");
}
public String getNombre() {
	return nombre;
}


public void setNombre(String nombre) {
	this.nombre = nombre;
}


public int getEdad() {
	return edad;
}


public void setEdad(int edad) {
	this.edad = edad;
}


public String getCarrera() {
	return carrera;
}


public void setCarrera(String carrera) {
	this.carrera = carrera;
}


public String getGeneroFav() {
	return generoFav;
}


public void setGeneroFav(String generoFav) {
	this.generoFav = generoFav;
}


public int getSemestre() {
	return semestre;
}


public void setSemestre(int semestre) {
	this.semestre = semestre;
}


@Override
public String toString() {
	return "Usuario [nombre=" + nombre + ", edad=" + edad + ", carrera=" + carrera + ", generoFav=" + generoFav
			+ ", semestre=" + semestre + "]";
}
   

   
}

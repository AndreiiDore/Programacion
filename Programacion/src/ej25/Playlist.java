package ej25;

import java.util.ArrayList;

public class Playlist {
	/**
	 * ArrayList llamado playlist para ir metiendo canciones alli;
	 */
	/**
	 * Vamos a poner de parametros de la clase:
	 * @param nombrePlaylist: Nombre de la playlist que le vamos a poner
	 */
	
	private String nombrePlaylist;
	private ArrayList<Cancion> playlist;
	
	public Playlist() {}
	public Playlist(String Nombre) {
		this.nombrePlaylist=Nombre;
		setNombrePlaylist(Nombre);
	}
	public void aniadirCancion(ArrayList <Playlist> playlists, int playlistDeseada) {
		
	}
	
	
	
	public ArrayList<Cancion> getPlaylist() {
		return playlist;
	}

	public void setPlaylist(ArrayList<Cancion> playlist) {
		this.playlist = playlist;
	}

	public String getNombrePlaylist() {
		return nombrePlaylist;
	}

	public void setNombrePlaylist(String nombrePlaylist) {
		this.nombrePlaylist = nombrePlaylist;
	}

	
}

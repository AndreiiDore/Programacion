package ej25;

import java.util.ArrayList;

public class Playlist extends Cancion{
	/**
	 * ArrayList llamado playlist para ir metiendo canciones alli;
	 */
	/**
	 * Vamos a poner de parametros de la clase:
	 * @param nombrePlaylist: Nombre de la playlist que le vamos a poner
	 */
	
	private String nombrePlaylist;
	private ArrayList<Cancion> playlist = new ArrayList();
	
	public Playlist() {}
	public Playlist(String Nombre) {
		this.nombrePlaylist=Nombre;
		setNombrePlaylist(Nombre);
	}
	public String aniadirCancion  (String mensaje, Cancion cancion) {
		playlist.add(playlist.size(),cancion);
		return "Cancion añadida con exito";
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

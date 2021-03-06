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
	public void aniadirCancion(Cancion cancion) {
		playlist.add(cancion);
		//System.out.println("Cancion a�adida con exito");
	}
	public Cancion obtenerCancion(int posicion) {
		return playlist.get(posicion);
	}
	public int	totalCanciones() {
		int totalC=0;
		for(Cancion p: playlist) {
			totalC++;
		}
		return totalC;
	}
	/**
	 * Metodo para ver lo que me dura una playlist
	 * @param aux Variable para ir sumando todas las duraciones
	 * @return devuelvo un entero redondeado.
	 */
	public int totalDuracionPlaylist() {
		double aux
		for(Cancion p: playlist) {
			aux=+p.getDuracion();
		}
		return (int) Math.round(aux);
	}
	/**
	 * Metodo para reproducir playlists
	 * @return 
	 */
	public String reproducirPlaylist() {
		for (int i = 0; i < playlist.size(); i++) {
			return playlist.get(i).reproducir();
		}
		return "Ya esta";
	}
	/**
	 * Metodo para reproducir solamente una cancion de una playlist
	 * @param posicion cancion que queremos que se reproduzca
	 */
	public String reproducirCancion(int posicion) {
		return playlist.get(posicion).reproducir();
	}
	/**
	 * Borra el contenido de una playlist
	 */
	public void limpiarPlaylist() {
		playlist.clear();
	}
	/**
	 * Elinina una cancion que queramos
	 * @param posicion Cancion que queremos eliminar
	 * @return Booleano para saber si se a borrado o no
	 */
	public boolean eliminarCancion(int posicion) {
		if (playlist.get(posicion).getTitulo().equals("")) {
			return false;
		}else {
			playlist.remove(posicion);
			return true;
		}
	}
	/**
	 * Metodo para buscar una cancion por el Titulo de una cancion
	 * @param titulo Nombre de la cancion a buscar
	 * @return Nos devuelve una cancion
	 */
	public Cancion encontarCancionTitulo(String titulo) {
		Cancion cancion =new Cancion();
		for(Cancion c: playlist) {
			if (c.getTitulo().equals(titulo)) {
				cancion.setTitulo(c.getTitulo());
				cancion.setArtista(c.getArtista());
				cancion.setDuracion((float) c.getDuracion());
			}
		}
		return cancion;
	}
	/**
	 * Metodo que nos va a buscar una cancion por el artista
	 * @param Artista nombre del autor que vamos a hacer la busqueda
	 * @return la cancion cual a compuesto/cantado el artista deseado
	 */
	public Cancion encontrarCancionArtista(String Artista) {
		Cancion cancion = new Cancion();
		for(Cancion c :playlist) {
			if (c.getArtista()!=Artista) {
				cancion.setArtista(c.getArtista());
				cancion.setTitulo(c.getTitulo());
				cancion.setDuracion((float) c.getDuracion());
				return cancion;
			}
		}
		return cancion;
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

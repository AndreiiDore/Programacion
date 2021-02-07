package ej25;
	/**
	 * 
	 * @author Andrei
	 *
	 */
public class Cancion {
	private String titulo;
	private String artista;
	private double duracion;
	
	/**
	 * Constructor vacio
	 */
	public Cancion() {}
	/**
	 * Constructor con parametos
	 * @param titulo Nombre de la cnacion que vamos a querer meter.
	 * @param artista Nombre del artista que canta la cancion
	 * @param duracion Duracion de la cancion que va a ser un numero decimal
	 */
	public Cancion(String titulo, String artista, double duracion) {
		this.titulo=titulo;
		this.artista=artista;
		this.duracion=duracion;
	}
	/**
	 * Metodo reproducir: Nos muestra un mensaje de "Reproduciendo..." y
	 * el titulo de la cancion que queramos reproducir
	 * @return Reproduciendo + titulo de la cancion
	 */
	public String reproducir() {
		return "Reproduciendo..."+this.titulo;
	}
	@Override
	/**
	 * Este metodo nos va a devolver el titulo de la cancion + el artista + la duracion de una cancion que queramos.
	 * Usamos la etiqueta override porque el metodo toSTring ya exixte, entonces debemos de marcarlo como que ya exite
	 * y de que lo estamos sobreescribiendo
	 */
	public String toString() {
		return this.titulo+" - "+this.artista+"| Duracion:"+this.duracion+", minutos";
	}

	/**
	 * Getters y setter correspondientes a los artibutos del objeto Cancion
	 * @return
	 */
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public double getDuracion() {
		return duracion;
	}

	public void setDuracion(float duracion) {
		this.duracion = duracion;
	}
	
}

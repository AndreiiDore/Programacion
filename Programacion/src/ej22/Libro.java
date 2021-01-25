package ej22;
 	/**
 	 * 
 	 * @author Andrei
 	 *
 	 */
public class Libro {
	private String Titulo;
	private String Autor;
	private int numEjemplares;
	private int numPrestados;
	
	/**
	 * Constructor libro vacio
	 */
	public Libro() {}
	/**
	 * Constructor libro en el cual tenemos los siguientes parametros:
	 * @param titulo Nombre del Libro
	 * @param autor Nombre del Autor
	 * @param numeroEjemplares Numeros de los ejemplares que tenemos en stock
	 * @param numPrestados Numero de libros que hemos prestado de un dicho libro
	 */
	public Libro(String titulo,String autor,int numeroEjemplares,int numPrestados) {

		this.Titulo=titulo;
		this.Autor=autor;
		this.numEjemplares=numeroEjemplares;
		this.numPrestados=numPrestados;
	}
	/**
	 * Metodo prestamo en el cual vamos a ver si un libro se puede prestar, en mi caso he puesto dos
	 * mensajes por pantalla para saber que lo que hago se hace xD
	 */
	public void prestamo() {
		if (numEjemplares>numPrestados) {
			numPrestados++;
			System.out.println("El prestamo se ha efectuado con exito");
		}else {
			System.out.println("No se puede prestar el libro por falta de Ejemplares");
		}
	}
	/**
	 * El metodo Devolver lo que hace es que si tenemos algun libro prestado, nos de la opcion de devolver este mismo,
	 * tocando asi la variable numPestados
	 */
	public void devolver() {

		if (numPrestados==0) {
			System.out.println("Este libro no se a prestado, No se ha hecho la devolucion del mismo");
		}else {
			numPrestados--;
			System.out.println("Devolucion con exito.");
		}
	}
	
	/**
	 * Aqui ponemos el override porque sustituye al metodo toString de la clase String
	 * y es para que aparezca comentada dado a que un futuro cuando se den cosas mas complejas
	 * se necesitara ese "comentario" para saber que estamos sustituyendo
	 * 
	 * En el metodo creado, vamos a devolver los datos de un libro, es decir,
	 * Nombre del Libro
	 * Autor del Libro
	 * Numeros de ejemplares que tenemos en "Stock"
	 * Numeros de libros prestados
	 */
	@Override
	public String toString() {
		return "Titulo del Libro: "+getTitulo()+"\nNombre del autor: "+getAutor()+"\nEjemplares del libro: "+getNumEjemplares()+"\nLibros prestados: "+getNumPrestados();
	}
	
	
	//Getters y Setters
	public String getTitulo() {
		return Titulo;
	}
	public void setTitulo(String titulo) {
		Titulo = titulo;
	}
	public String getAutor() {
		return Autor;
	}
	public void setAutor(String autor) {
		Autor = autor;
	}
	public int getNumEjemplares() {
		return numEjemplares;
	}
	public void setNumEjemplares(int numEjemplares) {
		this.numEjemplares = numEjemplares;
	}
	public int getNumPrestados() {
		return numPrestados;
	}
	public void setNumPrestados(int numPrestados) {
		this.numPrestados = numPrestados;
	}
	
}

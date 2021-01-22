package ej22;

public class Libro {
	private String Titulo;
	private String Autor;
	private int numEjemplares;
	private int numPrestados;
	
	public Libro() {
		
	}
	public Libro(String titulo,String autor,int numeroEjemplares,int numPrestados) {
		this.Titulo=titulo;
		this.Autor=autor;
		this.numEjemplares=numeroEjemplares;
		this.numPrestados=numPrestados;
	}
	public void prestamo() {
		if (numEjemplares>numPrestados) {
			numPrestados++;
			System.out.println("El prestamo se ha efectuado con exito");
		}else {
			System.out.println("No se puede prestar el libro por falta de Ejemplares");
		}
	}
	public void devolver() {
		if (numPrestados==0) {
			System.out.println("Este libro no se a prestado, No se ha hecho la devolucion del mismo");
		}else {
			numPrestados--;
			System.out.println("Devolucion con exito.");
		}
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

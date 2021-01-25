package ej22;

import java.util.Scanner;

public class Ej22 {

	public static void main(String[] args) {
		Libro libro1=new Libro("la casa de la pradera","chiquito de la calzada",10,9);
		Libro libro2=new Libro("el ultimo mohicano","kiko rivera",5,4);
		libro1.prestamo();
		System.out.println("Ejemplares del libro 1: "+libro1.getNumEjemplares());
		libro1.prestamo();
		System.out.println("Ejemplares del libro 1: "+libro1.getNumEjemplares());
		libro1.devolver();
		libro1.setNumPrestados(0);
		libro1.devolver();
		System.out.println("Ejemplares prestados del  libro 1: "+libro1.getNumPrestados());
		System.out.println("Vamos a Introducir tu propio libro ahora. USA LA IMAGINACION!!!");
		Libro libro3=new Libro();
		Scanner sc=new Scanner(System.in);
		System.out.println("Dime el nombre de tu libro: ");
		libro3.setTitulo(sc.nextLine());
		System.out.println("Dime el Autor de tu libro: ");
		libro3.setAutor(sc.nextLine());
		System.out.println("Dime el numero de Libros que tienes: ");
		libro3.setNumEjemplares(sc.nextInt());
		System.out.println("Dime el numero de Ejemplares Prestados tienes: ");
		libro3.setNumPrestados(sc.nextInt());
		System.out.println(libro3.toString());
		sc.close();
	}

}

package ej25;

import java.util.ArrayList;
import java.util.Scanner;

import ej23.Libro;



public class Ej25  {
	
	public static void main(String[] args) {
		int opcion;
		ArrayList <Playlist> playlists = new ArrayList <Playlist>();
		ArrayList <Cancion>canciones = new ArrayList <Cancion>();
		do {
			opcion=menu();
			switch(opcion) {
			case 0:adios();break;
			case 1:crearPlaylist(playlists);;break;
			case 2:;aniadirCancion(playlists);break;
			}
		} while (opcion!=0);
		
		
		
		Cancion cancion1=new Cancion("100","Anuel",3.35);
		
		System.out.println(cancion1.reproducir());
	

	}
	/**
	 * Funcion para dar un menu al usario simpre que lo necesite
	 * @return Vamos a devilver el valor de la opcion que vamos a necesitar para el menu
	 */
	public static int menu () {
		Scanner sc = new Scanner(System.in);
		System.out.println("Bienvenidos al Spoty de Andrei el AMO.");
		System.out.println("Vamos a mostrarte las opciones que tienes para navegar:");
		System.out.println("1. Crear Playlist");
		System.out.println("2. Añadir una cancion a una Playlist.");
		
		System.out.println("0. Salir del programa");
		int opcion=sc.nextInt();
		return opcion;
		
	}
	/**
	 * Funcion para crear una playlist que quiera el usuario con el nombre que el desee
	 * @param playlists Arraylist de todas las playList que va a tener el progrma
	 */
	public static void crearPlaylist(ArrayList <Playlist> playlists ) {
		Scanner sc = new Scanner(System.in);
		System.out.println("como quieres llamar a la playlist?");
		Playlist playlist =new Playlist();
		playlist.setNombrePlaylist(sc.nextLine());
		playlists.add(playlist);
		System.out.println(playlist.getNombrePlaylist());
	}
	/**
	 * Vamos a meter una cancion en una playlist
	 * @param playlists
	 */
	public static void aniadirCancion(ArrayList <Playlist> playlists){
		Scanner sc = new Scanner(System.in);
		System.out.println("En que playlist quieres meter una cancion?");
		for(Playlist p: playlists) {
			System.out.println(p+". "+p.getNombrePlaylist());
		}
		int opcionP=sc.nextInt();
		System.out.println("Que cancion quieres meter en la playlist "+playlists.indexOf(opcionP)+" ?");
		/*Falta llamr al metodo de cancion para ver que cancion vamos a meter y dnde*/
	}
	public static void adios() {
		System.out.println("Muchas gracias por usar esta aplicacion.");
	}
	

}

package ej23;

import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca {
	
	public static void main(String[] args) {
		ArrayList<Libro> catalogo = new ArrayList <Libro>();
		int opcion=0;
		do {
			//menu();
			opcion=menu();
			switch (opcion) {
			case 1:
				//tengo que darle a la funcion el parametro de como se llama mi ArrayList
				altaLibro(catalogo);
				;break;
			case 2:
				consultaLibro(catalogo);
				;break;
			case 3:
				bajaLibro(catalogo);
				;break;
			case 4:
				prestamoLibro(catalogo);
				;break;
			case 5:
				devolucionLibro(catalogo);
				;break;
			case 6:
				buscarLibro(catalogo);
				;break;
			case 0:
				adios();
				;break;
			default:System.out.println("Introduce un numero del 0 al 6.");;break;
			}
		} while (opcion!=0);



	}
	public static  int menu() {
		int opcion;
		Scanner sc = new Scanner(System.in);
		System.out.println("Bienvenidos a la Biblioteca de Andrei...");
		System.out.println("Pulsa la opcion que quieras hacer.");
		System.out.println("1. Dar de alta un libro Nuevo.");
		System.out.println("2. Consulta un Libro.");
		System.out.println("3. Dar de baja un Libro.");
		System.out.println("4. Prestar un libro.");
		System.out.println("5. Devolver un Libro");
		System.out.println("6. Buscar un libro");
		/*vamos a intentar hacer una funcion en la cual se pueda buscar por titulo o autor
		 * dentro de esta funcion voy a llamar a dos funciones mas que va a ser por titulo o por autor*/
		System.out.println("0. Para salir del programa");
		opcion=sc.nextInt();
		//sc.close();
		return opcion;
	}
	//Tengo que meter el arrayList para que me lo meta en el ArrayList de arriba
	public static void altaLibro(ArrayList<Libro> catalogo) {
		Scanner sc = new Scanner(System.in);
		Scanner sc2= new Scanner(System.in);
		Libro libroNuevo = new Libro();
		System.out.println("Como quieres que se llame tu libro?");
		libroNuevo.setTitulo(sc.nextLine());
		System.out.println("Cual es el autor de tu libro?");
		libroNuevo.setAutor(sc.nextLine());
		System.out.println("Cuantos ejemplares quieres dar de alta?");
		libroNuevo.setNumEjemplares(sc2.nextInt());
		libroNuevo.setNumPrestados(0);
		catalogo.add(libroNuevo);
		System.out.println("Libro dado de alta correctamente");
		//sc.close();
	}
	public static void consultaLibro(ArrayList<Libro> catalogo) {
		System.err.println();
		System.out.println("*************Libros en catalogo***************");
		for (int i = 0; i < catalogo.size(); i++) {
			System.out.println(catalogo.get(i).getTitulo()+" En la posicion :"+(i+1));
		}
		System.out.println("***********************************************");
		System.out.println();
	}
	public static void bajaLibro(ArrayList <Libro> catalogo) {
		System.out.println("Que Libro quieres eliminar?");
		for (int i = 0; i <catalogo.size(); i++) {
			System.out.println("          "+-(i+1)+" : "+catalogo.get(i).getTitulo());
		}
		Scanner sc=new Scanner(System.in);
		System.out.println("Que libro quieres borrar?");
		int opcion=sc.nextInt();
		System.out.println("Estas seguro de que quieres borrar "+catalogo.get(opcion-1).getTitulo());
		System.out.println("Pulsa uno para confirmar al eliminacion, 2 para que no se haga nada");
		int confir=sc.nextInt();
		if (confir==1) {
			catalogo.remove(opcion-1);
			System.out.println("La baja del libro se efectuo correctamente");
		}else {
			System.out.println("La baja del libro no se realizo.");
		}
		//sc.close();
	}
	public static void prestamoLibro(ArrayList <Libro>catalogo) {
		Scanner sc=new Scanner(System.in);
		System.out.println();
		System.out.println("*************Libros en catalogo***************");
		for (int i = 0; i < catalogo.size(); i++) {
			System.out.println(catalogo.get(i).getTitulo()+" En la posicion :"+(i+1)+" | Existencias para prestamo: "+(catalogo.get(i).getNumEjemplares()-catalogo.get(i).getNumPrestados()));
		}
		System.out.println("***********************************************");
		System.out.println();
		System.out.println("De que libro quieres hacer un prestamo?");
		int prestamo=sc.nextInt();
		/*
		 * condicion el if:
		 * 1. si los libros prestados es distinto a los ejemplares que tenemos.
		 * 2. si los libros prestados es menor que los ejemplares
		 * */
		if (catalogo.get(prestamo-1).getNumPrestados()!=catalogo.get(prestamo-1).getNumEjemplares()&&catalogo.get(prestamo-1).getNumPrestados()<catalogo.get(prestamo-1).getNumEjemplares()) {
			catalogo.get(prestamo-1).setNumPrestados(catalogo.get(prestamo-1).getNumPrestados()+1);
			System.out.println("Prestamo efectuado con exito");
		}else {
			System.out.println("Lo sentmos, ese prestamo no se puede hacer debido a falta de ejemplares.");
		}
	}
	public static void devolucionLibro(ArrayList<Libro>catalogo) {
		Scanner sc =new Scanner(System.in);
		System.out.println("*************Libros en catalogo***************");
		for (int i = 0; i < catalogo.size(); i++) {
			System.out.println(catalogo.get(i).getTitulo()+" En la posicion :"+(i+1)+" | Libros prestados: "+(catalogo.get(i).getNumPrestados()));
		}
		System.out.println("***********************************************");
		System.out.println();
		System.out.println("Que libro quieres devolver?");
		int devolver = sc.nextInt();
		//si el numero de prestamos es distinto a 0
		if (catalogo.get(devolver-1).getNumPrestados()!=0) {
			catalogo.get(devolver-1).setNumPrestados(catalogo.get(devolver-1).getNumPrestados()-1);
			System.out.println("Devolucion con exito!!!");
		}else {
			System.out.println("Fallo al devolver el libro.");
		}
	}
	public static void buscarLibro(ArrayList<Libro>catalogo) {
		boolean salir=true;
		do {
			Scanner sc=new Scanner(System.in);
			Scanner sc2=new Scanner(System.in);
			System.out.println("Como quieres buscar el Libro?");
			System.out.println("1. Por titulo");
			System.out.println("2. Por autor");
			int opcion=sc2.nextInt();
			if (opcion==1) {
				System.out.println("Inserta el titulo del libro a buscar?");
				String busqueda=sc.nextLine();
				for (int i = 0; i < catalogo.size(); i++) {
					if (catalogo.get(i).getTitulo().equals(busqueda)) {
						System.out.println("Tu libro "+catalogo.get(i).getTitulo()+" esta en la posicion "+(i+1)+" y tienes "+(catalogo.get(i).getNumEjemplares()-catalogo.get(i).getNumPrestados())+" ejemplares disponibles");
					}
				}
			}else {
				if (opcion==2) {
					System.out.println("Dime el autor que quieres que te muestre sus Libros:");
					String busqueda=sc.nextLine();
					int cont=0;
					for (int i = 0; i < catalogo.size(); i++) {
						if (catalogo.get(i).getAutor().equals(busqueda)) {
							cont++;
							System.out.println((i+1)+". "+catalogo.get(i).getTitulo()+" y tienes "+(catalogo.get(i).getNumEjemplares()-catalogo.get(i).getNumPrestados())+" ejemplares disponibles");
						}
						if (cont==0) {
							System.out.println("No hay libros con ese autor.");
						}
					}
				}else {
					salir=false;
					System.out.println("No hemos podido solucionar tu consulta, vuelve a intentarlo.");
				}
			}
		} while (!salir);
	}
	public static void adios() {
		System.out.println("Muchas gracias y hasta la proxima :)");
	}
}
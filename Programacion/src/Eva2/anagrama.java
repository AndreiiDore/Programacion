package Eva2;

import java.util.Scanner;

public class anagrama {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int repetir=0;
		do {
			System.out.println("Bievenido al programa de los anagramas.");
			System.out.println("REGLAS");
			System.out.println("--------------------------------------");
			System.out.println("1.El texto que vas a introducir no puede tener acentos ni eñes.");
			System.out.println("2.Que no tenga mas de 100 caracteres, por lo demas esta todo permitido");
			System.out.println("Introduce el primer texto");
			String texto1=sc.nextLine();
			System.out.println("Ahora introduce el texto con el que lo quieres comparar:");
			String texto2=sc.nextLine();
			boolean anagrama=true;
			//antes de nada vamos a hacer las comprobaciones, primero de tamaño y despues de los caracteres especiales.
			if (texto1.length()<100) {
				for (int i = 0; i < texto1.length(); i++) {
					if (texto1.charAt(i)>=65||texto1.charAt(i)<=90||texto1.charAt(i)>=97||texto1.charAt(i)<=122) {
						anagrama=true;
					}
					else {
						anagrama=false;
					}
				}
			}
			//depsues de las comprobaciones
			if (anagrama) {
				int correcto_parcial=0;
				for (int j = 0; j < texto1.length(); j++) {
					for (int i = 0; i < texto2.length(); i++) {
						if (texto1.charAt(i)==texto2.charAt(j)) {
							correcto_parcial++;
						}
					}
				}
				if (correcto_parcial==texto1.length()) {
					System.out.println("Lo sinto... no es un anagrama");
				}else {
					System.out.println("Es un anagrama!!!");
				}
			}else {
				System.out.println("Tu frase no cumple con las reglas que hemos establecido antes");
				repetir=1;
			}
			System.out.println("Quieres volver a ver si una frase o palabra es un anagrama?");
			repetir=sc.nextInt();
		} while (repetir==1);
		System.out.println("Gracias por su colaboracion");
		sc.close();

	}

}

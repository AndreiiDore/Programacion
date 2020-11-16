package Eva1;

import java.util.Scanner;

public class ej40 {
/*
 * Pedir al usuario un numero y mostrar por pantalla un triangulo de asteriscos 
 * hasta llegar a la altura que ha dicho el usuario: 
 * */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime el tamaño de tu triangulo:");
		int tam=sc.nextInt();
		for (int i = 0; i < tam; i++) {
			for (int j = tam; j > i; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j < i; j++) {
				System.out.print("* ");
		}
			System.out.println();
		}
		sc.close();
	}

}


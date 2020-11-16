package Eva1;

import java.util.Scanner;

public class ej39 {
/*
 * Pedir al usuario un numero y mostrar por pantalla un triangulo de asteriscos  
 * hasta llegar a la altura que ha dicho el usuario: 
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("De cuanto de largo quieres el triangulo?");
		int largo=sc.nextInt();
		for (int i = 0; i < largo+1; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
		}
			System.out.println();
		}
		sc.close();
	}

}

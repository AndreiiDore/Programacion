package Eva1;

import java.util.Scanner;

public class ej23 {
/*
 * Escribe un programa que pida un número y luego muestre en pantalla todos los números pares que hay entre 0 y el número solicitado. 
 * */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime un numero y te dire todos los numeros pares que hay entre tu numero y el 0:");
		int num=sc.nextInt();
		for (int i = 0; i <=num; i++) {
			if (i%2==0) {
				System.out.println(i);
			}
		}
		sc.close();

	}

}

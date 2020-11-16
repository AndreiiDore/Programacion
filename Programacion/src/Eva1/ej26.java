package Eva1;

import java.util.Scanner;

public class ej26 {
/*
 * Escribe un programa que pida un número y luego muestre en pantalla todos los números primos que hay entre 0 y el número solicitado.
 * */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime un numero y te dire los numeros primos entre tu numero y el 0:");
		int num=sc.nextInt();
		boolean primo=true;
		System.out.println("Los numeros primos entre 0 y "+num+" son:");
		for (int i = 0; i < num; i++) {
			for (int div = 2; div == i; div++) {
				while (num%i!=0) {
					if (num % i == 0) {
					    primo = false;
					}
			
				}
			}
		}
	
		sc.close();
	}

}

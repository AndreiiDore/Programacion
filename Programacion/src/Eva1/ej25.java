package Eva1;

import java.util.Scanner;

public class ej25 {
/*
 * Escribe un programa que pida un número y nos diga si es o no un número primo.
 * */
	//comentario para entornos
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime un numero y te dire si es primo o no:");
		int num=sc.nextInt();
		boolean primo=true;
		int i;
		i=num-1;
		while (num%i!=0||i>=2) {
			if (num % i == 0) {
			    primo = false;
			}
			i--;
		}
		if (primo) {
			System.out.println("El numero es primo");
		} else {
			System.out.println("El numero no es primo");
		}
		sc.close();
	}

}
/*for(int i = 2; i < num; i++) {
if (num % i == 0) {
    primo = false;
    break;
}
}*/
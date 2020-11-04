package Eva1;

import java.util.Scanner;

public class ej24 {
/*
 * Pedir números al usuario hasta que introduzca un 0. Sumar en un acumulador solo aquellos que sean pares. 
 * */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int contador=0, num=0;
		System.out.println("Te voy a pedir numeros, parare cuando me pongas un 0.");
		do {
			System.out.println("Dime un numero:");
			num=sc.nextInt();
			if (num%2==0) {
				contador+=num;
			}
		}while(num!=0);
		System.out.println("La suma de los numeros pares que has introducido es de "+contador);
		sc.close();
	}

}

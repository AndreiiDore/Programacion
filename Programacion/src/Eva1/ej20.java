package Eva1;

import java.util.Scanner;

public class ej20 {
/*
 * Repetir el ejercicio anterior, pero mostrar al finalizar también la media de los números introducidos.
 * */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cuenta=0, num=0, contador=0;;
		do {
			System.out.println("Dime numeros, parare cuando me pongas un cero:");
			num=sc.nextInt();
			if (num!=0) {
				cuenta+=num;
				contador++;
			}
		}while(num!=0);
		System.out.println("La suma de tus numeros es "+cuenta);
		System.out.println("La media de tus numeros es "+(cuenta/contador));
		sc.close();

	}

}

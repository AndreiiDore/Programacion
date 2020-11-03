package Eva1;

import java.util.Scanner;

public class ej22 {
/*
 * Escribe un programa que calcule ab  pidiendo por teclado a y b. (no puede usar la funcion pow).
 * */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime un numero que quieras:");
		int num=sc.nextInt();
		System.out.println("Dime a que potencia quieres que te lo eleve:");
		int potencia=sc.nextInt();
		int resul=0;
		for (int i = 0; i < potencia; i++) {
			switch(i) {
			case 0:resul=num;break;
			case 1:resul=num*num;break;
			default:resul*=num;break;
			}
		}
		System.out.println("El numero "+num+" elvado a "+potencia+" da el resultado de "+resul);
		sc.close();
	}

}

package Eva1;

import java.util.Scanner;

import sun.text.resources.cldr.ext.FormatData_en_MT;

public class ej26 {
/*
 * Escribe un programa que pida un número y luego muestre en pantalla todos los números primos que hay entre 0 y el número solicitado.
 * */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime un numero y te dire los numeros primos entre tu numero y el 0:");
		int num=sc.nextInt();
		boolean primo=true;
		int i=num-1;
		System.out.println("Los numeros primos entre 0 y "+num+" son:");
		for (int j = 0; j < args.length; j++) {
			while (num%i!=0||i>=2) {
				if (num % i == 0) {
				    primo = false;
				}
				i--;
			}
		}
		sc.close();
	}

}

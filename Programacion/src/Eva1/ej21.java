package Eva1;

import java.util.Scanner;

public class ej21 {
/*
 * Repetir el ejercicio anterior, pero mostrar al finalizar el mayor y el menor de los números 
 * introducidos (sin contar el 0)
 * */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cuenta=0, num=0,contador=0, min= Integer.MAX_VALUE, max=Integer.MIN_VALUE;
		do {
			System.out.println("Dime numeros, parare cuando me pongas un cero");
			num=sc.nextInt();
			if (num!=0) {
				cuenta+=num;
				contador++;
				if (num>max) {
					max=num;
				}
				if (num<min) {
					min=num;
				}
			}
		}while(num!=0);
		System.out.println("La suma de tus numeros es "+cuenta);
		System.out.println("La media de tus numeros es "+(cuenta/contador));
		System.out.println("El numero mas bajo introducido es: "+min);
		System.out.println("El numero mas alto introducido es: "+max);
		sc.close();

	}

}

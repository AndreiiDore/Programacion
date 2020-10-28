package Eva1;

import java.util.Scanner;

public class ej18 {

	public static void main(String[] args) {
		int cuenta=0,num1,num2,contador=0;
		Scanner sc = new Scanner(System.in);
		do{
			if (contador!=0) {
				System.out.println("CUIDADO PAISANO MIO!!!!!!! ALGO TINEES MAL");
				System.out.println("Te has equivocado, pon primero el numero mas pequeño");
			}
			System.out.println("Ponme desde donde quieres que empiece a contar");
			num1=sc.nextInt();
			System.out.println("Ponme donde quieres que acabe:");
			num2=sc.nextInt();
			contador++;
		}while(num1>num2);
		
		System.out.println("Ponme de cuantos en cuanto quieres que cuente");
		int intervalo=sc.nextInt();
		cuenta=num1;
		while (cuenta<=num2) {
			System.out.println(cuenta);
			cuenta+=intervalo;
			
		}
		sc.close();
	}

}

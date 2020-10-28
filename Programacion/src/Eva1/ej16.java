package Eva1;

import java.util.Scanner;

public class ej16 {

	public static void main(String[] args) {
		int cuenta=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Ponme desde donde quieres que empiece a contar");
		int num1=sc.nextInt();
		System.out.println("Ponme donde quieres que acabe:");
		int num2=sc.nextInt();
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

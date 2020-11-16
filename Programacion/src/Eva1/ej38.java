package Eva1;

import java.util.Scanner;

public class ej38 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime cuantos * quieres que sea tu cuadrado: ");
		int anch=sc.nextInt();
		for (int i = 0; i < anch; i++) {
			System.out.println();
			for (int j = 0; j < anch; j++) {
				if (i%2==0) {
					System.out.print(" *");
				}else {
					System.out.print("* ");
				}
			}
		}
		sc.close();
	}

}

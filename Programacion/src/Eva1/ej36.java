package Eva1;

import java.util.Scanner;

public class ej36 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime la anchira de tu cuadrado: ");
		int anch=sc.nextInt();
		for (int i = 0; i < 4; i++) {
			System.out.println();
			for (int j = 0; j < anch; j++) {
				System.out.print("*");
			}
		}
		sc.close();

	}

}

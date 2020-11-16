package Eva1;

import java.util.Scanner;

public class ej37 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime las columnas de tu rectangulo: ");
		int colum=sc.nextInt();
		System.out.println("Dime las filas de tu rectangulo: ");
		int filas=sc.nextInt();
		for (int i = 0; i < colum; i++) {
			System.out.println();
			for (int j = 0; j <filas; j++) {
				System.out.print("*");
			}
		}
		sc.close();
	}

}

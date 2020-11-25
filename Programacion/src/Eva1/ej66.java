/**
 * 
 */
package Eva1;

import java.util.Scanner;

/**
 * @author Andrei
 *array de 10 y ver si se repite algun nunmero
 *
 */
public class ej66 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int array [] = new int[10];
		for (int i = 0; i < array.length; i++) {
			System.out.println("Introduce el numero "+(i+1));
			array[i]=sc.nextInt();
		}
		boolean repite=false;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (i!=j) {
					if (array[i]==array[j]) {
						repite=true;
					}
				}
			}
		}
		if (repite) {
			System.out.println("Los numeros si se repiten");
		}else {
			System.out.println("Ningun numero se repite");
		}
		sc.close();
	}

}

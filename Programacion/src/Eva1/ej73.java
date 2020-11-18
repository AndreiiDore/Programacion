/**
 * 
 */
package Eva1;

import java.util.Scanner;

/**
 * @author Andrei
 *
 */
public class ej73 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int array[]= new int [10];
		boolean repetir=false;
		do {
			if (repetir) {
				System.out.println("Has reprtido algun numero. Vuelve a empezar");
				repetir=false;
			}
			System.out.println("Te voy a pedir 10 numeros, no los repitas plis :)");
			for (int i = 0; i < array.length; i++) {
				System.out.println("Dame el numero "+(i+1));
				array[i]=sc.nextInt();
			}
			for (int i = 0; i < array.length; i++) {
				for (int j = 0; j < array.length; j++) {
					if (array[i]==array[j]) {
						repetir=true;
					}
				}
			}
		}while(!repetir);
		System.out.println("Muy bien, no se ha repetido ningun numero");
		sc.close();
	}

}

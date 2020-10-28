/**
 * 
 */
package Eva1;

import java.util.Scanner;

/**
 * @author andrei
 *
 */
public class Semana3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int superficie,campos=0;
		float cuenta=0;
		do {
			System.out.println("Digame la superficie real:");
			superficie=sc.nextInt();
			if (superficie!=0) {
				System.out.println("Cuantos campos de futbol?");
				campos=sc.nextInt();
			}
			if (superficie==0) {
				System.out.println("Gracias por usar el programa");
			} else {
				cuenta=superficie/4050;
				}
				if (superficie!=0) {
					if (cuenta==campos) {
						System.out.println("Muy bien UN APLUASO PA TI");
					}else {
						System.out.println("Nah, estudia otra cosa");
					}
				}
		} while (superficie!=0);
		sc.close();
	}

}

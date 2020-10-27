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
		int superficie;
		int campos=0;
		do {
			System.out.println("Digame la superficie real:");
			superficie=sc.nextInt();
			while(superficie>=1080) {
				if (superficie>=1080) {
					campos++;
					superficie-=1080;
				}
			}
			if (superficie!=0) {
				System.out.println("Son mas o menos "+campos+" campos de futbol");
			} else {
				System.out.println("Gracias por usar el programa");
			}
		} while (superficie!=0);

	}

}

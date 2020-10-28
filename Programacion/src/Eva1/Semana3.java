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
		int superf=0;
		System.out.println("Dame la superficie real en metros cuadrados:");
		superf=sc.nextInt();
		if(superf>(45*90)&&superf<(120*90)) {
			
		}else {
			System.out.println("No es ni un campo de futlbol");
		}

	}

}

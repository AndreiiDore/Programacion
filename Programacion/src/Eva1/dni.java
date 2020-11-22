/**
 * 
 */
package Eva1;

import java.util.Scanner;

/**
 * @author andre
 *
 */
public class dni {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char letras[]= new char [] {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
		System.out.println("Dme los numeros de tu dni");
		int num=sc.nextInt();
		int resto=num%23;
		System.out.println("La letra que le correponde es :"+letras[resto]);
		System.out.println("El dni completo seria: "+num+""+letras[resto]);
		sc.close();
	}

}

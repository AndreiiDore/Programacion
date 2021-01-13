package Eva2;

import java.util.Scanner;

public class dniPOO {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dme los numeros de tu dni");
		int num=sc.nextInt();
		System.out.println("La letra que le correponde es :"+letraDNI(num));
		System.out.println("El dni completo seria: "+num+""+letraDNI(num));
		sc.close();
	}
	private static char letraDNI(int num) {
		char resultado;
		char letras[]= new char [] {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
		int resto=num%23;
		resultado = letras[resto];
		return resultado;	
	}

}

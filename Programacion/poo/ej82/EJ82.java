package ej82;

import java.util.Scanner;

public class EJ82 {

	public static void main(String[] args) {
		Cilindro primercilindro = new Cilindro();
		Scanner sc = new Scanner(System.in);
		double altura, radio;
		
		System.out.println("Ponme la altura del cilindro:");
		altura=sc.nextDouble();
		System.out.println("Pomne el radio del cilindro:");
		radio=sc.nextDouble();
		
		primercilindro.area(altura,radio);
		primercilindro.volumen(altura,radio);

	}

}

package Eva1;

import java.util.Scanner;

public class semana4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Cuanto peso aguanta tu tela de araña?");
		int pesotela=sc.nextInt();
		int peso=0;int pesoe=1,i=0;
		boolean romper=false,salir=false;
		do {
			System.out.println("Cuanto pesa el elefante "+i+"?");
			pesoe=sc.nextInt();
			peso+=pesoe;
			i++;
			if (peso>pesotela) {
				romper=true;
			}
			if (pesoe==0) {
				salir=true;
			}
		}while(romper||salir);
		if (romper) {
			System.out.println("Mala suerte, tu tela no aguantaba tanto peso...");
		}else {
			System.out.println("Aguanta todo lo que quieras, parece una tela de hierro");
		}
	}

}

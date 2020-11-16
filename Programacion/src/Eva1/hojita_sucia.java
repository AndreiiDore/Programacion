package Eva1;

import java.util.Scanner;

public class hojita_sucia {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int array []= {1,2,3};
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		for (int i = 0; i < array.length; i++) {
			array[i]=0;
		}
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		/*
		int campos=0,metros,campof=0;
		do {
			System.out.println("Dime cuantos metros:");
			metros=sc.nextInt();
			if(metros!=0) {
				System.out.println("Dime cuantos campos");
				campos=sc.nextInt();
			}
			while(metros<=4050) {
				while(metros<=4050) {
					if (metros<=4050) {
						metros-=4050;
						campof++;
					}
				}
			}
			if (campof==campos) {
				System.out.println("Si");
			}else {
				System.out.println("No");
			}
		}while(metros!=0);
		System.out.println("Gracias por usar este programa");
		sc.close();
		*/

	}

}

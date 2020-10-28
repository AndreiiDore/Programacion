package Eva1;

import java.util.Scanner;

public class EJ19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cuenta=0,num=0;
		do {
			System.out.println("Dime numeros,yo parare cuando me pongas un 0");
			num=sc.nextInt();
			cuenta+=num;
		}while(num!=0);
		System.out.println("La suma es "+cuenta);

	}

}

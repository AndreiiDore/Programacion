package Eva1;

import java.util.Scanner;

public class TablaAutomatica {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Dime de que numero quieres la tabla de multiplicar:");
		int num=sc.nextInt();
		System.out.println("----TABLA DEL "+num+"----");
		for (int i = 0; i < 11; i++) {
			System.out.println(num+"*"+i+"="+num*i);
		}

	}

}

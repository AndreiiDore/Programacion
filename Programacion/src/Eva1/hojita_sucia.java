package Eva1;

import java.util.Scanner;

//import java.util.scanner;

public class hojita_sucia {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dme de que numero queres que te dga la tabla");
		int num=sc.nextInt();
		System.out.println("----TABLA DEL "+num+"----");
		for (int i = 0; i < 11; i++) {
			System.out.println(num+"*"+i+"="+num*i);
		}
	}
}
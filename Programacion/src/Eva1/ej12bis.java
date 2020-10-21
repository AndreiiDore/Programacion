package Eva1;

import java.util.Scanner;

public class ej12bis {

	public static void main(String[] args) {
		int num1, num2,num3,aux;
		Scanner sc = new Scanner(System.in);
		System.out.println("Te voy a pedir 3 numeros y te los voy a ordenar de mayor a menor.");
		System.out.println("Dime el primer numero:");
		num1=sc.nextInt();
		System.out.println("Dime el segundo numero:");
		num2=sc.nextInt();
		System.out.println("Dime el tercer y ultimo numero:");
		num3=sc.nextInt();
		//condicionales
		if (num1<num2&&num1<num3&&num2<num3) {
			System.out.println();
			
		}
		//aux=num1;
		//num1=num2;
		//num3=aux;

	}

}

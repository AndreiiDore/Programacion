/**
 * 
 */
package Eva1;

import java.util.Scanner;

/**
 * @author Andrei
 *
 */
public class ej12 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int num1, num2,num3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Te voy a pedir 3 numeros y te los voy a ordenar de mayor a menor.");
		System.out.println("Dime el primer numero:");
		num1=sc.nextInt();
		System.out.println("Dime el segundo numero:");
		num2=sc.nextInt();
		System.out.println("Dime el tercer y ultimo numero:");
		num3=sc.nextInt();
		//condicionales
		if (num1>num2&&num1>num3) {
			if (num2>num3) {
				System.out.println("El orden de mayor a menor es: "+num1+", "+num2+" y por ultimo "+num3);
			}else {
				if(num2==num3) {
					System.out.println("El mayor es el "+num1+" mientras los otros son iguales");
				}
				System.out.println("El orden de mayor a menor es: "+num1+", "+num3+" y por ultimo "+num2);
			}
		}
		if (num2>num1&&num2>num3) {
			if (num1>num3) {
				System.out.println("El orden de mayor a menor es: "+num2+", "+num1+" y por ultimo "+num3);
			}else {
				if(num1==num3) {
					System.out.println("El mayor es el "+num2+" mientras los otros son iguales");
				}
				System.out.println("El orden de mayor a menor es: "+num2+", "+num3+" y por ultimo "+num1);
			}
		}
		if (num3>num1&&num3>num2) {
			if (num1>num2) {
				System.out.println("El orden de mayor a menor es: "+num3+", "+num1+" y por ultimo "+num2);
			}else {
				if (num1==num2) {
					System.out.println("El mayor es el "+num3+" mientras los otros son iguales");
				}
				System.out.println("El orden de mayor a menor es: "+num3+", "+num2+" y por ultimo "+num1);
			}
		}
		if (num1==num2&&num1==num3) {
			System.out.println("Todos son iguales");
		}

	}

}

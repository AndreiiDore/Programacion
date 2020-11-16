package Eva1;

import java.util.Scanner;

public class ej63 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE,media=0;
		int array[]= new int [10];
		for (int i = 0; i < array.length; i++) {
			System.out.println("Dime el numero "+(i+1));
			array[i]=sc.nextInt();
		}
		for (int i = 0; i < array.length; i++) {
			if (array[i]>max) {
				max=array[i];
			}
			if (array[i]<min) {
				min=array[i];
			}
			media+=array[i];
		}
		media/=array.length;
		System.out.println("El numero mas bajo es: "+min);
		System.out.println("El numero mas alto es : "+max);
		System.out.println("La media de los numeros es: "+media );
	}

}

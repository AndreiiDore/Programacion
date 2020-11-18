package Eva1;

import java.util.Scanner;

public class ej64 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int array1[]= new int [1];
		int array2[]=new int [1];
		int arrayfinal[]=new int [2];
		System.out.println("Dame los datos del pirmer array:");
		for (int i = 0; i < array1.length; i++) {
			System.out.println("Ponme el numero "+(i+1));
			array1[i]=sc.nextInt();
		}
		for (int i = 0; i < array2.length; i++) {
			System.out.println("Ponme el numero "+(i+1));
			array2[i]=sc.nextInt();
		}
		int j=0;
		for (int i = 0; i < array1.length; i++) {
			 arrayfinal[j]=array1[i];
			 j++;
			 arrayfinal[j]=array2[i];
			 j++; 
		}
		System.out.println("Este es el orden:");
		for (int i = 0; i < arrayfinal.length; i++) {
			System.out.print("|"+arrayfinal[i]+"|");
		}
		sc.close();
	}

}

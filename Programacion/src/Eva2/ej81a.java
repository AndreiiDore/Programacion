package Eva2;

//import java.util.Scanner;

public class ej81a {

	public static void main(String[] args) {
		intervalo(1,10);
		
	}
	
	private static void intervalo(int num1, int num2) {
		for (int i = num1+1; i < num2; i++) {
			System.out.print(i+", ");
		}
	}

}

package Eva1;
import java.util.Scanner;
//numero par o impar
public class ej2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Dime un numero para que te diga si es par o impar:");
		num= sc.nextInt();
		if (num==0) {
			System.out.println("El numero es 0, no es par ni impar");
		}else {
			if (num%2==0) {
				System.out.println("El numero es par");
			}else {
				System.out.println("El numero es impar");
			}
		}

	}

}

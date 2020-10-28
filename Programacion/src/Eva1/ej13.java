package Eva1;

import java.util.Scanner;

public class ej13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nota;
		System.out.println("Dime que nota has sacado");
		nota=sc.nextInt();
		switch(nota) {
		case 0:case 1:case 2:case 3:case 4:System.out.println("Insuficiente");;break;
		//case 1:System.out.println("Insuficiente");;break;
		//case 2:System.out.println("Insuficiente");;break;
		//case 3:System.out.println("Insuficiente");;break;
		//case 4:System.out.println("Insuficiente");;break;
		//Se puede hacer de la otra forma
		case 5:System.out.println("Suficiente");;break;
		case 6:System.out.println("Bien");;break;
		case 7:System.out.println("Notable");;break;
		case 8:System.out.println("Notable");;break;
		case 9:System.out.println("Sobresaliente");;break;
		case 10:System.out.println("Sobresaliente");;break;
		default:System.out.println("Error. ¿Como vas a sacar un "+nota+"?");;break;
		}
	}

}

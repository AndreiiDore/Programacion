package Ex_Eva1;

import java.util.Scanner;

public class control {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int taquillas [] =new int [10];
		//Ponemos que las taquillas esten ocupadas o no aleatoriamente
		for (int i = 0; i < taquillas.length; i++) {
			taquillas[i]=(int) (Math.random()*2);
		}
		int opcion=0;
		int taquilla;
		do {
			System.out.println("Bienvenido al programa de gestion de taquillas, pulse la opcion que quiera:");
			System.out.println("1. Cerrar una taquilla");
			System.out.println("2. Abrir una taquilla");
			System.out.println("0. Salir del programa");
			opcion=sc.nextInt();
			switch(opcion) {
				case 0:
					System.out.println("Hasta la proxima!!");
				;break;
				case 1:
					for (int i = 0; i < taquillas.length; i++) {
						if (taquillas[i]==1) {
							System.out.println("Taquilla "+i+": OCUPADA");
						}else {
							System.out.println("Taquilla "+i+": LIBRE");
						}
					}
					System.out.println("Que taquilla quiere ocupar?");
					taquilla=sc.nextInt();
					if (taquillas[taquilla]==0) {
						taquillas[taquilla]=1;
					}else {
						System.out.println("Esa taquilla esta ocupada, vuelve a intentarlo mas tarde");
					}
				;break;
				case 2:
					for (int i = 0; i < taquillas.length; i++) {
						if (taquillas[i]==1) {
							System.out.println("Taquilla "+i+": OCUPADA");
						}else {
							System.out.println("Taquilla "+i+": LIBRE");
						}
					}
					System.out.println("Que taquilla quiere ocupar?");
					 taquilla=sc.nextInt();
					if (taquillas[taquilla]==1) {
						taquillas[taquilla]=0;
					}else {
						System.out.println("Esa taquilla esta ocupada, vuelve a intentarlo mas tarde");
					}
				;break;
				default:
					System.out.println("Por favor, maque con los numeros 0,1 o 2.");
				;break;
			}
			
		}while(opcion !=0);

	}

}

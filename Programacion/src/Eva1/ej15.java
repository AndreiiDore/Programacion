package Eva1;

import java.util.Scanner;

public class ej15 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int dia,mes,a�o,ok=0,salir=0;
		/*Programa para dia con mes correcto*/
		do {
			//pido a�o
			do {
				System.out.println("Dime el a�o:");
				a�o=sc.nextInt();
			}while(a�o<1000&&a�o>3000);
			//pido mes
			do {
				System.out.println("Dime el mes:");
				mes=sc.nextInt();
			}while(mes<1&&mes>12);
			//pido dia
			do {
				System.out.println("Dime el dia:");
				dia=sc.nextInt();
				//Compruebo si esta bien el dia con el mes, si no, vuelvo a introducir dia
				switch(mes) {
				case 1:case 3: case 5:case 7:case 8: case 10:case 12:
					if (dia>31) {
						System.out.println("El mes selccionado no tiene "+dia+" dias, solamente tiene 31 dias");
						ok=0;
						}else{
							ok=1;
						}
					;break;
				case 2:
					if (dia>28) {
					System.out.println("El mes selccionado no tiene "+dia+" dias, solamente tiene 28 dias");
					ok=0;
					}else{
						ok=1;
					};
				break;
				case 4:case 6: case 9: case 11:
					if (dia>30) {
						System.out.println("El mes selccionado no tiene "+dia+" dias, solamente tiene 30 dias");
						ok=0;
						}else{
							ok=1;
						}
					;break; 
				}
			}while(ok==0);
			
			if (dia<10) {
				if (mes<10) {
					System.out.println("Su fecha es "+a�o+"/0"+mes+"/0"+dia);
				}else {
					System.out.println("Su fecha es "+a�o+"/"+mes+"/0"+dia);
				}
			}else {
				System.out.println("Su fecha es "+a�o+"/"+mes+"/"+dia);
			}
			System.out.println("Quieres volver a introducir una fecha pulsa 1");
			salir=sc.nextInt();
		}while(salir==0);
		
	}

}

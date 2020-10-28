/**
 * 
 */
package Eva1;

import java.util.Scanner;

/**
 * @author andrei
 *
 */
public class MenuEstadoAnimo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int opcion;
		do {
			System.out.println("MUY BUEN DIA AMABLE ESTUDIANTE!!!!");
			System.out.println("Dime tu estado de animo actual:");
			System.out.println("1.Alegre, digamos que tengo salud");
			System.out.println("2.Digamos que mi estado de animo es como estar a Lunes por la mañana");
			System.out.println("Marca acontinuacion con la tecla 1 o 2 segun creeas que es tu estado de animo");
			opcion=sc.nextInt();
			switch(opcion) {
			case 1:
				do {
					System.out.println("Ohh... si quieres elige otra vez o pulsa 3 para salir del programa");
					System.out.println("1.Pero... alegre lo que se dice alegre de verdad?");
					System.out.println("2.O me estabas mintiendo y estas un poquito mas triste de lo que creias?");
					System.out.println("3.Si crees que ya soy un pesado y no quieres saber nada de mi");
					opcion=sc.nextInt();
					switch(opcion) {
						case 1:
							System.out.println("Pues sigue asi, la vida son dos dias y tu la estas viviendo al limite");
						;break;
						case 2:
							System.out.println("Pues en este pequeño caso no te estreses, vendran tiempos mejores");
						;break;
						case 3:
							System.out.println("Pues muchas gracias por contestar, ten un dia maravilloso");
						;break;
						default:
							System.out.println("Marca un numero, solamente vale el 1,2 o 3");
						;break;
					}
				}while(opcion>4)
			;break;
			case 2:
				do {
					System.out.println("Pero... que Lunes.... explicate");
					System.out.println("1.Que tipo de lunes? el que te apetece\"");
					System.out.println("2.O el que te quieres quedar dormido en casa sin saber nada de nadie");
					System.out.println("3.Si crees que ya soy un pesado y no quieres saber nada de mi");
					opcion=sc.nextInt();
					switch(opcion) {
						case 1:
							System.out.println("Entonces no era tan grave como parecia");
						;break;
						case 2:
							System.out.println("Pues solamente piensa que mañana es Martes y ya veras como te alegras el dia ");
						;break;
						case 3:
							System.out.println("Pues muchas gracias por contestar, ten un dia maravilloso");
						;break;
						default:
							System.out.println("Marca un numero, solamente vale 1, 2 o 3");
						;break;
					}
				}while(opcion>4);
				
			;break;
			default:
				System.out.println("Me parece que te has equivocado, has marcado un "+opcion+" y solamente se puede elegir el 1 o el 2");
			break;
			}
		}while(opcion<2);
		sc.close();
	}

}

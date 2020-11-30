/**
 * 
 */
package Ex_Eva1;

import java.util.Scanner;

/**
 * @author Andrei y Diego
 *
 */
public class buscaminas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("¿De cuanto quieres el tamaño del campo de minas?");
		int tam=sc.nextInt();
		char tablero [][] = new char[tam+1][tam+1];
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero.length; j++) {
				int valor=(int) (Math.random()*3)+1;
				if (valor==3) {
					tablero[i][j]='*';
				}else {
					tablero[i][j]='-';
				}
			}
		}
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero.length; j++) {
				System.out.print(tablero[i][j]);
			}
			System.out.println();
		}
		int cont=0;
		int validas=0;
		for (int i = 1; i < tablero.length-1; i++) {
			cont=0;
			for (int j = 1; j < tablero.length-1; j++) {
				if (tablero[i][j]=='-') {
					if (tablero[i+1][j+1]=='*') {
						cont++;
					}
					if (tablero[i++][j]=='*') {
						cont++;
					}
					if (tablero[i][j++]=='*') {
						cont++;
					}
					if (tablero[i--][j++]=='*') {
						cont++;
					}
					if (tablero[i--][j]=='*') {
						cont++;
					}
					if (tablero[i--][j--]=='*') {
						cont++;
					}
					if (tablero[i][j--]=='*') {
						cont++;
					}
					if (tablero[i++][j--]=='*') {
						cont++;
					}
					if (cont>=6) {
						validas++;
					}
				}
			}
		}
		System.out.println(validas+" celdas libres con al menos 6 minas alrededor");
	}

}

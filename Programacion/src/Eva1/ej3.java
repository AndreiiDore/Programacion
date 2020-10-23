/**
 * 
 */
package Eva1;
import java.util.Scanner;

/**
 * @author Andrei Dore
 *Como meter dator por consola con java y el uso del scanner
 */
public class ej3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//creo el obejeto scanner
		
		//lo que se pone en el "sc" es el nombre del objeto si lo cambio alli al coger datos
		//tambien lo debo de cambiar
		Scanner sc=new Scanner (System.in);
		System.out.println("Introduce un numero:");
		int num=sc.nextInt();
		System.out.println("El numero que has introducido es el "+num);
	}

}

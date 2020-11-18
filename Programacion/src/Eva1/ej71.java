/**
 * 
 */
package Eva1;

/**
 * @author Andrei
 *
 */
public class ej71 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int array1[][]= new int [3][3];
		int array2[][]= new int [3][3];
		int array3[][]= new int [3][3];
		//Pongo numeros aleatorios en array 1
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array1[i].length; j++) {
				array1[i][j]=(int) (Math.random()*10);
			}
		}
		//Pongo numeros aleatorios en array 2
		for (int i = 0; i < array2.length; i++) {
			for (int j = 0; j < array2[i].length; j++) {
				array2[i][j]=(int) (Math.random()*10);
			}
			System.out.println();
		}
		//Hago operaciones en array 3
		for (int i = 0; i < array2.length; i++) {
			for (int j = 0; j < array2[i].length; j++) {
				array3[i][j]= array1[i][j]+array2[i][j];
			}
			System.out.println();
		}
		//Muestro valores tabla 1 para ver que se a sumado
		System.out.println("Array 1 Datos:");
		for (int i = 0; i < array2.length; i++) {
			for (int j = 0; j < array2[i].length; j++) {
				System.out.print("|"+array1[i][j]);				
			}
			System.out.println();
		}
		//Muestro los valores del array 2 para ver lo que he sumado
		System.out.println("Array 2 Datos:");
		for (int i = 0; i < array2.length; i++) {
			for (int j = 0; j < array2[i].length; j++) {
				System.out.print("|"+array2[i][j]);				
			}
			System.out.println();
		}
		//Muestro los resultados
		System.out.println("Array 3 Resultados:");
		for (int i = 0; i < array2.length; i++) {
			for (int j = 0; j < array2[i].length; j++) {
				System.out.print("|"+array3[i][j]);				
			}
			System.out.println();
		}
	}

}

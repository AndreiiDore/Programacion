/**
 * 
 */
package Eva1;

/**
 * @author Andrei
 *
 */
public class ej70 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int array[][]= new int [10][10];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				array[i][j]=i*j;
			}
		}
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print("|"+array[i][j]);
			}
			System.out.println();
		}
		

	}

}

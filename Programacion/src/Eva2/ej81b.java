package Eva2;

public class ej81b {

	public static void main(String[] args) {
		int resultado [] =intervalo(1,10);
		for (int i = 0; i < resultado.length; i++) {
			System.out.println(resultado[i]);
		}

	}
	private static int[] intervalo (int num1,int num2){
		int array []=new int [num2-num1];
		for (int i = num1, j=0; i < num2; i++,j++) {
			array[j]=i;
		}
		return array;
	}

}

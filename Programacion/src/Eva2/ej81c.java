package Eva2;

public class ej81c {

	public static void main(String[] args) {
		int resultado []=intervalo(10,100,5);
		for (int i = 0; i < resultado.length; i++) {
			System.out.println(resultado[i]);
		}

	}
	private static int[] intervalo (int num1,int num2,int intervalo){
		int array []=new int [(num2-num1)/intervalo+1];
		for (int i = num1, j=0; i <= num2; i=i+intervalo,j++) {
			array[j]=i;
		}
		return array;
	}
}

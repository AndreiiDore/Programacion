package Eva2;

public class ej81b {

	public static void main(String[] args) {
		intervalo(1,10);

	}
	private static void intervalo (int num1,int num2){
		int cont=0;
		for (int i = num1; i <= num2; i++) {
			cont++;
		}
		int x=0;
		int array []=new int [cont];
		for (int i = num1; i < num2; i++) {
			array[x]=i;
			System.out.println("|"+array[x]+"|");
			x++;
			
		}
	}

}

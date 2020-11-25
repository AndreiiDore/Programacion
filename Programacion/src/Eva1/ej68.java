/**
 * 
 */
package Eva1;

import java.util.Scanner;

/**
 * @author Andrei
 * 
 * introducir notas para alumnos
 *
 */
public class ej68 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Cuantos alumnos tienes en clase?");
		int alum=sc.nextInt();
		int array [][] = new int[alum][3];
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				System.out.println("Para el alumno"+(i+1)+" cual es su "+(j+1)+"nota?");
				int nota=sc.nextInt();
				array[i][j]=nota;
			}
		}
		System.out.println("Estas son las notas introducidas:");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (j==0) {
					System.out.print("Las notas del alumno"+(i+1)+":");
				}else {
					if (j==3) {
						System.out.println(" "+array[i][j]);
					}else {
						System.out.print(" "+array[i][j]+",");
					}	
				}
				
			}
		}
		int media_alum_a=0,media_alum_b=0,media_alum_c=0;
		int media_a=0,media_b=0,media_c=0;//media por alumno
		int sus_as_a=0,sus_as_b=0,sus_as_c=0;//suspenso pòr asig
		int sus_alu_a=0,sus_alu_b=0,sus_alu_c=0;
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				switch(i) {
				case 0:media_alum_a+=array[i][j];break;
				case 1:media_alum_b+=array[i][j];break;
				case 2:media_alum_c+=array[i][j];break;
				}
				switch(j) {
				case 0:media_a+=array[i][j];break;
				case 3:media_a+=array[i][j];break;
				case 2:media_a+=array[i][j];break;
				}
				switch(j) {
				case 0:
					if (array[i][j]<5) {
						sus_as_a++;
					}
					;break;
				case 1:
					if (array[i][j]<5) {
						sus_as_b++;
					}
					;break;
				case 2:
					if (array[i][j]<5) {
						sus_as_c++;
					}
					;break;
				}
				switch(i) {
				case 0:
					if (array[i][j]<5) {
						sus_alu_a++;
					}
					;break;
				case 1:
					if (array[i][j]<5) {
						sus_alu_b++;
					}
					;break;
				case 2:
					if (array[i][j]<5) {
						sus_alu_c++;
					}
					;break;
				}
			}
		}
		for (int i = 0; i < alum; i++) {
			switch(i) {
			case 0:System.out.println("El alumno "+(i+1)+" tiene una media de "+(media_alum_a/3));;break;
			case 1:System.out.println("El alumno "+(i+1)+" tiene una media de "+(media_alum_b/3));;break;
			case 2:System.out.println("El alumno "+(i+1)+" tiene una media de "+(media_alum_c/3));;break;
			}
		}
		System.out.println("La asignartura");
		sc.close();
	}

}

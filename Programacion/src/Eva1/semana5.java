/**
 * 
 */
package Eva1;

import java.lang.reflect.Array;
import java.util.Scanner;
/*Pseudocodigo
	 * Vamos a crear 2 array distintos.
	El primero  va a ser de tipo char en el cual guardaremos los palos de la baraja, es decir, Picas, Diamantes, Corazon y Treboles (longitud de 3)
	El segundo va a contener los números que contiene la baraja, va a tener una longitud de 13.
	Despues vamos a pedir al usuario que nos ponga (valor de la carta) que lo vamos a guardar en un array y después el palo que lo vamos a meter en otro,
	este dato lo vamos a tener que pedir 4 veces.
	Lo primero que vamos a comprobar es si todas las cartas son del mismo palo, ya que el objetvo es conseguir una escalera de color.
	Si ya con los palos introducidos no se puede, le sacaremos el mensaje de que no se puede hacer una escalera de color debido al color de las cartas.
	En caso de que los palos sean correctos, vamos a crear un array de 5 posiciones en el cual vamos a ordenar las cartas de mayor a menor.
	Una vez que lo tenemos vamos a recorrer el array en busca de el valor que nos falta para completar la escalera de color, pero si falta mas de un numero en el array,
	 no se podría hacer la escalera y le sacaremos el mensaje de que es imposible hacer esa escalera debido a que falta mas de una carta.

 * */

/**
 * @author andrei
 *
 */
public class semana5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int valores[]= new int [13];
		for (int i = 0; i < valores.length; i++) {
			valores[i]=i+1;
		}
		char array_palos[]= new char[] {'D','P','T','C'};
		//2 array creados?	
		int palos_cartas[]= new int [4]; //Array para meter los palos que yo quiero de una carta
		System.out.println("Bienvenido al juego de la escalera de color, te voy a pedir 4 cartas, piensa en las cartas que vas a pedir...");
		int valores_mano[]= new int [4];
		for (int i = 0; i < array_palos.length; i++) {
			System.out.println("Dime el valor de la carta "+(i+1)+":");
			char carta_l=sc.next().charAt(0);//carta en letra
			if (carta_l>Integer.MIN_VALUE||carta_l<Integer.MAX_VALUE) {
				valores_mano[i]= Character.getNumericValue (carta_l);//castng de char a int				
			}
			/*
			 * valores de las cartas:
			 * J=11
			 * Q=12
			 * K=13
			 * */
			if (carta_l=='J'||carta_l=='j'||carta_l=='Q'||carta_l=='q'||carta_l=='K'||carta_l=='k') {
				carta_l=Character.toUpperCase(carta_l);//Lo converto a mayus
				switch(carta_l) {
				case'K':valores_mano[i]=13;break;
				case'Q':valores_mano[i]=12;break;
				case'J':valores_mano[i]=11;break;
				}
			}
			boolean correcto;
			do {
				correcto= false;
				System.out.println("De que palo quieres que sea tu carta "+carta_l+":");
				char palo=sc.next().charAt(0);//Cojo palo de la carta
				palo=Character.toUpperCase(palo);//Convierto el palo a mayus para que a la hora de compararlo sea mas facl compararlo
				palos_cartas[i]=palo;
				/*
				 * En este bucle que viene a continuacion vamos a comparar a ver si a puesto bien la figura  de las cartas, en este caso creamos un for para que nos recorra el for en busca de la letra que le hemos metido
				 * Nos va a salir del bucle en el caso de que correcto sea verdadero, si el contador que en este caso es la j llega a 3, sabremos que no se a encontrado esa letra en el array, entonces, deberemos de poner otra letra.
				 * Inicializamos la j a -1 para que cuando nos vuelva arriba valga 0 y pueda recorrer otra vez el array
				 * */
				for (int j = 0; !correcto; j++) {
					if (palo==array_palos[j]) {
						correcto=true;
					}else {
						if(j==3){
							System.out.println("Pero que dishe pisha, ese palo no existe. Debes de poner:");
							System.out.println("D: para seleccionar Diamante.");
							System.out.println("C: para seleccionar Corazon.");
							System.out.println("P: para seleccionar Picas.");
							System.out.println("T: para seleccionar Treboles.");
							j=-1;
						}
					}
				}
					
				
			}while(!correcto);
			
			
				
		}
		
		for (int i = 0; i < valores_mano.length; i++) {
			System.out.println("La carta "+i+": |"+valores_mano[i]+"| del palo: "+(palos_cartas[i]=(char)palos_cartas[i]));
			//en la ultma concatenacion hago que el numero ascii que tiene la letra y solmante sustituimos el valor
		}
		char palo_comparacion=(char) palos_cartas[0];//Vamos a meter el palo de la primera carta ya que todos deben de ser iguales
		int palos_t=0;//variable para ver cuantos son del msmo palo
		for (int i = 0; i < palos_cartas.length; i++) {
			if (palo_comparacion==palos_cartas[i]&&i>0) {
				palos_t++;
			}
		}
		if (palos_t==3) {
			System.out.println("TODOS LOS PALOS SON IGUALES!!");
			int array_ordenado[]=new int [] {14,14,14,14};//inicialzamos el array en unos numeros "grandes" para buscar el mas pequeño
			//ordenamos los numeros de menor a mayor
			for (int i = 0; i < array_ordenado.length; i++) {
				for (int j = 0; j < valores_mano.length; j++) {
					if (valores_mano[j]<array_ordenado[i]) {
						array_ordenado[i]=valores_mano[j];
						valores_mano[j]=Integer.MAX_VALUE;
					}
				}
				
			}
			for (int i = 0; i < array_ordenado.length; i++) {
				System.out.print("|"+array_ordenado[i]+("|"));
			}
			boolean orden=false;
			int contador=0;
			//Vamos a buscar la carta que nos falta.
			int cartas_faltan=0; // En caso de que nos falte una carta podremos seguir con el programa si ya llega a dos cartas que nos faltan ya no se podra hace
			for (int i = 1; i < array_ordenado.length-1; i++) {
				if (cartas_faltan==0||cartas_faltan==1) {
					if (array_ordenado[i]!=array_ordenado[i]-1) {
						cartas_faltan++;
					}
				}
				for (int j = 0; j < array_ordenado.length-1; j++) {
					if (array_ordenado[j]+1==array_ordenado[i+1]) {
						orden=true;
						contador++;
					}
				}
			}
			System.out.println();
			System.out.println(cartas_faltan);
			if (cartas_faltan<2) {
				System.out.println("Te falta mas de una carta, no se puede hacer... Intentalo mas tarde");
			}else {
				if (orden) {
					if (array_ordenado[3]==13) {
						System.out.println("Te faltaria el AS");
					}else {
						System.out.println("Te faltaria "+ (array_ordenado.length+1));
					}
				}else {
					int falta=0;
					for (int i = 0; i < array_ordenado.length; i++) {
						if (array_ordenado[i]==array_ordenado[i+1]-1) {
							falta=i;
						}
					}
					System.out.println("Te faltaria "+array_ordenado[falta-2]);
				}
			}
		}else {
			System.out.println("Vaya... No todas tus cartas son del mismo palo, solamente tienes "+(palos_t+1)+" cartas del mismo palo.");
		}
		sc.close();
	}

}
/*
 * if (valores_mano[0]<valores_mano[1]&&valores_mano[0]<valores_mano[2]&&valores_mano[0]<valores_mano[3]) {
				
			}else {
				
			}
 * */

package Eva1;

import java.util.Scanner;

//import java.util.scanner;

//import java.util.scanner;

public class hojita_sucia {

	public static void main(String[] args) {
		//int array[][]= new int [10][10];
		//scanner sc = new scanner(system.in);
		//int [] domain = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		//--------------------------------------------------------------------------------------
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
		}//------------------------------------------------------------------------------------------------------------------------------------------------------------------
		
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
			System.out.println(cartas_faltan);
			if (cartas_faltan<2) {
				System.out.println("Te falta mas de una carta, no se puede hacer... Intentalo mas tarde");
			}else {
				if (orden&&contador==3) {
					if (array_ordenado[array_ordenado.length]!=13) {
						System.out.println("La carta que te falta es "+(array_ordenado[array_ordenado.length]+1));
					}else {
						if (array_ordenado[0]!=1) {
							System.out.println("La carta que te falta es "+(array_ordenado[0]-1));

						}else {
							System.out.println("La carta que te falta es "+(array_ordenado[0]-1)+" o por la otra parte de la baraja que seria "+(array_ordenado[array_ordenado.length]+1));
						}
					}
				}
			}
		}else {
			System.out.println("Vaya... No todas tus cartas son del mismo palo, solamente tienes "+(palos_t+1)+" cartas del mismo palo.");
		}
	}
}

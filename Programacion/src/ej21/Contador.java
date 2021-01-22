package ej21;

public class Contador {
	private int cont;
	
	public Contador(){
		
	}
	public Contador (int contador) {
		setCont(contador);
	}
	//Cpnstructor copia aqui
	public Contador(Contador c1) {
		setCont(c1.getCont());
	}
	public int getCont() {
		return cont;
	}
	public void setCont(int cont) {
		if (cont<0) {
			this.cont=0;
		}else {
			this.cont = cont;	
		}
	}
	public void icrementar() {
		cont++;
	}
	public void decrementar() {
		if (cont-1>=0) {
			cont--;
		}else {
			cont=0;
		}
	}
	
}

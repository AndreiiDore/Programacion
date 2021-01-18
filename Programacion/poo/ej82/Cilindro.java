package ej82;

//import java.util.Scanner;

public class Cilindro {
	double altura;
	double radio;
	

	public Cilindro() {
		this.altura=altura;
		this.radio=radio;
	}
	public double  area( double altura ,double radio) {
		double area=(2*3.14*radio*altura)+(2*3.14*radio*2);
		return area;
	}
	public double volumen(double altura, double radio) {
		double volumen = 3.14*radio*radio*altura;
		return volumen;
	}
}

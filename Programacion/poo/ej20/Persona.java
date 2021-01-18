package ej20;

import java.util.Scanner;

public class Persona {
	private String nombre;
	private String apellidos;
	private int anioNacimiento;
	private int mesNacimiento;
	private int diaNacimiento;
	private char sexo;
	
	public Persona() {
		
	}
	public Persona (String nombre,String apellidos, int anio,int mes,int dia,char sexo) {
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.anioNacimiento=anio;
		this.mesNacimiento=mes;
		this.diaNacimiento=dia;
		this.sexo=sexo;
	}
	
	//Metodos
	public void saludar() {
		System.out.println("Hola soy "+this.nombre+" "+this.apellidos+" y naci el "+this.diaNacimiento+"/"+this.mesNacimiento+"/"+this.anioNacimiento);
	}
	public void mostrarEdad() {

		System.out.println("En la actualidad tengo "+(2020-this.anioNacimiento));
	}
	public int getEdad(int edad) {
		edad=2020-this.anioNacimiento;
		return edad;
	}
	
	//Getters y Setters
	public String getApellidos() {
		return apellidos;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		if (nombre.length()<4) {
			this.nombre="Sin especificar";
		}else {	
			for (int i = 0; i < this.nombre.length(); i++) {
				if (i==0) {
					this.nombre.toUpperCase().charAt(0);
				}else {
					this.nombre.toLowerCase().charAt(i);
				}
				//this.nombre dentro del if?
				this.nombre = nombre;
			}
		}
		
	}
	public void setApellidos(String apellidos) {
		int espacio=Integer.MIN_VALUE;
		for (int i = 0; i < this.apellidos.length(); i++) {
			if (i==0) {
				this.apellidos.toUpperCase().charAt(0);
			}else {
				if (i==this.apellidos.indexOf(' ')) {
					espacio=i+1;
				}
				if (i==espacio) {
					this.apellidos.toUpperCase().charAt(i);
				}
				this.apellidos.toLowerCase().charAt(i);
			}
			//this.nombre dentro del if?
			this.apellidos = apellidos;
		}
		
	}
	public int getAnioNacimiento() {
		return anioNacimiento;
	}
	public void setAnioNacimiento(int anioNacimiento) {
		if (anioNacimiento<1900&&anioNacimiento>2020) {
			this.anioNacimiento=anioNacimiento;
		}else {
			this.anioNacimiento=2000;
		}
		
	}
	public int getMesNacimiento() {
		return mesNacimiento;
	}
	public void setMesNacimiento(int mesNacimiento) {
		if (mesNacimiento<12&&mesNacimiento>1) {
			this.mesNacimiento=mesNacimiento;
		}else {
			this.mesNacimiento=1;
		}
	}
	public int getDiaNacimiento() {
		return diaNacimiento;
	}
	public void setDiaNacimiento(int diaNacimiento) {
		if (diaNacimiento<31&&diaNacimiento>1) {
			this.diaNacimiento=diaNacimiento;
		}else {
			this.diaNacimiento=1;
		}
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public void pedirDatos() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digame su nombre: ");
		this.nombre=sc.nextLine();
		System.out.println("Digame sus apellidos: ");
		this.apellidos=sc.nextLine();
		System.out.println("Introduzca el dia de nacimiento (solamente el dia)");
		this.diaNacimiento=sc.nextInt();
		System.out.println("Introduzca el mes de nacimiento:");
		this.mesNacimiento=sc.nextInt();
		System.out.println("Introduca el año de nacimiento:");
		this.anioNacimiento=sc.nextInt();
		sc.close();
	}
	public void mostrarDatos() {
		System.out.println("Buenas "+this.nombre+" "+this.apellidos);
		System.out.println("Su cumpleaños es el "+this.diaNacimiento+"/"+this.mesNacimiento+"/"+this.anioNacimiento);
	}
}

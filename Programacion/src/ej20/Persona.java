package ej20;



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
		setNombre(nombre);
		setApellidos(apellidos);
		setDiaNacimiento(dia);
		setMesNacimiento(mes);
		setAnioNacimiento(anio);
		setSexo(sexo);
	}
	
	//Metodos
	public String saludar() {
		return "Hola soy "+this.nombre+" "+this.apellidos+" y naci el "+this.diaNacimiento+"/"+this.mesNacimiento+"/"+this.anioNacimiento;
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
			this.nombre=nombre.substring(0, 1).toUpperCase()+nombre.substring(1);
		}
		
	}
	public void setApellidos(String apellidos) {
		char palabra []= new char [apellidos.length()];
		char letra;
		apellidos.toLowerCase();
		for (int i = 0; i < apellidos.length(); i++) {
			if (i==0) {
				letra=apellidos.toUpperCase().charAt(0);
				palabra[i]=letra;
			}else {
				palabra[i]=apellidos.charAt(i);
			}
			if (i-1==apellidos.indexOf(' ')) {
				letra=apellidos.toUpperCase().charAt(i);
				palabra[i]=letra;
			}
			
			this.apellidos=String.valueOf(palabra);

			
		}
		
	}
	public int getAnioNacimiento() {
		return anioNacimiento;
	}
	public void setAnioNacimiento(int anioNacimiento) {
		if (anioNacimiento<1900&&anioNacimiento>2020) {
			this.anioNacimiento=2000;
		}else {
			this.anioNacimiento=anioNacimiento;
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
		if (sexo!='h'||sexo!='H'||sexo!='f'||sexo!='F') {
			this.sexo='H';
		}else {
			this.sexo=sexo;
		}
	}
	
}
//int espacio=Integer.MIN_VALUE;
//for (int i = 0; i < apellidos.length(); i++) {
//	//encontramos el espacio
//	if (i==apellidos.indexOf(' ')) {
//		espacio=i;
//	}
//}
//apellidos.toLowerCase();
//String primerAP=apellidos.substring(0,espacio);
//String segundoAP=apellidos.substring(espacio);
//this.apellidos=(primerAP.substring(0,1).toUpperCase()+primerAP.substring(1))+" "+(segundoAP.substring(1,2).toUpperCase()+segundoAP.substring(2));
//this.apellidos=(apellidos.substring(0,1).toUpperCase()+apellidos.substring(1,espacio))+" "+apellidos.substring(espacio+1,espacio+2).toUpperCase()+nombre.substring(espacio+2);

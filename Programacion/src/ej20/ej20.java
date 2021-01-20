package ej20;

public class ej20 {

	public static void main(String[] args) {
		Persona yo =new Persona();
		//yo.pedirDatos();
		yo.setNombre("andrei");
		yo.setApellidos("dore hola adios");
		yo.setAnioNacimiento(1999);
		yo.setMesNacimiento(6);
		yo.setDiaNacimiento(27);
		System.out.println(yo.saludar());
		
		Persona perico=new Persona("Perico","torrez diaz",1800,5,35,'h');
		System.out.println(perico.saludar());
		
	}

}

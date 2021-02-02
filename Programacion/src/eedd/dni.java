package eedd;

public class dni {

	public static void main(String[] args) {
		Nif minif = new Nif(9748088,'K');
		System.out.println(minif.getDni()+ "-"+minif.getLetra());
		minif.setLetra('U');
		System.out.println(minif.getDni()+ "-"+minif.getLetra());
		minif.setLetra('D');
		System.out.println(minif.getDni()+ "-"+minif.getLetra());
	}

}

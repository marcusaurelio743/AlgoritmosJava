package colecao;

import java.util.ArrayList;

public class Lista {

	public static void main(String[] args) {
		ArrayList<Usuario> lista = new ArrayList<Usuario>();
		
		Usuario u1 = new Usuario("Ana");
		lista.add(u1);
		
		lista.add(new Usuario("Maria"));
		lista.add(new Usuario("Ana"));
		lista.add(new Usuario("Jose"));
		lista.add(new Usuario("paulo"));
		System.out.println("++++++++++++++++++++++++++++++++++");
		System.out.println(lista.get(3));
		System.out.println("++++++++++++++++++++++++++++++++++");
		
		lista.remove(3);
		lista.remove(new Usuario("paulo"));
		
		for(Usuario u : lista) {
			System.out.println(u);
		}
	}

}

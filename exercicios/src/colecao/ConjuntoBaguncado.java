package colecao;

import java.util.HashSet;

public class ConjuntoBaguncado {

	public static void main(String[] args) {
		HashSet conjunto = new HashSet();
		
		conjunto.add(9.0);
		conjunto.add(true);
		conjunto.add("usuario");
		conjunto.add(70);
		conjunto.add('H');
		
		System.out.println("Tamanho do conjunto: "+conjunto.size());
		conjunto.add('H');
		System.out.println("Tamanho do conjunto: "+conjunto.size());
		
		System.out.println(conjunto.remove('H'));
		
		System.out.println(conjunto);
	}

}

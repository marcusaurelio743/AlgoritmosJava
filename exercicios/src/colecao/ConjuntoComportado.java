package colecao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ConjuntoComportado {

	public static void main(String[] args) {
		
		//Set<String> lista = new HashSet<String>();
		Set<String> lista = new TreeSet<String>();//ordena a inserção
		
		lista.add("11.345");
		lista.add("maria");
		lista.add("paula");
		lista.add("jose");
		
		for(String string: lista) {
			System.out.println(string);
		}
		
		Set<Integer> num = new HashSet<>();
		//Set<String> lista = new TreeSet<String>();// ordena a inserção

		num.add(1);
		num.add(2);
		num.add(3);
		num.add(4);
		
		for(int a : num) {
			System.out.println(a);
		}

	}

}

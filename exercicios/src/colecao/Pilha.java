package colecao;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {
		Deque<String> livro = new ArrayDeque<String>();
		
		livro.add("O pequeno principe");
		livro.push("Livro2");
		livro.push("Livro 4");
		
		/*System.out.println(livro.peek());
		System.out.println(livro.element());
		System.out.println(livro.pop());
		System.out.println(livro.poll());
		System.out.println(livro.poll());
		System.out.println(livro.poll());/*
		/*livro.size();
		livro.contains(livro);
		livro.clear();
		livro.isEmpty();*/
		
		for (String string : livro) {
			System.out.println(string);
		}
		
		
	}

}

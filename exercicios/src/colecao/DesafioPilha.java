package colecao;

import java.util.ArrayDeque;
import java.util.Deque;

public class DesafioPilha {

	public static void main(String[] args) {
		//pegar a frase a pilha do gato colocar em uma pilha e imprimir o resultado
		Deque<Character> pilha = new ArrayDeque<>();
		pilha.push('a');
		pilha.push('p');
		pilha.push('i');
		pilha.push('l');
		pilha.push('h');
		pilha.push('a');
		pilha.push('d');
		pilha.push('o');
		pilha.push('g');
		pilha.push('a');
		pilha.push('t');
		pilha.push('o');
		
		for(Character x: pilha) {
			System.out.print(" "+x);
		}

	}

}

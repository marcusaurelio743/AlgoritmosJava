package colecao;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<String>();
		//add e offer adicona elemnetos da lsta
		//a diferen�a � o comportamento
		
		fila.add("Ana");
		fila.offer("Joao");
		fila.offer("Paulo");
		fila.add("Jose");
		fila.offer("Andre");
		fila.add("Marcos");
		fila.offer("Andrade");
		
		System.out.println(fila.peek());//retorna falso quando est� vazio
		System.out.println(fila.element());//lan�a exe��o quando est� vazio
		
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.remove());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		
	}

}

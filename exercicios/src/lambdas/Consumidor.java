package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {

	public static void main(String[] args) {
		Consumer<Produto> imprimir = p->System.out.println(p.nome); 
		Produto p = new Produto("Caneta", 0.9, 2.9);
		Produto p2 = new Produto("Caneta Lapis", 0.9, 2.9);
		Produto p3 = new Produto("Caneta Preta", 0.9, 2.9);
		Produto p4 = new Produto("Caneta Branca", 0.9, 2.9);
		Produto p5 = new Produto("Caneta Pontilhada", 0.9, 2.9);
		imprimir.accept(p);
		
		List<Produto> produtos = Arrays.asList(p,p2,p3,p4,p5);
		produtos.forEach(imprimir);
	}

}

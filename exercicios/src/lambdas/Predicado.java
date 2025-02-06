package lambdas;

import java.util.function.Predicate;

public class Predicado {

	public static void main(String[] args) {
		Predicate<Produto> isCaro = prod-> (prod.preco * (1 - prod.desconto)) >= 750;
		
		Produto p = new Produto("Notebook", 0.85, 3893.80);
		
		System.out.println(isCaro.test(p));
	}

}

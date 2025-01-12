package classe;

import java.util.Locale;

public class ProdutoTeste {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Produto p1 = new Produto();
		p1.nome = "Teclado Game";
		p1.preco = 500.00;
		p1.preco = 0.25;
		
		Produto p2 = new Produto("Caneta preta",12.56,0.29);
		//p2.nome = "Caneta preta";
		//p2.preco = 12.56;
		//p2.desconto = 0.29;
		double precofinal = p1.precoComDesconto(0);
		double precofinal2 = p2.precoComDesconto(0.1);
		
		System.out.println(p1.nome);
		
		System.out.println(p2.nome);
		
		System.out.println("Media carrinho: "+ (precofinal+precofinal2)/2);
		
		
		
	}

}

package oo.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {
	
	List<Item> itens = new ArrayList<Item>();
	
	void additens(Produto p, Integer quantidade) {
		this.itens.add(new Item(p, quantidade));
		
	}
	
	double obterValorTotal() {
		double total = 0.0;
		
		for(Item item: itens) {
			total+= (item.produto.preco * item.qtd);
		}
		return total;
	}
}

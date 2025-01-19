package oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Compra {
	String cliente;
	List<Item> itens = new ArrayList<Item>();
	
	double obterValorTotal() {
		double soma = 0.0;
		
		for(Item item : itens) {
			soma+= (item.quantidade*item.preco);
		}
		return soma;
	}
	

}

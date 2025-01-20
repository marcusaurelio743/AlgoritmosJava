package oo.desafio;

public class Sistema {

	public static void main(String[] args) {
		Compra compra1 = new Compra();
		compra1.additens(new Produto("caneta preta", 9.67), 100);
		compra1.additens(new Produto("notebook", 1897.88), 2);
		
		Compra compra2 = new Compra();
		compra2.additens(new Produto("caderno", 10.0), 10);
		compra2.additens(new Produto("impressora", 998.90), 1);
		
		Cliente cliente = new Cliente();
		cliente.nome = "Paulo";
		cliente.compras.add(compra1);
		cliente.compras.add(compra2);
		
		System.out.println(cliente.obterValorTotal());

	}

}

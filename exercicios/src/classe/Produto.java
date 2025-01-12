package classe;

public class Produto {
	String nome;
	double preco;
	double desconto;
	
	public double precoComDesconto(double descontoGerente) {
		return preco * (1-(desconto+descontoGerente));
	}
	
	

}

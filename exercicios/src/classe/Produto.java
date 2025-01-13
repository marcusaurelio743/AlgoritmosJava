package classe;

public class Produto {
	String nome;
	double preco;
	 static double desconto = 0.25;
	
	Produto(){
		
	}
	
	Produto(String nome){
		this.nome = nome;
		
	}
	Produto(String nome,double preco){
		this.nome = nome;
		this.preco = preco;
		
	}
	
	
	public double precoComDesconto() {
		return preco * (1-desconto);
	}
	
	public double precoComDesconto(double descontoGerente) {
		return preco * (1-(desconto+descontoGerente));
	}
	
	

}

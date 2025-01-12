package classe;

public class Produto {
	String nome;
	double preco;
	double desconto;
	
	Produto(){
		
	}
	
	Produto(String nome){
		this.nome = nome;
		
	}
	Produto(String nome,double preco){
		this.nome = nome;
		this.preco = preco;
		
	}
	Produto(String nome,double preco,double desconto){
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
	}
	
	public double precoComDesconto() {
		return preco * (1-desconto);
	}
	
	public double precoComDesconto(double descontoGerente) {
		return preco * (1-(desconto+descontoGerente));
	}
	
	

}

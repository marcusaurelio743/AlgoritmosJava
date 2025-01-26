package oo.heranca.desafio;

public class Corrida {

	public static void main(String[] args) {
		Carro gol = new Gol();
		gol.velocidade = 100;
		Carro ferrari = new Ferrari();
		ferrari.velocidade = 100;
		ferrari.acelerar();
		ferrari.acelerar();
		
		gol.acelerar();
		gol.acelerar();
		
		System.out.println("velocidade Ferrari: "+ferrari.velocidade);
		System.out.println("velocidade Gol: "+gol.velocidade);
		
		ferrari.reduzir();
		ferrari.reduzir();
		ferrari.reduzir();
		ferrari.reduzir();
		
		gol.reduzir();
		gol.reduzir();
		gol.reduzir();
		gol.reduzir();
		gol.reduzir();
		gol.reduzir();
		
		
		
		System.out.println("velocidade Ferrari: "+ferrari.velocidade);
		System.out.println("velocidade Gol: "+gol.velocidade);
	}

}

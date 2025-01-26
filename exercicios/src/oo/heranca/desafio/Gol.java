package oo.heranca.desafio;

public class Gol extends Carro {
	
	public void reduzir() {
		if(velocidade >= 0) {
			velocidade -= 20;
			
			if(velocidade < 0) {
				
				velocidade = 0;
			}
		}
	}
	
	public void acelerar() {
		
		velocidade += 2;
	}
	
}

package oo.heranca.desafio;

public class Ferrari extends Carro {
	public void acelerar() {
		
		velocidade += 5;
	}
	public void reduzir() {
		if(velocidade >= 0) {
			velocidade -= 30;
			if(velocidade < 0) {
				velocidade = 0;
			}
		}
	}
	

}

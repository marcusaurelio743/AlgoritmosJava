package oo.heranca.desafio;

public class Carro {
	int velocidade;
	
	public void reduzir() {
		if(velocidade >=0) {
			velocidade--;
		}
	}
	public void acelerar() {
		velocidade++;
	}

}

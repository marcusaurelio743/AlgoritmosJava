package oo.heranca.desafio;

public class Ferrari extends Carro implements Esportivo {
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
	@Override
	public void ligarTurbo() {
		acelerar();
		acelerar();
		acelerar();
	}
	@Override
	public void desligarTurbo() {
		reduzir();
		reduzir();
		reduzir();
		
	}
	

}

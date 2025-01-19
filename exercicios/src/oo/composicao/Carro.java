package oo.composicao;

public class Carro {
	Motor motor;
	
	public Carro() {
		this.motor = new Motor(this);
	}
	
	void acelerar() {
		
		if(motor.fatorInjecao < 2.6) {
			
			motor.fatorInjecao+= 0.4;
		}
	}
	
	void freiar() {
		
		if(motor.fatorInjecao > 0.5) {
			motor.fatorInjecao-= 0.4;
		}
	}
	
	void ligado() {
		motor.ligado = true;
	}
	void desligado() {
		motor.ligado = false;
	}
	boolean estaLigado() {
		return motor.ligado;
	}
}

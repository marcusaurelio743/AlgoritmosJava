package oo.composicao;

public class CarroTest {

	public static void main(String[] args) {
		Carro c1 = new Carro();
		c1.ligado();
		
		System.out.println(c1.estaLigado());
		System.out.println(c1.motor.giros());
		
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		System.out.println(c1.motor.giros());
		c1.freiar();
		c1.freiar();
		c1.freiar();
		c1.freiar();
		c1.freiar();
		c1.freiar();
		c1.freiar();
		c1.freiar();
		
		System.out.println(c1.motor.giros());
		
		//rela��o bidirecional
		System.out.println(c1.motor.carro.motor.carro.motor.giros());
	}

}

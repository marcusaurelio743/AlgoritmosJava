package oo.polimorfismo;

import java.util.Locale;

public class Jantar {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Pessoa convidado = new Pessoa(99.65);
		
		Arroz igr1 = new Arroz(0.2);
		Feijao igr2 = new Feijao(0.1);
		
		System.out.println(convidado.getPeso());
		
		convidado.comer(igr1);
		convidado.comer(igr2);
		
		System.out.printf("%.2f",convidado.getPeso());
		
		Sorvete sobremesa = new Sorvete(0.400);
		
		convidado.comer(sobremesa);
		convidado.comer(sobremesa);
		
		System.out.printf("\n%.2f",convidado.getPeso());
		
		
	}

}

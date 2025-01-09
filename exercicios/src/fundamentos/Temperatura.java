package fundamentos;
/*
 * faça um programa que converter uma temperatura em fahrenheit para celsius
 */

public class Temperatura {
	
	public static void main(String[] args) {
		// (F-32) X 5/9 = c
		final double conversao = 32.0;
		final double multiplicador = 5.0/9.0;
		double f = 115;
		
		double conversor = (f-conversao) * multiplicador;
		
		System.out.println("valor informado em fahrenheit "+ f);
		System.out.println("convertido em celsius fica: "+conversor);
	}
}

package lambdas;

import java.util.Arrays;
import java.util.List;

public class ForEach {

	public static void main(String[] args) {
		List<String> Aprovados = Arrays.asList("ana","bia","liy","gui");
		
		System.out.println("Forma de imprimir tradicional");
		
		for(String nome: Aprovados) {
			
			System.out.println(nome);
		}
		
		System.out.println("\nForma de imprimir Lambida #01");
		
		Aprovados.forEach((nome)->{System.out.println(nome+" !!!!!!!!");});
		
		System.out.println("\n forma method reference #01...");
		
		Aprovados.forEach(System.out::println);
		
		System.out.println("\n Forma de imprimir Lambida #02");
		Aprovados.forEach(nome -> meuImprimir(nome));
		
		System.out.println("\n forma method reference #02...");

		Aprovados.forEach(ForEach::meuImprimir);
		
	}
	
	static void meuImprimir(String nome) {
		
		System.out.println("Olá: "+nome);
	}

}

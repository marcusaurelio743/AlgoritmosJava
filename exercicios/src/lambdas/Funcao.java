package lambdas;

import java.util.function.Function;

public class Funcao {

	public static void main(String[] args) {
		Function<Integer, String> parOuImpar = numero-> numero % 2 == 0 ?"Par": "Impar";
		
		System.out.println(parOuImpar.apply(33));
		
		Function<String, String> oResultadoE = valor-> "O resultado �: "+valor; 
		Function<String, String> empolgado = valor-> valor+" !!!!!!!!!!"; 
		
		String resultado = parOuImpar.andThen(oResultadoE).andThen(empolgado).apply(55);
		
		System.out.println(resultado);
	}

}

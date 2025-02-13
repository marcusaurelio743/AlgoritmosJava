package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Map {
	public static void main(String[] args) {
		Consumer<String> print = System.out::print;
		
		List<String> marcas = Arrays.asList("BMW","Fiat ","Honda ","Lamborgini ","Ferrari ");
		
		marcas.stream().map(m->m.toUpperCase()).forEach(print);
		System.out.println("\n\n usando composi��o");
		//UnaryOperator<String> maicuscula = n ->n.toUpperCase();
		//UnaryOperator<String> primeiraletra = n ->n.charAt(0) + "";
		//UnaryOperator<String> grito = n ->n+" !!!!!!! ";
		
		marcas.stream()
			.map(Utilitarios.maicuscula)
			.map(Utilitarios.primeiraletra)
			.map(Utilitarios.grito)
			.forEach(print);
		
		
	}
}

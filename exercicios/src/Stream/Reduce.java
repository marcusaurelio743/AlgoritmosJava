package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce {

	public static void main(String[] args) {
		List<Integer> numns = Arrays.asList(1,2,3,4,5,6,7,8,9);
		BinaryOperator<Integer> soma = (ac,n)-> ac+n;
		
		int total = numns.stream().reduce(soma).get();
		
		System.out.println(total);
		
		int total2 = numns.parallelStream().reduce(100, soma);
		System.out.println(total2);
	}

}

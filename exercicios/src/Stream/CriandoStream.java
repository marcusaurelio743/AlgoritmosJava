package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStream {

	public static void main(String[] args) {
		
		Consumer<String> print = System.out::print;
		
		Stream<String> lang = Stream.of("Java ","PHP ", "Js\n");
		lang.forEach(print);
		
		String[] maisLang = {"Pyton ","C# ", "PHP ","GO\n"};
		
		Stream.of(maisLang).forEach(print);
		Arrays.stream(maisLang).forEach(print);
		Arrays.stream(maisLang,2,4).forEach(print);
		
		List<String> outrasLang = Arrays.asList("Java ", "C++ ", "Kotlin\n");
		outrasLang.stream().forEach(print);
		outrasLang.parallelStream().forEach(print);
	}

}

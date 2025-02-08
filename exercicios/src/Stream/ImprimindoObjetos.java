package Stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {
	public static void main(String[] args) {
		
	List<String> aprovados = Arrays.asList("Lu","Luca","Amanada","Jose");
	
	for(int i=0; i< aprovados.size(); i++) {
		System.out.println(aprovados.get(i));
	}
	
	System.out.println();
	
	for (String aprovado : aprovados) {
		System.out.println(aprovado);
	}
	
	System.out.println("\n usando Iterator....");
	Iterator<String> it = aprovados.iterator();
	
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	
	System.out.println("\n usando Stream....");
	
	Stream<String> stream = aprovados.stream();
	
	stream.forEach(System.out::println);
	
	
   
}

}

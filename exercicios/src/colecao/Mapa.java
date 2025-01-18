package colecao;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {

	public static void main(String[] args) {
		Map<Integer, String> usuarios = new HashMap<Integer, String>();
		
		usuarios.put(1, "Amanda");
		usuarios.put(2, "Jose");
		usuarios.put(3, "Marcus");
		usuarios.put(4, "Paula");
		
		System.out.println(usuarios.size());
		System.out.println(usuarios.isEmpty());
		System.out.println(usuarios.keySet());
		System.out.println(usuarios.entrySet());
		
		for(int x: usuarios.keySet()) {
			System.out.println(x);
		}
		for(String x: usuarios.values()) {
			System.out.println(x);
		}
		for(Entry<Integer, String> registro: usuarios.entrySet()) {
			System.out.print(registro.getKey()+ " ");
			System.out.println(registro.getValue());
		}
	}

}

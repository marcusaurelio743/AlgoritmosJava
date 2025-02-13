package Stream;

import java.util.function.UnaryOperator;

public class Utilitarios {
	public final static UnaryOperator<String> maicuscula = n ->n.toUpperCase();
	public final static UnaryOperator<String> primeiraletra = n ->n.charAt(0) + "";
	 public final static UnaryOperator<String> grito = n ->n+" !!!!!!! ";

}

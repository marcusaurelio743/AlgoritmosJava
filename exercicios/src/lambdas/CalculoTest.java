package lambdas;

public class CalculoTest {

	public static void main(String[] args) {
		
		Calculo calculo = new Soma();
		System.out.println(calculo.execultar(5.0, 7.0));
		
		calculo = new Multiplicar();
		System.out.println(calculo.execultar(3.0, 5.0));
	}

}

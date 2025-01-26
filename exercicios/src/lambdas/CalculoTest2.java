package lambdas;

public class CalculoTest2 {

	public static void main(String[] args) {
		Calculo calculo = (x,y) ->{return (x+y);};
		
		 System.out.println(calculo.execultar(5.0, 15.0));
		 
		 calculo = (x,y) -> x*y;
		 
		 System.out.println(calculo.execultar(3.0, 5.0));
	}

}

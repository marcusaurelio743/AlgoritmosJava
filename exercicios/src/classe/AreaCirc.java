package classe;

public class AreaCirc {
	double raio;
	 static final double PI = 3.1415;
	
	public AreaCirc(double raioInicial) {
		
		raio = raioInicial;
	}
	//metodo Math.pow eleva o valor informado ex: raio * raio
	public double area() {
		return Math.pow(raio, 2)* PI;
				
	}
	
	public static double area(double raio) {
		return Math.pow(raio, 2)* PI;
	}

}

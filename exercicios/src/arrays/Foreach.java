package arrays;

public class Foreach {

	public static void main(String[] args) {
		double[] notas = {7.4,5.7,6.8,9.9,8.7};
		
		for (int i = 0; i < notas.length; i++) {
			System.out.println(notas[i]);
		}
		System.out.println("------------------------------------------------------");
		for(double nota : notas) {
			System.out.println(nota);
		}
	}

}

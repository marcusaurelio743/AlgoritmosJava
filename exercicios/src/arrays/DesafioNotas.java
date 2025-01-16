package arrays;

import java.util.Locale;
import java.util.Scanner;

public class DesafioNotas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Olá Por favor informe a quantidade de notas?:");
		int valor = sc.nextInt();
		
		double[] notas = new double[valor];
		
		for(int i = 0; i< valor; i++) {
			System.out.println("informe a "+(i+1)+" nota:");
			notas[i] = sc.nextDouble();
			
		}
		double soma = 0.0;
		for(double nota : notas) {
			soma+= nota;
			System.out.println(nota);
		}
		
		System.out.println("media total: "+soma/notas.length);
		
		sc.close();

	}

}

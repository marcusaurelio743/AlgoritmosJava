package arrays;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("informe a quantidade de alunos:");
		int qtdAluno = sc.nextInt();
		
		System.out.println("quantas notas por aluno:");
		int qtdnota = sc.nextInt();
		
		double[][] matriz = new double[qtdAluno][qtdnota];
		
		double notaTotal = 0.0;
		
		for (int a = 0; a < matriz.length; a++) {
			for (int n = 0; n < matriz[a].length; n++) {
				System.out.printf("informe a nota %d do aluno %d: ",(n+1),(a+1));
				matriz[a][n] = sc.nextDouble(); 
				notaTotal+= matriz[a][n];
			}
		}
		
		double media = notaTotal / (qtdAluno*qtdnota);
		System.out.println("media turma: "+media);
		System.out.println("===============================");
		
		for(double[] notasdoAluno: matriz) {
			
			System.out.println(Arrays.toString(notasdoAluno));
		}
		
		
		sc.close();
	}

}

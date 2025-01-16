package arrays;

import java.util.Arrays;

public class Exercicios {
	public static void main(String[] args) {
		double[] notasAluno = new double[4];
		
		System.out.println(Arrays.toString(notasAluno));
		
		notasAluno[0] = 7.0;
		notasAluno[1] = 8.0;
		notasAluno[2] = 9.0;
		notasAluno[2] = 6.0;
		
		System.out.println(Arrays.toString(notasAluno));
		
		double soma = 0.0;
		for(int i= 0; i<notasAluno.length; i++) {
			soma+=notasAluno[i];
		}
		System.out.println(soma/notasAluno.length);
		System.out.println("======================================================");
		
		double[] aluno2 = {9.0,6.5,7.8,8.6};
		
		double somaAluno2 = 0.0;		
		for (int i = 0; i < aluno2.length; i++) {
			somaAluno2+= aluno2[i];
		}
		
		System.out.println(somaAluno2 / aluno2.length);
	}

}

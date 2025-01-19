package oo.composicao;

public class CursosTest {

	public static void main(String[] args) {
		Aluno a1 = new Aluno("Joao");
		Aluno a2 = new Aluno("Maria");
		Aluno a3 = new Aluno("Pedro");
		
		
		Curso c1 = new Curso("Java");
		Curso c2 = new Curso("Analise de software");
		Curso c3 = new Curso("POO");
		
		
		c1.adicionar(a1);
		c1.adicionar(a2);
		
		c2.adicionar(a1);
		c2.adicionar(a3);
		
		a1.adicionar(c3);
		a2.adicionar(c3);
		a3.adicionar(c3);
		
		for(Aluno aluno: c1.alunos) {
			System.out.println("Estou matriculado no curso "+c1.nome+"....");
			System.out.println(" meu nome é: "+aluno.aluno);
		}
		System.out.println("============================================");
		
		for(Aluno aluno: c3.alunos) {
			System.out.println("Estou matriculado no curso "+c3.nome+"....");
			System.out.println(" meu nome é: "+aluno.aluno);
		}
	}

}

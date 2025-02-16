package Stream;

import java.util.Arrays;
import java.util.List;

public class Filter {

	public static void main(String[] args) {
		Aluno a1 = new Aluno("Ana", 7.9);
		Aluno a2 = new Aluno("Bia", 5.9);
		Aluno a3 = new Aluno("Carla", 9.9);
		Aluno a4 = new Aluno("Simas", 6.9);
		Aluno a5 = new Aluno("Andre", 5.4);
		Aluno a6 = new Aluno("Jõao", 4.7);
		
		List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4,a5,a6);
		
		alunos.stream()
			.filter(a-> a.nota >= 7.0)
			.map(a->"Parabéns "+a.nome+" você foi aprovado com nota: "+a.nota)
			.forEach(System.out::println);
	}

	}

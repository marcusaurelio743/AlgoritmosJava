package oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
	final String aluno;
	final List<Curso> cursos = new ArrayList<>();
	
	public Aluno(String nome) {
		this.aluno = nome;
	}
	void adicionar(Curso curso) {
		this.cursos.add(curso);
		curso.alunos.add(this);
	}

}

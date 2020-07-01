package com.nobuwebdeveloper.gerenciadorcurso.teste;

import com.nobuwebdeveloper.gerenciadorcurso.classes.Aluno;
import com.nobuwebdeveloper.gerenciadorcurso.classes.Aula;
import com.nobuwebdeveloper.gerenciadorcurso.classes.Curso;

public class TestaCursoComAluno {

	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Nobuyoshi Ishizuka");
		
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com Coleções", 24));
		
		Aluno a1 = new Aluno("Rodrigo Turini", 11111);
		Aluno a2 = new Aluno("Guilherme Silveira", 22222);
		Aluno a3 = new Aluno("Mauricio Aniche", 33333);
		
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		
		System.out.println("Todos os alunos matriculados: ");
		javaColecoes.getAlunos().forEach(aluno -> {System.out.println(aluno);});

	}

}

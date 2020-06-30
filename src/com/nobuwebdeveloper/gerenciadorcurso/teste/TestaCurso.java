package com.nobuwebdeveloper.gerenciadorcurso.teste;

import java.util.List;

import com.nobuwebdeveloper.gerenciadorcurso.classes.Aula;
import com.nobuwebdeveloper.gerenciadorcurso.classes.Curso;

public class TestaCurso {

	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Nobuyoshi Ishizuka");
		
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com Coleções", 24));
		
		javaColecoes.getAulas().add(new Aula("Trabalhando com ArrayList", 21));
		
		System.out.println(javaColecoes.getAulas());
	}

}

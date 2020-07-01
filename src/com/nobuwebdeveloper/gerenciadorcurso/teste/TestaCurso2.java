package com.nobuwebdeveloper.gerenciadorcurso.teste;

import java.util.HashSet;
import java.util.Set;

public class TestaCurso2 {


	public static void main(String[] args) {

		Set<String> alunos = new HashSet<>();
		alunos.add("Rodrigo Turin");
		alunos.add("Alberto Souza");
		alunos.add("Nico Steppat");
		alunos.add("Pedro");
		
		
		for (String aluno : alunos) {
			System.out.println(aluno);
		}
		
		
		
		System.out.println(alunos.size());
	
		alunos.add("Pedro");
		System.out.println(alunos.size());
		
		boolean adicionou = alunos.add("Pedrod");
		System.out.println("Pedro foi adicionado ao Set? " + adicionou);
	}

}

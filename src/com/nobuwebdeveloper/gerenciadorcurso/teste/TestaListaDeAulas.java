package com.nobuwebdeveloper.gerenciadorcurso.teste;

import java.util.ArrayList;
import java.util.Comparator;

import com.nobuwebdeveloper.gerenciadorcurso.classes.Aula;

public class TestaListaDeAulas {

	public static void main(String[] args) {

		Aula a1 = new Aula("Revisitando as ArrayListis", 21);
		Aula a2 = new Aula("Lista de Objetos", 20);
		Aula a3 = new Aula("Relacionamento de Listas", 15);
		
		ArrayList<Aula> aulas = new ArrayList<>();
		aulas.add(a1);
		aulas.add(a2);
		aulas.add(a3);
		
		aulas.sort(Comparator.comparing(Aula::getTempo));
		
		System.out.println(aulas);
	}

}

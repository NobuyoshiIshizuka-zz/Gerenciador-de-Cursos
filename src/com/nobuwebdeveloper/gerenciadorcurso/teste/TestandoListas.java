package com.nobuwebdeveloper.gerenciadorcurso.teste;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {

	public static void main(String[] args) {
		
		String aula1 = "Java";
		String aula2 = "Orientação a Objetos";
		String aula3 = "Servlets";
		
		ArrayList<String> aulas = new ArrayList<>();
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);
		
		Collections.sort(aulas);
		
		System.out.println(aulas);
	}

}

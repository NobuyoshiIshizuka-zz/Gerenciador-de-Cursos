package com.nobuwebdeveloper.gerenciadorcurso.classes;

public class Aluno {

	private String nome;
	private int numeroMatricula;
	
	public Aluno(String nome, int matricula) {
		this.nome = nome;
		this.numeroMatricula = matricula;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getNumeroMatricula() {
		return numeroMatricula;
	}

	@Override
	public String toString() {
		return "[Aluno: " + this.nome + ", Matricula: " + this.numeroMatricula + "]";
	}
	
	
}

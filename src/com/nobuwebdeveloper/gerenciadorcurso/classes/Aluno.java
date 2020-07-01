package com.nobuwebdeveloper.gerenciadorcurso.classes;

public class Aluno {

	private String nome;
	private int numeroMatricula;
	
	public Aluno(String nome, int matricula) {
		if (nome == null) {
			throw new NullPointerException("Nome n�o pode ser nulo");
		}
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
	
	@Override
	public boolean equals(Object obj) {
		Aluno outroAluno = (Aluno) obj;
		return this.nome.equals(outroAluno.nome);
	}
	
	@Override
	public int hashCode() {
		return this.nome.charAt(0);
	}
	
}

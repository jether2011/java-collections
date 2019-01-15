package com.jetherrodrigues.domain;

import java.io.Serializable;

/**
 * 
 * @author jether.rodrigues
 *
 */
public final class Aluno implements Serializable, Comparable<Aluno>{

	private static final long serialVersionUID = 1L;
	private String nome;
	private int numeroMatricula;
	
	public Aluno(String nome, int numeroMatricula) {
		this.nome = nome;
		this.numeroMatricula = numeroMatricula;
	}

	public String getNome() {
		return nome;
	}

	public int getNumeroMatricula() {
		return numeroMatricula;
	}

	@Override
	public int compareTo(Aluno outro) {
		return this.nome.compareTo(outro.nome);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Aluno [nome=").append(nome).append(", numeroMatricula=").append(numeroMatricula).append("]");
		return builder.toString();
	}

}

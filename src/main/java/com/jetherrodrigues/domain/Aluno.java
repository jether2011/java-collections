package com.jetherrodrigues.domain;

import java.io.Serializable;
import java.util.Objects;

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
	public int hashCode() {
		return Objects.hash(nome, numeroMatricula);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(nome, other.nome) && numeroMatricula == other.numeroMatricula;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Aluno [nome=").append(nome).append(", numeroMatricula=").append(numeroMatricula).append("]");
		return builder.toString();
	}

}

package com.jetherrodrigues.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.TreeSet;

/**
 * 
 * @author jether.rodrigues
 *
 */
public class Course implements Serializable, Comparable<Course> {

	private static final long serialVersionUID = 1L;

	private String nome;
	private String instrutor;
	
	@SuppressWarnings("unused")
	private int totalTimeOfClass;
	
	private List<Class> classes = new ArrayList<>();
	/**
	 * TreeSet funciona aqui pois a classe Aluno implementa Comparable, sem essa implementação iria estourar uma Unchecked Exception
	 * TreeSet é mais lento que HashSet (este usa tabela de espalhamento que agrupa objetos e através do hash sabe isolar o grupo que irá buscar o resultado)
	 * A busca em um Set é muito mais rápido que List
	 * Set não possui ordenação e busca por index, justamente pelo modelo de busca e agrupamento
	 * LinkedHashSet é tão rápido a busca quanto HashSet e permite uma ordem nas inserções
	 */
	private Set<Aluno> alunos = new TreeSet<>();
	private Map<Integer, Aluno> numberAluno = new HashMap<Integer, Aluno>();

	public Course(String nome, String instrutor) {
		super();
		this.nome = nome;
		this.instrutor = instrutor;
	}

	public String getNome() {
		return nome;
	}

	public String getInstrutor() {
		return instrutor;
	}

	public List<Class> getClasses() {
		return Collections.unmodifiableList(classes);
	}
	
	public Set<Aluno> getAlunos() {
		return Collections.unmodifiableSet(alunos);
	}
	
	public Map<Integer, Aluno> retornaMapaMatriculaAluno() {
		return Collections.unmodifiableMap(numberAluno);
	}
	
	public int getTotalTimeOfClass() {
		/**
		 * old way
		 */
		//return totalTimeOfClass;
		/**
		 * new way
		 */
		return this.classes.stream().mapToInt(Class::getTime).sum();
	}
	
	public void add(Class c) {
		this.totalTimeOfClass += c.getTime();
		this.classes.add(c);
	}
	
	public void addAluno(Aluno aluno) {
		this.alunos.add(aluno);
		this.numberAluno.put(aluno.getNumeroMatricula(), aluno);
	}
	
	public Aluno searchAluno(int number) {
		if(!this.numberAluno.containsKey(number))
			throw new NoSuchElementException("Aluno não encontrado para a matricula: " + number);
		return this.numberAluno.get(number);
	}

	@Override
	public int compareTo(Course o) {
		return 0;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Course [nome=")
				.append(nome)
				.append(", instrutor=")
				.append(instrutor)
				.append(", classes=")
				.append(classes)
				.append("]");
		return builder.toString();
	}

}

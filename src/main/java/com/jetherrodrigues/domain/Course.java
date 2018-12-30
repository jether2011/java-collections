package com.jetherrodrigues.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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

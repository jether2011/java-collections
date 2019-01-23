package com.jetherrodrigues.sets;

import java.util.Map.Entry;
import java.util.Set;

import com.jetherrodrigues.domain.Aluno;
import com.jetherrodrigues.domain.Class;
import com.jetherrodrigues.domain.Course;

public class TestaBuscaAluno {

	public static void main(String[] args) {
		Course courses = new Course("Dominando as coleções do Java",
                "Paulo Silveira");

        courses.add(new Class("Trabalhando com ArrayList", 21));
        courses.add(new Class("Criando uma Aula", 20));
        courses.add(new Class("Modelando com coleções", 24));

        Aluno a1 = new Aluno("Rodrigo Turini", 34672);
        Aluno a2 = new Aluno("Guilherme Silveira", 5617);
        Aluno a3 = new Aluno("Mauricio Aniche", 17645);
        
        courses.addAluno(a1);
        courses.addAluno(a2);
        courses.addAluno(a3);
        
        System.out.println("Todos os alunos matriculados: ");
        courses.getAlunos().forEach(aluno -> {
            System.out.println(aluno);
        });
        
        System.out.println("Buscando aluno pela matricula 34672...");
        System.out.println("Aluno: " + courses.searchAluno(34672));
        
        System.out.println("Iterando Map...");
        System.out.println("Keys:");
        Set<Integer> keySet = courses.retornaMapaMatriculaAluno().keySet();
        keySet.forEach(System.out::println);
        
        System.out.println("Values:");
        courses.retornaMapaMatriculaAluno().values().parallelStream().forEach(System.out::println);
        
        System.out.println("Entry:");
        Set<Entry<Integer, Aluno>> entries = courses.retornaMapaMatriculaAluno().entrySet();
        for (Entry<Integer, Aluno> entry : entries) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		} 
        
        System.out.println("Entry (Java 8):");
        entries.parallelStream().forEach(e -> {
        	System.out.println(e.getKey() + ": " + e.getValue());
        });
	}

}

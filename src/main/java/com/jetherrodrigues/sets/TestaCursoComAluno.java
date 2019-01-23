package com.jetherrodrigues.sets;

import com.jetherrodrigues.domain.Aluno;
import com.jetherrodrigues.domain.Course;
import com.jetherrodrigues.domain.Class;

public class TestaCursoComAluno {

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
	}

}

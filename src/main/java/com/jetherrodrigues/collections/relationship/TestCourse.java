package com.jetherrodrigues.collections.relationship;

import com.jetherrodrigues.domain.Class;
import com.jetherrodrigues.domain.Course;

/**
 * 
 * @author jether.rodrigues
 *
 */
public class TestCourse {

	public static void main(String[] args) {
		Course javaCollections = new Course("Java Collections", "Paulo Silveira");
		
		javaCollections.add(new Class("Working wiht List of object", 17));
		javaCollections.add(new Class("Working ArrayList", 12));
		
		System.out.println(javaCollections);
	}

}

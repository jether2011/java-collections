package com.jetherrodrigues.collections.relationship;

import java.util.ArrayList;
import java.util.List;

import com.jetherrodrigues.domain.Class;
import com.jetherrodrigues.domain.Course;

/**
 * 
 * @author jether.rodrigues
 *
 */
public class TestCourse2 {

	public static void main(String[] args) {
		Course javaCollections = new Course("Java Collections", "Paulo Silveira");
		
		javaCollections.add(new Class("Working wiht List of object", 17));
		javaCollections.add(new Class("Working ArrayList", 12));
		
		System.out.println(javaCollections);
		
		List<Class> imutableClasses = javaCollections.getClasses();
		System.out.println(imutableClasses);
		
		List<Class> mutableClasses = new ArrayList<Class>(imutableClasses);
		
	}

}

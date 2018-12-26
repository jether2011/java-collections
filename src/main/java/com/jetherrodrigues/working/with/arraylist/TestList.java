package com.jetherrodrigues.working.with.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 
 * @author jether.rodrigues
 *
 */
public class TestList {

	public static void main(String[] args) {
		List<String> courses = new ArrayList<String>();
		courses.add("Spring MVC");
		courses.add("Spring Boot");
		courses.add("Java Programmer I");
		courses.add("Unity");
		
		System.out.println("The first course is: " + courses.get(0));
		//courses.forEach(c -> System.out.println(c));
		System.out.println(courses);
		
		courses.remove(3);
		Collections.sort(courses);
		
		System.out.println("The first course is (after sort): " + courses.get(0));
		//courses.forEach(c -> System.out.println(c));
		System.out.println(courses);
	}

}

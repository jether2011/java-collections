package com.jetherrodrigues.list.of.object;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.jetherrodrigues.domain.Class;

/**
 * 
 * @author jether.rodrigues
 *
 */
public class TestListOfClass {

	public static void main(String[] args) {
		List<Class> classes = new ArrayList<Class>();
		classes.add(new Class("Working wiht List of object", 17));
		classes.add(new Class("Working ArrayList", 12));
		
		System.out.println(classes);
		
		Collections.sort(classes);
		System.out.println(classes);
		
		classes.add(new Class("Reviewing Objects", 19));
		classes.sort(Comparator.comparing(Class::getTime));
		System.out.println(classes);
	}

}

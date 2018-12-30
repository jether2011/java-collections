package com.jetherrodrigues.sets;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 
 * @author jether.rodrigues
 *
 */
public class TestSets {

	public static void main(String[] args) {
		/**
		 * With Set, we can't have the guarantee of that order 
		 */
		Set<String> names = new HashSet<String>();
		names.add("Jether Rois");
		names.add("Denise Cristina");
		names.add("Isabelly Costa");
		names.add("Beatriz Costa");
		/**
		 * Set guarantee the Set does not has a duplicate object
		 */
		names.add("Beatriz Costa");
		
		System.out.println(names);
		
		names.forEach(n -> System.out.println(n));
		
		System.out.println(names.contains("Beatriz Costa"));
		System.out.println(names.size());
		
		names.remove("Beatriz Costa");
		System.out.println(names.contains("Beatriz Costa"));
		System.out.println(names.size());
		
		List<String> names2 = new ArrayList<>(names);
		Collections.sort(names2);
		System.out.println(names2);
	}

}

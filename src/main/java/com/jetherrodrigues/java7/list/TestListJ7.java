package com.jetherrodrigues.java7.list;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author jether.rodrigues
 *
 */
public class TestListJ7 {

	public static void main(String[] args) {
		List<String> conjunto1 = new ArrayList<>();
		List<String> conjunto2 = new ArrayList<>();
		
		conjunto1.add("J");
		conjunto1.add("E");
		conjunto1.add("T");
		
		conjunto2.add("H");
		conjunto2.add("E");
		conjunto2.add("R");
		conjunto2.add("J");
		conjunto2.add("T");
		
		if (conjunto2.containsAll(conjunto1)) {
			System.out.println("sim");
		}
	}

}

package com.jetherrodrigues.hackerrank;

public class NumberException {

	public static void main(String[] args) {
		try {
			System.out.println(doStuff("x"));
		} catch (Exception e) {
			/**
			 * if throws an exception, the 'exc' string will be printed
			 */
			System.out.println("exc");
		}
	}

	static int doStuff(String args) {
		return Integer.parseInt(args);
	}
}

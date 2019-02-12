package com.jetherrodrigues.hackerrank;

public class HerancaCompile {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		B b = new B();
		@SuppressWarnings("unused")
		C c = new C();
		/**
		 * will not compile because b is not c, b is a A and c is a A
		 */
		//b = c;
	}

}

class A {
	public void print() {
		System.out.println("A");
	}
}

class B extends A{
	public void print() {
		System.out.println("B");
	}
}

class C extends A{
	public void print() {
		System.out.println("C");
	}
}
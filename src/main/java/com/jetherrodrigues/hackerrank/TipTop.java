package com.jetherrodrigues.hackerrank;

public class TipTop {

	public static void main(String[] args) {
		/**
		 * 
		 * @author jether.rodrigues
		 *
		 * Using InnerClass
		 * Will not print anything but the code will compile fine
		 */
		@SuppressWarnings("unused")
		class Inner {
			Inner() {
				System.out.println("AA");
			}
		}
		
		/**
		 * if an instance to be created, the string 'AA' will be printed
		 */
		//Inner inner = new Inner();
	}

}

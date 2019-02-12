package com.jetherrodrigues.hackerrank;

import java.io.IOException;

public class IsPossible {
	public static void main(String[] args) throws IOException {
		String result = isPossible(1, 4, 5, 9);
		System.out.println(result);

		String result2 = isPossible(1, 2, 3, 6);
		System.out.println(result2);
	}

	public static String isPossible(int a, int b, int c, int d) {
		if (a == c && b == d) {
			return "Yes";
		}

		int result = transform(a, b, c, d, true);

		if (result == 0) {
			return "Yes";
		} else {
			result = transform(a, b, c, d, false);
		}

		if (result == 0) {
			return "Yes";
		}

		return "No";
	}

	private static int transform(int a, int b, int c, int d, boolean left) {
		if (left) {
			a = a + b;

		} else {
			b = a + b;
		}

		if (a == c && b == d) {
			return 0;
		}

		if (a > c || b > d) {
			return -1;
		}

		int result = transform(a, b, c, d, true);

		if (result == -1) {
			result = transform(a, b, c, d, false);
		}

		return result;
	}

}

package com.jetherrodrigues.hackerrank;

import java.io.IOException;

public class InTheFeature {
    public static void main(String[] args) throws IOException {

        int result = Result2.minNum(3, 5, 1);
        System.out.println(result);
        
        int result2 = Result2.minNum(4, 5, 1);
        System.out.println(result2);
    }
}

class Result2 {

    public static int minNum(int A, int K, int P) {
    	if ((K - A) <= 0) {
            return -1;
        }
        
        if ((K - (A + 1)) == 1) {
            return 1;
        }
        
        return ((K-A)/((K+P)-(A+P)));
    }

}

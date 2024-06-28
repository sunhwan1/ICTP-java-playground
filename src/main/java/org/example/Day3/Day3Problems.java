package org.example.Day3;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/{numbers}
 * */

public class Day3Problems {

    public int solution_181938(int a, int b) {
        String strA = String.valueOf(a);
        String strB = String.valueOf(b);
        int ab = Integer.parseInt(strA + strB);
        int two_ab = 2 * a * b;
        return Math.max(ab, two_ab);
    }
}
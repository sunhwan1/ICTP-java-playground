package org.example.Day3;

public class p181938 {
    public static void main(String[] args) {
        int result = solution(2,91);
        System.out.println(result);
    }

    public static int solution(int a, int b) {
        String strA = String.valueOf(a);
        String strB = String.valueOf(b);
        int ab = Integer.parseInt(strA + strB);
        int two_ab = 2 * a * b;
        return Math.max(ab, two_ab);
    }
}
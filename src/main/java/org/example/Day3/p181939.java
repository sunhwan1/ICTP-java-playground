package org.example.Day3;
// 더 크게 합치기
public class p181939 {
    public static void main(String[] args) {
        int result = solution(9,91);
        System.out.println(result);
    }

    public static int solution(int a, int b) {
        String strA = String.valueOf(a);
        String strB = String.valueOf(b);
        int ab = Integer.parseInt(strA + strB);
        int ba = Integer.parseInt(strB + strA);
        return Math.max(ab, ba);
    }
}
package org.example.Day4;

public class Solution_181931 {
    public int solution_181931(int a, int d, boolean[] included) {
        int answer = 0;
        for (int i = 0; i < included.length; i++) {
            if (included[i]) {
                answer += a + i * d;
            }
        }
        return answer;
    }
}

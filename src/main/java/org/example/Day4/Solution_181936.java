package org.example.Day4;

public class Solution_181936 {
    public int Solution_181937(int number, int m, int n) {
        // 공배수
        return (number % n == 0 && number % m == 0) ? 1 : 0;
    }
}
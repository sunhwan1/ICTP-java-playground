package org.example;
// 홀짝 확인하기
import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        sc.close();

        if (str.length() % 2 == 0) {
            // 나눴을 때 나머지가 0 이면 짝수
            System.out.println("even");
        } else {
            // 나눴을 때 나머지가 1 이면 홀수
            System.out.println("odd");
        }
    }
}

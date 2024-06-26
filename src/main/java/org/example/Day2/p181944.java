package org.example.Day2;
// 홀짝 구분하기
import java.util.Scanner;

public class p181944 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.print(n);



        System.out.print(" is ");

        if (n % 2 == 0) {
            // 나눴을 때 나머지가 0 이면 짝수
            System.out.println("even");
        } else {
            // 나눴을 때 나머지가 1 이면 홀수
            System.out.println("odd");

        }

    }
}
package org.example;
// 출력문자, 횟수 받아서 반복하기
import java.util.Scanner;

// public : java 파일의 주인 객체 이름.
public class test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();


        for (int i = 0; i < n; i++) {
            System.out.print(str);
        }
        System.out.println();


    }
}
package org.example.Day1;
// 문자열 반복해서 출력하기
import java.util.Scanner;

// public : java 파일의 주인 객체 이름.
public class P181950 {
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
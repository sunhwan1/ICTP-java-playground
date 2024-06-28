package org.example.Day2;
// 문자열 돌리기

import java.util.Scanner;

        public class P181945 {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                String input = sc.next();

                // 각 문자를 한 줄씩 출력
                // input.length() : 입력받은 문자의 길이 확인.
                // input.charAt(i) : 문자열 input 의 i번째 위치에 있는 문자를 반환.
                for (int i = 0; i < input.length(); i++) {
                    System.out.println(input.charAt(i));
                }

                sc.close();
            }
        }


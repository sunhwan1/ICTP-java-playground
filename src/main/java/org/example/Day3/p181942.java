package org.example.Day3;
// 문자열 섞기
import java.util.Scanner;

public class p181942 {
    public String solution(String str1, String str2) {
        StringBuilder answer = new StringBuilder();

        int length = str1.length();

        for (int i = 0; i < length; i++) {
            answer.append(str1.charAt(i));
            answer.append(str2.charAt(i));
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println();
        String str1 = scanner.nextLine();

        System.out.println();
        String str2 = scanner.nextLine();

        if (str1.length() != str2.length()) {
            System.out.println("두 문자열의 길이가 같아야 합니다.");
            return;
        }

        p181942 instance = new p181942();
        String result = instance.solution(str1, str2);
        System.out.println(result);
    }
}

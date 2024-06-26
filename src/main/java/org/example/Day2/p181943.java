package org.example.Day2;
//문자열 겹쳐쓰기
import java.util.Scanner;

public class p181943 {
    public static String solution(String my_string, String overwrite_string, int s) {
        // my_string.substring(0, s) 0 ~ s-1 까지의 문자 + overwrite_string(입력받은 값 그대로) + my_string.substring(s + overwrite_string.length()(overwrite_string 이후의 남은 문자)
        return my_string.substring(0, s) + overwrite_string + my_string.substring(s + overwrite_string.length());
    }
    // 기본 형식
    public static void main(String[] args) {
        // 스캔을 위한 기본 형식
        Scanner sc = new Scanner(System.in);

        // 문자 입력 요청
        String my_string = sc.nextLine();
        String overwrite_string = sc.nextLine();
        int s = sc.nextInt();

        // solution 메서드를 호출하여 덮어쓰기 작업을 수행하고 결과 문자열을 result 변수에 저장.
        String result = solution(my_string, overwrite_string, s);

        // 출력
        System.out.println(result);

        // 스캐너 닫음
        sc.close();
    }
}

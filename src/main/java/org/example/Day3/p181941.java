package org.example.Day3;
// 문자 리스트를 문자열로 변환하기

public class p181941{
    // https://school.programmers.co.kr/learn/courses/30/lessons/181940
    public static void main(String[] args) {
        String result = solution("love",10);
        System.out.println(result);
    }

    public static String solution(String my_string, int k) {
        StringBuilder answer = new StringBuilder();
        for(int i = 1; i < k; i++){
            answer.append(my_string);
        }
        return answer.toString();
    }
}

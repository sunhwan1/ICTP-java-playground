package org.example.Day3;
// 문자열 곱하기
class p181940 {
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

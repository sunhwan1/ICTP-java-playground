package org.example.switchT;

import java.util.Random;

public class SwitchTest {
    public static void main(String[] args) {
        // 랜덤? (1~12중 랜덤한 수 뽑기)
        // mission : 9번 라인의 우항 공식을 메소드화 시켜 보시오.
        // int getRandomNumber(int start, int end);
        // start값 ~ end값 사이의 랜덤값을 가져옴.
        int month = getRandomNumber(1,12);
//        int month = (int) (Math.random() * 12) + 1;
        String monthString = "";
        switch (month) { // 조건 줄수 있는 자료형 : char, int, enum, String, byte, short
            case 1: monthString = "Jan"; break;
            case 2: monthString = "Feb"; break;
            case 3: monthString = "Mar"; break;
            case 4: monthString = "Apr"; break;
            case 5: monthString = "May"; break;
            case 6: monthString = "Jun"; break;
            case 7: monthString = "Jul"; break;
            case 8: monthString = "Aug"; break;
            case 9: monthString = "Sep"; break;
            case 10: monthString = "Oct"; break;
            case 11: monthString = "Nov"; break;
            case 12: monthString = "Dec"; break;
            default: monthString = "Invalid month"; break;
        }
        System.out.println(monthString);
    }

    public static int getRandomNumber(int start, int end) {
        return (int) (Math.random() * (end-start+1)) + start;
    }
}
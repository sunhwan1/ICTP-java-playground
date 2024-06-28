package org.example.Day4;

import java.util.ArrayList;

public class ArrayListT {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");


        // 길이
        System.out.println(list.size()); // 4
        // 값을 가져오기
        System.out.println(list.get(0)); // "a"
        // 해당 값이 있나, 없나?
        System.out.println(list.contains("c")); // true

        // list 의 특정 값 지우기
        boolean isRemoved = list.remove("c");
        System.out.println(isRemoved); // true

        String result = list.remove(0); // a


        //for 문을 돌면서 작업 수행하기
        for (String s : list) {
            System.out.printf("%s, ", s);

        }


    }
}
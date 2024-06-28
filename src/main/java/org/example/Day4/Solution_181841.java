package org.example.Day4;

import java.util.ArrayList;

class Solution_181841 {
    public String solution(String[] str_list, String ex) {
        ArrayList<String> list = new ArrayList<>();

        for (String str : str_list) {
            if (!str.contains(ex)) {
                list.add(str);
            }
        }

        StringBuilder answer = new StringBuilder();
        for (String str : list) {
            answer.append(str);
        }

        return answer.toString();
    }
}

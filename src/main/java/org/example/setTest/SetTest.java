package org.example.setTest;

import java.util.Arrays;
import java.util.HashSet;

public class SetTest {

    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>(Arrays.asList("H","e","l","l","o"));
        System.out.println(set); // [e,H,l,o] (중복을 제외하고 출력됨.)

        HashSet<Integer> s1 = new HashSet<>(Arrays.asList(1,2,3,4,5,6));
        HashSet<Integer> s2 = new HashSet<>(Arrays.asList(4,5,6,7,8,9));
        // 교집합(intersection) 구하기 retainAll
        HashSet<Integer> intersection = new HashSet<>(s1);
        intersection.retainAll(s2);
        System.out.println(intersection); // [4, 5, 6]

        // 합집합(union) 구하기  addAll (set 자체가 애초에 중복을 제외하니 중복없이 출력된다.)
        HashSet<Integer> union = new HashSet<>(s1);
        union.addAll(s2);
        System.out.println(union); // [1, 2, 3, 4, 5, 6, 7, 8, 9]

        // 차집합 구하기 removeAll
        HashSet<Integer> substract = new HashSet<>(s1);
        substract.removeAll(s2);
        System.out.println(substract); // [1, 2, 3]


    }
}

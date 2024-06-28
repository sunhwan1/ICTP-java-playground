package org.example.Day4;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ListSort {
    public static void main(String[] args) {
        ArrayList<String> list =
                new ArrayList<>(Arrays.asList("a","c","k","g","d"));
        for(String s : list){
            System.out.print(s + ","); // a,c,k,g,d
        }
        System.out.println();
        // 정렬
        list.sort(Comparator.naturalOrder());
        for(String s : list) {
            System.out.print(s + ","); // a,c,d,g,k
        }
    }
}

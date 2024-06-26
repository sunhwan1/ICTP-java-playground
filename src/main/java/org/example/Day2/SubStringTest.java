package org.example.Day2;
//배열 배우기
public class SubStringTest {
    public static void main(String[] args) {
        String hi = "hello 안녕하세요.";
        System.out.println(hi);
        String result1 = hi.substring(2);
        System.out.println(result1);
        String result2 = hi.substring(2, 4);
        System.out.println(result2);
        CharSequence result3 = hi.subSequence(2,4);
        System.out.println(result3);

        int[] nums = new int[5];
        nums[3] = 2;
        int[] nums2 = {4,5,2,3,5};

    }
}
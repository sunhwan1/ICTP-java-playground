package org.example.mapexample;

import java.util.HashMap;

public class MapTest2 {
    public static void main(String[] args) {
        // MapTest 에서는 한 사람의 계정 정보가 하나의 HashMap 에 담겨 있음.
        // 여러명의 계정 정보를 Map 으로 관리하려면 어떻게 할 수 있나?
        HashMap<String, Person> users = new HashMap<String, Person>();
        // 집어넣기
        users.put("1", new Person("shkwon", "myPassword", "240204@ict.ac.kr", "shdescription"));
        users.put("2", new Person("111111", "11Password", "111111@ict.ac.kr", "11description"));
        users.put("3", new Person("222222", "22Password", "222222@ict.ac.kr", "22description"));

        // 3번 Person 의 정보 접근
        // 접근 : 보는 의미 뿐만 아니라, crud(보고, 수정, 생성, 삭제) 가능.
//        Person p3 = users.get("3");
//        System.out.printf("id: %s \t email: %s\t", p3.id, p3.email);

        // mission : users 모두 가져와서 콘솔에 뿌리기




        for(String key : users.keySet()) {
            System.out.printf("id: %s\t pw: %s \n", users.get(key).id, users.get(key).pw);
        }
    }
}


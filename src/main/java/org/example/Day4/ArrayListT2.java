package org.example.Day4;

import java.util.ArrayList;

public class ArrayListT2 {
    public static void main(String[] args) {
        Person[] persons = new Person[15]; // 배열로 선언
        ArrayList<Person> list = new ArrayList<Person>(); // list 로 선언
        list.add(new Person("a", 22));
        list.add(new Person("b", 24));
        list.add(new Person("c", 30));
        Person p = list.get(0);
        System.out.printf("name: %s, age: %d\n", p.name, p.age); // name: a, age: 22

        // foreach 를 돌려서 각 Person 의 이름과 나이를 출력 해 보시오.
        for (Person pp : list) {
            System.out.printf("name: %s, age: %d\n", pp.name, pp.age);

        }

        Person[] person1 = new Person[3]; // 배열로 선언
        persons[0] = new Person("a", 22);
        persons[1] = new Person("b", 24);
        persons[2] = new Person("c", 30);

        Person[] persons2 = new Person[]{
                new Person("a", 22),
                new Person("b", 24),
                new Person("c", 30),

        };
        // 배열





    }
}

class Person {
    String name;
    Integer age;
    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;

    }
}
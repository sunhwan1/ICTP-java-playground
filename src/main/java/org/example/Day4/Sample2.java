package org.example.Day4;

class Animal2 {
    String name;
    Integer age;
    public Animal2(String name, Integer age) {
        this.name = name;
        this.age = age;

    }
    public Animal2(String name) {
        this.name = name;
    }
    public Animal2(Integer age) {
        this.age = age;
    }
    public Animal2() {}
}


public class Sample2 {
    public static void main(String[] args) {
        Animal2 a2 = new Animal2();
        Animal2 a3 = new Animal2("dog",23);
        Animal2 a4 = new Animal2(23);
        Animal2 a5 = new Animal2("dog");
    }
}

package org.example.Day4;

class Creature {
    String name;

    public void setName(String name) {
        this.name = name;
    }
}


class Animal extends Creature { // Creature 클래스 상속
    String name;
    public void setName(String name) {
        this.name = name;
    }

    public void setCreatureName(String name) {
        super.name = name;
    }
}

class Dog extends Animal {  // Animal 클래스를 상속한다.
    void sleep(String sound) {

        System.out.println(sound);
    }
}

public class Sample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("poppy");
        dog.setCreatureName("dog");
        dog.sleep("zzzzz");


  //      System.out.println(dog.name);
    }
}

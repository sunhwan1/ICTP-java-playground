package org.example.Day5;

// interface 공부

// user 는 interface 를 보며 쓴다. 구현 클래스에 있는 것을 가져다 쓸 수 있게 해주는 객체
interface AnimalFeedable {
    void feed();
}

class Turtle implements AnimalFeedable {

// 기능이 어떻게 돌아가게 될지에 대한 것.
    @Override
    public void feed() {

    }
}
public class AnimalB {
    public static void main(String[] args) {
        AnimalFeedable af = new Turtle();
        af.feed();

    }

}
// 디자인 패턴에 따라 프레임 워크가 만들어진다.
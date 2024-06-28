package org.example.callbysomething;

// callby레퍼런스
// 주황색이 아닌 것은 다 참조형이다.
//

class Updater {
    void update(Counter counter) {
        counter.count++;
    }
}

class Counter {
    int count = 0;
}

public class Sample {
    public static void main(String[] args) {
        Counter myCounter = new Counter();
        System.out.printf("before update: %d \n", myCounter.count);
        Updater myUpdater = new Updater();
        myUpdater.update(myCounter);
        System.out.printf("after update: %d \n", myCounter.count);
    }
}

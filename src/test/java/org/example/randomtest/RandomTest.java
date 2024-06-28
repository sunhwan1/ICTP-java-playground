package org.example.randomtest;

import org.example.switchT.SwitchTest;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RandomTest {

    @Test
    // 1~12까지의 랜덤한 수가 잘 나오나?
    public void randomTest() {
        for(int i = 1; i <= 1000; i++){
            int randomNum = SwitchTest.getRandomNumber(1,12);
            assertThat(true, is(randomNum >= 1 && randomNum <= 12));
        }
    }
}

















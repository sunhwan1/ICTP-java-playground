import org.example.Day2.P181943test;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class TT {
    @Test
    public void pTest(){
        String a = "abc";
        int sum = 1+2;

        assertThat(a, is("abc"));
        assertThat(sum, is(3));
    }

    @Test
    public void p181943test(){
        String resuslt = P181943test.solution("aaaaaa"
                , "bbb"
                , 3);
        assertThat(resuslt, is("aaabbb"));

    }

}

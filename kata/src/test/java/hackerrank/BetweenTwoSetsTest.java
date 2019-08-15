package hackerrank;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class BetweenTwoSetsTest {


    @Test
    public void test() {

        List<Integer> a = Arrays.asList(2, 4);
        List<Integer> b = Arrays.asList(16, 32, 96);
        int totalX = BetweenTwoSets.getTotalX(a, b);
        System.out.println(totalX);
    }


    @Test
    public void test2() {
        List<Integer> a = Arrays.asList(3, 4);
        List<Integer> b = Arrays.asList(24, 48);
        int totalX = BetweenTwoSets.getTotalX(a, b);
        System.out.println(totalX);
    }

}
package kata;

import kata.Sum;
import org.junit.Test;

import java.util.stream.IntStream;

import static org.junit.Assert.*;

/**
 *s
 */
public class SumTest {


    Sum s = new Sum();

    @Test
    public void Test1() {
        assertEquals(-1, s.GetSum(0, -1));
        assertEquals(1, s.GetSum(0, 1));
    }


    @Test
    public void test2(){
//        IntStream.rangeClosed(5,-1).sum();
//        System.out.println();
        IntStream.rangeClosed(-1,5).forEach(System.out::print);
        System.out.println();
        IntStream.range(-17,-17).forEach(System.out::print);

    }

}
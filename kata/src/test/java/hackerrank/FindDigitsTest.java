package hackerrank;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.List;

public class FindDigitsTest {

    Logger log = LoggerFactory.getLogger(this.getClass());


    @Test
    public void test1() {
        Assertions.assertThat(FindDigits.findDigits(1012)).isEqualTo(3);
    }

    @Test
    public void test2() {
    }


    private List<Integer> test =  Arrays.asList(
            123456789
            ,114108089
            ,110110015
            ,121
            ,33
            ,44
            ,55
            ,66
            ,77
            ,88
            ,106108048);

    private List<Integer> results = Arrays.asList(3
            ,3
            ,6
            ,2
            ,2
            ,2
            ,2
            ,2
            ,2
            ,2
            ,5);

    @Test
    public void test3(){
        int i = 0;
        for (Integer integer : test) {
            System.out.println(integer);

            Assertions.assertThat(FindDigits.findDigits(integer)).isEqualTo(results.get(i++));

        }
    }

}
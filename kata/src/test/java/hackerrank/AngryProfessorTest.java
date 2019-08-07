package hackerrank;

import org.junit.Before;
import org.junit.Test;

public class AngryProfessorTest {

    int k = 0;
    int b[];

    @Before
    public void before() {
        k = 3;
        b = new int[]{-1, -3, 4, 2};

    }

    @Test
    public void test() {
        String s = AngryProfessor.angryProfessor(k, b);
        System.out.println(s);
    }

    @Test
    public void test2() {
        String s = AngryProfessor.angryProfessor(2, new int[]{0, -1, 2, 1});
        System.out.println(s);
    }

}
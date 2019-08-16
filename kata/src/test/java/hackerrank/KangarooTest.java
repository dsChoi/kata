package hackerrank;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class KangarooTest {
    @Test
    public void test() {
        Assertions.assertThat(Kangaroo.kangaroo(0, 3, 4, 2)).isEqualTo("YES");
    }

    @Test
    public void test2() {
        Assertions.assertThat(Kangaroo.kangaroo(0, 2, 5, 3)).isEqualTo("NO");
    }

}
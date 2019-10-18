package hackerrank;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class BreakingTheRecordsTest {
    /// 생략 ///
    Logger log = LoggerFactory.getLogger(this.getClass());

    @Test
    public void test1() {
        int tests[] = new int[]{3, 4, 21, 36, 10, 28, 35, 5, 24, 42};
        int[] results
                = BreakingTheRecords.breakingRecords(tests);

        /// 생략 ///
        log.info("results = {}", results);

        Assertions.assertThat(results
                .length).isEqualTo(2);
        Assertions.assertThat(results[0]).isEqualTo(4);
        Assertions.assertThat(results[1]).isEqualTo(0);
    }

}
package hackerrank;

import org.assertj.core.api.Assertions;
import org.junit.Test;


public class DrawingBookTest {

	@Test
	public void test(){
		Assertions.assertThat(DrawingBook.pageCount(5, 4)).isEqualTo(0);
		Assertions.assertThat(DrawingBook.pageCount(6, 2)).isEqualTo(1);
	}

}
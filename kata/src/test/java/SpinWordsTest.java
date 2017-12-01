import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Created by NHNEnt on 2017-12-01.
 */
public class SpinWordsTest {
	@Test
	public void test() {
		assertEquals("emocleW", new SpinWords().spinWords("Welcome"));
	}

}
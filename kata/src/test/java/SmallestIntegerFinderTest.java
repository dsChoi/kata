import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Created by NHNEnt on 2017-12-01.
 */
public class SmallestIntegerFinderTest {
	@Test
	public void example1() {
		int expected = 11;
		int actual = SmallestIntegerFinder.findSmallestInt(new int[]{78, 56, 232, 112, 11, 43});
		assertEquals(expected, actual);
	}

}
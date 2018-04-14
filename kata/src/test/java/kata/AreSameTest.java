package kata;

import static org.junit.Assert.assertEquals;

import kata.AreSame;
import org.junit.Test;

/**
 * Created by NHNEnt on 2017-11-30.
 */
public class AreSameTest {

	@Test
	public void test1() {
		int[] a = new int[]{121, 144, 19, 161, 19, 144, 19, 11};
		int[] b = new int[]{121, 14641, 20736, 361, 25921, 361, 20736, 361};
		assertEquals(AreSame.comp(a, b), true);
	}

	@Test
	public void test2() {
		int[] a = new int[]{0, 144, 161, 1, 19, 195, -14, 191};
		int[] b = new int[]{0, 20736, 1, 36481, 25921, 196, 361, 38025};
		assertEquals(AreSame.comp(a, b), true);
	}

	@Test
	public void test3() {
		int[] a = new int[]{144, 161, 19, 121, 11};
		int[] b = new int[]{20736, 14641, 25921, 36100, 121, 361};
		assertEquals(true, AreSame.comp(a, b));
	}

	@Test
	public void test4() {
		int[] a = new int[]{144, 161, 19, 121, 11};
		int[] b = new int[]{20736, 14641, 25921, 36100, 121, 361};
		boolean actual = AreSame.comp(a, b);
		assertEquals(true, actual);
		assertEquals(actual, true);
	}

	@Test
	public void test5() {
		int[] a = new int[]{};
		int[] b = new int[]{1};
		boolean actual = AreSame.comp2(a, b);
		assertEquals(true, actual);
	}


}
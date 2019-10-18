package kata;

import static org.junit.Assert.assertEquals;

import kata.Kata;
import org.junit.Test;

/**
 * Created by NHNEnt on 2017-11-29.
 */
public class KataTest {
	@Test
	public void tests() {
		assertEquals("fgh", Kata.longestWord("a b c d e fgh"));
		assertEquals("three", Kata.longestWord("one two three"));
		assertEquals("grey", Kata.longestWord("red blue grey"));
	}
}
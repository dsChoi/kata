import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LineTest {
	@Test
	public void test1() {
		assertEquals("YES", Line.Tickets(new int[]{25, 25, 50}));
	}

	@Test
	public void test2() {
		assertEquals("NO", Line.Tickets(new int[]{25, 100}));
	}

	@Test
	public void test3() {
		assertEquals("YES", Line.Tickets(new int[]{25, 25, 25, 100}));
	}

	@Test
	public void test4() {
		assertEquals("YES", Line.Tickets(new int[]{25, 25, 50, 50}));
	}

	@Test
	public void test5() {
		assertEquals("YES", Line.Tickets(new int[]{25, 50, 25, 50}));
	}

	@Test
	public void test6() {
		assertEquals("NO", Line.Tickets(new int[]{25, 25, 50, 25, 100}));
	}

	@Test
	public void test7() {
		assertEquals("YES", Line.Tickets(new int[]{25, 25, 25, 25, 50, 100, 50}));
	}


}
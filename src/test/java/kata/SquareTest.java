package kata;

import kata.Square;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.Random;

public class SquareTest {
    @Test
    public void shouldWorkForSomeExamples() throws Exception {
        assertEquals("negative numbers aren't square numbers", false, Square.isSquare(-1));
        assertEquals("3 isn't a square number", false,  Square.isSquare(3));
        assertEquals("4 is a square number",    true,   Square.isSquare(4));
        assertEquals("25 is a square number",   true,   Square.isSquare(25));
        assertEquals("26 isn't a square number",false,  Square.isSquare(26));
        assertEquals("219154152  isn't a square number",false,  Square.isSquare(219154152 ));
    }
    @Test
    public void shouldWorkForRandomSquareNumbers() throws Exception {
        Random rand = new Random();
        for(int i = 0; i < 100; ++i){
            int randomNum = rand.nextInt(0x0fff);
            int randomSq = randomNum * randomNum;
            assertEquals(String.format("%d is a square number", randomSq), true, Square.isSquare(randomSq));
        }
    }
}
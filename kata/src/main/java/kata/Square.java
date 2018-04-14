package kata;

public class Square {

    public static boolean isSquare(int n) {
        return (int)Math.sqrt(n) * (int)Math.sqrt(n) == n;
    }
}

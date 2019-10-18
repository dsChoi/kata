package hackerrank;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//https://www.hackerrank.com/challenges/kangaroo/problem
public class Kangaroo {

    private static final Scanner scanner = new Scanner(System.in);
    private static String YES = "YES";
    private static String NO = "NO";


    // Complete the kangaroo function below.
    static String kangaroo(int x1, int v1, int x2, int v2) {
        if (v1 <= v2) {
            return NO;
        }
        return ((x2 - x1)) % (v1 - v2) == 0 ? YES : NO;
    }

    // Complete the kangaroo function below.
    static String kangaroo2(int x1, int v1, int x2, int v2) {

        if (v1 <= v2) {
            return NO;
        }

        int mathA = x1 + v1;
        int mathB = x2 + v2;
        int sign = mathB - mathA;
        if (sign == 0) {
            return YES;
        }
        while (Math.signum(sign) != -1) {
            mathA = mathA + v1;
            mathB = mathB + v2;
            if (mathA == mathB) {
                return YES;
            }
            sign = mathB - mathA;
        }
        return NO;
    }

    static String kangaroo3(int x1, int v1, int x2, int v2) {
        for (int i = 0; i < 10000; i++) {
            if (x1 + v1 * i == x2 + v2 * i) {
                return YES;
            }
        }
        return NO;

    }

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] x1V1X2V2 = scanner.nextLine().split(" ");

        int x1 = Integer.parseInt(x1V1X2V2[0]);

        int v1 = Integer.parseInt(x1V1X2V2[1]);

        int x2 = Integer.parseInt(x1V1X2V2[2]);

        int v2 = Integer.parseInt(x1V1X2V2[3]);

        String result = kangaroo(x1, v1, x2, v2);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

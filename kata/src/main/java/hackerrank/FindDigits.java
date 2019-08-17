package hackerrank;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//https://www.hackerrank.com/challenges/find-digits/problem
public class FindDigits {
    private static final Scanner scanner = new Scanner(System.in);

    // Complete the findDigits function below.
    static int findDigits(int n) {

        char[] chars = String.valueOf(n).toCharArray();
        int count = 0;
        for (char aChar : chars) {
            int ch = Character.getNumericValue( aChar);
            if (ch != 0 && n % ch == 0) {
                System.out.println(ch);
                count++;
            }
        }
        return count;
    }

    static int findDigits2(int n) {
        int r = n;
        int count = 0;
        while (r > 0) {
            if (r % 10 != 0 && n % (r % 10) == 0) {
                System.out.println("n = " + n + " (r % 10)" + r % 10);
                System.out.println("r = " + r);
                count++;
            }
            r = r / 10;
        }

        System.out.println(count);
        return count;
    }

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int result = findDigits(n);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }

}

package hackerrank;

import java.util.Scanner;

/**
 * Created by 두석 on 2018-04-12.
 */
public class StairCase {
        static void staircase(int n) {
            for (int i = 1; i <= n; i++) {
                for (int j =n-1;  j >= 0; j--) {
                    if (j >= i) {
                        System.out.print(" ");
                    } else {
                        System.out.print("#");

                    }
                }
                System.out.println(" ");
            }
        }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine().trim());

        staircase(n);
    }
}

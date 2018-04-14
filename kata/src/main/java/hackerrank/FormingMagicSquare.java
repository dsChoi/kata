package hackerrank;

import java.util.Scanner;

/**
 * Created by 두석 on 2018-04-11.
 */
public class FormingMagicSquare {
    static int formingMagicSquare(int[][] s) {
        // Complete this function
        return 0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] s = new int[3][3];
        for(int s_i = 0; s_i < 3; s_i++){
            for(int s_j = 0; s_j < 3; s_j++){
                s[s_i][s_j] = in.nextInt();
            }
        }
        int result = formingMagicSquare(s);
        System.out.println(result);
        in.close();
    }
}

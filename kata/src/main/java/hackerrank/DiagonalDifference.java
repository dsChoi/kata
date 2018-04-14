package hackerrank;

import com.sun.javafx.binding.StringFormatter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by 두석 on 2018-04-11.
 */
public class DiagonalDifference {

    /*
     * Complete the diagonalDifference function below.
     */
    static int diagonalDifference(int[][] a) {
        /*
         * Write your code here.
         */
        int arrayLength = a.length;


        int first = 0;
        int second = 0;


        for (int i = 0; i < arrayLength; i++) {
            for (int j = 0; j < arrayLength; j++) {
                if (i == j) {
                    System.out.println("a[" +  i + "][" +  j + "]");
                    first = first + a[i][j];
                }
                if( i== arrayLength - j -1 ){
                    second = second + a[i][j];
                }

            }
        }
        return Math.abs(first - second);
    }

    private static List<String> getFirstLine(int arrayLength) {


        List<String> s = new ArrayList<>();
        for (int i = 0; i < arrayLength; i++) {
            s.add(i + "," + i);
        }
        return s;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(scan.nextLine().trim());

        int[][] a = new int[n][n];

        for (int aRowItr = 0; aRowItr < n; aRowItr++) {
            String[] aRowItems = scan.nextLine().split(" ");

            for (int aColumnItr = 0; aColumnItr < n; aColumnItr++) {
                int aItem = Integer.parseInt(aRowItems[aColumnItr].trim());
                a[aRowItr][aColumnItr] = aItem;
            }
        }

        int result = diagonalDifference(a);

        bw.write(String.valueOf(result));
        bw.newLine();

        bw.close();
    }

}


package hackerrank;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/mini-max-sum/problem
 *
 *
 *
 */

public class MiniMaxSum {
    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {

        int min = 0 ;
        int max = 0;

        long totalSum = 0;
        for (int i =0; i< arr.length; i++) {
            int value = arr[i];
            if(i == 0){
                min = value;
                max = value;
            }

            if( min > i){
                min = value;
            }
            if( max  < i){
                max = value;
              }
            totalSum = totalSum + value;

        }

        System.out.print((totalSum - min) + " " + (totalSum -  max));
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }



}

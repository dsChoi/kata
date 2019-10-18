package hackerrank;

import java.util.Scanner;

/**
 * Created by 두석 on 2018-04-12.
 */
public class PlusMinus {

    static void plusMinus(int[] arr) {
        int length = arr.length;

        double positive = 0;
        double negative = 0;
        double zero = 0;
        for (int i : arr) {
            if(i  > 0){
               positive++;
            }else if(i ==0){
                zero++;
            }else{
                negative++;
            }
        }
        System.out.println(String.format("%05.06f", positive/length));
        System.out.println(String.format("%05.06f", negative/length));
        System.out.println(String.format("%05.06f", zero/length));

    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {



        int n = Integer.parseInt(scan.nextLine().trim());

        int[] arr = new int[n];

        String[] arrItems = scan.nextLine().split(" ");

        for (int arrItr = 0; arrItr < n; arrItr++) {
            int arrItem = Integer.parseInt(arrItems[arrItr].trim());
            arr[arrItr] = arrItem;
        }

        plusMinus(arr);
    }
}

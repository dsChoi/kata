package hackerrank.sort;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/ctci-bubble-sort/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=sorting
 */
public class BubleSort {
    // Complete the countSwaps function below.
    static void countSwaps(int[] a) {

		int swapCount = 0;

		for (int i = 0; i < a.length ; i++) {
			for (int j = i+1; j < a.length; j++) {
				int ivalue = a[i];
				int jValue = a[j];
				if (ivalue > jValue) {
					int temp = ivalue;
                    a[i] = jValue;
                    a[j] = temp;
					swapCount = swapCount + 1;
				}
			}

		}

		System.out.println("Array is sorted in " + swapCount + " swaps.");
		System.out.println("First Element: " + a[0]);
		System.out.println("Last Element: " + a[a.length - 1]);

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        countSwaps(a);

        scanner.close();
    }

}

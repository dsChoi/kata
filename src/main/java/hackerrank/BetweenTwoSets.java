package hackerrank;

import java.io.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

//https://www.hackerrank.com/challenges/bigger-is-greater/problem
public class BetweenTwoSets {
    /*
     * Complete the 'getTotalX' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */


    public static int getTotalX(List<Integer> a, List<Integer> b) {
        // Write your code here

        Integer min = a.stream().max(Integer::compareTo).get();
        Integer max = b.stream().min(Integer::compareTo).get();

        System.out.println("min : " + min);
        System.out.println("max : " + max);

        AtomicInteger counter = new AtomicInteger();

        IntStream.rangeClosed(min, max).forEach(
                i -> {
                    if (a.stream().allMatch(aa -> i % aa == 0)
                            && b.stream().allMatch(bb -> bb % i == 0)) {
                        counter.addAndGet(1);
                    }
                }
        );

        return counter.get();
    }

    public static int getTotalX2(List<Integer> a, List<Integer> b) {
        // Write your code here

        Integer min = a.stream().max(Integer::compareTo).get();
        Integer max = b.stream().min(Integer::compareTo).get();

        Set key = new HashSet<Integer>();
        for (int i = min; i <= max; i++) {
            for (Integer integerA : a) {
                if (i % integerA != 0) {
                    break;
                } else {
                    for (Integer integerB : b) {
                        if (integerB % i != 0) {
                            break;
                        }
                        key.add(i);
                    }
                }
            }
        }

        return key.size();
    }


    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int m = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> brr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int total = BetweenTwoSets.getTotalX(arr, brr);

        bufferedWriter.write(String.valueOf(total));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

package hackerrank;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * https://www.hackerrank.com/challenges/time-conversion/problem?h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen
 */
public class TimeConversion {
    public static final String DELIM = ":";

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        String time = s.substring(0, 8);

        StringTokenizer st = new StringTokenizer(time, DELIM);

        String hour = st.nextToken();
        String minute = st.nextToken();
        String secound = st.nextToken();

        String amPm = s.substring(8);

        if ("PM".equals(amPm) ) {
            int addTime = 12;
            if(hour.equals("12")){
                addTime = 0;
            }
            hour = String.format("%02d", Integer.valueOf(hour) +addTime);
        } else if ("AM".equals(amPm) && hour.equals("12")) {
            hour = "00";
        }
        return hour + DELIM + minute + DELIM + secound;

    }


    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }



}

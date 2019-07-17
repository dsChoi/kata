package hackerrank;


import java.io.*;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class DayOfProgrammmer {

    // Complete the dayOfProgrammer function below.
    static String dayOfProgrammer(int year) {

        Calendar instance = GregorianCalendar.getInstance();


        int plusDate = 255;
        if(year <= 1918){


            plusDate = 254;
        }

        instance.set(year, 0, 1);
        instance.add(Calendar.DAY_OF_YEAR, plusDate);

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");

        return dateFormat.format(instance.getTime());


    }   // Complete the dayOfProgrammer function below.
    static String dayOfProgrammer2(int year) {

        LocalDate localDate =  LocalDate.of(year, 1,1);


        return null;

    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int year = Integer.parseInt(bufferedReader.readLine().trim());

        String result = dayOfProgrammer(year);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

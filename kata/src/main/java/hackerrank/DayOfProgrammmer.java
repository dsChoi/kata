package hackerrank;


import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DayOfProgrammmer {

    // Complete the dayOfProgrammer function below.
    static String dayOfProgrammer(int year) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        // for all cases after 1918 as I am starting from 1st day of year
        int plusDay = 255;

        if (year == 1918) {
            //18년은 1월 31일 이후 2월 14일이므로 13일을 더해줌
            plusDay = plusDay + 13;
        } else if (year < 1918) {
            // 윤년 계산 마이너스 처리
            // 나머지 윤년은 알아서 처리해줌.
            if (year % 4 == 0 && year % 100 == 0) {
                plusDay = plusDay - 1;
            }
        }

        LocalDate date = LocalDate.of(year, 1, 1);
        LocalDate dayOfProgrammer = date.plusDays(plusDay);


        return formatter.format(dayOfProgrammer);
    }   // Complete the dayOfProgrammer function below.


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

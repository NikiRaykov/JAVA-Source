import java.io.*;
import java.time.LocalDate;
import java.util.*;

public class DayOfWeek {

    public static void findDay(int month, int day, int year) {

        LocalDate localDate = LocalDate.of(year, month, day);
        java.time.DayOfWeek dayOfWeek = localDate.getDayOfWeek();
        System.out.println(dayOfWeek);
    }
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int[] date = Arrays.stream(bufferedReader.readLine().split("\\s+|\\.|,|/|-|\\\\"))
                .mapToInt(Integer::parseInt).toArray();

        findDay(date[0], date[1], date[2]);

        bufferedReader.close();
    }
}
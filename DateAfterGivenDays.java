import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateAfterGivenDays {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter date in format: dd-MM-yyyy");
        String date = scan.nextLine();
        System.out.println("Enter number ot days:");
        int givenDays=Integer.parseInt(scan.nextLine());

        DateTimeFormatter dateTimeFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate afterGivenDays = LocalDate.parse(date, dateTimeFormat).plusDays(givenDays);

        System.out.println(dateTimeFormat.format(afterGivenDays));
    }
}

import java.util.Scanner;
import java.util.stream.IntStream;

public class Factorial {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());

        System.out.println(IntStream.iterate(num, i -> i > 1, i -> i - 1).asLongStream().reduce(1, (a, b) -> a * b));
    }
}

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class ReadStackWithStream {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Stack
        ArrayDeque<Integer> secondBox = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .forEach(secondBox::push);
    }
}

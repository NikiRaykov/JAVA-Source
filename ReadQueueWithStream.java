import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ReadQueueWithStream {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Queue
        ArrayDeque<Integer> firstBox = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayDeque::new));
    }
}

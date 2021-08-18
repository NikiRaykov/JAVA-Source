import java.util.*;
import java.util.function.BiFunction;
import java.util.function.UnaryOperator;

public class SortArray {

    static int i = 0;

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] array = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        sort(array, "ascending"); // or descending
        System.out.println(Arrays.toString(array).replaceAll("[\\[\\],]", ""));
    }

    private static void sort(int[] array, String order) {
        int direction, start, end;
        BiFunction<Integer, Integer, Boolean> functionX;
        BiFunction<Integer, Integer, Boolean> functionY;
        UnaryOperator<Integer> action;
        if (order.equals("ascending")) {
            direction = 1;
            start = 0;
            end = array.length - 1;
            functionX = (a, b) -> a > b;
            functionY = (a, b) -> a < b;
            action = e -> i += 1;
        } else if (order.equals("descending")) {
            direction = -1;
            start = array.length - 1;
            end = 1;
            functionX = (a, b) -> b < a;
            functionY = (a, b) -> a >= b;
            action = e -> i -= 1;
        } else {
            System.out.println("Invalid sort order!");
            return;
        }
        boolean isNotReady = false;
        for (i = start; functionY.apply(i, end); action.apply(i)) {
            if (functionX.apply(array[i], array[i + direction])) {
                int temp = array[i];
                array[i] = array[i + direction];
                array[i + direction] = temp;
                isNotReady = true;
            }
        }
        if (isNotReady) sort(array, order);
    }
}
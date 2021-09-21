import java.util.ArrayDeque;
import java.util.stream.Collectors;

public class MethodForFormatArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> myDeque = new ArrayDeque<>();
    }

    private static String formatArrayDeque(ArrayDeque<Integer> deque) {
        if (deque.isEmpty()){
            return "none";
        }
        return deque.stream().map(String::valueOf).collect(Collectors.joining(", "));
    }
}

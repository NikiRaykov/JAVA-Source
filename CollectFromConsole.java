import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CollectFromConsole {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        // split by one or more spaces if we know data type :

        // int [] :
        int[] intArray = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        // String []:
        String[] stringArray = scan.nextLine().split("\\s+");

        // char[]:
        char[] arrayName = scan.nextLine().replaceAll("\\s+", "").toCharArray();

        // double[]:
        double[] doubleArray = Arrays.stream(scan.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();

        // List Integer:
        List<Integer> listInteger = Arrays.stream(scan.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        // List Double:
        List<Double> arrayDouble = Arrays.stream(scan.nextLine().split("\\s+")).map(Double::parseDouble).collect(Collectors.toList());

        // List String:
        List<String> listString = Arrays.stream((scan.nextLine().split("\\s+")))
                .collect(Collectors.toList());

        // List Characters:
        String text = scan.nextLine().replaceAll("\\s+", "");
        List<Character> charList = IntStream.range(0, text.length()).mapToObj(text::charAt).collect(Collectors.toList());

        // Queue: String:
        ArrayDeque<String> queueName = Arrays.stream(scan.nextLine().split("\\s+")).collect(Collectors.toCollection(ArrayDeque::new));

        // Integer queue:
        ArrayDeque<Integer> deque = Arrays.stream(scan.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toCollection(ArrayDeque::new));

        // Integer stack:
        ArrayDeque<Integer> numbersStack = new ArrayDeque<>();
        Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).forEach(numbersStack::push);

        // for map : key - name from console -> value =0;
        Map<String, Integer> mapInfo = Arrays.stream(scan.nextLine().split("\\s+")).collect(Collectors.toMap(s -> s, s -> 0, (a, b) -> a, LinkedHashMap::new));

        // for Set:
        int line = 10; //numbers of next line
        Set<String> userList = IntStream.range(0, line).mapToObj(i -> scan.nextLine())
                .collect(Collectors.toCollection(LinkedHashSet::new));
        Set<String>infoList= IntStream.range(0, Integer.parseInt(scan.nextLine()))
                .mapToObj(i -> scan.nextLine().split("\\s+")).flatMap(Arrays::stream)
                .collect(Collectors.toCollection(TreeSet::new));
        Set<Integer> firstPlayer = Arrays.stream(scan.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toCollection(LinkedHashSet::new));

        // HashSet: Integers
        Set<Integer> firstList = IntStream.range(0, line)
                .mapToObj(i -> Integer.parseInt(scan.nextLine())).collect(Collectors.toSet());
    }
}
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BombShipGame {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        Map<String, int[]> rowList = new HashMap<>();
        IntStream.range(0, n).forEach(i -> {
            int[] rowArray = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            rowList.put(String.valueOf(i), rowArray);
        });
        List<String> squaresArray = Arrays.stream((scan.nextLine().split("\\s+"))).collect(Collectors.toList());

        int countShipDestroyed = 0;

        for (String s : squaresArray) {
            String[] command = s.split("-");
            String key = command[0];
            int index = Integer.parseInt(command[1]);
            if (((rowList.containsKey(key)) && (index >= 0 && index < rowList.get(key).length)) && rowList.get(key)[index] > 0) {
                rowList.get(key)[index] -= 1;
                if (rowList.get(key)[index] == 0) {
                    countShipDestroyed++;
                }
            }
        }
        System.out.println(countShipDestroyed);
    }
}
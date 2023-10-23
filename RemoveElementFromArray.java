import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class RemoveElementFromArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the sequence of numbers: ");
        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        System.out.print("Enter the index of the element to be removed: ");
        int indexToRemove = scanner.nextInt();

        if (numbers == null || indexToRemove < 0 || indexToRemove >= numbers.length) {
            System.out.println("Invalid index");
            return;
        }

        System.out.println("Index to be removed: " + indexToRemove);

        ArrayList<Integer> newArray = new ArrayList<>();

        for (int value: numbers) {
            newArray.add(value);
        }

        newArray.remove(indexToRemove);

        System.out.println("Array before modification: " + Arrays.toString(numbers));
        System.out.println("Array after modification: " + newArray);
    }
}

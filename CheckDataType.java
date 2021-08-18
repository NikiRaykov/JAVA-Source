import java.util.Scanner;

public class CheckDataType {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        checkDataType(new Scanner(input), input);

    }
    private static void checkDataType(Scanner readData, String input) {
        if (readData.hasNextInt()) {
            System.out.printf("%s is integer type%n", input);
        } else if (readData.hasNextDouble()) {
            System.out.printf("%s is floating point type%n", input);
        } else if (input.length() == 1) {
            System.out.printf("%s is character type%n", input);
        } else if (readData.hasNextBoolean()) {
            System.out.printf("%s is boolean type%n", input);
        } else if (readData.hasNextLine()) {
            System.out.printf("%s is string type%n", input);
        }
    }
}
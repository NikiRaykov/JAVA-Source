import java.util.*;

public class DecimalToBinaryOrTheOpposite {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 'D' for decimal to binary or 'B' for the opposite:");
        String choice;
        while (!"e".equals(choice = scan.nextLine().toLowerCase())) {

            if (choice.charAt(0) == 'd') {
                System.out.println("Enter decimal:");
                int decimal = Integer.parseInt(scan.nextLine());

                if (decimal != 0) {
                    ArrayDeque<Integer> binaryStack = new ArrayDeque<>();
                    while (decimal != 0) {
                        binaryStack.push(decimal % 2);
                        decimal /= 2;
                    }
                    while (!binaryStack.isEmpty()) {
                        System.out.print(binaryStack.pop());
                    }
                    System.out.println();
                } else {
                    System.out.println(0);
                }
            } else if (choice.charAt(0) == 'b') {

                System.out.println("Enter binary:");
                String binary = scan.nextLine();
                int decimal = 0; int index=0;
                for (int i = binary.length()-1; i >=0; i--) {
                    decimal+=((Integer.parseInt(String.valueOf(binary.charAt(index))))*(int)Math.pow(2,i));
                    index++;
                }
                System.out.println(decimal);
            } else {
                System.out.println("Enter 'D' for decimal to binary or 'B' for the opposite:");
            }
            System.out.println("Enter 'E' for exit or continue whit 'B' or 'D':");
        }
    }
}
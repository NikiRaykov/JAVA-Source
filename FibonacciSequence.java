import java.util.*;

public class FibonacciSequence {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of the sequence:");
        int n = Integer.parseInt(scan.nextLine());
        while(n<0){
            System.out.println("Enter positive number:");
            n = Integer.parseInt(scan.nextLine());
        }
        long[] arr = new long[n];
        if (n == 0) {
            System.out.println(0);
            return;
        }
        arr[0] = 1;
        if (n > 1) {
            arr[1] = 1;
        }
        if (n > 2) {
            for (int i = 2; i < n; i++) {
                arr[i] = arr[i - 1] + arr[i - 2];
            }
        }
        System.out.print(Arrays.toString(arr).replaceAll("[\\[\\]]", "").replaceAll(", ", " "));
    }
}
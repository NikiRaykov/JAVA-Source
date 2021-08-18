import java.util.Scanner;

public class RecursiveFibonacci {

    public static long[] fibonacciInfo = new long[100];

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the sequence number /less then 100/ from the Fibonacci sequence:");
        int n = Integer.parseInt(scan.nextLine());
        while (n<0){
            System.out.println("Enter a positive number:");
            n=Integer.parseInt(scan.nextLine());
        }
        fibonacciInfo[0] = 1;
        fibonacciInfo[1] = 1;
        System.out.println(Fibonacci(n));
    }

    static long Fibonacci(long n) {
        long currentFibonacci;
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else if (fibonacciInfo[(int) n] != 0) {
            return fibonacciInfo[(int) n];
        } else {
            currentFibonacci = Fibonacci(n - 1) + Fibonacci(n - 2);
            fibonacciInfo[(int) n] = currentFibonacci;
            return currentFibonacci;
        }
    }
}
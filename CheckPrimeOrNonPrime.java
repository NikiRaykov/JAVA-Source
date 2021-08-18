import java.util.Scanner;

public class CheckPrimeOrNonPrime {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter integer:");
        int digit = Integer.parseInt(scan.nextLine());
        boolean prime = true;

        for (int i = 2; i <= Math.sqrt(Math.abs(digit)); i++) {

            if (digit % i == 0) {
                prime = false;
                break;
            }
        }
        if (prime) {
            System.out.println("Prime");
        } else {
            System.out.println("Non Prime");
        }
    }
}

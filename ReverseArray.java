import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {

        int[] numbers=new int[]{1,2,3,4,5,6,7,8,9};

        for (int i = 0; i < numbers.length / 2; i++) {
            int oldNum = numbers[i];
            numbers[i] = numbers[numbers.length - 1 - i];
            numbers[numbers.length - 1 - i] = oldNum;
        }
        System.out.println(Arrays.toString(numbers));
    }
}
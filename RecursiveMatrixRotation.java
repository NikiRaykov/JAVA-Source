import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

public class RecursiveMatrixRotation {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(scan.nextLine());
        int countRotateBy90 = 0;
        if (matcher.find()) countRotateBy90 = Integer.parseInt(matcher.group()) % 360 / 90;
        char[][] matrix = readMatrix(scan);
        char[][] newMatrix = rotateMatrix(matrix, countRotateBy90);
        printMatrix(newMatrix);

    }

    private static char[][] readMatrix(Scanner scan) {
        String readLine;
        List<String> words = new ArrayList<>();
        while (!"END".equals(readLine = scan.nextLine())) words.add(readLine);
        int col = Collections.max(words, Comparator.comparing(String::length)).length();
        IntStream.range(0, words.size()).forEachOrdered(i -> {
            StringBuilder word = new StringBuilder(words.get(i));
            while (word.length() < col) word.append(" ");
            words.set(i, word.toString());
        });
        return words.stream().map(String::toCharArray).toArray(char[][]::new);
    }

    private static char[][] rotateMatrix(char[][] matrix, int count) {

        char[][] newMatrix = new char[matrix[0].length][matrix.length];
        if (count == 0) return matrix;
        int currentCol = 0;
        for (int rows = 0; rows < newMatrix.length; rows++) {
            for (int cols = 0; cols < newMatrix[0].length; cols++) {
                newMatrix[rows][cols] = matrix[matrix.length - 1 - cols][currentCol];
            }
            currentCol++;
        }
        return count == 1 ? newMatrix : rotateMatrix(newMatrix, count - 1);
    }

    private static void printMatrix(char[][] matrix) {
        Arrays.stream(matrix).map(row -> Arrays.toString(row)
                .replaceAll("[\\[\\], ]", "")).forEach(System.out::println);
    }
}
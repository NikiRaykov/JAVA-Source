public class ReadAndPrintMatrix {
    //created by J.M.

/*
     private static int[] findIndexes(char[][] matrix, char toFind) {
        int[] indexes = new int[2];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == toFind) {
                    indexes[0] = i;
                    indexes[1] = j;
                }
            }
        }
        return indexes;
    }
     private static void checkForBonus(int i, String dir) {
        while (indexesInBounds() && matrix[beeRow][beeCol] == 'O') {
            matrix[beeRow][beeCol] = '.';
            if (dir.equals("col")) {
                beeCol = Math.abs(beeCol) + i;
            } else {
                beeRow = Math.abs(beeRow) + i;
            }
        }
    }
     READ MATRIX:
    -------------------------------------------------------------------------------------------------------
    int [][]
    private static int[][] readMatrix(Scanner scanner) {
        int[] size = readArray(scanner);
        int[][] matrix = new int[size[0]][size[1]];
        for (int i = 0; i < size[0]; i++) {
            matrix[i] = readArray(scanner);
        }
        return matrix;
    }
    private static int[] readArray(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
    }
    char [][]
    private static char[][] readMatrix(Scanner scan) {
         int rows = ? ;
         int cols = ? ;
        char[][] matrix = new char[rows][cols];
        for (int row = 0; row < rows; row++) {
            matrix[row] = scan.nextLine()
                    .replaceAll("\\s+", "").toCharArray();
        }
        return matrix;
    }
    private static void readMatrix(Scanner scan) {
        int n = Integer.parseInt(scan.nextLine());
        matrix = new char[n][n];
        for (int row = 0; row < matrix.length; row++) {
            String input = scan.nextLine();
            matrix[row] = input.toCharArray();
            if (input.contains("B")) {
                beeRow = row;
                beeCol = input.indexOf('B');
            }
        }
    }
    String [][]
    private static String[][] readMatrix(Scanner scan) {
        int[] size = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        String[][] matrix = new String[size[0]][size[1]];
        for (int i = 0; i < size[0]; i++) {
            matrix[i] = scan.nextLine().split("\\s+");
        }
        return matrix;
    }
    // PRINT MATRIX:
    //-----------------------------------------------------------------------------------------------------------
    Arrays.stream(matrix).forEach(row ->{ Arrays.stream(row)
            .forEach(System.out::print); System.out.println(); });
    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.printf("%d ", element);
            }
            System.out.println();
        }
    }
    private static void printMatrix(char[][] output) {
        for (char[] current : output) {
            IntStream.range(0, current.length).forEach(j -> System.out.printf("%c ", current[j]));
            System.out.println();
        }
    }
    private static void printMatrix(char[][] matrix) {
        Arrays.stream(matrix).map(row -> Arrays.toString(row).replaceAll("[\\[\\]]", "")
                .replaceAll(", ", "")).forEach(System.out::println);
    }
    Arrays.stream(matrix).forEach(e->System.out.println(Arrays.toString(e)
                .replaceAll("[\\[\\]]", "").replaceAll(", ", " ")));
*/

}
public class MoveIndexesInMatrix {
    public static void main(String[] args) {

    }

    private static boolean movePosition(char[][] matrix, int[] position, int rawMod, int colMod) {
        int startRow = position[0];
        int startCol = position[1];

        int newRow = ensureIndexIsInBounds(startRow + rawMod, matrix.length);
        int newCol = ensureIndexIsInBounds(startCol + colMod, matrix.length);

        boolean playerWon = false;

        if (matrix[newRow][newCol] == 'B'){
            newRow = newRow + rawMod;
            newCol = startCol + colMod;
        }else if (matrix[newRow][newCol] == 'T'){
            newRow = startRow;
            newCol = startCol;
        }else if (matrix[newRow][newCol] == 'F'){
            playerWon = true;
        }

        matrix[startRow][startCol] = '-';
        matrix[newRow][newCol] = 'f';
        position[0] = newRow;
        position[1] = newCol;
        return playerWon;
    }

    private static int ensureIndexIsInBounds(int index, int bounds) {
        if (index < 0){
            index = bounds - 1;
        }else if (index >= bounds){
            index = 0;
        }

        return index;
    }
}

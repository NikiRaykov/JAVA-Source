public class IsOutOfBoundsMethodMatrix {
    private static boolean isOutOfBounds(int r, int c, char[][] matrix) {
        return r < 0 || r >= matrix.length || c < 0 || c >= matrix[r].length;
    }
}

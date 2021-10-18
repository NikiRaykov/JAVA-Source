public class FlipIndexesInMatrix {
    private static int[] flipSnake(int length, int r, int c) {
        int[] result = new int[2];
        if (r < 0){
            result[0] = length - 1;
            result[1] = c;
        }else if (r >= length){
            result[1] = length - 1;
        }else if (c < 0){
            result[0] = r;
            result[1] = length - 1;
        }else {
            result[0] = r;
        }

        return result;
    }
}

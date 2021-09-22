public class EnsureIndexIsInBoundsInMatrix {
    public static void main(String[] args) {

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

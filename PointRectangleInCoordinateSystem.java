import java.util.Scanner;

public class PointRectangleInCoordinateSystem {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int h = Integer.parseInt(scan.nextLine());
        int x = Integer.parseInt(scan.nextLine());
        int y = Integer.parseInt(scan.nextLine());

        boolean border = (x == 0 && y <= h) || (x == 0 && y == 0) || (y == 0 && x <= h * 3) || (x == h * 3 && y <= h)
                || (y == h && (x <= h || (x >= h * 2 && x <= h * 3))) || (x == h && (y <= h * 4 && y >= h))
                || (y == h * 4 && (x >= h && x <= h * 2)) || (x == h * 2 && (y >= h && y <= h * 4));

        boolean outside = x > h * 3 || y > h * 4 || (y > h && (x < h || x > h * 2));
        // boolean outside = (x < 0 || y < 0) || ((x < h || x > 2 * h) && y > h) || y > 4 * h || x > 3 * h;

        if (border) {
            System.out.println("border");
        } else if (outside) {
            System.out.println("outside");
        } else {
            System.out.println("inside");
        }
    }
}
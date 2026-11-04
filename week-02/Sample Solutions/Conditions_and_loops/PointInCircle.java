package Conditions_and_loops;

/*
Reads a point (x, y) and checks whether it lies inside the circle centred at
(0, 0) with radius 10. A point is inside when its distance from the centre is
at most the radius.
*/
import java.util.Scanner;

public class PointInCircle {

    public static void main(String[] args) {
        final double RADIUS = 10;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a point with two coordinates: ");
        double x = input.nextDouble();
        double y = input.nextDouble();

        double distance = Math.sqrt(x * x + y * y);

        if (distance <= RADIUS) {
            System.out.println("Point (" + x + ", " + y + ") is in the circle");
        } else {
            System.out.println("Point (" + x + ", " + y + ") is not in the circle");
        }

        input.close();
    }
}

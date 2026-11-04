package Conditions_and_loops;

/*
Reads the centre and radius of two circles and decides whether the second
circle is inside the first, overlaps it, or does not touch it at all.
*/
import java.util.Scanner;

public class TwoCircles {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter circle1's center x-, y-coordinates, and radius: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double r1 = input.nextDouble();

        System.out.print("Enter circle2's center x-, y-coordinates, and radius: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double r2 = input.nextDouble();

        double distance = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));

        // r2 <= r1 is needed too: a big circle2 cannot fit inside a small circle1
        if (distance <= Math.abs(r1 - r2) && r2 <= r1) {
            System.out.println("circle2 is inside circle1");
        } else if (distance <= r1 + r2) {
            System.out.println("circle2 overlaps circle1");
        } else {
            System.out.println("circle2 does not overlap circle1");
        }

        input.close();
    }
}


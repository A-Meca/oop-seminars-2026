package circle;

/** Slide 51: an array of objects is an array of reference variables. */

public class TestCircleArray {
  public static void main(String[] args) {
    Circle[] circleArray = new Circle[10];

    // No Circle exists yet: only 10 references, all null
    System.out.println("Length: " + circleArray.length);
    System.out.println("circleArray[0]: " + circleArray[0]);

    // Each element needs its own object
    for (int i = 0; i < circleArray.length; i++) {
      circleArray[i] = new Circle(i + 1);
    }

    System.out.println("circleArray[0] radius: " + circleArray[0].getRadius());
    System.out.println("circleArray[9] radius: " + circleArray[9].getRadius());
    System.out.println("Number of circles: " + Circle.getNumberOfObjects());
  }
}

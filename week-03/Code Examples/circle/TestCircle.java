package circle;

/**
 * Tests the instance and static members of Circle.
 * Each Circle object has its own radius, but all of them share numberOfObjects.
 */

public class TestCircle {
  public static void main(String[] args) {

    // Static method: called through the class, before any object exists
    System.out.println("Circles before creating objects: " + Circle.getNumberOfObjects());

    // Each new object has its own radius and adds 1 to the shared numberOfObjects
    Circle myCircle = new Circle(5.0);
    System.out.println("\nAfter creating myCircle:");
    System.out.println("myCircle radius: " + myCircle.getRadius());
    System.out.println("Number of circles: " + Circle.getNumberOfObjects());

    Circle yourCircle = new Circle();
    System.out.println("\nAfter creating yourCircle:");
    System.out.println("yourCircle radius: " + yourCircle.getRadius());
    System.out.println("Number of circles: " + Circle.getNumberOfObjects());

    // myCircle was created when the count was 1, but it also sees 2: the value is shared.
       System.out.println("\nNumber of circles, called from myCircle: " + myCircle.getNumberOfObjects());

    // WRONG: Circle.getRadius(); // getRadius() is an instance method: which circle's radius?
    // WRONG: yourCircle.radius = 100; // radius is private

    yourCircle.setRadius(100);

    System.out.println("\nAfter yourCircle.setRadius(100):");
    System.out.println("myCircle radius: " + myCircle.getRadius()); // Unchanged: a different object
    System.out.println("yourCircle radius: " + yourCircle.getRadius());

    // Instance methods: each result depends on the radius of that object
    System.out.println("\nmyCircle area: " + myCircle.getArea());
    System.out.println("myCircle perimeter: " + myCircle.getPerimeter());
    System.out.println("yourCircle area: " + yourCircle.getArea());
    System.out.println("yourCircle perimeter: " + yourCircle.getPerimeter());
  }
}

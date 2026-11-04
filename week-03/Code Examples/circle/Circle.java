package circle;

/**
 * Slides 3-4 and 49-50: a Circle with encapsulated data fields.
 * The fields are private, so other classes use the public methods.
 */

public class Circle {
  /** The radius of this circle (default: 1.0) */
  private double radius = 1.0;

  /** The number of circle objects created */
  private static int numberOfObjects = 0;

  /** Constructs a default circle object */
  public Circle() {
    numberOfObjects++;
  }

  /** Constructs a circle object with the specified radius */
  public Circle(double newRadius) {
    radius = newRadius;
    numberOfObjects++;
  }

  /** Returns the radius of this circle */
  public double getRadius() {
    return radius;
  }

  /** Sets a new radius for this circle */
  public void setRadius(double newRadius) {
    radius = newRadius;
  }

  /** Returns the number of circle objects created */
  public static int getNumberOfObjects() {
    return numberOfObjects;
  }

  /** Returns the area of this circle */
  public double getArea() {
    return radius * radius * Math.PI;
  }

  /** Returns the perimeter of this circle */
  public double getPerimeter() {
    return 2 * radius * Math.PI;
  }
}

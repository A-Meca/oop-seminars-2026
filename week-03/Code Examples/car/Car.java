package car;

class Car {
  String color;
  String brand;
  boolean turnedOn;

  // Slide 40: one copy, shared by all Car objects
  static int countBuiltCars = 0;

  // Slide 40
  public Car() {
    countBuiltCars++;
  }

  // Slide 7
  void turnOn() {
    turnedOn = true;
  }

  // Slide 7
  void paint(String newCol) {
    color = newCol;
  }

  // Slide 12: no object reference needed for attributes of the same object
  void paint() {
    color = "green";
    // color refers to current obj
  }

  // Slide 7, with a space added after "is" (the slide would print "the engine ison")
  void printState() {
    System.out.println("Car " + brand + " " + color);
    System.out.println("the engine is "
      + (turnedOn ? "on" : "off"));
  }
}

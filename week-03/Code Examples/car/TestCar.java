package car;

/** using Car, and two references to one object. */

public class TestCar {
  public static void main(String[] args) {
    // Static attributes exist before any object is created (slide 40)
    System.out.println("Cars built so far: " + Car.countBuiltCars);

    Car a1, a2; // Two uninitialized references. A reference is not an object.
    a1 = new Car(); // An object is created and its reference is stored in a1
    a1.brand = "Fiat";
    a1.paint("yellow");
    a1.printState();

    a2 = a1; // Two references point to the same object: this is aliasing
    a2.paint(); 
    a2.turnOn();
    a1.printState(); // The change made through a2 is visible through a1

    a1 = null; // Only a2 points to the object now
    a2 = null; // No reference left: the garbage collector may remove the object

    new Car();
    System.out.println("Cars built so far: " + Car.countBuiltCars);
  }
}

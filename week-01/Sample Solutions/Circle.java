/*
Shows:
  - declaring variables of different types (String, int, double)
  - a constant: a final variable, named in UPPER_CASE
  - arithmetic expressions
  - string concatenation with + inside System.out.println
  - formatted output with System.out.printf
  - integer division versus floating-point division

Run it in Eclipse (Ctrl+F11), or from PowerShell:
  javac Circle.java
  java Circle
*/
public class Circle {

    public static void main(String[] args) {
        final double PI = 3.14159;   // Java also provides this constant as Math.PI

        String name = "Small circle";
        int radius = 5;

        int diameter = 2 * radius;
        double circumference = 2 * PI * radius;
        double area = PI * radius * radius;

        // println: + concatenates the text and the values into one String
        System.out.println(name);
        System.out.println("Radius: " + radius);
        System.out.println("Diameter: " + diameter);
        System.out.println("Circumference: " + circumference);

        // printf: format specifiers control how each value is shown
        // %s text, %d whole number, %.2f number with 2 decimals, %n new line
        System.out.printf("%s: radius %d, area %.2f%n", name, radius, area);

        // Careful: + adds numbers but concatenates text, from left to right
        System.out.println("Radius plus one: " + radius + 1);   // prints 51
        System.out.println("Radius plus one: " + (radius + 1)); // prints 6

        // Warning: dividing an int by an int gives an int; the decimal part is truncated
        System.out.println("Half the radius: " + radius / 2);   // prints 2
        System.out.println("Half the radius: " + radius / 2.0); // prints 2.5
    }
}

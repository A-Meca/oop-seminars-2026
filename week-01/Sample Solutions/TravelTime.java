/*
Asks for a destination, a distance and a speed, then calculates how long
the trip takes.

Shows:
  - importing a class from the Java library
  - reading a line of text and numbers from the keyboard with Scanner
  - integer division (/) and the remainder operator (%) to convert minutes
    into hours and minutes

Run it in Eclipse (Ctrl+F11) and type your answers in the Console,
or from PowerShell:
  javac TravelTime.java
  java TravelTime
*/
import java.util.Scanner;

public class TravelTime {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Destination: ");
        String destination = input.nextLine();

        System.out.print("Distance in km: ");
        double distance = input.nextDouble();

        System.out.print("Average speed in km/h: ");
        double speed = input.nextDouble();

        double hours = distance / speed;
        int totalMinutes = (int) Math.round(hours * 60);
        int wholeHours = totalMinutes / 60;   // integer division: the number of full hours
        int minutes = totalMinutes % 60;      // remainder: the minutes left over

        System.out.printf("The trip to %s takes %.2f hours,%n", destination, hours);
        System.out.printf("that is %d h %d min.%n", wholeHours, minutes);

        input.close();
    }
}

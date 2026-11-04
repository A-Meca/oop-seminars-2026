package Methods;

/*
Two methods that convert temperatures in each direction, and a test program
that prints a small conversion table.
*/
public class TemperatureConversion {

    public static void main(String[] args) {
        System.out.printf("%-10s %-12s|   %-12s %-10s %n", "Celsius", "Fahrenheit", "Fahrenheit", "Celsius");

        double celsius = 40;
        double fahrenheit = 120;
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%-10.1f %-12.1f|   %-12.1f %-10.2f %n",
                    celsius, celsiusToFahrenheit(celsius),
                    fahrenheit, fahrenheitToCelsius(fahrenheit));
            celsius--;
            fahrenheit -= 10;
        }
    }

    /** Convert from Celsius to Fahrenheit */
    public static double celsiusToFahrenheit(double celsius) {
        return (9.0 / 5) * celsius + 32;
    }

    /** Convert from Fahrenheit to Celsius */
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (5.0 / 9) * (fahrenheit - 32);
    }
}

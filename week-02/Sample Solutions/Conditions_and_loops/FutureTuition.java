package Conditions_and_loops;

/*
The tuition is 400,000 lek this year and increases by 5% every year.
Computes the tuition in ten years, and the total cost of the four years after the tenth year (years 11, 12, 13 and 14).
*/
public class FutureTuition {

    public static void main(String[] args) {
        final double INCREASE = 0.05;
        double tuition = 400000;

        // Increase the tuition once for each of the next ten years
        for (int year = 1; year <= 10; year++) {
            tuition = tuition * (1 + INCREASE);
        }
        System.out.printf("Tuition in ten years: %.2f lek%n", tuition);

        // The four years after the tenth year: years 11, 12, 13 and 14
        double total = 0;
        for (int year = 11; year <= 14; year++) {
            tuition = tuition * (1 + INCREASE);
            total = total + tuition;
        }
        System.out.printf("Total cost of years 11 to 14: %.2f lek%n", total);
    }
}

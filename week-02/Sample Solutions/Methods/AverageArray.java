package Methods;

/*
Two overloaded methods with the same name: one for int arrays and one for
double arrays. Java picks the right one from the type of the argument.
The int version uses integer division, so its result has no decimals.
*/
import java.util.Scanner;

public class AverageArray {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       // double[] numbers = new double[10];
       // System.out.print("Enter ten double values: ");
       // for (int i = 0; i < numbers.length; i++) {
      //      numbers[i] = input.nextDouble();
      //  }
    //    System.out.println("The average is " + average(numbers));

        // The int version, for comparison
        int[] whole = {1, 2, 3, 4};
        double[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("The average is " + average(num));
        System.out.println("The average of {1, 2, 3, 4} as int is " + average(whole));

        input.close();
    }

    public static int average(int[] array) {
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return sum / array.length;   // integer division: 10 / 4 is 2
    }

    public static double average(double[] array) {
        double sum = 0;
        for (double value : array) {
            sum += value;
        }
        return sum / array.length;
    }
}


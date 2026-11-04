package Arrays;

/*
Reads ten integers into an array and prints them in reverse order.
*/
import java.util.Scanner;

public class ReverseNumbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];

        System.out.print("Enter ten integers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        System.out.print("In reverse order: ");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + "");
        }
        System.out.println();

        input.close();
    }
}

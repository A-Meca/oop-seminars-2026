package Methods;

/*
Reads a balance and an annual interest rate (as a percentage) and prints the interest for the next month: balance * (annualInterestRate / 1200).
*/
import java.util.Scanner;

public class MonthlyInterest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter balance: ");
        double balance = input.nextDouble();

        System.out.print("Enter annual interest rate (e.g. 3.5): ");
        double annualInterestRate = input.nextDouble();

        double interest = balance * (annualInterestRate / 1200);
        System.out.printf("The interest for next month is %.2f%n", interest);

        input.close();
    }
}




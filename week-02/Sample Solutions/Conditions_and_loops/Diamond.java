package Conditions_and_loops;

/*
Prints a diamond of numbers with nested loops. Row i counts up from 1 to i and back down to 1. 
The top half grows from 1 to 9, the bottom half shrinks from 8 back to 1. Leading spaces centre each row.
*/
public class Diamond {

    public static void main(String[] args) {
        final int SIZE = 9;

        // Top half, including the middle row
        for (int row = 1; row <= SIZE; row++) {
            printRow(row, SIZE);
        }
        // Bottom half
        for (int row = SIZE - 1; row >= 1; row--) {
            printRow(row, SIZE);
        }
    }

    // Prints one row: spaces, then 1 2 ... row ... 2 1
    public static void printRow(int row, int size) {
        for (int space = 1; space <= size - row; space++) {
            System.out.print("");
        }
        for (int number = 1; number <= row; number++) {
            System.out.print(number + "");
        }
        for (int number = row - 1; number >= 1; number--) {
            System.out.print(number + "");
        }
        System.out.println();
    }
}

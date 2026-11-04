package Methods;

/*
A method returns the n-th pentagonal number n(3n - 1)/2. The test program prints the first 100 of them, 10 on each line.
*/
public class PentagonalNumbers {

    public static void main(String[] args) {
        for (int n = 1; n <= 100; n++) {
            System.out.printf("%7d", getPentagonalNumber(n));
            if (n % 10 == 0) {
                System.out.println();   // new line after every 10 numbers
            }
        }
    }

    public static int getPentagonalNumber(int n) {
        return n * (3 * n - 1) / 2;
    }
}

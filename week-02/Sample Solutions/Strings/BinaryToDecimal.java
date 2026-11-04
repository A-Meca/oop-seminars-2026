package Strings;

/*
Converts a binary string such as "10001" to its decimal value (17) without Integer.parseInt. 
Reading from left to right, each step doubles the value and adds the next bit: 1 -> 2 -> 4 -> 8 -> 17.
*/
import java.util.Scanner;

public class BinaryToDecimal {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        String binary = input.nextLine();

        System.out.println(binary + " in decimal is " + binaryToDecimal(binary));

        input.close();
    }
    

    public static int binaryToDecimal(String binaryString) {
        int value = 0;
        for (int i = 0; i < binaryString.length(); i++) {
            int bit = binaryString.charAt(i) - '0';   // '0' -> 0, '1' -> 1
            value = value * 2 + bit;
        }
        return value;
    }
}




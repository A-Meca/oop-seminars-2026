package Strings;

/*
Counts how many times each digit 0-9 appears in a string. counts[d] holds the count for digit d. 
For a digit character ch, ch - '0' gives its value:'0' - '0' is 0, '7' - '0' is 7.
*/
import java.util.Scanner;

public class DigitOccurrences {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = input.nextLine();

        //int[] counts = count(s);
        
       
        int[] counts = new int [10];
        for (int d = 0; d <= 9; d++) {
            String digit = String.valueOf(d);
            counts[d] = s.length() - s.replace(digit, "").length();
        }
        
    
        for (int digit = 0; digit < counts.length; digit++) {
            if (counts[digit] > 0) {
                System.out.println(digit + " appears " + counts[digit] + (counts[digit] == 1 ? " time" : " times"));
            }
        }

        input.close();
    }

    public static int[] count(String s) {
        int[] counts = new int[10];   // all start at 0
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                counts[ch - '0']++;
            }
        }
        return counts;
    }
    

}

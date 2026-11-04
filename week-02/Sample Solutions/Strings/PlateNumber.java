package Strings;

/*
Generates a random plate number: three uppercase letters followed by four digits. A char can be computed from a number: 'A' + 0 is 'A', 'A' + 25 is 'Z'.
*/
public class PlateNumber {

    public static void main(String[] args) {
        String plate = "";

        for (int i = 0; i < 3; i++) {
            char letter = (char) ('A' + (int) (Math.random() * 26));
            plate += letter;
        }
        for (int i = 0; i < 4; i++) {
            int digit = (int) (Math.random() * 10);
            plate += digit;
        }

        System.out.println("The plate number is " + plate);
    }
}

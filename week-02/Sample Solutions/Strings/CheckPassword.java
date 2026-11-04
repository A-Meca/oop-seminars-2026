package Strings;

/*
A valid password has at least eight characters, contains only letters and digits, and has at least two digits.
*/
import java.util.Scanner;

public class CheckPassword {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a password: ");
        String password = input.nextLine();

        if (isValidPassword(password)) {
            System.out.println("Valid Password");
        } else {
            System.out.println("Invalid Password");
        }

        input.close();
    }

    public static boolean isValidPassword(String password) {
        if (password.length() < 8) {
            return false;
        }

        int digits = 0;
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (!Character.isLetterOrDigit(ch)) {
                return false;               // a space or symbol is not allowed
            }
            if (Character.isDigit(ch)) {
                digits++;
            }
        }
        return digits >= 2;
    }
    
    public static boolean isValidPassword2(String password) {
        boolean rightCharacters = password.matches("[A-Za-z0-9]{8,}");
        int digits = password.replaceAll("[^0-9]", "").length();
        return rightCharacters && digits >= 2;
    }
    
    public static boolean isValidPassword3(String password) {
        return password.matches("(?=(.*[0-9]){2})[A-Za-z0-9]{8,}");
    }
}

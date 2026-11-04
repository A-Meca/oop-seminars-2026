package Arrays;

// Note: list1 == list2 would only check whether both variables refer to the same array, not whether the contents are the same.
import java.util.Scanner;

public class IdenticalArrays {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter list1: ");
        int[] list1 = readList(input);
        System.out.print("Enter list2: ");
        int[] list2 = readList(input);

        if (identical(list1, list2)) {
            System.out.println("Two lists are identical");
        } else {
            System.out.println("Two lists are not identical");
        }

        input.close();
    }

    // Reads the size first, then that many numbers
    public static int[] readList(Scanner input) {
        int size = input.nextInt();
        int[] list = new int[size];
        for (int i = 0; i < size; i++) {
            list[i] = input.nextInt();
        }
        return list;
    }

    public static boolean identical(int[] list1, int[] list2) {
        if (list1.length != list2.length) {
            return false;
        }
        for (int i = 0; i < list1.length; i++) {
            if (list1[i] != list2[i]) {
                return false;
            }
        }
        return true;
    }
}

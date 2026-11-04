package Methods;

/*
The parameter int... n accepts any number of int arguments. Inside the method, n is an ordinary array.
*/
public class MinMax {

    public static void main(String[] args) {
        System.out.println("Maximum of 3, 9, 1, 7: " + max(3, 9, 1, 7));
        System.out.println("Minimum of 3, 9, 1, 7: " + min(3, 9, 1, 7));
        System.out.println("Maximum of -5, -2: " + max(-5, -2));
        System.out.println("Minimum of 42: " + min(42));
    }

    public static int max(int... n) {
        int result = n[0];
        for (int i = 1; i < n.length; i++) {
            if (n[i] > result) {
                result = n[i];
            }
        }
        return result;
    }

    public static int min(int... n) {
        int result = n[0];
        for (int i = 1; i < n.length; i++) {
            if (n[i] < result) {
                result = n[i];
            }
        }
        return result;
    }
}


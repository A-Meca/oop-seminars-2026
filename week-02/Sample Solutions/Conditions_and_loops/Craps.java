package Conditions_and_loops;

/*
Rolls two dice. 2, 3 or 12 loses, 7 or 11 wins. 
Any other sum becomes the point, and the dice are rolled again until either the point (win) or a 7 (lose) comes up.
*/
public class Craps {

    public static void main(String[] args) {
        int die1 = (int) (Math.random() * 6) + 1;   // a whole number from 1 to 6
        int die2 = (int) (Math.random() * 6) + 1;
        int sum = die1 + die2;
        System.out.println("You rolled " + die1 + " + " + die2 + " = " + sum);

        if (sum == 2 || sum == 3 || sum == 12) {
            System.out.println("You lose");
        } else if (sum == 7 || sum == 11) {
            System.out.println("You win");
        } else {
            int point = sum;
            System.out.println("point is " + point);

            do {
                die1 = (int) (Math.random() * 6) + 1;
                die2 = (int) (Math.random() * 6) + 1;
                sum = die1 + die2;
                System.out.println("You rolled " + die1 + " + " + die2 + " = " + sum);
            } while (sum != point && sum != 7);

            if (sum == point) {
                System.out.println("You win");
            } else {
                System.out.println("You lose");
            }
        }
    }
}

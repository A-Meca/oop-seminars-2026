package Conditions_and_loops;

/*
Approximates e = 1 + 1/1! + 1/2! + ... + 1/i! for i = 10000, 20000, ..., 100000.

Computing i! directly does not work: a long overflows after 20!, and even a double becomes Infinity after 170!. 
Instead, each term is computed from the previous one, because 1/i! = (1/(i-1)!) / i.
*/
public class ComputeE {

    public static void main(String[] args) {
        double e = 1;
        double term = 1;

        for (int i = 1; i <= 100000; i++) {
            term = term / i;   // 1/1!, then 1/2!, then 1/3!, ...
            e = e + term;

            if (i % 10000 == 0) {
                System.out.println("i = " + i + ": e = " + e);
            }
        }
        // All the values are the same: after about 18 terms the terms are too small to change a double any more.
    }
}


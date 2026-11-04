package Arrays;

/*
The names, grades and averages are kept in three separate (parallel) arrays.
Position i in each array belongs to the same student, so when the arrays are sorted by average, all three have to be swapped together.
The averages are int, as the method header asks, so the decimals are dropped.
*/
public class StudentGradeAverages {

    public static void main(String[] args) {
        String[] names = {"Jack", "Robert", "Edward", "Eddie"};
        int[][] grades = {
            {76, 54, 89, 76, 98},
            {34, 65, 23, 87, 100},
            {80, 65, 97, 54, 94},
            {63, 75, 33, 75, 87}
        };

        int[] average = calculateAverage(grades);
        System.out.println("Before sorting:");
        printStudents(names, grades, average);

        sort(names, grades, average);
        System.out.println();
        System.out.println("Sorted by average (highest first):");
        printStudents(names, grades, average);
    }

    public static int[] calculateAverage(int[][] grades) {
        int[] average = new int[grades.length];
        for (int student = 0; student < grades.length; student++) {
            int sum = 0;
            for (int grade : grades[student]) {
                sum += grade;
            }
            average[student] = sum / grades[student].length;
        }
        return average;
    }

    public static void printStudents(String[] names, int[][] grades, int[] average) {
        System.out.printf("%-8s", "Name");
        for (int g = 1; g <= grades[0].length; g++) {
            System.out.printf("%9s", "Grade " + g);
        }
        System.out.printf("%9s%n", "Average");

        for (int student = 0; student < names.length; student++) {
            System.out.printf("%-8s", names[student]);
            for (int grade : grades[student]) {
                System.out.printf("%9d", grade);
            }
            System.out.printf("%9d%n", average[student]);
        }
    }

    // Selection sort, highest average first. Every swap is done in all three arrays.
    public static void sort(String[] names, int[][] grades, int[] average) {
        for (int i = 0; i < average.length - 1; i++) {
            int best = i;
            for (int j = i + 1; j < average.length; j++) {
                if (average[j] > average[best]) {
                    best = j;
                }
            }

            int tempAverage = average[i];
            average[i] = average[best];
            average[best] = tempAverage;

            String tempName = names[i];
            names[i] = names[best];
            names[best] = tempName;

            int[] tempGrades = grades[i];   // swaps the whole row: each row is its own array
            grades[i] = grades[best];
            grades[best] = tempGrades;
        }
    }
}

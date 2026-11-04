package Arrays;

/*
Fills a 4x4 matrix with random 0s and 1s, prints it, and finds the first row and the first column with the most 1s. Indices start at 0.
Using > (not >=) keeps the FIRST row or column when there is a tie.
*/
public class LargestRowColumn {

    public static void main(String[] args) {
        int[][] matrix = new int[4][4];

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = (int) (Math.random() * 2);   // 0 or 1
                System.out.print(matrix[row][col] + "");
            }
            System.out.println();
        }

        System.out.println("The largest row index: " + largestRow(matrix));
        System.out.println("The largest column index: " + largestColumn(matrix));
    }

    public static int largestRow(int[][] matrix) {
        int bestRow = 0;
        int bestCount = -1;
        for (int row = 0; row < matrix.length; row++) {
            int count = 0;
            for (int col = 0; col < matrix[row].length; col++) {
                count += matrix[row][col];
            }
            if (count > bestCount) {
                bestCount = count;
                bestRow = row;
            }
        }
        return bestRow;
    }

    public static int largestColumn(int[][] matrix) {
        int bestCol = 0;
        int bestCount = -1;
        for (int col = 0; col < matrix[0].length; col++) {
            int count = 0;
            for (int row = 0; row < matrix.length; row++) {   // reading down the column
                count += matrix[row][col];
            }
            if (count > bestCount) {
                bestCount = count;
                bestCol = col;
            }
        }
        return bestCol;
    }
}


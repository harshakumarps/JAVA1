public class MaxColumn{
	public static void main(String[] args) {
        int[][] num1 = {
                    {1, 2, 3},{4, 8, 6},{7, 8, 9}
        };

        int rows = num1.length;
        int cols = num1[0].length;

        int maxSum = 0;
        int maxCol = 0;

        for (int j = 0; j < cols; j++) {
            int colSum = 0;
            for (int i = 0; i < rows; i++) {
                colSum += num1[i][j];
            }

            if (colSum > maxSum) {
                maxSum = colSum;
                maxCol = j;
            }
        }
        System.out.println("Column with max sum: " + maxCol);
        System.out.println("Maximum column sum: " + maxSum);
    }
}

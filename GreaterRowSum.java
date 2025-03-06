public class GreaterRowSum {
    public static void main(String[] args) {
        int[][] num1 = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {1, 2, 5} };
        
        int maxSum = 0;
        int maxRowIndex = -1;

        for (int index = 0; index < num1.length; index++) { 
            int sum = 0;
            for (int j = 0; j < num1[index].length; j++) { 
                sum += num1[index][j];
            }

            if (sum > maxSum) {
                maxSum = sum;
                maxRowIndex = index;
            }
        }

        System.out.println("Row with the maximum sum:");
        for (int num : num1[maxRowIndex]) {
            System.out.print(num + " ");
        }
        System.out.println("\nMaximum row sum: " + maxSum);
    }
}
public class ZeroMatrix {
    public static void main(String[] args) {
        // Create sample matrix
        int[][] matrix = {
            {1, 2, 3},
            {4, 0, 6},
            {7, 8, 9}
        };
        
       
        System.out.println("Original Matrix:");
        printMatrix(matrix);
        
        
        zeroMatrix(matrix);
        
       
        System.out.println("\nTransformed Matrix:");
        printMatrix(matrix);
    }
    
    
    public static void zeroMatrix(int[][] matrix) {
       
        boolean[] row = new boolean[matrix.length];
        boolean[] col = new boolean[matrix[0].length];
        

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    row[i] = true;
                    col[j] = true;
                }
            }
        }
        
    
        for (int i = 0; i < matrix.length; i++) {
            if (row[i]) {
                for (int j = 0; j < matrix[0].length; j++) {
                    matrix[i][j] = 0;
                }
            }
        }
        
        // Set columns to zero
        for (int j = 0; j < matrix[0].length; j++) {
            if (col[j]) {
                for (int i = 0; i < matrix.length; i++) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
    
    // Method to print matrix
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
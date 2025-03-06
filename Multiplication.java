public class Multiplication {
    public static void main(String[] args) {
        // Define two matrices
        int[][] matrixA = {
            {1, 2, 3},
            {3, 4, 5},
            {4, 5, 6}
        };
        
        int[][] matrixB = {
            {3, 4, 5},
            {2, 5, 4},
            {6, 7, 8}
        };
        
        // Create result matrix
        int[][] result = new int[3][3];
        
        // Multiply matrices
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                // Calculate each element
                result[i][j] = (matrixA[i][0] * matrixB[0][j]) + 
                               (matrixA[i][1] * matrixB[1][j]) + 
                               (matrixA[i][2] * matrixB[2][j]);
            }
        }
        
        // Print result
        System.out.println("Matrix Multiplication Result:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
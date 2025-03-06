public class MultiDimentionalArray {
    public static void main(String[] args) {
        int[][] num1 = {
            {1, 2, 3},
            {4, 8, 6},
            {7, 8, 9}
        };

        int sum1 = 0;
        int lowerTriangular = 0;
        for (int index = 0; index < num1.length; index++) {
            int sum2 = 0;
             int value1 = num1[index][0];
            for (int j = 0; j < num1[index].length; j++) {
                System.out.print(num1[index][j] + " ");
                sum1 = sum1 + num1[index][j];
                sum2 = sum2 + num1[index][j];
                if(num1[index][j]>=value1){
                    value1=num1[index][j];
                }

              
                if (j <= index) {
                    lowerTriangular += num1[index][j];
                }

            }
            System.out.println();
            System.out.println("==============");
            System.out.println("row in an array " + sum2);
            System.out.println("greatest value in each row " + value1);

            System.out.println("==============");

            if (sum2 > value1) {
                value1 = sum2;
            }
            
        }

        System.out.println("The total sum of all array elements is " + sum1);
        
        System.out.println("Sum of elements in the lower triangular matrix is " + lowerTriangular);
    }
}
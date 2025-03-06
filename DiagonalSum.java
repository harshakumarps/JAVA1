public class DiagonalSum{
 public static void main(String args[])
 {
  int [][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
  int sumA = 0;
  int sumB = 0;
  int n = matrix.length;
  

  for (int i = 0; i < matrix.length; i++)
  {
   sumA += matrix[i][i];
   sumB += matrix[i][n - i - 1]; 
  }
  System.out.println("the diagonal is A:" + sumA);
  System.out.println("the diagonal is B:" + sumB);
 }
}
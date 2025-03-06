public class Rotation{
 public static void main(String args[])
 {
  int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};

  System.out.println("the original matrix:");
  displayMatrix(matrix);

  System.out.println("the swaping matrix:");
  rotationMatrix(matrix);

  System.out.println("the rotation matrix is:");
  displayMatrix(matrix);
 }

 public static void rotationMatrix(int[][] matrix)
 {
  for(int i=0; i<matrix.length; i++)
  {
   for(int j=0; j<matrix.length; j++)
    int temp = matrix[i][j];
    matrix[i][j] = matrix[j][i];
    matrix[j][i] = temp;
  }

  for(int i =0; i<matrix.length; i++)
  {
   for(int j=0; j<matrix.length; j++)
    int temp =matrix[i][j];
    matrix[i][j] = matrix[i][matrix.length-i-1];
    matrix[i][matrix.length-i-1] = temp;
  }
 }

 public static void displayMatrix(int[][] matrix)
 {
  for(int i=0;i<matrix.length;i++)
  {
   for(int j=0;j<matrix.length;j++)
   {
    System.out.println(matrix[i][j] + "the rotate function");
   }
  }
  System.out.println("");
 }

}
public class SubtractTwo{
 public static void main(String[] args) {
  int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
  int b[][] = {{1,2,3},{4,5,6},{7,8,9}};

  int res[][] = new int[a.length][a[0].length];

  if(a.length != b.length && a[0].length != b[0].length){
   System.out.println("the Subtraction is not possible ");
  }

  for(int i=0;i<a.length;i++){
   for(int j=0;j<a[0].length;j++){
    res[i][j] = a[i][j] - b[i][j];

    System.out.print(res[i][j]+" ");
   }
   System.out.println();
  }
 }
 
}
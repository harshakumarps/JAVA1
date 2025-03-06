public class Transpose{
	public static void main(String[] args) {
		 int[][] num1 = {
            {1, 2, 3},{4, 8, 6},{7, 8, 9}
        };
        for (int i = 0; i < num1.length; i++) {
            for (int j = 0; j < num1[i].length; j++) {
                System.out.print(num1[i][j] + " ");
            }
            System.out.println();
        }
            System.out.println("=================================");

        for (int j = 0; j < num1[0].length; j++) {
            for (int i = 0; i < num1.length; i++) {
                System.out.print(num1[i][j] + " ");
            }
            System.out.println();
        }
    }
}
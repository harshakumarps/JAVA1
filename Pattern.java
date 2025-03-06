public class Pattern{
	public static void main(String[] args) {
		int n=3;
		for (int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
				System.out.print("% ");
			}
			System.out.println();
		}
		for (int i=1;i<=n;i++){
			for(int j=1;j<=3;j++){
			}
			System.out.println();
		}
		for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == n / 2 && j == n / 2) {
                    System.out.print(" "); 
                } else {
                    System.out.print("%");
                }
            }
            System.out.println();
        }
	}
}
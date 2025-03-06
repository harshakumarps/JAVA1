public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5};
        int n = arr[arr.length - 1];
        
        for (int i = arr[0]; i <= n; i++) {
            boolean found = false;
            for (int num : arr) {
                if (num == i) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("Missing number: " + i);
            }
        }
    }
}

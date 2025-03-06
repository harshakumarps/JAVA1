class SumOfTarget {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 4};
        int target = 14;
        int sum = 0;
         for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        if (sum==target) {
            System.out.println("Target is equal to the sum of array elements");
        } else {
            System.out.println("Target is NOT equal to the sum of array elements");
        }
    }
}

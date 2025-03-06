class CountMultiple {
    public static void main(String[] args) {
        int[] arr = {3, 6, 9, 12, 15, 20};
        int target = 3;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % target == 0) {
                count++;
            }
        }

        System.out.println("Count of multiples of " + target + " is: " + count);
    }
}

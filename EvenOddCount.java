class EvenOddCount {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 4, 6, 8, 9, 11};
        int evenCount = 0, oddCount = 0;
           for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("Even count: " + evenCount);
        System.out.println("Odd count: " + oddCount);
    }
}

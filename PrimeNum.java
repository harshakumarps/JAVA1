class PrimeCheck {
    public static boolean isPrime(int num) {
        if (num < 2)
         return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) 
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Prime numbers in the array:");
        for (int num : arr) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
    }
}
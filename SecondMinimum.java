public class SecondMinimum {
    public static void main(String[] args) {
        int[] arr = {10, 20, 5, 30, 25};
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        
        for (int num : arr) {
            if (num < min) {
                secondMin = min;
                min = num;
            } else if (num < secondMin && num != min) {
                secondMin = num;
            }
        }
        
        System.out.println("Second minimum element: " + secondMin);
    }
}

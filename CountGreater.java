public class CountGreater {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int value = 25;
        int count = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > value) {
                count++;
            }
        }
        
        System.out.println("Count of elements greater than " + value + ": " + count);
    }
}

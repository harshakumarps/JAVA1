public class DisplayArray {
    public static void displayArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        displayArray(numbers);
    }
}
///question3
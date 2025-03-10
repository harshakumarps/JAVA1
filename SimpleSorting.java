public class SimpleSorting {
    public static void sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) { 
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 7, 1, 3};
        sort(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

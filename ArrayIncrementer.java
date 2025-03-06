public class ArrayIncrementer {
    public static void addNumberAndPrint(int[] arr) {
        int numberToAdd = 5;
        for (int i = arr.length - 1; i >= 0; i--) {
            int sum = arr[i] + numberToAdd;
            arr[i] = sum % 10;
            numberToAdd = sum / 10;
            if (numberToAdd == 0) {
                break;
            }
        }
        
        // Handle case when there's still a carry
        if (numberToAdd > 0) {
            // Create a new array with additional digit
            int[] newArr = new int[arr.length + 1];
            newArr[0] = numberToAdd;
            
            // Copy existing digits
            for (int i = 0; i < arr.length; i++) {
                newArr[i + 1] = arr[i];
            }
            printArray(newArr);
        } else {
            printArray(arr);
        }
    }
    public static void printArray(int[] arr) {
        System.out.print("{");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(",");
            }
        }
        System.out.print("}");
    }

    public static void main(String[] args) {
        int[] numbers = {9, 9, 9};
        addNumberAndPrint(numbers);
    }
}
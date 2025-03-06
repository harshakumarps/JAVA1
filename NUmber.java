import java.util.Scanner;

public class NUmber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input number
        System.out.print("Enter the number as digits separated by commas or spaces: ");
        String input = scanner.nextLine();

        // Remove commas and spaces manually
        String cleanedInput = "";
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch >= '0' && ch <= '9') {
                cleanedInput += ch;
            }
        }

        // Convert input to digit array
        int n = cleanedInput.length();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = cleanedInput.charAt(i) - '0';
        }

        // Get the number to add
        System.out.print("Enter the number to add: ");
        int numToAdd = scanner.nextInt();
        scanner.close();

        // Compute result
        int[] result = addNumber(arr, numToAdd);

        // Print result
        System.out.print("Result: ");
        printArray(result);
    }

    public static int[] addNumber(int[] arr, int numToAdd) {
        int carry = numToAdd;
        int n = arr.length;

        // Start from the last digit and move to the front
        for (int i = n - 1; i >= 0; i--) {
            int sum = arr[i] + carry;
            arr[i] = sum % 10;  // Store last digit
            carry = sum / 10;     // Compute carry for next position
        }

        // If there is any carry left, expand the array
        if (carry > 0) {
            int[] newArr = new int[arr.length + 1];
            newArr[0] = carry; // Add the carry to the front

            // Copy the rest of the array manually
            for (int i = 0; i < arr.length; i++) {
                newArr[i + 1] = arr[i];
            }

            return newArr;
        }

        return arr; // Return updated array if no extra carry
    }

    // Method to print array of digits
    public static void printArray(int[] arr) {
        for (int digit : arr) {
            System.out.print(digit); // Print each digit directly
        }
        System.out.println(); // Move to the next line after printing
    }
}
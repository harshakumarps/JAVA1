 public class SecondLargest{
 public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1}; 
        int largest = arr[0];
        int secondLargest = -1; 
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];       
            } else if (arr[i] > secondLargest && arr[i] < largest) {
                secondLargest = arr[i]; 
            }
        }
        if (secondLargest == -1) {
            System.out.println("Array does not have a second largest number.");
        } else {
            System.out.println("The second largest number is: " + secondLargest);
        }
    }
}
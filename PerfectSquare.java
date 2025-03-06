public class PerfectSquare {
    public static void main(String[] args) {
        int[] arr = {4, 9, 16, 25};
        
        for (int num : arr) {
            int sqrt = (int) Math.sqrt(num);
            if (sqrt * sqrt != num) {
                System.out.println(num + " is not a perfect square");
            }
        }
    }
}

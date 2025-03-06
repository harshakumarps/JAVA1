public class Frequency {
    public static void main(String[] args) {
        int[] arr = {2, 2, 3, 4, 5, 6, 6, 3};
        int n = arr.length;
        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                int count = 1;
                for (int j = i + 1; j < n; j++) {
                    if (arr[i] == arr[j]) {
                        visited[j] = true;
                        count++;
                    }
                }
                System.out.println(arr[i] + " appearss" + count + " times");
            }
        }
    }
}

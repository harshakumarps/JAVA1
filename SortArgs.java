public class SortArgs {
    public static void main(String[] args) {
        for (int i = 0; i < args.length - 1; i++) {
            for (int j = i + 1; j < args.length; j++) {
                if (args[i].compareTo(args[j]) > 0) {
                    String temp = args[i];
                    args[i] = args[j];
                    args[j] = temp;
                }
            }
        }

        for (String arg : args) {
            System.out.print(arg + " ");
        }
    }
}

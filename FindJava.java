public class FindJava {
    public static void main(String[] args) {
        boolean found = false;
        for (int i = 0; i < args.length; i++) {
            if (args[i].equals("Java")) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Java is present");
        } else {
            System.out.println("Java is not present");
        }
    }
}

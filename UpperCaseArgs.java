public class UpperCaseArgs {
    public static void main(String[] args) {
        for (String arg : args) {
            String upper = "";
            for (int i = 0; i < arg.length(); i++) {
                char ch = arg.charAt(i);
                if (ch >= 'a' && ch <= 'z') {
                    ch = (char)(ch - 32);
                }
                upper += ch;
            }
            System.out.print(upper + " ");
        }
    }
}

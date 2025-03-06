public class Palindrome{
	public static void main(String args[]){
        int num=123;
        int reverse=0;
        int original=num;
        for (; num>0; num=num/10) {
            reverse=reverse*10+num % 10;
        }
        if (original==reverse) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }

	}
}
public class Swap{
	public static void main(String args[]){
		int num1=10;
		int num2=20;
		System.out.println("original numbers is : num1="+ num1+", num2="+num2);
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		System.out.println("Swaped numbers is : num1="+ num1+", num2="+num2);

	}
}
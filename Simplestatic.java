public class Simplestatic{
	static{
		System.out.println("Static");

		}
		static String teamName="banglore";
	public static void main(String[] args) {
		System.out.println("Main method");
		
		//System.out.println("Variable"+Simplestati1.teamName);
		System.out.println("Variable"+Simplestatic.teamName);
		Simplestati1.display();


	}
}
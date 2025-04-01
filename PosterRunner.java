public class PosterRunner{
	public static void main(String[] args) {
		Poster info=new Poster();
		info.info();
		System.out.println("-----");
		Poster info1=new Poster(12);
		info1.info();
		System.out.println("-----");

		Poster info2=new Poster(12,12);
		info2.info();
		System.out.println("-----");

		Poster info3=new Poster(12,13,"movie");
		info3.info();
		System.out.println("-----");

		Poster info4=new Poster(12,13,"movie","paper");
		info4.info();
		System.out.println("-----");
		
		
	}
	
}
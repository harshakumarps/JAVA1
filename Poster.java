class Poster{
	int width;
	int length;
	String content;
	String material;
	public Poster(){

	}
	public Poster(int width){
		this.width=width;


	}
	public Poster(int width, int length){
		this.width=width;
		this.length=length;
	}
	public Poster(int width,int length,String content){
		this.width=width;
		this.length=length;
		this.content=content;
	}
	public Poster(int width,int length,String content,String material){
		this.width=width;
		this.length=length;
			this.content=content;
				this.material=material;
	}
	public void info(){
		System.out.println("information about poster");
		System.out.println("width :"+width);
		System.out.println("length :"+length);
		System.out.println("materialcontent :"+material);
		System.out.println("content :"+content);

	}
}
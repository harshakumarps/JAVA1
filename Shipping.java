public class Shipping{
	public static void main(String args[]){
	float p1=6;
	float p2=8;
	float p3=100.3746327f;
	float total=p1+p2+p3;
	System.out.println("total Amount = "+total+"$");
	if(total>=50){
	System.out.println("free shipping for your bill");
	}else{
	System.out.println("extra charge for free shipping");

	}
	}

}
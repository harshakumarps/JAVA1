public class Shop{
	pulic static void main(String args[]){
	float p1=6;
	float p2=8;
	float p3=100.3746327f;
	float total=p1+p2+p3;
	System.out.println("total Amount = "+total+"$");
	if(total>=100){
	discount=total*(10/100);
	System.out.println("Amount after discount = "+discount+"$");
	}else{
		System.out.println("total amount is lesser than 100$ so no discount");

	}
	}

}
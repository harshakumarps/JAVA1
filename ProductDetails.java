public class ProductDetails{
	public static void main(String args[]){
		System.out.println("Product Details");
		String name= "laptop";
		float price=88990.88f;
		float discount=12;
		String brandname="Asus";
		float gst=10;
		float deliveryfee= 150.5f;
		float donation=20;
		float platformfee=100.75f;
		float totalWithGst=price+price*(discount/100)+deliveryfee+donation+platformfee+price*(gst/100);
		float totalWithOutGst=totalWithGst-gst;
		System.out.println("Product name = "+ name);
		System.out.println("Product price = "+ price);
		System.out.println("Product brand name = "+ brandname);
		System.out.println("Product donation = "+ donation);
		System.out.println("Product deliveryfee = "+deliveryfee);
		System.out.println("Product platformfee = "+ platformfee);
		System.out.println("Product gst = " + gst+"%");
		System.out.println("Product discount = "+ discount+"%");
		System.out.println("Total payable amount with gst = "+ totalWithGst);
		System.out.println("Total payable amount without gst = "+ totalWithOutGst);

	}
}  
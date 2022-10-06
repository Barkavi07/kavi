package lms;

public class UseMobile {
	public static void main(String [] args) {
		String word=args[0];
		String [] values=word.split(",");
		int val1=Integer.parseInt(values[0]);
		String val2=values[1];
		String val3=values[2];
		
		Mobile mobile=new Mobile();
		mobile.price=val1;
		mobile.brand=val2;
		mobile.model=val3;
		System.out.println("Price="+mobile.price+", Brand="+mobile.brand+", Model="+mobile.model);
	}

}

class Mobile{
	int price;
	String brand;
	String model;
	
}

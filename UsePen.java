package lms;

public class UsePen {
	public static void main(String [] args) {
		String [] words=args[0].split(" ");
		
		Pen pen=new Pen();
		pen.price=Integer.parseInt(words[0]);
		pen.brand=words[1];
		pen.model=words[2];
		
		System.out.println(pen.price+","+pen.brand+","+pen.model);
		
	}

}

class Pen {
	String brand;
	int price;
	String model;
}

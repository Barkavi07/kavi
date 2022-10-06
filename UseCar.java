package lms;

public class UseCar {
	public static void main(String [] args) {
		String [] words=args[0].split("@");
		String [] values=args[1].split("@");
		
		Car car1=new Car();
		car1.brand=words[0];
		car1.price=Integer.parseInt(words[1]);
		car1.color=words[2];
		car1.isPetrol=Boolean.parseBoolean(words[3]);
		
		Car car2=new Car();
		car2.brand=values[0];
		car2.price=Integer.parseInt(values[1]);
		car2.color=values[2];
		car2.isPetrol=Boolean.parseBoolean(values[3]);
		
		System.out.println("Brand = "+car1.brand+" , "+car2.brand);
		System.out.println("Price = "+car1.price+" , "+car2.price);
		System.out.println("color = "+car1.color+" , "+car2.color);
		System.out.println("IsPetrol = "+car1.isPetrol+" , "+car2.isPetrol);
		
		
	}
	

}
class Car {
	String brand;
	int price;
	String color;
	boolean isPetrol;
}
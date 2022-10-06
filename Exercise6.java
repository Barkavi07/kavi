package lms;

public class Exercise6 {
	public static void main(String [] args) {
		String [] words=args[0].split(",");
		String name=words[0];
		int rollNum=Integer.parseInt(words[1]);
		boolean isPresent=Boolean.parseBoolean(words[2]);
		String department=words[3];
		System.out.println("Student Name = "+name+" , Roll Number = "+rollNum+" , IsPresent = "+isPresent+" , Department = "+department);
	}

}

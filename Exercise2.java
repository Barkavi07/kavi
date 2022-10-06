package lms;

public class Exercise2 {
	public static void main(String [] args) {
		int mathsMark=Integer.parseInt(args[0]);
		int scienceMark=Integer.parseInt(args[1]);
		int englishMark=Integer.parseInt(args[2]);
		int average=(mathsMark+scienceMark+englishMark)/3;
		System.out.println(average);
	}

}

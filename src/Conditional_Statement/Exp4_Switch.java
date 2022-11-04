package Conditional_Statement;

public class Exp4_Switch {
	public static void main(String[] args) {
		int age=16;
		switch(age) {
		case(16):
			System.out.println("u are under 18");
			break;
			
		case(18):
			System.out.println("u are eligibles for voting");
			break;
			
		case(65):
			System.out.println("u are senior citizen");
			break;
			
		default:
			System.out.println("Not applicable");
	}
	}

}

package Conditional_Statement;

public class Exp5_switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int level=3;
		String levelIs="";
		switch(level) {
		
		case(1):
			levelIs="Beginners";
			break;
		
		case(2):
			levelIs="intermediated";
			break;
			
		case(3):
			levelIs="Expert";
			break;
			
		default:
			System.out.println("No level");
		}
		System.out.println(levelIs);
	}

}

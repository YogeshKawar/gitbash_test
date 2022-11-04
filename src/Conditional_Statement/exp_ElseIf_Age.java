package Conditional_Statement;

public class exp_ElseIf_Age {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age=45;
		if(age<13) {
			System.out.println("Kids");
		}
		else if (age>13 && age<23) {
			System.out.println("Teenager");
		}
		else if (age>23 && age<50) {
			System.out.println("Adult");
		}
		else if (age>50 && age<100) {
			System.out.println("Old age");
		}
		else
		{
			System.out.println("Uncatagorized");
		}
	}

}

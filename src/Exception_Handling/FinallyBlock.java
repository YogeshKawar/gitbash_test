package Exception_Handling;

public class FinallyBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			System.out.println(10/0);
		}
		catch(ArithmeticException obj){
			System.out.println("Enter Valid Denomenator");
		}
		finally {
			System.out.println("Thank for using try catch");
		}
		
		System.out.println("--------------------------------------");
		
		
		try
		{
			System.out.println(15/0);
		}
		catch(NullPointerException obj){
			System.out.println("Enter Valid Denomenator");
		}
		finally {
			System.out.println("Thank for using try catch");
		}
	}

}

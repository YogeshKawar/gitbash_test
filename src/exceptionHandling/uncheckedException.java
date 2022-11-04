package exceptionHandling;

public class uncheckedException extends Exception{
	public static void main(String[] args) {
		
	
	{
	System.out.println("My age is 27");
	try {
	throw new AgeException();
	}
	catch(AgeException ex)
	{
		System.out.println("Exception handled: ");
		System.out.println(ex);
	}
}
	}
}

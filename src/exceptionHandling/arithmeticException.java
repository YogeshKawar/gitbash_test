package exceptionHandling;

public class arithmeticException {
public static void main(String[] args) {
	int a = 10;
	int b = 0;
	
	try{
	int c = a/b;
	System.out.println(c);
	}
	
catch(ArithmeticException e)//Actual exception name and 'e' is reference variable
{
	System.out.println("Exception handled: "+e);
}
	System.out.println("'a' can't devided by 'b'");
}
}
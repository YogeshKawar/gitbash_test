package exceptionHandling;

public class finallyBlock {
public static void main(String[] args) {
	try {
		System.out.println(10/0);
	}
	catch(NullPointerException e) {
		System.out.println("Exception Handled: "+e);
	}
	finally {
		System.out.println("Number cannot be devided by zero");//ignores exception occured block and only prints finally block.
	}
}
}

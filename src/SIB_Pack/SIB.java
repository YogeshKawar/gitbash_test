package SIB_Pack;

public class SIB {
	int i=10;
	static {
		System.out.println("I'm from static block");
	}

	{
		System.out.println("I'm from Instance Initializer Block");
	}

	SIB()
	{
		System.out.println("I'm from constructor");
	}
	public static void main(String[] args) {
		System.out.println("I'm from main method");
		SIB s=new SIB();
		System.out.println("Value of i:" +s.i);

	}

}

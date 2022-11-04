package FinalStaticadd;

public class FinalStaticAddition {
	static int a=10;
	static final int b=20;
	
	public static int add()
	{
	int c=a+b;
    return c;
	}
	
	public static void main(String[] args) {
		int c=add();
		System.out.println(c);
	}
}

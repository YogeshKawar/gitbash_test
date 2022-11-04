package Method_Overloading;

public class Overloading {
	
	public void multiplication(int a, int b)
	{
		System.out.println("Multiplication is :" + (a*b));
	}
	
	public void multiplication(int a, int b, int c)
	{
		System.out.println("Multiplication is :" + (a*b*c));
	}
	
public static void main(String[] args) {
	Overloading o=new Overloading();
	o.multiplication(10, 20);
	o.multiplication(10, 20, 30);
}
}

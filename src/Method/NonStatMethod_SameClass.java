package Method;

public class NonStatMethod_SameClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NonStatMethod_SameClass n = new NonStatMethod_SameClass();
		n.m1();
		n.m2();
		n.m3();
		n.m4();
	}
	public void m1()
	{
		System.out.println("non static m1 method call from same class");
	}
	public void m2()
	{
		System.out.println("non static m2 method call from same class");
	}
	public void m3()
	{
		System.out.println("non static m3 method call from same class");
	}
	public void m4()
	{
		System.out.println("non static m4 method call from same class");
	}
}

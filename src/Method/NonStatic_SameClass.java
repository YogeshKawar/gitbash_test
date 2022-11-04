package Method;

public class NonStatic_SameClass {
	
	public int sub(int a, int b) {
		int c=a-b;
		return c;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NonStatic_SameClass ns=new NonStatic_SameClass();
		System.out.println("Substration is:"+ns.sub(30,20));
	}

}

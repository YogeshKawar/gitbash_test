package Methods;
public class with_parameter {
	public static void main(String[] args) {
		
		addition(20,10);
		multipication(30,40); //compile time binding (CBT)
		
	}
	public static void addition(int a, int b) {
		int c = a+b;
		System.out.println("addition :"+c);
	}
	public static void multipication(int d, int e) {
		int f = d*e;
		System.out.println("multipication :"+f);
		
	}
}

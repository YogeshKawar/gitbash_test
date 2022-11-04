package overloadingAndOverriding;

public class methodOverloading {
public void divide (int a, int b) {
	System.out.println("Division: "+(a/b));
}
public void divide(int a,int b, int c, int d) {
	System.out.println("Division: " +(a/b)+" Division: "+(c/d));
}
}
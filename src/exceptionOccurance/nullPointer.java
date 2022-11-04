package exceptionOccurance;

public class nullPointer {
	int i=10;///whenever we are trying to fetch null refrence then we will get null pointer exception
@SuppressWarnings("null")
public static void main(String[] args) {
	nullPointer n = null;
	System.out.println(n.i);
}
}

package exceptionOccurance;

public class numberFormat {
public static void main(String[] args) {
	System.out.println(Integer.parseInt("99"));
	System.out.println(Integer.parseInt("99k44"));
}
}
//Using parseInt() method if inside we put character instead of number then we get this exception
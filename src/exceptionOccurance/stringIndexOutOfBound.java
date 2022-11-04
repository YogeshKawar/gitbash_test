package exceptionOccurance;

public class stringIndexOutOfBound {
public static void main(String[] args) {
	String str = "Yogesh";
	System.out.println(str.length());
	str.charAt(7);// if we try to fetch index which is not present then we get this exception
}
}

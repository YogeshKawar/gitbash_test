package String;
//import java.lang.*;

public class RevStringPalindrom {
	public static void main(String[] args) {
		String org="nitin";
		String rev="";
		
		for (int i=org.length()-1;i>=0;i--) {
			rev=rev+org.charAt(i);
		}
		System.out.println("Reverse String is:" +rev);
		
		if(org.equals(rev))
		{
			System.out.println("String is Palindrome");
		}
		else
		{
			System.out.println("String is not palindrome");
		}
	}

}

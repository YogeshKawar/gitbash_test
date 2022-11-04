package Logical_Program;

public class rev_string1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String org="madam";
		String rev=" ";
		for(int i=org.length()-1;i>=0;i--)
		{
			rev=rev+org.charAt(i);
		}
		System.out.println("Reverse String is:" +rev);
		
		if(org.equals(rev))
		{
			System.out.println("String is Palindome");
		}
		else
		{
			System.out.println("String is not palindrom");
		}
	}

}



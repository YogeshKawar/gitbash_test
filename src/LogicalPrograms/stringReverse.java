package LogicalPrograms;

public class stringReverse {
	public static void main(String[] args) {
		String str1="yogesh";
		String str2= "";
		for(int i=str1.length()-1;i>=0;i--) {
			str2=str2+str1.charAt(i);
		}
		System.out.println(str2);
		/*if(str1.equals(str2)) {
			System.out.println("Is palindrome");
		}
		else
		{
			System.out.println("Is not palindrome");
		}*/
	}
}

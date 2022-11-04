package Logical_Program;

public class Rev_No {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1234;
		int revnum=0;
		for(int i=num;i>0;i=i/10)
		{
			int rem=i%10;
			revnum=revnum*10+rem;
		}
		System.out.println("Rev No.:" +revnum);
	if(num==revnum)
	{
		System.out.println("Given no is palindrome");
	}
	else
	{
		System.out.println("Given no is not palindrom");
	}
	}

}

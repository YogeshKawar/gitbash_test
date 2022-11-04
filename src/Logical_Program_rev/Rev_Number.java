package Logical_Program_rev;

public class Rev_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1234;
		int revNum=0;
		for(int i=num;i>0;i=i/10)
		{
			int rem=i%10;
			revNum=revNum*10+rem;
		}
		System.out.println("Revserse String:"+revNum);
	}

}

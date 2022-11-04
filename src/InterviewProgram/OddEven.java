package InterviewProgram;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter No.:");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		if(a%2==0)
		{
			System.out.println(a + "is Even No");
		}
		else
		{
			System.out.println(a + " is Odd No");
		}
		sc.close();
	}

}

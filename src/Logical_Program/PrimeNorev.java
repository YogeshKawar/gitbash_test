package Logical_Program;

import java.util.Scanner;

public class PrimeNorev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cnt=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No. ");
		int no=sc.nextInt();
		for(int i=1;i<=no;i++)
		{
			if(no%i==0)
			{
				cnt++;
			}
		//	else
			//{
				//cnt--;
			//}
		}
		if(cnt==2)
		{
			System.out.println(+no+ " is Prime No. having count is :" +cnt );
		}
		else
		{
			System.out.println("its not prime no");
		}
		sc.close();
	}

}

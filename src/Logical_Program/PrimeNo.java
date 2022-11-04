package Logical_Program;

import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no:");
		int num=sc.nextInt();
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				count++;
			}
		//	else
			//{
				//count--;
			//}
			
		}
		if(count==2)
		{
			System.out.println(+num+ " is Prime No.having " +count+ " count ");
		}
		else
		{
			System.out.println("its not prime no");
		}
		sc.close();
		
	}

}

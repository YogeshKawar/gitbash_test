package Logical_Program_rev;

import java.util.Scanner;

public class Prime_No {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no to check whether it is prime or not");
		int num=sc.nextInt();
		int count=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println("This is prime no. & count is:"+count);
		}
		else
		{
			System.out.println("This is not prime no.& Count is:"+count);
		}
		sc.close();
	
	}

}

package Logical_Program;

import java.util.Scanner;

public class EvenOddrev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No. :");
		int num=sc.nextInt();
		if(num%2==0)
		{
			System.out.println("No is even no.");
		}
		else
		{
			System.out.println("no. is odd no.");
		}
		sc.close();
	}

}

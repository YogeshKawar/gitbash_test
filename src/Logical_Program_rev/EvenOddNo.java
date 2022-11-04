package Logical_Program_rev;

import java.util.Scanner;

public class EvenOddNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No.");
		int no=sc.nextInt();
		if(no%2==0)
		{
			System.out.println("No is even no.");
		}
		else
		{
			System.out.println("NO is Odd no.");
		}
		sc.close();
	}

}

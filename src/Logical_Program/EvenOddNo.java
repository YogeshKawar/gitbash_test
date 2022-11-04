package Logical_Program;

import java.util.Scanner;

public class EvenOddNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter no. to check whether it Even or Odd:");
		int num=sc.nextInt();
		if(num%2==0)
		{
			System.out.println(num +" is Even No.");
		}
		else
		{
			System.out.println(num +" is Odd No");
		}
sc.close();
	}

}
